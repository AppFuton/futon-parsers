package io.github.landwarderer.futon.parsers.site.zeistmanga.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@Broken
@MangaSourceParser("MAXGSSCAN", "MaxgsScan", "pt")
internal class MaxgsScan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MAXGSSCAN, "www.maxgsscan.online")
