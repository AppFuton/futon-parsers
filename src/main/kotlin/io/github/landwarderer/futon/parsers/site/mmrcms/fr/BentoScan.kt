package io.github.landwarderer.futon.parsers.site.mmrcms.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("BENTOSCAN", "BentoScan", "fr")
internal class BentoScan(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.BENTOSCAN, "bentoscan.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val imgUpdated = ".jpg"
}
