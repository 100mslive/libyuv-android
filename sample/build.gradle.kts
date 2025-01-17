plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    buildToolsVersion = "31.0.0"
    compileSdk = 31
    defaultConfig {
        applicationId = "com.github.crow_misia.libyuv"
        minSdk = 14
        targetSdk = 31
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lint {
        textReport = true
        textOutput("stdout")
        ignore("InvalidPackage")
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        debug {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    kotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
            apiVersion = "1.6"
            languageVersion = "1.6"
        }
    }
}

dependencies {
    implementation(project(":core"))
    implementation(Kotlin.stdlib)

    implementation(AndroidX.activity)
    implementation(AndroidX.appCompat)
}
