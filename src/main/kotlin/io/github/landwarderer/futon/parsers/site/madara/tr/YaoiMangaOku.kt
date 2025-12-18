package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIMANGAOKU", "YaoiMangaOku", "tr", ContentType.HENTAI)
internal class YaoiMangaOku(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMANGAOKU, "yaoimangaoku.net", 16) {
	override val datePattern = "d MMMM yyyy"
}
