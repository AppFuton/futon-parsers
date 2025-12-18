package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAREADCO", "MangaRead.co", "en")
internal class MangaReadCo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAREADCO, "mangaread.co", 16) {
	override val tagPrefix = "m-genre/"
	override val datePattern = "yyyy-MM-dd"
}
