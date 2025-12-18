package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANHUASY", "ManhuaSy", "en")
internal class Manhuasy(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUASY, "www.manhuasy.com") {
	override val listUrl = "manhua/"
	override val tagPrefix = "manhua-genre/"
}
