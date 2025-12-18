package io.github.landwarderer.futon.parsers.site.mangareader.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TRADUCCIONESMOONLIGHT", "TraduccionesMoonlight", "es", ContentType.HENTAI)
internal class TraduccionesMoonlight(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TRADUCCIONESMOONLIGHT, "traduccionesmoonlight.com", 20, 10)
