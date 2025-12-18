package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("IMPERIOSCANS", "ImperioScans", "pt")
internal class ImperioScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMPERIOSCANS, "imperioscans.com.br") {
	override val datePattern: String = "dd/MM/yyyy"
}
