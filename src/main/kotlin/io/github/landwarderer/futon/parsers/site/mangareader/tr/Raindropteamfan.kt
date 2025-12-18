package io.github.landwarderer.futon.parsers.site.mangareader.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("RAINDROPTEAMFAN", "Raindrop Fansub", "tr")
internal class Raindropteamfan(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.RAINDROPTEAMFAN,
		"www.raindropteamfan.com",
		pageSize = 25,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}

