import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.defaultRepositories() {
	google()
	mavenCentral()
	jcenter()
}

object Plugins {
	object Versions {
		const val kotlin = "1.4.30"
		const val binaryCompatibilityValidatorVersion = "0.5.0"
		const val detekt = "1.16.0"
		const val nexusPublish = "1.0.0"
		const val dokka = "1.4.30"
		const val androidBuildTools = "4.1.2"
	}

	const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
	const val androidBuildTools = "com.android.tools.build:gradle:${Versions.androidBuildTools}"
}
