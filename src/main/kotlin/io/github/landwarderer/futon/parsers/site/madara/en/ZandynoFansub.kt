package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("ZANDYNOFANSUB", "Zandyno Fansub", "en")
internal class ZandynoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZANDYNOFANSUB, "zandynofansub.aishiteru.org", 20) {
	override val listUrl = "series/"
	override val datePattern = "dd.MM.yyyy"
}
