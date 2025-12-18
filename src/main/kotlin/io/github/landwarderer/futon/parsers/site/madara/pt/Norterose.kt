package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("NORTEROSE", "Norterose", "pt")
internal class Norterose(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NORTEROSE, "norterose.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
	override val withoutAjax = true
}
