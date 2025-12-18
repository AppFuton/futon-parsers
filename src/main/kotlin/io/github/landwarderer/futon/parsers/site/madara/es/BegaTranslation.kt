package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("BEGATRANSLATION", "BegaTranslation", "es")
internal class BegaTranslation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEGATRANSLATION, "begatranslation.com") {
	override val datePattern = "dd/MM/yyyy"
	override val listUrl = "series/"
}
