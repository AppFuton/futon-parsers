package io.github.landwarderer.futon.parsers.site.mangareader.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DTUPSCAN", "DtupScan", "es")
internal class DtupScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DTUPSCAN, "dtupscan.com", pageSize = 20, searchPageSize = 10)
