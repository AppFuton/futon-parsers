package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("EUPHORIASCAN", "EuphoriaScan", "pt", ContentType.HENTAI)
internal class EuphoriaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EUPHORIASCAN, "euphoriascan.com", 10) {
	override val datePattern: String = "dd 'de' MMMM 'de' yyyy"
}
