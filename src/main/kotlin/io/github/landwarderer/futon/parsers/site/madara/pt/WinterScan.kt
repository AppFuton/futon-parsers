package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("WINTERSCAN", "WinterScan", "pt")
internal class WinterScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WINTERSCAN, "winterscan.com", pageSize = 20) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
