// build.gradle (App)

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.ruhidjavadoff.qrcodescaner"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ruhidjavadoff.qrcodescaner"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    viewBinding {
        enabled = true  // ViewBinding-i aktivləşdiririk
    }
}

dependencies {
    // AndroidX və digər əsas kitabxanalar
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Lifecycle və ViewModel (view lifecycles üçün)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")

    // Navigation Component (Fragment keçidləri üçün)
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.0")

    // Retrofit (API əlaqəsi üçün)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Coroutines (Asinxron əməliyyatlar üçün)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")

    // Glide (Şəkil yükləmə üçün)
    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation("com.github.bumptech.glide:annotations:4.12.0")

    // Timber (Loglama üçün)
    implementation("com.jakewharton.timber:timber:5.0.1")

    // Room (Verilənlər bazası üçün)
    implementation("androidx.room:room-runtime:2.4.0")
    implementation("androidx.room:room-ktx:2.4.0")
    kapt("androidx.room:room-compiler:2.4.0")

    // Hilt (Dependency Injection üçün)
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    implementation("com.google.dagger:hilt-android:2.40")
    kapt("com.google.dagger:hilt-android-compiler:2.40")

    // Firebase (əgər istifadə edirsinizsə)
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-database-ktx")

    // Testlər
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
