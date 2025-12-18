package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("ATIKROST", "Atikrost", "tr")
internal class Atikrost(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ATIKROST, "www.mangaoku.org", 10) {
	override val datePattern = "d MMMM yyyy"
}
