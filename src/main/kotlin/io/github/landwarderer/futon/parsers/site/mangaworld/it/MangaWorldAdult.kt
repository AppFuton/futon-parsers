package io.github.landwarderer.futon.parsers.site.mangaworld.it

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangaworld.MangaWorldParser

@MangaSourceParser("MANGAWORLDADULT", "MangaWorldAdult", "it")
internal class MangaWorldAdult(
	context: MangaLoaderContext,
) : MangaWorldParser(context, MangaParserSource.MANGAWORLDADULT, "mangaworldadult.net")
