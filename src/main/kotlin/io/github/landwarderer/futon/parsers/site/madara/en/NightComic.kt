package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("NIGHTCOMIC", "Night Comic", "en")
internal class NightComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIGHTCOMIC, "www.nightcomic.com") {
	override val postReq = true
}
