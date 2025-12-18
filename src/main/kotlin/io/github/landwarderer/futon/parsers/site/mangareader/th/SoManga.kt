package io.github.landwarderer.futon.parsers.site.mangareader.th

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SOMANGA", "SoManga", "th")
internal class SoManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SOMANGA, "so-manga.com", pageSize = 5, searchPageSize = 25)
