plugins {
    id("com.android.application") version("7.4.2")
    kotlin("android") version("1.8.0")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = 28
    defaultConfig {
        applicationId = "com.nilhcem.blenamebadge"
        minSdk = 18
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    implementation("com.jakewharton.timber:timber:4.6.0")

    implementation("no.nordicsemi.android.support.v18:scanner:1.0.0")

    testImplementation("junit:junit:4.12")
    testImplementation("com.nhaarman:mockito-kotlin-kt1.1:1.5.0")
    testImplementation("org.amshove.kluent:kluent:1.72")
}
