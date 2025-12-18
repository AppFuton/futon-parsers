package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAHOT", "ManhuaHot", "en")
internal class Manhuahot(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAHOT, "manhuahot.com", 10)
