private const val kotlinVersion = "1.3.50"
private const val androidGradleVersion = "3.5.3"
private const val androidExtensionsVersion = "1.1.0"
private const val coroutinesVersion = "1.3.3"

//android libs
private const val lifecycleExtensionsVersion = "2.1.0"

//support libs
private const val appcompatVersion = "1.1.0"
private const val constraintLayoutVersion = "1.1.3"

//injection libs
private const val daggerVersion = "2.5"

//data libs
private const val retrofitVersion = "2.7.1"

//test libs
private const val junitVersion = "4.12"
private const val mockitoVersion = "1.10.19"
private const val mockitoKotlinVersion = "2.2.0"

object Dependencies {
    object Android {
        const val minVersion = 16
        const val targetVersion = 29
        const val compileSdk = 29
        const val applicationName = "com.aperezsi.shared"
        const val version = 1
        const val versionSerial = "1.0"
    }

    object Kotlin {
        const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
        const val android_extensions = "androidx.core:core-ktx:$androidExtensionsVersion"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object AndroidLibs {
        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:$lifecycleExtensionsVersion"
    }

    object SupportLibs {
        const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }

    object DependencyInjection {
        const val dagger = "com.google.dagger:dagger:$daggerVersion"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    }

    object DataLibs {
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    }

    object TestLibs {
        const val junit = "junit:junit:$junitVersion"
        const val mockito = "org.mockito:mockito-core:$mockitoVersion"
        const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:$mockitoKotlinVersion"
        const val lifecycleTest = "androidx.arch.core:core-testing:$lifecycleExtensionsVersion"
    }

}