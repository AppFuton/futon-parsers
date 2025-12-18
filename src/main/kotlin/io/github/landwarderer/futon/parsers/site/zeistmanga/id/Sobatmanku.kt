package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SOBATMANKU", "Sobatmanku", "id")
internal class Sobatmanku(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SOBATMANKU, "www.sobatmanku19.cab")
