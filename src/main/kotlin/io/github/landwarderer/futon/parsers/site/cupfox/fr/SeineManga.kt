package io.github.landwarderer.futon.parsers.site.cupfox.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.cupfox.CupFoxParser

@MangaSourceParser("SEINEMANGA", "SeineManga", "fr")
internal class SeineManga(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.SEINEMANGA, "www.seinemanga.com")
