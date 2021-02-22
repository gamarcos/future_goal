import dependencies.Database
import dependencies.JetPack
import dependencies.Android
import dependencies.Network

plugins {
    id("android-base-library")
}

android {
    kapt {
        arguments {
            arg("room.incremental", "true")
        }
    }
}

dependencies {
    implementation(Database.ROOM)
    implementation(Database.ROOM_KTX)
    implementation(JetPack.LIFECYCLE_EXTENSIONS)
    implementation(JetPack.NAVIGATION_UI)
    implementation(Android.FRAGMENT_KTX)
    implementation(Android.ANDROIDX)
    implementation(Network.RETROFIT)
    implementation(Network.RETROFIT_CONVERTER)
    implementation(Network.LOGGING)
    implementation(Network.MOSHI)
    implementation(Network.MOSHI_KTX)

    kapt(AnnotationProcessorsDependencies.ROOM)
}