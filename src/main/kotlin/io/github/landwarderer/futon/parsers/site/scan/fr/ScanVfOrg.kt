package io.github.landwarderer.futon.parsers.site.scan.fr

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.scan.ScanParser

@MangaSourceParser("SCANVFORG", "ScanVf.org", "fr")
internal class ScanVfOrg(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.SCANVFORG, "scanvf.org")
