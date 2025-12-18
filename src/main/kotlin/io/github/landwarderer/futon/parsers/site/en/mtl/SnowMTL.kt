package io.github.landwarderer.futon.parsers.site.en.mtl

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.model.ContentType

@Broken
@MangaSourceParser("SNOWMTL", "SnowMTL", "en", type = ContentType.OTHER)
internal class SnowMTL(context: MangaLoaderContext):
    MTLParser(context, source = MangaParserSource.SNOWMTL, "snowmtl.ru")
