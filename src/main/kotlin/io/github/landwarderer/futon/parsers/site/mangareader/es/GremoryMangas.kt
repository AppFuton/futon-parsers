package io.github.landwarderer.futon.parsers.site.mangareader.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import io.github.landwarderer.futon.parsers.Broken

@Broken // There are no comics on the website at all.
@MangaSourceParser("GREMORYMANGAS", "GremoryMangas", "es")
internal class GremoryMangas(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.GREMORYMANGAS,
		"gremorymangas.com",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
