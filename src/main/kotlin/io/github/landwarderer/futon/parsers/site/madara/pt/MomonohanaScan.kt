package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MOMONOHANASCAN", "MomonohanaScan", "pt")
internal class MomonohanaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MOMONOHANASCAN, "momonohanascan.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
