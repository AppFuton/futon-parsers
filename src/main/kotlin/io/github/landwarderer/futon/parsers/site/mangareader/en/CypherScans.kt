package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CYPHERSCANS", "CypherScans", "en")
internal class CypherScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.CYPHERSCANS, "cypheroscans.xyz", pageSize = 20, searchPageSize = 10)
