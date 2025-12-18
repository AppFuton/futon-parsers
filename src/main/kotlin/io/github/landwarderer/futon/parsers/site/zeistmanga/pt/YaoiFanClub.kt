package io.github.landwarderer.futon.parsers.site.zeistmanga.pt

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YAOIFANCLUB", "YaoiFanClub", "pt")
internal class YaoiFanClub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.YAOIFANCLUB, "www.yaoifanclub.com") {
	override val sateOngoing: String = "Ativo"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
