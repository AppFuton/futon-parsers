package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAREAD", "MangaRead", "en")
internal class MangaRead(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAREAD, "www.mangaread.org") {
	override val tagPrefix = "genres/"
	override val datePattern = "dd.MM.yyyy"
}
