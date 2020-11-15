@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.socket

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.api.PlayRequest
import org.jellyfin.apiclient.model.serializer.UUIDSerializer
import java.util.*

@Serializable
public data class PlayMessage(
	@SerialName("MessageId")
	override val messageId: UUID,

	@SerialName("Data")
	val request: PlayRequest,
) : IncomingSocketMessage
