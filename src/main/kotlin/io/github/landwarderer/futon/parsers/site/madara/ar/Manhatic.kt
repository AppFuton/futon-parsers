package io.github.landwarderer.futon.parsers.site.madara.ar

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("MANHATIC", "Manhatic", "ar", ContentType.HENTAI)
internal class Manhatic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHATIC, "manhatic.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
