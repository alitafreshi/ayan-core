// Top-level build file where you can add configuration options common to all sub-projects/modules.
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

buildscript {
    repositories {
        maven(url = "https://jitpack.io")
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath(Build.buildTools)
        classpath(Build.kotlinGradlePlugin)
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
    }
}

allprojects {
    repositories {
        maven(url = "https://jitpack.io")
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}