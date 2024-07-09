import com.playground.AppConfig

plugins {
    id("android.application")
    id("android.hilt")
    alias(libs.plugins.kotlin.android)
    id("android.navigation")
}

android {
    namespace = AppConfig.applicationId
    compileSdk = AppConfig.compileSdkVersion

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minimumSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        testInstrumentationRunner = AppConfig.testInstrumentationRunner
    }

    signingConfigs {
        create("release") {
            storeFile = file("app-signature/dmtcl.jks")
            storePassword = "123456"
            keyAlias = "dmtcl"
            keyPassword = "123456"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
}

dependencies {
    with(libs){
        implementation(dateced)
        implementation(bundles.androidx.core.dependencies)
        implementation(bundles.androidx.lifecycle.dependencies)
        implementation(view.state.layout)
        implementation(bundles.rxjava3.dependencies)
        implementation(bundles.androidx.navigation.dependencies)
        debugImplementation(leakcanary)
        implementation(timber)
        implementation(libs.picasso)
        implementation(libs.cirlce.imageview)
        implementation(libs.custom.view)
        implementation(libs.cirlce.imageview)

        implementation(libs.bundles.android.responsive.size.dependencies)

        testImplementation(test.junit)
        androidTestImplementation(test.extjunit)
        androidTestImplementation(test.espresso)
    }
}