package io.github.landwarderer.futon.parsers.site.mangareader.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("FRANXXMANGAS", "FranxxMangas", "pt")
internal class FranxxMangas(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.FRANXXMANGAS, "franxxmangas.net", pageSize = 10, searchPageSize = 10)
