package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DEXHENTAI", "DexHentai", "en", ContentType.HENTAI)
internal class DexHentai(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DEXHENTAI, "dexhentai.com", 40, 36)
