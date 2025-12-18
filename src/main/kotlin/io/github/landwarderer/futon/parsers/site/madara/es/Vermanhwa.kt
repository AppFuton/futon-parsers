package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("VERMANHWA", "Vermanhwa", "es", ContentType.HENTAI)
internal class Vermanhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VERMANHWA, "vermanhwa.com", 10)
