package io.github.landwarderer.futon.parsers.site.mangareader.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ORIGAMIORPHEANS", "Origami Orpheans", "pt")
internal class Origamiorpheans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ORIGAMIORPHEANS,
		"origami-orpheans.com",
		pageSize = 20,
		searchPageSize = 10,
	)
