package io.github.landwarderer.futon.parsers.site.zeistmanga.ar

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("ARABSDOUJIN", "ArabsDoujin", "ar", ContentType.HENTAI)
internal class ArabsDoujin(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ARABSDOUJIN, "www.arabsdoujin.online")
