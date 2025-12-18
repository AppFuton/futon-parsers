package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MSYPUBLISHER", "MsyPublisher", "en")
internal class MsyPublisher(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MSYPUBLISHER, "msypublisher.com", 20) {
	override val listUrl = "manhua/"
	override val selectGenre = "manhua-genre/"
}
