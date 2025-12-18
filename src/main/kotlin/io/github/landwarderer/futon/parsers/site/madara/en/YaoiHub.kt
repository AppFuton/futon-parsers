package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIHUB", "YaoiHub", "en", ContentType.HENTAI)
internal class YaoiHub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIHUB, "yaoihub.com")
