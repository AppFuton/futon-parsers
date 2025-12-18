package io.github.landwarderer.futon.parsers.site.mangareader.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("NYXMANGA", "NyxManga", "tr")
internal class NyxManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NYXMANGA, "nyxmanga.com", pageSize = 14, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}