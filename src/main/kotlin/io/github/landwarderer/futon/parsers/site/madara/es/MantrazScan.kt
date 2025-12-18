package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANTRAZSCAN", "MantrazScan", "es")
internal class MantrazScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANTRAZSCAN, "mantrazscan.org") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "generos-de-manga/"
}
