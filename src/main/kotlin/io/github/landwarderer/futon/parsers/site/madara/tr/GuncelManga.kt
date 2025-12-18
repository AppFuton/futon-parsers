package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("GUNCEL_MANGA", "GuncelManga", "tr")
internal class GuncelManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GUNCEL_MANGA, "guncelmanga.net") {
	override val datePattern = "d MMMM yyyy"
}
