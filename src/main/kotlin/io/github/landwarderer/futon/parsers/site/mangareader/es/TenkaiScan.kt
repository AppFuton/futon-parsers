package io.github.landwarderer.futon.parsers.site.mangareader.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import java.util.*

@Broken("Not dead, changed template")
@MangaSourceParser("TENKAISCAN", "TenkaiScan", "es", ContentType.HENTAI)
internal class TenkaiScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TENKAISCAN, "falcoscan.net", 20, 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
