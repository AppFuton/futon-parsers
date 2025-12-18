package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("HOUSEOFOTAKUS", "HouseOfOtakus", "es")
internal class HouseOfOtakus(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOUSEOFOTAKUS, "houseofotakus.xyz")
