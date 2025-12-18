package io.github.landwarderer.futon.parsers.site.scan.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.scan.ScanParser

@MangaSourceParser("SCANTRAD", "ScanTrad", "fr")
internal class ScanTrad(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.SCANTRAD, "scan-trad.com")
