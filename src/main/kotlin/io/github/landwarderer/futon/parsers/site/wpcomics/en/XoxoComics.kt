package io.github.landwarderer.futon.parsers.site.wpcomics.en

import androidx.collection.ArrayMap
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.withLock
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentRating
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.Manga
import io.github.landwarderer.futon.parsers.model.MangaChapter
import io.github.landwarderer.futon.parsers.model.MangaListFilter
import io.github.landwarderer.futon.parsers.model.MangaPage
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.model.MangaState
import io.github.landwarderer.futon.parsers.model.MangaTag
import io.github.landwarderer.futon.parsers.model.RATING_UNKNOWN
import io.github.landwarderer.futon.parsers.model.SortOrder
import io.github.landwarderer.futon.parsers.site.wpcomics.WpComicsParser
import io.github.landwarderer.futon.parsers.util.attrAsRelativeUrl
import io.github.landwarderer.futon.parsers.util.generateUid
import io.github.landwarderer.futon.parsers.util.host
import io.github.landwarderer.futon.parsers.util.mapChapters
import io.github.landwarderer.futon.parsers.util.mapToSet
import io.github.landwarderer.futon.parsers.util.oneOrThrowIfMany
import io.github.landwarderer.futon.parsers.util.parseHtml
import io.github.landwarderer.futon.parsers.util.parseSafe
import io.github.landwarderer.futon.parsers.util.removeSuffix
import io.github.landwarderer.futon.parsers.util.selectFirstOrThrow
import io.github.landwarderer.futon.parsers.util.textOrNull
import io.github.landwarderer.futon.parsers.util.toAbsoluteUrl
import io.github.landwarderer.futon.parsers.util.toTitleCase
import io.github.landwarderer.futon.parsers.util.urlEncoded
import java.text.SimpleDateFormat
import java.util.EnumSet

