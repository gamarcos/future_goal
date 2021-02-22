import dependencies.Kotlin
import dependencies.Test
import dependencies.Coroutines
import dependencies.DI

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(BuildAndroidConfig.MIN_SDK)
        targetSdkVersion(BuildAndroidConfig.TARGET_SDK)
    }

    androidExtensions {
        isExperimental = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Kotlin.KOTLIN)

    implementation(Coroutines.COROUTINES)
    implementation(Coroutines.COROUTINES_ANDROID)
    implementation(DI.DAGGER)

    kapt(AnnotationProcessorsDependencies.DAGGER)

    Test.setup.forEach { androidTestImplementation(it) }
}