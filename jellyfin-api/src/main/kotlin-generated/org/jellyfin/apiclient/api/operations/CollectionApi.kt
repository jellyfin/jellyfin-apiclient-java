// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.CollectionCreationResult

public class CollectionApi(
	private val api: KtorClient
) {
	/**
	 * Creates a new collection.
	 *
	 * @param name The name of the collection.
	 * @param ids Item Ids to add to the collection.
	 * @param parentId Optional. Create the collection within a specific folder.
	 * @param isLocked Whether or not to lock the new collection.
	 */
	public suspend fun createCollection(
		name: String? = null,
		ids: List<String>? = emptyList(),
		parentId: UUID? = null,
		isLocked: Boolean = false
	): Response<CollectionCreationResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["ids"] = ids
		queryParameters["parentId"] = parentId
		queryParameters["isLocked"] = isLocked
		val data = null
		val response = api.post<CollectionCreationResult>("/Collections", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Adds items to a collection.
	 *
	 * @param collectionId The collection id.
	 * @param ids Item ids, comma delimited.
	 */
	public suspend fun addToCollection(collectionId: UUID, ids: List<UUID> = emptyList()):
			Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["collectionId"] = collectionId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["ids"] = ids
		val data = null
		val response = api.post<Unit>("/Collections/{collectionId}/Items", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Removes items from a collection.
	 *
	 * @param collectionId The collection id.
	 * @param ids Item ids, comma delimited.
	 */
	public suspend fun removeFromCollection(collectionId: UUID, ids: List<UUID> = emptyList()):
			Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["collectionId"] = collectionId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["ids"] = ids
		val data = null
		val response = api.delete<Unit>("/Collections/{collectionId}/Items", pathParameters,
				queryParameters, data)
		return response
	}
}
