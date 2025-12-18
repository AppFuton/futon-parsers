package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA1ST", "Manga1st", "en")
internal class Manga1st(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA1ST, "manga1st.online") {
	override val datePattern = "d MMMM، yyyy"
}
