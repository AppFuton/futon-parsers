package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken("Redirect to @MANGAGEZGINI")
@MangaSourceParser("GLORYMANGA", "GloryManga", "tr")
internal class GloryManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GLORYMANGA, "mangagezgini.site", 18) {
	override val datePattern = "dd/MM/yyyy"
}
