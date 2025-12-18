package io.github.landwarderer.futon.parsers.site.onemanga.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("DEMONSLAYERSCAN", "DemonSlayerScan", "fr")
internal class DemonSlayerScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.DEMONSLAYERSCAN, "demonslayerscan.com")
