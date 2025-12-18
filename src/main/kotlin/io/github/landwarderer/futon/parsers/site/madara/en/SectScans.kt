package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("SECTSCANS", "SectScans", "en")
internal class SectScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SECTSCANS, "sectscans.com") {
	override val listUrl = "comics/"
}
