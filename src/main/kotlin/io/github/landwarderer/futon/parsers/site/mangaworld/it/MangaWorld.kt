package io.github.landwarderer.futon.parsers.site.mangaworld.it

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangaworld.MangaWorldParser

@MangaSourceParser("MANGAWORLD", "MangaWorld", "it")
internal class MangaWorld(
	context: MangaLoaderContext,
) : MangaWorldParser(context, MangaParserSource.MANGAWORLD, "mangaworld.ac")
