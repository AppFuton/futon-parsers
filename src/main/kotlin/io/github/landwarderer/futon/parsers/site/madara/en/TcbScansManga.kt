package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("TCBSCANSMANGA", "TcbScansManga", "en")
internal class TcbScansManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TCBSCANSMANGA, "tcbscans-manga.com", 10) {
	override val selectPage = "img"
}
