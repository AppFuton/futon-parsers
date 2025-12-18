package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("FIRSTKISSMANHUA", "FirstKissManhua", "en")
internal class FirstKissManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FIRSTKISSMANHUA, "1stkissmanhua.net", 20) {
	override val listUrl = "manhua/"
}
