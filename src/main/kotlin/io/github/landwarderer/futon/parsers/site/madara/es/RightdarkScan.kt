package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("RIGHTDARKSCAN", "RightDarkScan", "es")
internal class RightdarkScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RIGHTDARKSCAN, "rsdleft.com", 10)
