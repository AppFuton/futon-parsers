package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("REAPERSCANSUNORIGINAL", "ReaperScansUnoriginal", "en")
internal class ReaperScansUnoriginal(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.REAPERSCANSUNORIGINAL,
		"reaper-scans.com",
		pageSize = 30,
		searchPageSize = 42,
	)
