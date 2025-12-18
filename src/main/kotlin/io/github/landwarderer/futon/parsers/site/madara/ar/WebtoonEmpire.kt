package io.github.landwarderer.futon.parsers.site.madara.ar

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.model.ContentType

@MangaSourceParser("WEBTOONEMPIRE", "WebtoonEmpire", "ar", type = ContentType.HENTAI)
internal class WebtoonEmpire(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WEBTOONEMPIRE, "webtoonempire-bl.com", pageSize = 10) {
	override val listUrl = "webtoon/"
	override val datePattern = "d MMMM، yyyy"
	override val withoutAjax = true
}
