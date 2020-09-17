// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.Int
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class ThemeMediaResult.
 */
@Serializable
data class ThemeMediaResult(
	/**
	 * Gets or sets the owner id.
	 */
	@SerialName("OwnerId")
	val ownerId: UUID,
	/**
	 * Gets or sets the items.
	 */
	@SerialName("Items")
	val items: List<BaseItemDto>? = null,
	/**
	 * The total number of records available.
	 */
	@SerialName("TotalRecordCount")
	val totalRecordCount: Int,
	/**
	 * The index of the first record in Items.
	 */
	@SerialName("StartIndex")
	val startIndex: Int
)
