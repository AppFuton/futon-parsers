package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("FREEWEBTOONCOINS", "FreeWebtoonCoins", "en")
internal class FreeWebtoonCoins(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FREEWEBTOONCOINS, "freewebtooncoins.com") {
	override val tagPrefix = "webtoon-genre/"
	override val listUrl = "webtoon/"
}
