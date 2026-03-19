package io.github.landwarderer.futon.parsers.site.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.config.ConfigKey
import io.github.landwarderer.futon.parsers.core.PagedMangaParser
import io.github.landwarderer.futon.parsers.model.ContentRating
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.Manga
import io.github.landwarderer.futon.parsers.model.MangaChapter
import io.github.landwarderer.futon.parsers.model.MangaListFilter
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaListFilterOptions
import io.github.landwarderer.futon.parsers.model.MangaPage
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.model.MangaState
import io.github.landwarderer.futon.parsers.model.MangaTag
import io.github.landwarderer.futon.parsers.model.RATING_UNKNOWN
import io.github.landwarderer.futon.parsers.model.SortOrder
import io.github.landwarderer.futon.parsers.util.attrAsRelativeUrl
import io.github.landwarderer.futon.parsers.util.attrOrNull
import io.github.landwarderer.futon.parsers.util.generateUid
import io.github.landwarderer.futon.parsers.util.mapChapters
import io.github.landwarderer.futon.parsers.util.mapNotNullToSet
import io.github.landwarderer.futon.parsers.util.mapToSet
import io.github.landwarderer.futon.parsers.util.parseHtml
import io.github.landwarderer.futon.parsers.util.selectFirstOrThrow
import io.github.landwarderer.futon.parsers.util.src
import io.github.landwarderer.futon.parsers.util.textOrNull
import io.github.landwarderer.futon.parsers.util.toAbsoluteUrl
import io.github.landwarderer.futon.parsers.util.toTitleCase
import io.github.landwarderer.futon.parsers.util.urlEncoded
import java.text.SimpleDateFormat
import java.util.EnumSet

