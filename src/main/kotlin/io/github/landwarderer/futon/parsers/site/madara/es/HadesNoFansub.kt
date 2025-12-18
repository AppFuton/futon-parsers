package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("HADESNOFANSUB", "HadesNoFansub", "es")
internal class HadesNoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HADESNOFANSUB, "hadesnofansub.com", 10) {
	override val datePattern: String = "MM/dd/yyyy"
}
