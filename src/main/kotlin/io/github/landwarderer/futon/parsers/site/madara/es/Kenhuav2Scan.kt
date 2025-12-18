package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("KENHUAV2SCANK", "Kenhuav2Scan", "es")
internal class Kenhuav2Scan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KENHUAV2SCANK, "kenhuav2scan.com")
