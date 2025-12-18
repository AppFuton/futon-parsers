package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("CERISE_SCANS", "CeriseScans", "pt")
internal class CeriseScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CERISE_SCANS, "cerise.leitorweb.com") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
