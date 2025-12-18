package io.github.landwarderer.futon.parsers.site.onemanga.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("MASHLESCAN", "MashleScan", "fr")
internal class MashleScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.MASHLESCAN, "mashlescan.fr")
