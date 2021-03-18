package dependencies

object Kotlin {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${BuildDependenciesVersions.KOTLIN}"
}

object Test {
    private const val JUNIT = "junit:junit:${BuildDependenciesVersions.JUNIT}"
    private const val ANDROIDX_JUNIT = "androidx.test.ext:junit:${BuildDependenciesVersions.ANDROIDX_JUNIT}"
    private const val ANDROIDX_TEST_CORE = "androidx.test:core:${BuildDependenciesVersions.ANDROIDX_TEST_CORE}"
    private const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${BuildDependenciesVersions.ANDROIDX_TEST_RUNNER}"
    private const val ANDROIDX_TEST_RULES = "androidx.test:rules:${BuildDependenciesVersions.ANDROIDX_TEST_RULES}"
    private const val ANDROIDX_TEST_EXT = "androidx.test.ext:truth:${BuildDependenciesVersions.ANDROIDX_TEST_EXT}"

    val setup = arrayListOf(
        JUNIT,
        ANDROIDX_JUNIT,
        ANDROIDX_TEST_CORE,
        ANDROIDX_TEST_RUNNER,
        ANDROIDX_TEST_RULES,
        ANDROIDX_TEST_EXT
    )
}

object Android {
    const val ANDROIDX = "androidx.core:core-ktx:${BuildDependenciesVersions.ANDROIDX_CORE_KTX}"
    const val ANDROIDX_APP_COMPAT =
        "androidx.appcompat:appcompat:${BuildDependenciesVersions.ANDROIDX_APP_COMPAT}"
    const val FRAGMENT = "androidx.fragment:fragment:${BuildDependenciesVersions.FRAGMENT_X}2"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${BuildDependenciesVersions.FRAGMENT_KTX}"

}

object Firebase {
    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${BuildDependenciesVersions.FIREBASE_BOM}"
    const val FIREBASE_DATABASE = "com.google.firebase:firebase-database-ktx"
    const val FIREBASE_AUTH = "com.google.firebase:firebase-auth-ktx"
}

object Interface {
    const val MATERIAL = "com.google.android.material:material:${BuildDependenciesVersions.MATERIAL}"
    const val CONSTRAINT =
        "androidx.constraintlayout:constraintlayout:${BuildDependenciesVersions.CONSTRAINTS}"
}

object Coroutines {
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependenciesVersions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependenciesVersions.COROUTINES}"
}

object Database {
    const val ROOM = "androidx.room:room-runtime:${BuildDependenciesVersions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${BuildDependenciesVersions.ROOM}"
}

object JetPack {
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${BuildDependenciesVersions.NAVIGATION}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${BuildDependenciesVersions.LIFECYCLE}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${BuildDependenciesVersions.NAVIGATION}"

}

object Network {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${BuildDependenciesVersions.RETROFIT}"
    const val MOSHI = "com.squareup.moshi:moshi:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${BuildDependenciesVersions.MOSHI}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.LOGGING}"
}

object DI {
    const val DAGGER = "com.google.dagger:dagger:${BuildDependenciesVersions.DAGGER}"
}

object Canary {
    const val LEAKCANARY = "com.squareup.leakcanary:leakcanary-android:${BuildDependenciesVersions.LEAKCANARY}"
}

object PlayCore {
    const val PLAY_CORE = "com.google.android.play:core:${BuildDependenciesVersions.PLAY_CORE}"
}