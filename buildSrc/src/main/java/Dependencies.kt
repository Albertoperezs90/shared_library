private const val kotlinVersion = "1.3.50"
private const val androidGradleVersion = "3.5.3"
private const val androidExtensionsVersion = "1.1.0"

//support libs
private const val appcompatVersion = "1.1.0"
private const val constraintLayoutVersion = "1.1.3"

//test libs
private const val junitVersion = "4.12"

object Dependencies{
    object Android {
        const val minVersion = 16
        const val targetVersion = 29
        const val compileSdk = 29
        const val applicationName = "com.aperezsi.shared"
        const val version = 1
        const val versionSerial = "1.0"
    }

    object Kotlin{
        const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
        const val android_extensions = "androidx.core:core-ktx:$androidExtensionsVersion"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object SupportLibs{
        val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
        val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }

    object TestLibs{
        val junit = "junit:junit:$junitVersion"
    }

}