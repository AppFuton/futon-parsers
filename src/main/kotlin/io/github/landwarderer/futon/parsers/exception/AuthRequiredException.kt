package io.github.landwarderer.futon.parsers.exception

import okio.IOException
import io.github.landwarderer.futon.parsers.InternalParsersApi
import io.github.landwarderer.futon.parsers.model.MangaSource

/**
 * Authorization is required for access to the requested content
 */
public class AuthRequiredException @InternalParsersApi @JvmOverloads constructor(
	public val source: MangaSource,
	cause: Throwable? = null,
) : IOException("Authorization required", cause)
