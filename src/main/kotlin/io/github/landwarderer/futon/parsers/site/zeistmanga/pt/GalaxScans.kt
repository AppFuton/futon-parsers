package io.github.landwarderer.futon.parsers.site.zeistmanga.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("GALAXSCANS", "GalaxScanlator", "pt")
internal class GalaxScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.GALAXSCANS, "galaxscanlator.blogspot.com") {
	override val mangaCategory = "Recentes"
	override val sateOngoing: String = "Lançando"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
