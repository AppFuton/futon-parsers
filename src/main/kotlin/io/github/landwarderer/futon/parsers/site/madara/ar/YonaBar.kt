package io.github.landwarderer.futon.parsers.site.madara.ar

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("YONABAR", "YonaBar", "ar")
internal class YonaBar(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YONABAR, "yonabar.xyz", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "yaoi/"
}
