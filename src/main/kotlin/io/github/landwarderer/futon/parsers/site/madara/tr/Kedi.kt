package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("KEDI", "Kedi", "tr")
internal class Kedi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KEDI, "kedi.to") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "tur/"
}
