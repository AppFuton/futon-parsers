package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("ZIN_MANGA_COM", "Zin-Manga.com", "en")
internal class ZinMangaCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZIN_MANGA_COM, "zin-manga.com") {
	override val selectPage = "img"
}
