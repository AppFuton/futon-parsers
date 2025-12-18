package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAGA", "ManhuaGa", "en")
internal class Manhuaga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAGA, "manhuaga.com")
