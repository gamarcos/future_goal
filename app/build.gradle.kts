import dependencies.Android
import dependencies.Firebase
import dependencies.Kotlin
import dependencies.Test
import dependencies.Interface
import dependencies.JetPack
import dependencies.Canary
import dependencies.PlayCore
import dependencies.DI

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)


    defaultConfig {
        applicationId = BuildAndroidConfig.APPLICATION_ID
        minSdkVersion(BuildAndroidConfig.MIN_SDK)
        targetSdkVersion(BuildAndroidConfig.TARGET_SDK)
        buildToolsVersion(BuildAndroidConfig.BUILD_TOOLS_VERSION)

        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME

        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }


    androidExtensions {
        isExperimental = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isDebuggable = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("debug") { isDebuggable = true }
    }

    dynamicFeatures = mutableSetOf(
        BuildModule.FEATURES_NAVIGATION,
        BuildModule.FEATURES_POKEDEX
    )

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

    repositories {
        flatDir {
            dirs("libs")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(BuildModule.CORE))

    implementation(Kotlin.KOTLIN)
    implementation(Android.ANDROIDX)
    implementation(Android.ANDROIDX_APP_COMPAT)
    implementation(Firebase.FIREBASE_BOM)
    implementation(Interface.MATERIAL)
    implementation(Interface.CONSTRAINT)
    implementation(JetPack.NAVIGATION_FRAGMENT)
    implementation(DI.DAGGER)
    implementation(PlayCore.PLAY_CORE)
    implementation(Canary.LEAKCANARY)

    Test.setup.forEach { androidTestImplementation(it) }

    kapt(AnnotationProcessorsDependencies.DAGGER)
}

//apply(plugin = "com.google.gms.google-services")