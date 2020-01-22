plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdk)
    defaultConfig {
        minSdkVersion(Dependencies.Android.minVersion)
        targetSdkVersion(Dependencies.Android.targetVersion)
        versionCode = Dependencies.Android.version
        versionName = Dependencies.Android.versionSerial
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    implementation (Dependencies.Kotlin.kotlin_std)
    implementation (Dependencies.SupportLibs.appcompat)
    implementation (Dependencies.Kotlin.android_extensions)
    implementation (Dependencies.SupportLibs.constraint_layout)
    testImplementation (Dependencies.TestLibs.junit)
}

