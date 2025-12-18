package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.Broken

@Broken
@MangaSourceParser("ZEVEP", "Zevep", "es")
internal class Zevep(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZEVEP, "zevep.com", 16)
