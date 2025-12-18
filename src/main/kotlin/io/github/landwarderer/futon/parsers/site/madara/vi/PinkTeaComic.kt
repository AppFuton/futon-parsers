package io.github.landwarderer.futon.parsers.site.madara.vi

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PINKTEACOMIC", "PinkTeaComic", "vi")
internal class PinkTeaComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PINKTEACOMIC, "pinkteacomics.com") {
	override val datePattern = "d MMMM, yyyy"
}
