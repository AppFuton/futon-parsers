package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("READER_EVILFLOWERS", "EvilFlowers", "en")
internal class ReaderEvilflowers(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READER_EVILFLOWERS, "evilflowers.com", pageSize = 10) {
	override val listUrl = "project/"
}
