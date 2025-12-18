package io.github.landwarderer.futon.parsers.site.mmrcms.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@MangaSourceParser("ANZMANGASHD", "AnzMangasHd", "es")
internal class AnzMangasHd(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.ANZMANGASHD, "www.anzmangashd.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectState = "dt:contains(Estado)"
	override val selectAlt = "dt:contains(Otros nombres)"
	override val selectAut = "dt:contains(Autor(es))"
	override val selectTag = "dt:contains(Categorías)"
}
