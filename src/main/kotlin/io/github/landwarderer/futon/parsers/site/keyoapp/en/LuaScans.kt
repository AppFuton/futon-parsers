package io.github.landwarderer.futon.parsers.site.keyoapp.en

import io.github.landwarderer.futon.parsers.Broken
import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("LUASCANS", "luaComic.net", "en")
internal class LuaScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.LUASCANS, "luacomic.org")
