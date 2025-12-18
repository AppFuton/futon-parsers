package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ESOMANGA", "EsoManga", "tr")
internal class EsoManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ESOMANGA, "esomanga.com", 10) {
	override val postReq = true
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "manga-kategoriler/"
}