package io.github.landwarderer.futon.parsers.site.mangareader.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SHIJIESCANS", "ShijieScans", "tr")
internal class ShijieScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SHIJIESCANS, "shijiescans.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/seri"
}
