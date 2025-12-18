package io.github.landwarderer.futon.parsers.site.madara.th

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGADEEMAK", "MangaDeemak", "th")
internal class Mangadeemak(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGADEEMAK, "mangadeemak.com", 12) {
	override val datePattern: String = "d MMMM yyyy"
}
