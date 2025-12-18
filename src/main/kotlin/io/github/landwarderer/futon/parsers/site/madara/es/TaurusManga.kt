package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("TAURUSMANGA", "TaurusManga", "es")
internal class TaurusManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TAURUSMANGA, "taurus.topmanhuas.org") {
	override val datePattern = "dd/MM/yyyy"
}