@MangaSourceParser("ELFTOON", "ElfToon", "en")
internal class ElfToon(context: MangaLoaderContext) :
    PagedMangaParser(context, MangaParserSource.ELFTOON, 20) {

    override val configKeyDomain = ConfigKey.Domain("elftoon.com")

    override val availableSortOrders: Set<SortOrder> = EnumSet.of(
        SortOrder.UPDATED,
        SortOrder.NEWEST,
        SortOrder.ALPHABETICAL,
    )

    override val filterCapabilities: MangaListFilterCapabilities
        get() = MangaListFilterCapabilities(
            isSearchSupported = true,
            isMultipleTagsSupported = true,
        )

    override fun onCreateConfig(keys: MutableCollection<ConfigKey<*>>) {
        super.onCreateConfig(keys)
        keys.add(userAgentKey)
    }

    override suspend fun getFilterOptions() = MangaListFilterOptions(
        availableTags = fetchAvailableTags(),
        availableStates = EnumSet.of(
            MangaState.ONGOING,
            MangaState.FINISHED,
            MangaState.PAUSED,
            MangaState.ABANDONED,
        ),
        availableContentTypes = EnumSet.of(
            ContentType.MANGA,
            ContentType.MANHWA,
            ContentType.MANHUA,
        ),
    )

    override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
        val url = buildString {
            append("https://")
            append(domain)
            when {
                !filter.query.isNullOrEmpty() -> {
                    if (page > 1) return emptyList()
                    append("/?s=")
                    append(filter.query.urlEncoded())
                    append("&post_type=wp-manga")
                }
                else -> {
                    append("/manga/")
                    if (page > 1) {
                        append("page/$page/")
                    }
                    append("?m_orderby=")
                    append(
                        when (order) {
                            SortOrder.UPDATED -> "latest"
                            SortOrder.NEWEST -> "new-manga"
                            SortOrder.ALPHABETICAL -> "alphabet"
                            else -> "latest"
                        },
                    )
                    if (filter.tags.isNotEmpty()) {
                        append("&genre[]=")
                        append(filter.tags.joinToString("&genre[]=") { it.key })
                    }
                    filter.states.firstOrNull()?.let {
                        append("&status=")
                        append(
                            when (it) {
                                MangaState.ONGOING -> "ongoing"
                                MangaState.FINISHED -> "end"
                                MangaState.PAUSED -> "hiatus"
                                MangaState.ABANDONED -> "canceled"
                                else -> ""
                            },
                        )
                    }
                    filter.types.firstOrNull()?.let {
                        append("&type=")
                        append(
                            when (it) {
                                ContentType.MANGA -> "manga"
                                ContentType.MANHWA -> "manhwa"
                                ContentType.MANHUA -> "manhua"
                                else -> ""
                            },
                        )
                    }
                }
            }
        }

        val doc = webClient.httpGet(url).parseHtml()
        return doc.select("div.listupd .bs, div.search-wrap .bs").map { element ->
            val a = element.selectFirstOrThrow("a")
            val href = a.attrAsRelativeUrl("href")
            Manga(
                id = generateUid(href),
                url = href,
                publicUrl = href.toAbsoluteUrl(domain),
                coverUrl = element.selectFirst("img")?.src(),
                title = element.selectFirst(".tt, h3, .bigor .tt")?.text().orEmpty(),
                altTitles = emptySet(),
                rating = element.selectFirst(".numscore")?.text()?.toFloatOrNull()?.div(10f) ?: RATING_UNKNOWN,
                tags = emptySet(),
                authors = emptySet(),
                state = parseStatus(element.selectFirst(".status")?.text().orEmpty()),
                source = source,
                contentRating = if (isNsfwSource) ContentRating.ADULT else null,
            )
        }
    }

    override suspend fun getDetails(manga: Manga): Manga {
        val doc = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()

        val chapters = doc.select("#chapterlist ul li").mapChapters(reversed = true) { i, li ->
            val a = li.selectFirstOrThrow("a")
            val href = a.attrAsRelativeUrl("href")
            MangaChapter(
                id = generateUid(href),
                url = href,
                title = a.selectFirst(".chapternum")?.textOrNull(),
                number = i + 1f,
                volume = 0,
                uploadDate = parseChapterDate(li.selectFirst(".chapterdate")?.text()),
                source = source,
                scanlator = null,
                branch = null,
            )
        }

        val tags = doc.select(".genres-content a, .mgen a").mapToSet { a ->
            MangaTag(
                key = a.attr("href").removeSuffix("/").substringAfterLast("/"),
                title = a.text(),
                source = source,
            )
        }

        return manga.copy(
            title = doc.selectFirst("h1.entry-title")?.text() ?: manga.title,
            altTitles = doc.select(".wd-full span.alter")
                .mapNotNullToSet { it.textOrNull() },
            authors = doc.select(".tsinfo .imptdt:contains(Author) i, .fmed b:contains(Author)+span")
                .mapToSet { it.text() }
                .ifEmpty { emptySet() },
            description = doc.selectFirst(".entry-content[itemprop=description], div.desc")?.text(),
            state = parseStatus(
                doc.selectFirst(".tsinfo .imptdt:contains(Status) i, .imptdt:contains(Status) a")?.text().orEmpty(),
            ),
            tags = tags,
            chapters = chapters,
        )
    }

    override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
        val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
        return doc.select("#readerarea img, #readerarea p img").mapNotNull { img ->
            val url = img.src() ?: return@mapNotNull null
            MangaPage(
                id = generateUid(url),
                url = url,
                preview = null,
                source = source,
            )
        }
    }

    private fun parseStatus(status: String): MangaState? = when {
        status.contains("ongoing", ignoreCase = true) -> MangaState.ONGOING
        status.contains("completed", ignoreCase = true) || status.contains("end", ignoreCase = true) -> MangaState.FINISHED
        status.contains("hiatus", ignoreCase = true) -> MangaState.PAUSED
        status.contains("canceled", ignoreCase = true) || status.contains("dropped", ignoreCase = true) -> MangaState.ABANDONED
        else -> null
    }

    private fun parseChapterDate(date: String?): Long = runCatching {
        SimpleDateFormat("MMMM dd, yyyy", sourceLocale).parse(date?.trim())?.time ?: 0L
    }.getOrDefault(0L)

    private suspend fun fetchAvailableTags(): Set<MangaTag> {
        val doc = webClient.httpGet("https://$domain/manga/").parseHtml()
        return doc.select("ul.genre li, .checkbox-group label, ul.genrez li").mapNotNullToSet { li ->
            val key = li.selectFirst("input")?.attrOrNull("value")
                ?: li.selectFirst("a")?.attr("href")?.removeSuffix("/")?.substringAfterLast("/")
                ?: return@mapNotNullToSet null
            val title = li.selectFirst("label")?.textOrNull()
                ?: li.selectFirst("a")?.textOrNull()
                ?: return@mapNotNullToSet null
            MangaTag(
                key = key,
                title = title.toTitleCase(),
                source = source,
            )
        }
    }
}
