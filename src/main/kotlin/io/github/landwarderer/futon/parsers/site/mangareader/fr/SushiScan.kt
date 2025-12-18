package io.github.landwarderer.futon.parsers.site.mangareader.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken("Blocked by Cloudflare")
@MangaSourceParser("SUSHISCAN", "SushiScan.Net", "fr")
internal class SushiScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SUSHISCAN, "sushiscan.net", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/catalogue"
	override val datePattern = "MMM d, yyyy"
}
