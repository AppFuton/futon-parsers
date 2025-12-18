package io.github.landwarderer.futon.parsers.site.madara.pt

import org.jsoup.nodes.Document
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.Manga
import io.github.landwarderer.futon.parsers.model.MangaChapter
import io.github.landwarderer.futon.parsers.model.MangaPage
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.util.generateUid
import io.github.landwarderer.futon.parsers.util.mapChapters
import io.github.landwarderer.futon.parsers.util.parseHtml
import io.github.landwarderer.futon.parsers.util.selectFirstOrThrow
import io.github.landwarderer.futon.parsers.util.toAbsoluteUrl
import io.github.landwarderer.futon.parsers.util.toRelativeUrl

@MangaSourceParser("MANHASTRO", "Manhastro", "pt")
internal class Manhastro(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHASTRO, "manhastro.net", 24) {

	override val listUrl = "lermanga/"
	override val tagPrefix = "genre/"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()

		val script = doc.selectFirstOrThrow("script:containsData(imageLinks)").data()
		val images = script.substringAfter('[').substringBeforeLast(']')
			.replace("\"", "").split(',')
		return images.map { img ->
			val url = context.decodeBase64(img).toString(Charsets.UTF_8)
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}

	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val initialChapters = super.getChapters(manga, doc)

		if (initialChapters.isEmpty()) {
			return initialChapters
		}

		// Use the URL of the first (latest) chapter to fetch the chapter page.
		val firstChapterUrl = initialChapters.first().url.toAbsoluteUrl(domain)
		val chapterPageDoc = webClient.httpGet(firstChapterUrl).parseHtml()

		// Select all <option> elements from the chapter selection dropdown.
		val options = chapterPageDoc.select("select.single-chapter-select option")

		if (options.isNotEmpty()) {
			// The dropdown list is newest-to-oldest
			return options.mapChapters(reversed = true) { i, option ->
				val href = option.attr("data-redirect").toRelativeUrl(domain)
				val name = option.text().trim()

				MangaChapter(
					id = generateUid(href),
					url = href,
					title = name,
					number = i + 1f,
					volume = 0,
					uploadDate = 0L, // Date is not available in the dropdown
					source = source,
					scanlator = null,
					branch = null,
				)
			}
		}

		// If the dropdown wasn't found for some reason, return the initial (short) list as a fallback.
		return initialChapters
	}
}
