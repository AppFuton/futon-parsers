package io.github.landwarderer.futon.parsers.site.zeistmanga.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("WOLFSCANBR", "WolfScanBr", "pt")
internal class WolfScanBr(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.WOLFSCANBR, "wolfscanbr.blogspot.com")
