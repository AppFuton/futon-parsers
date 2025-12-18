package io.github.landwarderer.futon.parsers.site.hotcomics.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("TOOMICSES", "TooMicsEs", "es")
internal class TooMicsEs(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICSES, "toomics.com/es") {
	override val isSearchSupported = false
	override val mangasUrl = "/webtoon/ranking/genre"
	override val selectMangas = "li > div.visual"
	override val selectMangaChapters = "li.normal_ep:has(.coin-type1)"
	override val selectTagsList = "div.genre_list li:not(.on) a"
	override val selectPages = "div[id^=load_image_] img"
	override val onePage = true
}
