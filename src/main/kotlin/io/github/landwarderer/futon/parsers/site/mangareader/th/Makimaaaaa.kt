package io.github.landwarderer.futon.parsers.site.mangareader.th

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MAKIMAAAAA", "Makimaaaaa", "th")
internal class Makimaaaaa(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MAKIMAAAAA, "makimaaaaa.com", pageSize = 30, searchPageSize = 30) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
