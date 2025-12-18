package io.github.landwarderer.futon.parsers.site.mangareader.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ADONISFANSUB", "AdonisFansub", "tr")
internal class AdonisFansub(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ADONISFANSUB,
		"manga.adonisfansub.com",
		pageSize = 20,
		searchPageSize = 20,
	) {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
