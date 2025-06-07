// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    buildscript {
        ext {
            kotlin_version = '1.5.30'
            nav_version = '2.5.0' // Navigation için versiya
        }
        repositories {
            google()
            mavenCentral()
        }
        dependencies {
            classpath "com.android.tools.build:gradle:7.0.4"
            classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
            classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
        }
    }

    allprojects {
        repositories {
            google()
            mavenCentral()
        }
    }
}
