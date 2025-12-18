package io.github.landwarderer.futon.parsers.site.mangareader.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import io.github.landwarderer.futon.parsers.Broken

@Broken
@MangaSourceParser("MANGASIGINAGI", "MangaSiginagi", "tr")
internal class MangaSiginagi(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASIGINAGI, "mangasiginagi.com", pageSize = 20, searchPageSize = 10)
