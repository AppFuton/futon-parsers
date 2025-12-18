package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("SAPPHIRESCAN", "SapphireScan", "es")
internal class SapphireScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SAPPHIRESCAN, "sapphirescan.com")
