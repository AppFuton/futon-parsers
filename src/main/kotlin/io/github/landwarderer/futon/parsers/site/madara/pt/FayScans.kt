package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("FAYSCANS", "FayScans", "pt")
internal class FayScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FAYSCANS, "fayscans.net") {
	override val datePattern: String = "dd/MM/yyyy"
}
