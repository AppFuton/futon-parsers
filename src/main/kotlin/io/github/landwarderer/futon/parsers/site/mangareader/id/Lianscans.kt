package io.github.landwarderer.futon.parsers.site.mangareader.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LIANSCANS", "LianScans", "id", ContentType.HENTAI)
internal class Lianscans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.LIANSCANS, "www.lianscans.com", pageSize = 10, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
}
