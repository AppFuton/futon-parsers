package io.github.landwarderer.futon.parsers.site.madara.es

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("RAGNAROKSCAN", "RagnarokScan", "es")
internal class RagnarokScan(context: MangaLoaderContext) :
    MadaraParser(context, MangaParserSource.RAGNAROKSCAN, "ragnarokscan.com") {
    override val stylePage = ""
    override val listUrl = "series/"
    override val tagPrefix = "genero/"
}
