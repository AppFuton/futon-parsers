package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("FLOWERMANGA", "FlowerManga", "pt")
internal class FlowerManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FLOWERMANGA, "flowermanga.net", 24) {
	override val datePattern = "d MMMM yyyy"
}
