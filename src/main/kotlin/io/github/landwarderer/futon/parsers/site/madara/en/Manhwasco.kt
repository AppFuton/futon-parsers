package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWASCO", "ManhwaSco", "en")
internal class Manhwasco(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWASCO, "manhwasco.net") {
	override val selectGenre = "div.mg_genres a"
}
