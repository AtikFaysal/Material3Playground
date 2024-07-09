package com.playground

import org.gradle.api.JavaVersion

object AppConfig {
    const val applicationId = "com.playground.material"
    const val minimumSdkVersion = 21
    const val compileSdkVersion = 34
    const val targetSdkVersion = 34
    var testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    val compatibilityVersion = JavaVersion.VERSION_17
    const val versionCode  = 1
    const val versionName  = "1.0.0"
}