package io.github.landwarderer.futon.parsers.site.onemanga.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("HUNTERXHUNTERSCAN", "HunterXHunterScan", "fr")
internal class HunterXHunterScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.HUNTERXHUNTERSCAN, "hunterxhunterscan.com")
