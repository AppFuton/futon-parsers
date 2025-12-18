package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIMANGA", "YaoiManga", "es")
internal class YaoiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMANGA, "yaoimanga.es", 42)
