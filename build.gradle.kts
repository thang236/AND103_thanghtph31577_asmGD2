// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories { jcenter() }
    dependencies {
        classpath(libs.google.services)
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
}