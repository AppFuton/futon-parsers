package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import java.util.*

@Broken
@MangaSourceParser("GEKKOUSCANS", "GekkouScans", "pt", ContentType.HENTAI)
internal class GekkouScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GEKKOUSCANS, "gekkou.site") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
