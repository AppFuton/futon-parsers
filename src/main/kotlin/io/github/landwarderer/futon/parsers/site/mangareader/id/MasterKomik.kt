package io.github.landwarderer.futon.parsers.site.mangareader.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MASTERKOMIK", "Tenshi", "id")
internal class MasterKomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MASTERKOMIK, "tenshi01.id", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val listUrl = "/komik"
}
