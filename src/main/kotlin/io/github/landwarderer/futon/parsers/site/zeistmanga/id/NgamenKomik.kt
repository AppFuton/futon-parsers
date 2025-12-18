package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("NGAMENKOMIK", "NgamenKomik", "id")
internal class NgamenKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.NGAMENKOMIK, "ngamenkomik05.blogspot.com")
