package io.github.landwarderer.futon.parsers.site.manga18.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.manga18.Manga18Parser

@MangaSourceParser("TUMANHWAS", "Tumanhwas", "es", ContentType.HENTAI)
internal class Tumanhwas(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.TUMANHWAS, "tumanhwas.club") {
	override val selectTag = "div.item:contains(Géneros) div.info_value a"
	override val selectAlt = "div.item:contains(Títulos alternativos) div.info_value"
}
