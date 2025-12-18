package io.github.landwarderer.futon.parsers.site.zeistmanga.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("LER999", "Ler999", "pt")
internal class Ler999(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.LER999, "ler999.blogspot.com")
