package io.github.landwarderer.futon.parsers

import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext
import io.github.landwarderer.futon.parsers.model.MangaParserSource
import io.github.landwarderer.futon.parsers.util.runCatchingCancellable

class AuthCheckExtension : BeforeAllCallback {

	private val loaderContext: MangaLoaderContext = MangaLoaderContextMock

	override fun beforeAll(context: ExtensionContext) {
		for (source in MangaParserSource.entries) {
			val parser = loaderContext.newParserInstance(source)
			if (parser is MangaParserAuthProvider) {
				checkAuthorization(source, parser)
			}
		}
	}

	private fun checkAuthorization(source: MangaParserSource, parser: MangaParserAuthProvider) = runTest {
		runCatchingCancellable {
			parser.getUsername()
		}.onSuccess { username ->
			println("Signed in to ${source.name} as $username")
		}.onFailure { error ->
			System.err.println("Auth failed for ${source.name}: ${error.javaClass.name}(${error.message})")
		}
	}
}
