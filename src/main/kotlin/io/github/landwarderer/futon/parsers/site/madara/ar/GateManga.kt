package io.github.landwarderer.futon.parsers.site.madara.ar

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("GATEMANGA", "GateManga", "ar")
internal class GateManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GATEMANGA, "gatemanga.com") {
	override val postReq = true
	override val datePattern = "d MMMM، yyyy"
	override val listUrl = "ar/"
	override val withoutAjax = true
}
