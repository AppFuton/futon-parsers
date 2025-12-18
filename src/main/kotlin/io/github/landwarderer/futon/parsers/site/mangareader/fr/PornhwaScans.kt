package io.github.landwarderer.futon.parsers.site.mangareader.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("PORNHWASCANS", "PornhwaScans", "fr")
internal class PornhwaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.PORNHWASCANS, "pornhwascans.fr", pageSize = 24, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
	override val selectChapter = "div.chapter-list > a.chapter-item"

}
