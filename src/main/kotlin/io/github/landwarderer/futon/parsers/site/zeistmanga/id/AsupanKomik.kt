package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@Broken
@MangaSourceParser("ASUPANKOMIK", "AsupanKomik", "id")
internal class AsupanKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ASUPANKOMIK, "www.asupankomik.my.id")
