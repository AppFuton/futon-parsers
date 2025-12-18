package io.github.landwarderer.futon.parsers.site.zeistmanga.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("TYRANTSCANS", "TyrantScans", "pt")
internal class TyrantScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.TYRANTSCANS, "www.tyrantscans.com")
