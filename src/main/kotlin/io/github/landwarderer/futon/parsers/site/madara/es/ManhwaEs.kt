package io.github.landwarderer.futon.parsers.site.madara.es

import org.jsoup.nodes.Document
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.Manga
import io.github.landwarderer.futon.parsers.model.MangaChapter
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.util.attrAsRelativeUrl
import io.github.landwarderer.futon.parsers.util.generateUid
import io.github.landwarderer.futon.parsers.util.mapChapters
import io.github.landwarderer.futon.parsers.util.selectFirstOrThrow
import java.text.SimpleDateFormat

@MangaSourceParser("MANHWA_ES", "Manhwa-Es", "es")
internal class ManhwaEs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWA_ES, "manhwa-es.com", 10) {
	override val datePattern = "MM/dd"
	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.body().select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirstOrThrow("a")
			val href = a.attrAsRelativeUrl("href")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()

			val name = li.selectFirstOrThrow(".mini-letters a").text()
			MangaChapter(
				id = generateUid(href),
				title = name,
				number = i + 1f,
				volume = 0,
				url = link,
				uploadDate = if (dateText == "¡Recién publicado!") {
					parseChapterDate(
						dateFormat,
						"today",
					)
				} else {
					parseChapterDate(
						dateFormat,
						dateText,
					)
				},
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}
}
