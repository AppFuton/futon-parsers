package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.model.MangaTag
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser
import io.github.landwarderer.futon.parsers.util.mapToSet
import io.github.landwarderer.futon.parsers.util.parseHtml

@MangaSourceParser("SHIYURASUB", "ShiyuraSub", "id")
internal class ShiyuraSub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SHIYURASUB, "shiyurasub.blogspot.com") {

	override val selectTags = ".leading-8 div.my-5.gap-2 a"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.select("div.list-label-widget-content ul li a").mapToSet {
			MangaTag(
				key = it.attr("href").removeSuffix("/").substringAfterLast('/'),
				title = it.html().substringBefore("<span"),
				source = source,
			)
		}
	}

}
