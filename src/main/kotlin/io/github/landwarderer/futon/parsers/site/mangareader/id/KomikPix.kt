package io.github.landwarderer.futon.parsers.site.mangareader.id

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("KOMIKPIX", "KomikPix", "id", ContentType.HENTAI)
internal class KomikPix(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKPIX, "komikpix.com", pageSize = 30, searchPageSize = 14) {
	override val listUrl = "/hentai"
}