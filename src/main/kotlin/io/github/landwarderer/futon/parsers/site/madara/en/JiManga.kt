package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("JIMANGA", "S2Manga.io", "en")
internal class JiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JIMANGA, "s2manga.io")
