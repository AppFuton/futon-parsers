package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Not dead, changed template")
@MangaSourceParser("HAREMSCANN", "HaremScann", "es")
internal class HaremScann(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HAREMSCANN, "haremscann.es") {
	override val postReq = true
}
