package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("SSREADING", "SsReading", "pt")
internal class SsReading(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SSREADING, "ssreading.com.br") {
	override val datePattern: String = "dd 'de' MMM 'de' yyyy"
}
