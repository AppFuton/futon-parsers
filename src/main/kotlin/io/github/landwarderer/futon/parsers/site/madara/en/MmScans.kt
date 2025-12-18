package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MMSCANS", "MmScans", "en")
internal class MmScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MMSCANS, "mm-scans.org") {
	override val selectChapter = "li.chapter-li"
	override val selectDesc = "div.summary-text"
	override val withoutAjax = true
}
