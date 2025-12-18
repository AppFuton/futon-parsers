package io.github.landwarderer.futon.parsers

import org.junit.jupiter.params.provider.EnumSource
import io.github.landwarderer.futon.parsers.model.MangaParserSource

// Change 'names' to test specified parsers
@EnumSource(MangaParserSource::class, names = [], mode = EnumSource.Mode.INCLUDE)
internal annotation class MangaSources
