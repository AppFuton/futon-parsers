package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICSVALLEY", "ComicsValley", "en", ContentType.HENTAI)
internal class ComicsValley(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICSVALLEY, "comicsvalley.com") {
	override val listUrl = "adult-comics/"
	override val tagPrefix = "comic-genre/"
	override val datePattern = "dd/MM/yyyy"
}
