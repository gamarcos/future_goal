plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    jcenter()
    mavenCentral()
}


kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

object PluginVersions {
    const val GRADLE_ANDROID = "4.1.1"
    const val KOTLIN = "1.3.72"
    const val GOOGLE_SERVICES = "4.3.5"
    const val NAVIGATION = "2.3.0"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersions.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.KOTLIN}")
    implementation("com.google.gms:google-services:${PluginVersions.GOOGLE_SERVICES}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${PluginVersions.NAVIGATION}")

}