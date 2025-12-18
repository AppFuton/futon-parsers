package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser


@MangaSourceParser("MAGERIN", "Magerin", "id")
internal class Magerin(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MAGERIN, "www.magerin.com")
