// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Library type options dto.
 */
@Serializable
data class LibraryTypeOptionsDto(
	/**
	 * Gets or sets the type.
	 */
	@SerialName("Type")
	val type: String? = null,
	/**
	 * Gets or sets the metadata fetchers.
	 */
	@SerialName("MetadataFetchers")
	val metadataFetchers: List<LibraryOptionInfoDto>? = null,
	/**
	 * Gets or sets the image fetchers.
	 */
	@SerialName("ImageFetchers")
	val imageFetchers: List<LibraryOptionInfoDto>? = null,
	/**
	 * Gets or sets the supported image types.
	 */
	@SerialName("SupportedImageTypes")
	val supportedImageTypes: List<ImageType>? = null,
	/**
	 * Gets or sets the default image options.
	 */
	@SerialName("DefaultImageOptions")
	val defaultImageOptions: List<ImageOption>? = null
)
