package io.github.landwarderer.futon.parsers.site.mangareader.th

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ECCHIDOUJIN", "EcchiDoujin", "th", ContentType.HENTAI)
internal class EcchiDoujin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ECCHIDOUJIN, "ecchi-doujin.com", pageSize = 30, searchPageSize = 10) {
	override val listUrl = "/doujin"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
