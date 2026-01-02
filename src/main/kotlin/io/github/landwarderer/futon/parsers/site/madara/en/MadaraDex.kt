package io.github.landwarderer.futon.parsers.site.madara.en

import io.github.landwarderer.futon.parsers.MangaLoaderContext
import io.github.landwarderer.futon.parsers.MangaSourceParser
import io.github.landwarderer.futon.parsers.config.ConfigKey
import io.github.landwarderer.futon.parsers.exception.ParseException
import io.github.landwarderer.futon.parsers.model.ContentType
import io.github.landwarderer.futon.parsers.model.MangaChapter
import io.github.landwarderer.futon.parsers.model.MangaPage
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.network.UserAgents
import io.github.landwarderer.futon.parsers.site.madara.MadaraParser
import io.github.landwarderer.futon.parsers.util.*

@MangaSourceParser("MADARADEX", "MadaraDex", "en", ContentType.HENTAI)
internal class MadaraDex(context: MangaLoaderContext) :
    MadaraParser(context, MangaParserSource.MADARADEX, "madaradex.org") {

    init {
        context.cookieJar.insertCookies(domain, "wpmanga-adault=1")
    }

    override fun onCreateConfig(keys: MutableCollection<ConfigKey<*>>) {
        super.onCreateConfig(keys)
        keys.remove(userAgentKey)
    }

    override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
        .set("User-Agent", UserAgents.CHROME_DESKTOP)
        .set("referer", "https://madaradex.org/")
        .build()

    override val authUrl: String
        get() = "https://${domain}"

    override suspend fun isAuthorized(): Boolean {
        return context.cookieJar.getCookies(domain).any {
            it.name.contains("cm_uaid")
        }
    }

    override val listUrl = "title/"
    override val tagPrefix = "genre/"
    override val postReq = true

    override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
        val fullUrl = chapter.url.toAbsoluteUrl(domain)
        val doc = webClient.httpGet(fullUrl).parseHtml()
        
        val images = doc.select("div.page-break img")
        
        if (images.isEmpty()) {
            throw ParseException("No images found, try to log in", fullUrl)
        }
        
        return images.mapNotNull { img ->
            val rawUrl = img.attr("data-src").ifBlank { img.attr("src") }.trim()
            
            if (rawUrl.isEmpty()) {
                return@mapNotNull null
            }
            
            val cleanUrl = rawUrl.toRelativeUrl(domain).substringBefore('#')
            
            MangaPage(
                id = generateUid(cleanUrl),
                url = cleanUrl,
                preview = null,
                source = source,
            )
        }
    }
}
