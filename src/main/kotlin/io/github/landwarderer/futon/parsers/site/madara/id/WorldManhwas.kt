package io.github.landwarderer.futon.parsers.site.madara.id

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("WORLDMANHWAS", "WorldManhwas", "id", ContentType.HENTAI)
internal class WorldManhwas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WORLDMANHWAS, "worldmanhwas.zone", 10) {
	override val tagPrefix = "genre/"
	override val listUrl = "komik/"
	override val datePattern = "d MMMM yyyy"
}
