package io.github.landwarderer.futon.parsers.site.liliana.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.liliana.LilianaParser

@MangaSourceParser("MANGASECT", "MangaSect", "en")
internal class MangaSect(context: MangaLoaderContext) :
	LilianaParser(context, MangaParserSource.MANGASECT, "mangasect.net")
