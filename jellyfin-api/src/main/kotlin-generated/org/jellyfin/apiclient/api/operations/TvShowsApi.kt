// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult
import org.jellyfin.apiclient.model.api.ImageType
import org.jellyfin.apiclient.model.api.ItemFields

public class TvShowsApi(
	private val api: KtorClient
) {
	/**
	 * Gets episodes for a tv season.
	 *
	 * @param seriesId The series id.
	 * @param userId The user id.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 * @param season Optional filter by season number.
	 * @param seasonId Optional. Filter by season id.
	 * @param isMissing Optional. Filter by items that are missing episodes or not.
	 * @param adjacentTo Optional. Return items that are siblings of a supplied item.
	 * @param startItemId Optional. Skip through the list until a given item is found.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param enableImages Optional, include image information in output.
	 * @param imageTypeLimit Optional, the max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param enableUserData Optional. Include user data.
	 * @param sortBy Optional. Specify one or more sort orders, comma delimited. Options: Album,
	 * AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount,
	 * PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime.
	 */
	public suspend fun getEpisodes(
		seriesId: String,
		userId: UUID? = null,
		fields: List<ItemFields>? = emptyList(),
		season: Int? = null,
		seasonId: String? = null,
		isMissing: Boolean? = null,
		adjacentTo: String? = null,
		startItemId: String? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		enableImages: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList(),
		enableUserData: Boolean? = null,
		sortBy: String? = null
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["seriesId"] = seriesId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["fields"] = fields
		queryParameters["season"] = season
		queryParameters["seasonId"] = seasonId
		queryParameters["isMissing"] = isMissing
		queryParameters["adjacentTo"] = adjacentTo
		queryParameters["startItemId"] = startItemId
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["enableImages"] = enableImages
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["enableUserData"] = enableUserData
		queryParameters["sortBy"] = sortBy
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Shows/{seriesId}/Episodes", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets seasons for a tv series.
	 *
	 * @param seriesId The series id.
	 * @param userId The user id.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 * @param isSpecialSeason Optional. Filter by special season.
	 * @param isMissing Optional. Filter by items that are missing episodes or not.
	 * @param adjacentTo Optional. Return items that are siblings of a supplied item.
	 * @param enableImages Optional. Include image information in output.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param enableUserData Optional. Include user data.
	 */
	public suspend fun getSeasons(
		seriesId: String,
		userId: UUID? = null,
		fields: List<ItemFields>? = emptyList(),
		isSpecialSeason: Boolean? = null,
		isMissing: Boolean? = null,
		adjacentTo: String? = null,
		enableImages: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList(),
		enableUserData: Boolean? = null
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["seriesId"] = seriesId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["fields"] = fields
		queryParameters["isSpecialSeason"] = isSpecialSeason
		queryParameters["isMissing"] = isMissing
		queryParameters["adjacentTo"] = adjacentTo
		queryParameters["enableImages"] = enableImages
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["enableUserData"] = enableUserData
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Shows/{seriesId}/Seasons", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a list of next up episodes.
	 *
	 * @param userId The user id of the user to get the next up episodes for.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param seriesId Optional. Filter by series id.
	 * @param parentId Optional. Specify this to localize the search to a specific item or folder. Omit
	 * to use the root.
	 * @param enableImges Optional. Include image information in output.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param enableUserData Optional. Include user data.
	 * @param enableTotalRecordCount Whether to enable the total records count. Defaults to true.
	 */
	public suspend fun getNextUp(
		userId: UUID? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		seriesId: String? = null,
		parentId: String? = null,
		enableImges: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList(),
		enableUserData: Boolean? = null,
		enableTotalRecordCount: Boolean = true
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["seriesId"] = seriesId
		queryParameters["parentId"] = parentId
		queryParameters["enableImges"] = enableImges
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["enableUserData"] = enableUserData
		queryParameters["enableTotalRecordCount"] = enableTotalRecordCount
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Shows/NextUp", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets a list of upcoming episodes.
	 *
	 * @param userId The user id of the user to get the upcoming episodes for.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param parentId Optional. Specify this to localize the search to a specific item or folder. Omit
	 * to use the root.
	 * @param enableImges Optional. Include image information in output.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param enableUserData Optional. Include user data.
	 */
	public suspend fun getUpcomingEpisodes(
		userId: UUID? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		parentId: String? = null,
		enableImges: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList(),
		enableUserData: Boolean? = null
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["parentId"] = parentId
		queryParameters["enableImges"] = enableImges
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["enableUserData"] = enableUserData
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Shows/Upcoming", pathParameters,
				queryParameters, data)
		return response
	}
}
