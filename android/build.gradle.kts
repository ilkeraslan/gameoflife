plugins {
    id("org.jetbrains.compose") version "1.0.0-alpha2"
    id("com.android.application")
    kotlin("android")
}

group = "me.ilker"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.3.1")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "me.ilker.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}