package io.github.landwarderer.futon.parsers.site.ru.grouple

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.config.ConfigKey
import io.github.landwarderer.futon.parsers.model.MangaParserSource

@MangaSourceParser("READMANGA_RU", "ReadManga", "ru")
internal class ReadmangaParser(
    context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.READMANGA_RU, 1) {

    override val configKeyDomain = ConfigKey.Domain(*domains)

    override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
        .add("referer", "https://$domain/")
        .build()

    companion object {

        val domains = arrayOf(
            "a.zazaza.me",
            "3.readmanga.ru",
        )
    }
}
