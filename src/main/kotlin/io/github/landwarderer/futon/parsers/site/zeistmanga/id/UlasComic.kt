package io.github.landwarderer.futon.parsers.site.zeistmanga.id

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser
import io.github.landwarderer.futon.parsers.model.MangaChapter
import io.github.landwarderer.futon.parsers.model.MangaPage
import io.github.landwarderer.futon.parsers.util.toAbsoluteUrl
import io.github.landwarderer.futon.parsers.util.generateUid
import io.github.landwarderer.futon.parsers.util.parseHtml
import io.github.landwarderer.futon.parsers.util.selectFirstOrThrow

@MangaSourceParser("ULASCOMIC", "UlasComic", "id")
internal class UlasComic(context: MangaLoaderContext):
	ZeistMangaParser(context, MangaParserSource.ULASCOMIC, "www.ulascomic00.xyz") {
	
	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
		return doc.selectFirstOrThrow("script:containsData(config['chapterImage'])")
			.data()
			.substringAfter("config['chapterImage'] = [")
			.substringBefore("];")
			.split("\",")
			.map { url ->
				val cleanUrl = url.trim().replace("\"", "")
				MangaPage(
					id = generateUid(cleanUrl),
					url = cleanUrl,
					preview = null,
					source = source,
				)
			}
	}
}
