package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("TOONCHILL", "ToonChill", "en")
internal class ToonChill(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOONCHILL, "toonchill.com", 32)
