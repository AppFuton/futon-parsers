package io.github.landwarderer.futon.parsers.site.mangareader.cz

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("EVILMANGA", "EvilManga", "cs", ContentType.HENTAI)
internal class EvilManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.EVILMANGA, "evil-manga.eu", pageSize = 20, searchPageSize = 10) {
	override val datePattern = "d MMMM, yyyy"
}
