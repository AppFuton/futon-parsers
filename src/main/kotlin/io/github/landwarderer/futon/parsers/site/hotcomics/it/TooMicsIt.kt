package io.github.landwarderer.futon.parsers.site.hotcomics.it

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("TOOMICSIT", "TooMicsIt", "it")
internal class TooMicsIt(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICSIT, "toomics.com/it") {
	override val isSearchSupported = false
	override val mangasUrl = "/webtoon/ranking/genre"
	override val selectMangas = "li > div.visual"
	override val selectMangaChapters = "li.normal_ep:has(.coin-type1)"
	override val selectTagsList = "div.genre_list li:not(.on) a"
	override val selectPages = "div[id^=load_image_] img"
	override val onePage = true
}
