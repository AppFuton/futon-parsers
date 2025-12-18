package io.github.landwarderer.futon.parsers.site.madara.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("SCANHENTAI", "ScanHentai", "fr", ContentType.HENTAI)
internal class ScanHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SCANHENTAI, "scan-hentai.fr") {
	override val datePattern = "dd/MM/yyyy"
}
