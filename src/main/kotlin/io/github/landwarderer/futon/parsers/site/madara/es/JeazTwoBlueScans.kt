package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("JEAZTWOBLUESCANS", "Lector HUB", "es")
internal class JeazTwoBlueScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JEAZTWOBLUESCANS, "lectorhub.j5z.xyz") {
	override val datePattern = "d MMMM, yyyy"
}
