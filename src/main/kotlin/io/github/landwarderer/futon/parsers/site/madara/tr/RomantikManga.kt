package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("ROMANTIKMANGA", "RomantikManga", "tr")
internal class RomantikManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ROMANTIKMANGA, "webtoonhatti.club", 20)
