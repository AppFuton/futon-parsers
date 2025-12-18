package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAONLINE_BLOG", "MangaOnline", "pt")
internal class MangaOnline(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAONLINE_BLOG, "mangaonline.blog", 16) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
