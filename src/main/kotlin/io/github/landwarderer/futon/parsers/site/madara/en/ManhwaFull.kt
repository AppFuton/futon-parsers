package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAFULL", "ManhwaFull", "en")
internal class ManhwaFull(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAFULL, "manhwafull.com") {
	override val listUrl = "manga-all-manhwa/"
	override val datePattern = "MM/dd/yyyy"
}
