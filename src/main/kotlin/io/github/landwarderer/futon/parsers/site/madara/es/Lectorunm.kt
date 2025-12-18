package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LECTORUNM", "Lectorunm.life", "es")
internal class Lectorunm(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORUNM, "lectorunm.life") {
	override val datePattern = "dd/MM/yyyy"
}
