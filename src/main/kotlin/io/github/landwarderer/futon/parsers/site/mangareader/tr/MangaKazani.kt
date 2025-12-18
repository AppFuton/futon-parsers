package io.github.landwarderer.futon.parsers.site.mangareader.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import io.github.landwarderer.futon.parsers.Broken

@Broken
@MangaSourceParser("MANGAKAZANI", "MangaKazani", "tr")
internal class MangaKazani(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAKAZANI, "mangakazani.com", pageSize = 19, searchPageSize = 10) {
	override val listUrl = "/seriler"
}
