package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("ZINCHANMANGA_NET", "ZinchanManga.net", "en")
internal class ZinchanMangaNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINCHANMANGA_NET, "zinchangmanga.net", 10)
