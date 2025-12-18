package io.github.landwarderer.futon.parsers.site.zeistmanga.ar

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.model.MangaTag
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser
import io.github.landwarderer.futon.parsers.util.mapToSet
import io.github.landwarderer.futon.parsers.util.parseHtml
import io.github.landwarderer.futon.parsers.util.requireElementById

@MangaSourceParser("MANGAAILAND", "MangaAiLand", "ar")
internal class MangaAiLand(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MANGAAILAND, "manga-ai-land.blogspot.com") {
	override val sateOngoing: String = "مستمر"
	override val sateFinished: String = "مكتملة"
	override val sateAbandoned: String = "متوقفة"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("LinkList1").select("ul li a").mapToSet {
			MangaTag(
				key = it.attr("href").substringBefore("?").substringAfterLast('/'),
				title = it.text(),
				source = source,
			)
		}
	}
}
