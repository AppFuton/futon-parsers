package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("NIVERAFANSUB", "NiveraFansub", "tr", ContentType.HENTAI)
internal class NiveraFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIVERAFANSUB, "niverafansub.org") {
	override val datePattern = "d MMMM yyyy"
}
