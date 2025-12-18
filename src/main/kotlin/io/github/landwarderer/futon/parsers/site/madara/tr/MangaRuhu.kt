package io.github.landwarderer.futon.parsers.site.madara.tr

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGARUHU", "MangaRuhu", "tr")
internal class MangaRuhu(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGARUHU, "mangaruhu.com", 16)
