package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("HAYALISTIC", "Hayalistic", "tr")
internal class Hayalistic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HAYALISTIC, "hayalistic.com.tr", 24) {
	override val datePattern = "dd/MM/yyyy"
}
