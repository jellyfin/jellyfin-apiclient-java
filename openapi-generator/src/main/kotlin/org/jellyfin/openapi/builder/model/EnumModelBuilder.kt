package org.jellyfin.openapi.builder.model

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import net.pearx.kasechange.CaseFormat
import net.pearx.kasechange.toPascalCase
import net.pearx.kasechange.toScreamingSnakeCase
import org.jellyfin.openapi.builder.Builder
import org.jellyfin.openapi.builder.extra.DeprecatedAnnotationSpecBuilder
import org.jellyfin.openapi.constants.Packages
import org.jellyfin.openapi.constants.Strings
import org.jellyfin.openapi.model.EnumApiModel
import org.jellyfin.openapi.model.JellyFile

class EnumModelBuilder(
	private val deprecatedAnnotationSpecBuilder: DeprecatedAnnotationSpecBuilder,
) : Builder<EnumApiModel, JellyFile> {
	override fun build(data: EnumApiModel): JellyFile {
		return TypeSpec.enumBuilder(data.name.toPascalCase(from = CaseFormat.CAPITALIZED_CAMEL))
			.apply {
				data.constants.forEach {
					addEnumConstant(
						it.toScreamingSnakeCase(from = CaseFormat.CAPITALIZED_CAMEL),
						TypeSpec.anonymousClassBuilder().apply {
							addAnnotation(AnnotationSpec.builder(SerialName::class).addMember("%S", it).build())
						}.build()
					)
				}
				data.description?.let { addKdoc(it) }
				if (data.deprecated) addAnnotation(deprecatedAnnotationSpecBuilder.build(Strings.DEPRECATED_CLASS))
				addAnnotation(Serializable::class.asTypeName())
			}
			.build()
			.let { JellyFile(Packages.MODEL, emptySet(), it) }
	}
}
