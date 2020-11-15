package org.jellyfin.apiclient.api.client

public class MissingPathVariableError(
	public val name: String,
	public val path: String
) : Error("Missing path variable $name for path $path")
