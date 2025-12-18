package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("LECTORMANGA", "LectorManga", "es")
internal class LectorManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORMANGA, "lectormangaa.com") {
	override val listUrl = "biblioteca/"
	override val tagPrefix = "comics-genero/"
}
