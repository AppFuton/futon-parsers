package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("KABUSMANGA", "KabusManga", "tr")
internal class KabusManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KABUSMANGA, "kabusmanga.com") {
	override val datePattern = "dd/MM/yyyy"
}
