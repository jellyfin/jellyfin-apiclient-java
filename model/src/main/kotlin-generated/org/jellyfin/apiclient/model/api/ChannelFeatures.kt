// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChannelFeatures(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the identifier.
	 */
	@SerialName("Id")
	val id: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance can search.
	 */
	@SerialName("CanSearch")
	val canSearch: Boolean,
	/**
	 * Gets or sets the media types.
	 */
	@SerialName("MediaTypes")
	val mediaTypes: List<ChannelMediaType>? = null,
	/**
	 * Gets or sets the content types.
	 */
	@SerialName("ContentTypes")
	val contentTypes: List<ChannelMediaContentType>? = null,
	/**
	 * Represents the maximum number of records the channel allows retrieving at a time.
	 */
	@SerialName("MaxPageSize")
	val maxPageSize: Int? = null,
	/**
	 * Gets or sets the automatic refresh levels.
	 */
	@SerialName("AutoRefreshLevels")
	val autoRefreshLevels: Int? = null,
	/**
	 * Gets or sets the default sort orders.
	 */
	@SerialName("DefaultSortFields")
	val defaultSortFields: List<ChannelItemSortField>? = null,
	/**
	 * Indicates if a sort ascending/descending toggle is supported or not.
	 */
	@SerialName("SupportsSortOrderToggle")
	val supportsSortOrderToggle: Boolean,
	/**
	 * Gets or sets a value indicating whether [supports latest media].
	 */
	@SerialName("SupportsLatestMedia")
	val supportsLatestMedia: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance can filter.
	 */
	@SerialName("CanFilter")
	val canFilter: Boolean,
	/**
	 * Gets or sets a value indicating whether [supports content downloading].
	 */
	@SerialName("SupportsContentDownloading")
	val supportsContentDownloading: Boolean
)
