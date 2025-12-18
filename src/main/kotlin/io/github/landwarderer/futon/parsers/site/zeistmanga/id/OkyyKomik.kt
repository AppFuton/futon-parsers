package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("OKYYKOMIK", "OkyyKomik", "id")
internal class OkyyKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.OKYYKOMIK, "www.okyykomik.my.id")
