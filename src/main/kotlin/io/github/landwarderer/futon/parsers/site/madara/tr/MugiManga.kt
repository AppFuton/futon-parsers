package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser


@MangaSourceParser("MUGIMANGA", "MugiManga", "tr")
internal class MugiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MUGIMANGA, "mugimanga.com", 20) {
	override val datePattern = "dd/MM/yyyy"
}
