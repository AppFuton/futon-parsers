package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.Broken

@Broken
@MangaSourceParser("MONARCAMANGA", "MonarcaManga", "es")
internal class MonarcaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MONARCAMANGA, "visormonarca.com") {
	override val tagPrefix = "manga-generos/"
}
