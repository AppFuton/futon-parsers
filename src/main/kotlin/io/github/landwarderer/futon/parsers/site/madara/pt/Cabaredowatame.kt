package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("CABAREDOWATAME", "DessertScan", "pt")
internal class Cabaredowatame(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CABAREDOWATAME, "cabaredowatame.site", 10) {
	override val datePattern = "dd/MM/yyyy"
}
