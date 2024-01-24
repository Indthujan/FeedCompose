plugins {
        alias(libs.plugins.android.application)
        alias(libs.plugins.kotlin.android)
        alias(libs.plugins.hilt)
        alias(libs.plugins.protobuf)
        kotlin("kapt")
}

android {
    namespace = "com.indthu.feed"

    defaultConfig {
        applicationId = "com.indthu.feed"
        versionCode = 1
        versionName = "1.0.0"

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
        compose = true
    }
}

dependencies {

//    implementation(projects.theme)
//    implementation(projects.network)
//    implementation(projects.storage)
//    implementation(projects.common)
//    implementation(projects.common.data)
//    implementation(projects.common.domain)
//
//    implementation(projects.features.auth)
//    implementation(projects.features.auth.data)
//    implementation(projects.features.auth.domain)
//
//    implementation(projects.features.home)
//    implementation(projects.features.home.data)
//    implementation(projects.features.home.domain)
//
//
//    implementation(projects.features.writestory)
//    implementation(projects.features.writestory.data)
//    implementation(projects.features.writestory.domain)

    implementation(projects.theme)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.material3)

    implementation(libs.androidx.compose.navigation)
    implementation(libs.androidx.hilt.compose.navigation)

    implementation(libs.hilt)
    kapt(libs.hilt.compiler)

    implementation(libs.ktor.client.core)

    implementation(libs.datastore)
    implementation(libs.protobuf.javalite)

    implementation(libs.timber)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}