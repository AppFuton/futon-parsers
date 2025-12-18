package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAOKUSANA", "MangaOkusana", "tr")
internal class MangaOkusana(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOKUSANA, "mangaokusana.com") {
	override val datePattern = "dd MMMM yyyy"
}
