// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class PlaybackStopInfo.
 */
@Serializable
data class PlaybackStopInfo(
	@SerialName("Item")
	val item: BaseItemDto,
	/**
	 * Gets or sets the item identifier.
	 */
	@SerialName("ItemId")
	val itemId: UUID,
	/**
	 * Gets or sets the session id.
	 */
	@SerialName("SessionId")
	val sessionId: String? = null,
	/**
	 * Gets or sets the media version identifier.
	 */
	@SerialName("MediaSourceId")
	val mediaSourceId: String? = null,
	/**
	 * Gets or sets the position ticks.
	 */
	@SerialName("PositionTicks")
	val positionTicks: Long? = null,
	/**
	 * Gets or sets the live stream identifier.
	 */
	@SerialName("LiveStreamId")
	val liveStreamId: String? = null,
	/**
	 * Gets or sets the play session identifier.
	 */
	@SerialName("PlaySessionId")
	val playSessionId: String? = null,
	/**
	 * Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is
	 * failed.
	 */
	@SerialName("Failed")
	val failed: Boolean,
	@SerialName("NextMediaType")
	val nextMediaType: String? = null,
	@SerialName("PlaylistItemId")
	val playlistItemId: String? = null,
	@SerialName("NowPlayingQueue")
	val nowPlayingQueue: List<QueueItem>? = null
)
