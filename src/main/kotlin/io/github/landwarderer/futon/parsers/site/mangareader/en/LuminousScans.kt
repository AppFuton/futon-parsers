package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("LUMINOUSSCANS", "RadiantScans", "en")
internal class LuminousScans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.LUMINOUSSCANS,
		"radiantscans.com",
		pageSize = 20,
		searchPageSize = 10,
	) {

	override val listUrl = "/series"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
