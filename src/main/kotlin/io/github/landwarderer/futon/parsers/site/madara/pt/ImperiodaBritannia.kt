package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("IMPERIODABRITANNIA", "ImperioDaBritannia", "pt")
internal class ImperiodaBritannia(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMPERIODABRITANNIA, "imperiodabritannia.com", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
	override val withoutAjax = true
}
