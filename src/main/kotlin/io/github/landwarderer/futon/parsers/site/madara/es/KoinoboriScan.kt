package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("KOINOBORISCAN", "KoinoboriScan", "es")
internal class KoinoboriScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KOINOBORISCAN, "visorkoi.com") {
	override val postReq = true
}
