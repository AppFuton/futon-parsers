package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWT_NET", "MangaWt.net", "tr")
internal class MangaWtNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAWT_NET, "mangawt.com")
