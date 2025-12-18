package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("REMANGAS", "ReMangas", "pt")
internal class ReMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.REMANGAS, "remangas.net") {
	override val datePattern = "dd/MM/yyyy"
}
