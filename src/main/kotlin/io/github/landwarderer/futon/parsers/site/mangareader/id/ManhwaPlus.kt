package io.github.landwarderer.futon.parsers.site.mangareader.id

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaListFilterCapabilities
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import java.util.*

@Broken
@MangaSourceParser("MANHWAPLUS", "ManhwaPlus", "id", ContentType.HENTAI)
internal class ManhwaPlus(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWAPLUS, "manhwablue.com", 20, 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "/komik"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}