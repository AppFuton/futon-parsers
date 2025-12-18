package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("YANPFANSUB", "YanpFansub", "pt")
internal class YanpFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YANPFANSUB, "trisalyanp.com") {
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
