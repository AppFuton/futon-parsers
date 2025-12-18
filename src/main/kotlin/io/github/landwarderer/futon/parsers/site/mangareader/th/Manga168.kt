package io.github.landwarderer.futon.parsers.site.mangareader.th

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGA168", "Manga168", "th", ContentType.HENTAI)
internal class Manga168(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGA168, "manga168.net", pageSize = 40, searchPageSize = 30) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
