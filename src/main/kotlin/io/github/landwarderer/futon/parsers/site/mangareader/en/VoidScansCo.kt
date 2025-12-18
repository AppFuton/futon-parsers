package io.github.landwarderer.futon.parsers.site.mangareader.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("VOIDSCANS_CO", "VoidScans", "en")
internal class VoidScansCo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VOIDSCANS_CO, "voidscans.co", pageSize = 30, searchPageSize = 42)
