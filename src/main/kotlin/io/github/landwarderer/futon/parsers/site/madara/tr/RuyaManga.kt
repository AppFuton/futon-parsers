package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("RUYAMANGA", "RuyaManga", "tr")
internal class RuyaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RUYAMANGA, "ruyamanga.net", 18) {
	override val tagPrefix = "manga-kategori/"
	override val datePattern = "dd/MM/yyyy"
}
