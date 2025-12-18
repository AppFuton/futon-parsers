package io.github.landwarderer.futon.parsers.site.madara.ar

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("NOVELSTOWN", "NovelsTown", "ar")
internal class Novelstown(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NOVELSTOWN, "novelstown.com") {
	override val datePattern = "d MMMM، yyyy"
}
