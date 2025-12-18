package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.*
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import io.github.landwarderer.futon.parsers.util.*
import io.github.landwarderer.futon.parsers.Broken

@Broken // The website is broken
@MangaSourceParser("CONSTELLARCOMIC", "ConstellarComic", "en", ContentType.HENTAI)
internal class Constellarcomic(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.CONSTELLARCOMIC,
		"constellarcomic.com",
		pageSize = 30,
		searchPageSize = 18,
	) {
	override val selectTestScript = "script:containsData(ts_rea_der_._run)"

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)

	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val chapters = docs.select(selectChapter).mapChapters(reversed = true) { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			MangaChapter(
				id = generateUid(url),
				title = element.selectFirst(".chapternum")?.textOrNull(),
				url = url,
				number = index + 1f,
				volume = 0,
				scanlator = null,
				uploadDate = 0,
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}
}
