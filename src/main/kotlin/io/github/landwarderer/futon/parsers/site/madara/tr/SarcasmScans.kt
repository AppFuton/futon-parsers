package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("SARCASMSCANS", "SarcasmScans", "tr", ContentType.HENTAI)
internal class SarcasmScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SARCASMSCANS, "sarcasmscans.com", 16)
