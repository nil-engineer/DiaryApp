// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
//    ext{
        val compose_version = "1.4.3"
//    }
    dependencies{
        classpath("com.google.gms:google-services:4.3.14")
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("io.realm.kotlin") version "1.11.0" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
    id("com.google.devtools.ksp") version "1.8.20-1.0.11" apply false
}