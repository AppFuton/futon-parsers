package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWOW", "MangaWow", "tr")
internal class MangaWow(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAWOW, "mangawow.org", 18) {
	override val datePattern = "d MMMM yyyy"
}
