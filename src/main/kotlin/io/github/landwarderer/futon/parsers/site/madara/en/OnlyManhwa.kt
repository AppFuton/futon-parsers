package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ONLYMANHWA", "OnlyManhwa", "en")
internal class OnlyManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ONLYMANHWA, "onlymanhwa.org") {
	override val listUrl = "manhwa/"
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
