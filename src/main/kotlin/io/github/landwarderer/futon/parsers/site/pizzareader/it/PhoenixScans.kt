package io.github.landwarderer.futon.parsers.site.pizzareader.it

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("PHOENIXSCANS", "PhoenixScans", "it")
internal class PhoenixScans(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.PHOENIXSCANS, "www.phoenixscans.com")
