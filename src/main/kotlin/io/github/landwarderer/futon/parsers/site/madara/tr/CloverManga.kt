package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken("Redirect to @WEBTOONHATTI")
@MangaSourceParser("CLOVERMANGA", "CloverManga", "tr")
internal class CloverManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CLOVERMANGA, "webtoonhatti.me", 20)
