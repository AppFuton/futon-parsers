package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("SHOOTINGSTARSCANS", "Shooting Star Scans", "en")
internal class ShootingStarScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SHOOTINGSTARSCANS, "shootingstarscans.com") {
	override val tagPrefix = "manga-tag/"
}
