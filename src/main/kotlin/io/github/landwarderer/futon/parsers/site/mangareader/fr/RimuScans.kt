package io.github.landwarderer.futon.parsers.site.mangareader.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("RIMUSCANS", "RimuScans", "fr")
internal class RimuScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.RIMUSCANS, "rimuscans.com", pageSize = 30, searchPageSize = 10)
