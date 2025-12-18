package io.github.landwarderer.futon.parsers.site.guya.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.guya.GuyaParser

@MangaSourceParser("HACHIRUMI", "Hachirumi", "en", ContentType.HENTAI)
internal class Hachirumi(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.HACHIRUMI, "hachirumi.com")
