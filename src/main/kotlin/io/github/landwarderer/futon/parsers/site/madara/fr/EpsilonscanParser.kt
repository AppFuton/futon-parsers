package io.github.landwarderer.futon.parsers.site.madara.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken("Blocked by Cloudflare")
@MangaSourceParser("EPSILONSCAN", "EpsilonScan", "fr", ContentType.HENTAI)
internal class EpsilonscanParser(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EPSILONSCAN, "epsilonscan.to") {
	override val datePattern = "dd/MM/yy"
	override val withoutAjax = true
}
