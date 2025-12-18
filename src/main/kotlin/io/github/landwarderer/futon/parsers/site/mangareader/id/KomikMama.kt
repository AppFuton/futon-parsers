package io.github.landwarderer.futon.parsers.site.mangareader.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KOMIKMAMA", "KomikMama", "id")
internal class KomikMama(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKMAMA, "komikmama.lat", pageSize = 30, searchPageSize = 10) {
	override val listUrl = "/komik"
}
