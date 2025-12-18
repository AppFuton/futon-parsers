package io.github.landwarderer.futon.parsers.site.onemanga.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("SNKSCAN", "SnkScan", "fr")
internal class SnkScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.SNKSCAN, "snkscan.com")
