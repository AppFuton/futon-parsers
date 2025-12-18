package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("COPYPASTESCAN", "CopyPasteScan", "es")
internal class Copypastescan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COPYPASTESCAN, "copypastescan.xyz", 10) {
	override val datePattern = "d MMMM, yyyy"
}
