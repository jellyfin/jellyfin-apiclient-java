// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class PlaybackStartInfo.
 */
@Serializable
data class PlaybackStartInfo(
	/**
	 * Gets or sets a value indicating whether this instance can seek.
	 */
	@SerialName("CanSeek")
	val canSeek: Boolean,
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
	 * Gets or sets the index of the audio stream.
	 */
	@SerialName("AudioStreamIndex")
	val audioStreamIndex: Int? = null,
	/**
	 * Gets or sets the index of the subtitle stream.
	 */
	@SerialName("SubtitleStreamIndex")
	val subtitleStreamIndex: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is paused.
	 */
	@SerialName("IsPaused")
	val isPaused: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is muted.
	 */
	@SerialName("IsMuted")
	val isMuted: Boolean,
	/**
	 * Gets or sets the position ticks.
	 */
	@SerialName("PositionTicks")
	val positionTicks: Long? = null,
	@SerialName("PlaybackStartTimeTicks")
	val playbackStartTimeTicks: Long? = null,
	/**
	 * Gets or sets the volume level.
	 */
	@SerialName("VolumeLevel")
	val volumeLevel: Int? = null,
	@SerialName("Brightness")
	val brightness: Int? = null,
	@SerialName("AspectRatio")
	val aspectRatio: String? = null,
	@SerialName("PlayMethod")
	val playMethod: PlayMethod,
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
	@SerialName("RepeatMode")
	val repeatMode: RepeatMode,
	@SerialName("NowPlayingQueue")
	val nowPlayingQueue: List<QueueItem>? = null,
	@SerialName("PlaylistItemId")
	val playlistItemId: String? = null
)
