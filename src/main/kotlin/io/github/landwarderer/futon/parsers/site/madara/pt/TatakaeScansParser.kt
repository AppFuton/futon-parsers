package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("TATAKAE_SCANS", "TatakaeScans", "pt")
internal class TatakaeScansParser(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TATAKAE_SCANS, "tatakaescan.com", pageSize = 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
