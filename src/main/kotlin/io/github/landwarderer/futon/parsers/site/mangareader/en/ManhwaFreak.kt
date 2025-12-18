package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken("Not dead, changed template")
@MangaSourceParser("MANHWA_FREAK", "ManhwaFreak", "en")
internal class ManhwaFreak(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWA_FREAK, "manhwafreak.xyz", pageSize = 30, searchPageSize = 42)
