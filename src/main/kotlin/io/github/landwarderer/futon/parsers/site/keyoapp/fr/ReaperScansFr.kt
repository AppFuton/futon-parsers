package io.github.landwarderer.futon.parsers.site.keyoapp.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("REAPERSCANS_FR", "ReaperScans.fr", "fr")
internal class ReaperScansFr(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.REAPERSCANS_FR, "reaper-scans.fr")
