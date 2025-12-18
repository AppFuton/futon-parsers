package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("NIRVANASCAN", "NirvanaScan", "pt")
internal class NirvanaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIRVANASCAN, "nirvanascan.com")
