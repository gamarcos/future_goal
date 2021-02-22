import dependencies.Android
import dependencies.Firebase
import dependencies.Kotlin
import dependencies.Test
import dependencies.Interface
import dependencies.JetPack
import dependencies.Canary
import dependencies.PlayCore
import dependencies.DI
import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

plugins {
    id("com.android.dynamic-feature")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(BuildAndroidConfig.MIN_SDK)
        targetSdkVersion(BuildAndroidConfig.TARGET_SDK)

        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    androidExtensions {
        isExperimental = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(BuildModule.APP))
    implementation(project(BuildModule.CORE))

    implementation(Kotlin.KOTLIN)
    implementation(Android.ANDROIDX)
    implementation(Android.ANDROIDX_APP_COMPAT)
    implementation(Firebase.FIREBASE_BOM)
    implementation(Interface.MATERIAL)
    implementation(Interface.CONSTRAINT)
    implementation(JetPack.NAVIGATION_FRAGMENT)
    implementation(JetPack.NAVIGATION_UI)
    implementation(DI.DAGGER)
    implementation(PlayCore.PLAY_CORE)
    implementation(Canary.LEAKCANARY)

    Test.setup.forEach { androidTestImplementation(it) }

    kapt(AnnotationProcessorsDependencies.DAGGER)
}
