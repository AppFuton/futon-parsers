package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("INFAMOUSSCANS", "InfamousScans", "en")
internal class InfamousScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INFAMOUSSCANS, "infamous-scans.com", 10)
