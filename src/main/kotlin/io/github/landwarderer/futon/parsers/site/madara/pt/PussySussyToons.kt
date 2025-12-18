package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("PUSSYSUSSYTOONS", "PussySussyToons", "pt", ContentType.HENTAI)
internal class PussySussyToons(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PUSSYSUSSYTOONS, "pussy.sussytoons.com")
