package io.github.landwarderer.futon.parsers.site.madara.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@MangaSourceParser("DREAMSCAN", "DreamScan", "pt")
internal class DreamScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DREAMSCAN, "fairydream.com.br")