@MangaSourceParser("XOXOCOMICS", "XoxoComics", "en", ContentType.COMICS)
internal class XoxoComics(context: MangaLoaderContext) :
    WpComicsParser(context, MangaParserSource.XOXOCOMICS, "xoxocomic.com", 36) {

    override val listUrl = "/comic-list"
    override val datePattern = "MM/dd/yyyy"

    override val availableSortOrders: Set<SortOrder> = EnumSet.of(
        SortOrder.UPDATED,
        SortOrder.NEWEST,
        SortOrder.POPULARITY,
        SortOrder.ALPHABETICAL,
    )

    override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
        val url = buildString {
            append("https://")
            append(domain)
            when {
                !filter.query.isNullOrEmpty() -> {
                    append("/search-comic?keyword=")
                    append(filter.query.urlEncoded())
                    append("&page=")
                    append(page.toString())
                }

                else -> {
                    // Handle state filters
                    val state = filter.states.oneOrThrowIfMany()
                    val tag = filter.tags.oneOrThrowIfMany()

                    when {
                        // Tag filtering (genre pages)
                        tag != null -> {
                            append("/")
                            append(tag.key)
                            append("-comic")
                            when (order) {
                                SortOrder.POPULARITY -> append("/popular")
                                SortOrder.UPDATED -> append("/latest")
                                SortOrder.NEWEST -> append("/newest")
                                SortOrder.ALPHABETICAL -> append("")
                                else -> append("/latest")
                            }
                        }
                        // State filtering (ongoing/completed)
                        state != null -> {
                            when (state) {
                                MangaState.ONGOING -> append("/ongoing-comic")
                                MangaState.FINISHED -> append("/completed-comic")
                                else -> append(listUrl)
                            }
                            when (order) {
                                SortOrder.POPULARITY -> append("/popular")
                                SortOrder.UPDATED -> append("/latest")
                                SortOrder.NEWEST -> append("/newest")
                                SortOrder.ALPHABETICAL -> append("")
                                else -> append("/latest")
                            }
                        }
                        // Default listing
                        else -> {
                            when (order) {
                                SortOrder.UPDATED -> append("/comic-update")
                                SortOrder.POPULARITY -> append("/popular-comic")
                                SortOrder.NEWEST -> append("/new-comic")
                                SortOrder.ALPHABETICAL -> append(listUrl)
                                else -> append("/comic-update")
                            }
                        }
                    }

                    append("?page=")
                    append(page.toString())
                }
            }
        }
        val doc = webClient.httpGet(url).parseHtml()

        // Handle different page layouts: popular comics (article.item), ongoing/completed (div.item), and list pages (li.row)
        val elements = doc.select("div.items article.item, div.row div.item, li.row")

        return elements.map { element ->
            // Find the main link - could be in different locations depending on page type
            val a = element.selectFirst("figure figcaption h3 a")
                ?: element.selectFirst("figcaption h3 a")
                ?: element.selectFirst("h3 a")
                ?: element.selectFirst("a")
                ?: throw IllegalStateException("Could not find main link in element")

            val href = a.attrAsRelativeUrl("href")

            // Handle different image structures and lazy loading
            val img = element.selectFirst("img")
            val coverUrl = when {
                img?.hasAttr("data-original") == true -> img.attr("data-original")
                img?.hasAttr("data-src") == true -> img.attr("data-src")
                img?.hasAttr("src") == true -> img.attr("src")
                else -> ""
            }.takeIf { it.isNotBlank() && !it.contains("data:image") } ?: ""

            val title = a.text().trim()

            Manga(
                id = generateUid(href),
                url = href,
                publicUrl = href.toAbsoluteUrl(element.host ?: domain),
                coverUrl = coverUrl,
                title = title,
                altTitles = emptySet(),
                rating = RATING_UNKNOWN,
                tags = emptySet(),
                authors = emptySet(),
                state = null,
                source = source,
                contentRating = if (isNsfwSource) ContentRating.ADULT else null,
            )
        }
    }

    override suspend fun getOrCreateTagMap(): ArrayMap<String, MangaTag> = mutex.withLock {
        tagCache?.let { return@withLock it }
        val doc = webClient.httpGet("https://$domain$listUrl").parseHtml()
        val list = doc.select("div.genres ul li:not(.active)").mapNotNull { li ->
            val a = li.selectFirst("a") ?: return@mapNotNull null
            val href = a.attr("href").removeSuffix('/').substringAfterLast('/')
            MangaTag(
                key = href,
                title = a.text(),
                source = source,
            )
        }
        val result = list.associateByTo(ArrayMap(list.size)) { it.title }
        tagCache = result
        result
    }

    override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
        val fullUrl = manga.url.toAbsoluteUrl(domain)
        val doc = webClient.httpGet(fullUrl).parseHtml()
        val chaptersDeferred = async { loadChapters(fullUrl) }
        val desc = doc.selectFirstOrThrow(selectDesc).html()
        val stateDiv = doc.selectFirst(selectState)
        val state = stateDiv?.let {
            when (it.text()) {
                in ongoing -> MangaState.ONGOING
                in finished -> MangaState.FINISHED
                else -> null
            }
        }
        val author = doc.body().select(selectAut).textOrNull()
        manga.copy(
            tags = doc.body().select(selectTag).mapToSet { a ->
                MangaTag(
                    key = a.attr("href").removeSuffix('/').substringAfterLast('/'),
                    title = a.text().toTitleCase(),
                    source = source,
                )
            },
            description = desc,
            authors = setOfNotNull(author),
            state = state,
            chapters = chaptersDeferred.await(),
        )
    }

    private val dateFormat = SimpleDateFormat("MM/dd/yyyy", sourceLocale)

    private suspend fun loadChapters(baseUrl: String): List<MangaChapter> {
        val chapters = ArrayList<MangaChapter>()
        var page = 0
        while (true) {
            ++page
            val doc = webClient.httpGet("$baseUrl?page=$page").parseHtml()
            val chapterElements = doc.select("#nt_listchapter nav ul li:not(.heading)")
            if (chapterElements.isEmpty()) break

            chapters.addAll(
                chapterElements.mapChapters { _, li ->
                    val a = li.selectFirstOrThrow("a")
                    val href = a.attr("href")
                    val dateText = li.selectFirst("div.col-xs-3")?.text()
                    MangaChapter(
                        id = generateUid(href),
                        title = a.text(),
                        number = 0f,
                        volume = 0,
                        url = href,
                        scanlator = null,
                        uploadDate = dateFormat.parseSafe(dateText),
                        branch = null,
                        source = source,
                    )
                },
            )
        }
        chapters.reverse()
        return chapters.mapIndexed { i, x -> x.copy(volume = x.volume, number = (i + 1).toFloat()) }
    }

    override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
        val fullUrl = chapter.url.toAbsoluteUrl(domain) + "/all"
        val doc = webClient.httpGet(fullUrl).parseHtml()
        return doc.select("img[data-original]").mapNotNull { img ->
            val imgUrl = img.attr("data-original").takeIf { it.isNotBlank() } ?: return@mapNotNull null
            val originalImage = imgUrl.replace("[", "").replace("]", "")
            MangaPage(
                id = generateUid(originalImage),
                url = originalImage,
                preview = null,
                source = source,
            )
        }
    }
}
