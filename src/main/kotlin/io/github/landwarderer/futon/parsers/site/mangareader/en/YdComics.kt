package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("YDCOMICS", "YdComics", "en")
internal class YdComics(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.YDCOMICS, "yd-comics.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/index.php/series"
}
