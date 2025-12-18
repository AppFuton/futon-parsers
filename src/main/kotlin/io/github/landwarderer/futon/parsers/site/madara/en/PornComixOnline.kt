package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("PORNCOMIXONLINE", "PornComix.online", "en", ContentType.HENTAI)
internal class PornComixOnline(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PORNCOMIXONLINE, "porncomix.online") {
	override val listUrl = "comic/"
	override val tagPrefix = "comic-genre/"
	override val stylePage = ""
}
