package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("TOPCOMICPORNO", "TopComicPorno", "es", ContentType.HENTAI)
internal class TopComicPorno(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOPCOMICPORNO, "topcomicporno.net", 18) {
	override val datePattern = "MMM dd, yy"
}
