import dependencies.Network
import dependencies.DI

plugins { id("android-base-dynamic-features") }

dependencies {
    implementation(project(BuildModule.FEATURES_NAVIGATION))
    implementation(Network.RETROFIT)
    implementation(Network.RETROFIT_CONVERTER)
    implementation(Network.LOGGING)
    DI.setup().forEach { implementation(it) }
    DI.setupProcessor().forEach { kapt(it) }
}
