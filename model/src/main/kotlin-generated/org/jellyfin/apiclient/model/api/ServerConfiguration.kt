// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents the server configuration.
 */
@Serializable
data class ServerConfiguration(
	/**
	 * Gets or sets a value indicating whether to enable automatic port forwarding.
	 */
	@SerialName("EnableUPnP")
	val enableUPnP: Boolean,
	/**
	 * Gets or sets a value indicating whether to enable prometheus metrics exporting.
	 */
	@SerialName("EnableMetrics")
	val enableMetrics: Boolean,
	/**
	 * Gets or sets the public mapped port.
	 */
	@SerialName("PublicPort")
	val publicPort: Int,
	/**
	 * Gets or sets the public HTTPS port.
	 */
	@SerialName("PublicHttpsPort")
	val publicHttpsPort: Int,
	/**
	 * Gets or sets the HTTP server port number.
	 */
	@SerialName("HttpServerPortNumber")
	val httpServerPortNumber: Int,
	/**
	 * Gets or sets the HTTPS server port number.
	 */
	@SerialName("HttpsPortNumber")
	val httpsPortNumber: Int,
	/**
	 * Gets or sets a value indicating whether to use HTTPS.
	 */
	@SerialName("EnableHttps")
	val enableHttps: Boolean,
	@SerialName("EnableNormalizedItemByNameIds")
	val enableNormalizedItemByNameIds: Boolean,
	/**
	 * Gets or sets the filesystem path of an X.509 certificate to use for SSL.
	 */
	@SerialName("CertificatePath")
	val certificatePath: String? = null,
	/**
	 * Gets or sets the password required to access the X.509 certificate data in the file specified by
	 * MediaBrowser.Model.Configuration.ServerConfiguration.CertificatePath.
	 */
	@SerialName("CertificatePassword")
	val certificatePassword: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance is port authorized.
	 */
	@SerialName("IsPortAuthorized")
	val isPortAuthorized: Boolean,
	/**
	 * Gets or sets if quick connect is available for use on this server.
	 */
	@SerialName("QuickConnectAvailable")
	val quickConnectAvailable: Boolean,
	@SerialName("AutoRunWebApp")
	val autoRunWebApp: Boolean,
	@SerialName("EnableRemoteAccess")
	val enableRemoteAccess: Boolean,
	/**
	 * Gets or sets a value indicating whether [enable case sensitive item ids].
	 */
	@SerialName("EnableCaseSensitiveItemIds")
	val enableCaseSensitiveItemIds: Boolean,
	@SerialName("DisableLiveTvChannelUserDataName")
	val disableLiveTvChannelUserDataName: Boolean,
	/**
	 * Gets or sets the metadata path.
	 */
	@SerialName("MetadataPath")
	val metadataPath: String? = null,
	@SerialName("MetadataNetworkPath")
	val metadataNetworkPath: String? = null,
	/**
	 * Gets or sets the preferred metadata language.
	 */
	@SerialName("PreferredMetadataLanguage")
	val preferredMetadataLanguage: String? = null,
	/**
	 * Gets or sets the metadata country code.
	 */
	@SerialName("MetadataCountryCode")
	val metadataCountryCode: String? = null,
	/**
	 * Characters to be replaced with a ' ' in strings to create a sort name.
	 */
	@SerialName("SortReplaceCharacters")
	val sortReplaceCharacters: List<String>? = null,
	/**
	 * Characters to be removed from strings to create a sort name.
	 */
	@SerialName("SortRemoveCharacters")
	val sortRemoveCharacters: List<String>? = null,
	/**
	 * Words to be removed from strings to create a sort name.
	 */
	@SerialName("SortRemoveWords")
	val sortRemoveWords: List<String>? = null,
	/**
	 * Gets or sets the minimum percentage of an item that must be played in order for playstate to be
	 * updated.
	 */
	@SerialName("MinResumePct")
	val minResumePct: Int,
	/**
	 * Gets or sets the maximum percentage of an item that can be played while still saving playstate.
	 * If this percentage is crossed playstate will be reset to the beginning and the item will be marked
	 * watched.
	 */
	@SerialName("MaxResumePct")
	val maxResumePct: Int,
	/**
	 * Gets or sets the minimum duration that an item must have in order to be eligible for playstate
	 * updates..
	 */
	@SerialName("MinResumeDurationSeconds")
	val minResumeDurationSeconds: Int,
	/**
	 * The delay in seconds that we will wait after a file system change to try and discover what has
	 * been added/removed
	 * Some delay is necessary with some items because their creation is not atomic.  It involves the
	 * creation of several
	 * different directories and files.
	 */
	@SerialName("LibraryMonitorDelay")
	val libraryMonitorDelay: Int,
	/**
	 * Gets or sets a value indicating whether [enable dashboard response caching].
	 * Allows potential contributors without visual studio to modify production dashboard code and test
	 * changes.
	 */
	@SerialName("EnableDashboardResponseCaching")
	val enableDashboardResponseCaching: Boolean,
	@SerialName("ImageSavingConvention")
	val imageSavingConvention: ImageSavingConvention,
	@SerialName("MetadataOptions")
	val metadataOptions: List<MetadataOptions>? = null,
	@SerialName("SkipDeserializationForBasicTypes")
	val skipDeserializationForBasicTypes: Boolean,
	@SerialName("ServerName")
	val serverName: String? = null,
	@SerialName("BaseUrl")
	val baseUrl: String? = null,
	@SerialName("UICulture")
	val uiCulture: String? = null,
	@SerialName("SaveMetadataHidden")
	val saveMetadataHidden: Boolean,
	@SerialName("ContentTypes")
	val contentTypes: List<NameValuePair>? = null,
	@SerialName("RemoteClientBitrateLimit")
	val remoteClientBitrateLimit: Int,
	@SerialName("EnableFolderView")
	val enableFolderView: Boolean,
	@SerialName("EnableGroupingIntoCollections")
	val enableGroupingIntoCollections: Boolean,
	@SerialName("DisplaySpecialsWithinSeasons")
	val displaySpecialsWithinSeasons: Boolean,
	@SerialName("LocalNetworkSubnets")
	val localNetworkSubnets: List<String>? = null,
	@SerialName("LocalNetworkAddresses")
	val localNetworkAddresses: List<String>? = null,
	@SerialName("CodecsUsed")
	val codecsUsed: List<String>? = null,
	@SerialName("PluginRepositories")
	val pluginRepositories: List<RepositoryInfo>? = null,
	@SerialName("IgnoreVirtualInterfaces")
	val ignoreVirtualInterfaces: Boolean,
	@SerialName("EnableExternalContentInSuggestions")
	val enableExternalContentInSuggestions: Boolean,
	/**
	 * Gets or sets a value indicating whether the server should force connections over HTTPS.
	 */
	@SerialName("RequireHttps")
	val requireHttps: Boolean,
	@SerialName("EnableNewOmdbSupport")
	val enableNewOmdbSupport: Boolean,
	@SerialName("RemoteIPFilter")
	val remoteIpFilter: List<String>? = null,
	@SerialName("IsRemoteIPFilterBlacklist")
	val isRemoteIpFilterBlacklist: Boolean,
	@SerialName("ImageExtractionTimeoutMs")
	val imageExtractionTimeoutMs: Int,
	@SerialName("PathSubstitutions")
	val pathSubstitutions: List<PathSubstitution>? = null,
	@SerialName("EnableSimpleArtistDetection")
	val enableSimpleArtistDetection: Boolean,
	@SerialName("UninstalledPlugins")
	val uninstalledPlugins: List<String>? = null,
	/**
	 * Gets or sets a value indicating whether slow server responses should be logged as a warning.
	 */
	@SerialName("EnableSlowResponseWarning")
	val enableSlowResponseWarning: Boolean,
	/**
	 * Gets or sets the threshold for the slow response time warning in ms.
	 */
	@SerialName("SlowResponseThresholdMs")
	val slowResponseThresholdMs: Long,
	/**
	 * Gets or sets the cors hosts.
	 */
	@SerialName("CorsHosts")
	val corsHosts: List<String>? = null,
	/**
	 * Gets or sets the number of days we should retain log files.
	 */
	@SerialName("LogFileRetentionDays")
	val logFileRetentionDays: Int,
	/**
	 * Gets or sets a value indicating whether this instance is first run.
	 */
	@SerialName("IsStartupWizardCompleted")
	val isStartupWizardCompleted: Boolean,
	/**
	 * Gets or sets the cache path.
	 */
	@SerialName("CachePath")
	val cachePath: String? = null,
	@SerialName("PreviousVersion")
	val previousVersion: Version,
	/**
	 * Gets or sets the stringified PreviousVersion to be stored/loaded,
	 * because System.Version itself isn't xml-serializable.
	 */
	@SerialName("PreviousVersionStr")
	val previousVersionStr: String? = null
)
