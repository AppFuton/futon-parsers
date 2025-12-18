package io.github.landwarderer.futon.parsers.site.mangareader.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASSCANS", "MangasScans", "fr")
internal class MangasScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASSCANS, "mangas-scans.com", pageSize = 30, searchPageSize = 10)
