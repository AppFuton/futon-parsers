package io.github.landwarderer.futon.parsers.site.madara.fr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("READERGEN", "ReaderGen", "fr")
internal class Readergen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READERGEN, "fr.readergen.fr", 18)
