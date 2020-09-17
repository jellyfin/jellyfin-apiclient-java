// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.Serializable

@Serializable
enum class RecommendationType {
	SIMILAR_TO_RECENTLY_PLAYED,

	SIMILAR_TO_LIKED_ITEM,

	HAS_DIRECTOR_FROM_RECENTLY_PLAYED,

	HAS_ACTOR_FROM_RECENTLY_PLAYED,

	HAS_LIKED_DIRECTOR,

	HAS_LIKED_ACTOR
}
