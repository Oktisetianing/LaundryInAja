plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.laundryapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.laundryapp"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.play.services.maps)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Lifecycle components
    implementation ("androidx.lifecycle:lifecycle-livedata:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.3.1")
    implementation ("android.arch.lifecycle:extensions:1.1.1")
    annotationProcessor ("android.arch.lifecycle:compiler:1.1.1")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")

    // Room Database
    implementation ("androidx.room:room-rxjava3:2.3.0")
    implementation ("androidx.room:room-runtime:2.3.0")
    annotationProcessor ("androidx.room:room-compiler:2.3.0")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")

    // Rx Java
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation ("io.reactivex.rxjava3:rxjava:3.0.0")

    // Location
    implementation ("com.github.delight-im:Android-SimpleLocation:v1.3.0")
}