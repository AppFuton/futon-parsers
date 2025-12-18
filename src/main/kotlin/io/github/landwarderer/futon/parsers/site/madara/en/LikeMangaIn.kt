package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("LIKEMANGAIN", "LikeManga.in", "en")
internal class LikeMangaIn(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIKEMANGAIN, "likemanga.in", 36) {
	override val datePattern = "d MMMM, yyyy"
}
