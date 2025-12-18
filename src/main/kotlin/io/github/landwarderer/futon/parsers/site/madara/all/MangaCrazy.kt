package io.github.landwarderer.futon.parsers.site.madara.all

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("MANGACRAZY", "MangaCrazy", "", ContentType.HENTAI)
internal class MangaCrazy(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGACRAZY, "mangacrazy.net") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
