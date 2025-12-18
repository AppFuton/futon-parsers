package io.github.landwarderer.futon.parsers.site.liliana.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.liliana.LilianaParser

@MangaSourceParser("MANHUAGOLD", "ManhuaGold", "en")
internal class ManhuaGold(context: MangaLoaderContext) :
	LilianaParser(context, MangaParserSource.MANHUAGOLD, "manhuagold.top")
