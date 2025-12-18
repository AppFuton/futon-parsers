package io.github.landwarderer.futon.parsers.util

import org.junit.jupiter.api.Test
import io.github.landwarderer.futon.parsers.MangaLoaderContextMock
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.newParser
import java.io.File

class IntentFilterGenerator {

    @Test
    fun generateIntentFilter() {
        val output = File("out/test/resources/intent-filter.xml")
        output.printWriter(Charsets.UTF_8).use { writer ->
            writer.appendLine("<intent-filter android:autoVerify=\"false\">")
            writer.appendTab().appendLine("<action android:name=\"android.intent.action.VIEW\" />")
            writer.appendLine()
            writer.appendTab().appendLine("<category android:name=\"android.intent.category.DEFAULT\" />")
            writer.appendTab().appendLine("<category android:name=\"android.intent.category.BROWSABLE\" />")
            writer.appendLine()
            writer.appendTab().appendLine("<data android:scheme=\"http\" />")
            writer.appendTab().appendLine("<data android:scheme=\"https\" />")
            writer.appendLine()
            for (source in MangaParserSource.entries) {
                val parser = source.newParser(MangaLoaderContextMock)
                parser.configKeyDomain.presetValues.forEach { domain ->
                    writer.appendTab().append("<data android:host=\"").append(domain).appendLine("\" />")
                }
            }
            writer.appendLine()
            writer.appendLine("</intent-filter>")
        }
        println(output.absolutePath)
    }

    private fun Appendable.appendTab() = append('\t')
}
