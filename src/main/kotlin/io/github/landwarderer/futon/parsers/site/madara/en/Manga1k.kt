package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGA1K", "Manga1k", "en", ContentType.HENTAI)
internal class Manga1k(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA1K, "manga1k.com", 20) {
	override val withoutAjax = true
}
