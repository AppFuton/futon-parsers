package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("DARKNEBULUS", "Darknebulus", "es")
internal class Darknebulus(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DARKNEBULUS, "www.darknebulus.com")
