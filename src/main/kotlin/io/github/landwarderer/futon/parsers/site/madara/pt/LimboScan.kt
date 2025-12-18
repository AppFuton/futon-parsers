package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("LIMBOSCAN", "LimboScan", "pt")
internal class LimboScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIMBOSCAN, "limboscan.com.br") {
	override val tagPrefix = "obras-genre/"
	override val listUrl = "obras/"
	override val datePattern: String = "dd/MM/yyyy"
}
