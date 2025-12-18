package io.github.landwarderer.futon.parsers.site.mangareader.es

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser
import io.github.landwarderer.futon.parsers.Broken

@Broken
@MangaSourceParser("CARTELDEMANHWAS", "Cartel De Manhwas", "es")
internal class CartelDeManhwas(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.CARTELDEMANHWAS,
		"cartelmanhwas.net",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val listUrl = "/series"
	override val datePattern = "MMM d, yyyy"
}
