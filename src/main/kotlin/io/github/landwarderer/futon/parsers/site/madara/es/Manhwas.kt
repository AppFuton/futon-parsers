package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAS_ES", "Manhwas.es", "es", ContentType.HENTAI)
internal class Manhwas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAS_ES, "manhwas.es", 30)
