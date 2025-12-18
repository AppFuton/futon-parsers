package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("STKISSMANGA_COM", "1stKissManga.com", "en")
internal class StkissMangaCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.STKISSMANGA_COM, "1stkissmanga.mom", 10) {
            override val postReq = true
      }
