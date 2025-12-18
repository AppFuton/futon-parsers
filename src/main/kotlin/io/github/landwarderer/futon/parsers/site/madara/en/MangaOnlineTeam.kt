package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAONLINETEAM", "MangaOnlineTeam", "en")
internal class MangaOnlineTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAONLINETEAM, "mangaonlineteam.com", 10)
