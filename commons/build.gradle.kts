import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("com.github.dcendents.android-maven")
}

group="com.github.Albertoperezs90"

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

    dataBinding {
        isEnabled = true
    }

}

dependencies {
    implementation (Dependencies.Kotlin.kotlin_std)
    implementation (Dependencies.Kotlin.coroutines)
    implementation (Dependencies.Kotlin.android_extensions)

    implementation (Dependencies.AndroidLibs.lifecycleExtensions)

    implementation (Dependencies.SupportLibs.appcompat)
    implementation (Dependencies.SupportLibs.constraint_layout)

    implementation (Dependencies.DataLibs.interceptor)

    implementation (Dependencies.DependencyInjection.dagger)
    kapt (Dependencies.DependencyInjection.daggerCompiler)


    testImplementation (Dependencies.TestLibs.junit)
    testImplementation (Dependencies.TestLibs.lifecycleTest)
}

