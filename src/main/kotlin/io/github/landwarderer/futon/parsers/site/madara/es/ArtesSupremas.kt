package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ARTESSUPREMAS", "ArtesSupremas", "es")
internal class ArtesSupremas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARTESSUPREMAS, "artessupremas.com") {
	override val datePattern = "dd/MM/yyyy"
}
