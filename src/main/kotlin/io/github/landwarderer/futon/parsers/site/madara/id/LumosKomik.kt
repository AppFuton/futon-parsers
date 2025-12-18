package io.github.landwarderer.futon.parsers.site.madara.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("LUMOSKOMIK", "LumosKomik", "id")
internal class LumosKomik(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LUMOSKOMIK, "lumos01.com") {
	override val tagPrefix = "genre/"
	override val listUrl = "komik/"
	override val datePattern = "dd MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
}
