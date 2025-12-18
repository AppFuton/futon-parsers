package io.github.landwarderer.futon.parsers.site.galleryadults.all

import org.jsoup.nodes.Element
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaListFilterOptions
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.model.MangaTag
import io.github.landwarderer.futon.parsers.site.galleryadults.GalleryAdultsParser
import io.github.landwarderer.futon.parsers.util.mapToSet
import io.github.landwarderer.futon.parsers.util.removeSuffix
import java.util.*

@MangaSourceParser("HENTAIROX", "HentaiRox", type = ContentType.HENTAI)
internal class HentaiRox(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaParserSource.HENTAIROX, "hentairox.com") {
	override val selectGalleryImg = ".inner_thumb img"
	override val selectTags = ".gtags"
	override val selectTag = "li:contains(Tags:)"
	override val selectAuthor = "li:contains(Artists:) span.item_name"
	override val selectLanguageChapter = "li:contains(Languages:) .item_name"

	override suspend fun getFilterOptions(): MangaListFilterOptions {
		return super.getFilterOptions().copy(
			availableLocales = setOf(
				Locale.ENGLISH,
				Locale.FRENCH,
				Locale.JAPANESE,
				Locale("es"),
				Locale("ru"),
				Locale("ko"),
				Locale.GERMAN,
			),
		)
	}

	override fun Element.parseTags() = select("a.tag, .gallery_title a").mapToSet {
		val key = it.attr("href").removeSuffix('/').substringAfterLast('/')
		val name = it.selectFirst(".item_name")?.text() ?: it.text()
		MangaTag(
			key = key,
			title = name,
			source = source,
		)
	}
}
