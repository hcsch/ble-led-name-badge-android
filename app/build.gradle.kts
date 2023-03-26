plugins {
    id("com.android.application") version("3.0.1")
    kotlin("android") version("1.2.10")
}

repositories {
    google()
    jcenter()
}

android {
    compileSdkVersion(27)
    buildToolsVersion("27.0.3")
    defaultConfig {
        applicationId = "com.nilhcem.blenamebadge"
        minSdkVersion(18)
        targetSdkVersion(27)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.10")

    implementation("com.android.support:appcompat-v7:27.0.2")
    implementation("com.android.support.constraint:constraint-layout:1.0.2")

    implementation("com.jakewharton.timber:timber:4.6.0")

    implementation("no.nordicsemi.android.support.v18:scanner:1.0.0")

    testImplementation("junit:junit:4.12")
    testImplementation("com.nhaarman:mockito-kotlin-kt1.1:1.5.0")
    testImplementation("org.amshove.kluent:kluent:1.31")
}
