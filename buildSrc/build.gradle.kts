plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.1.0-rc01")
    implementation("com.android.tools.build:gradle-api:7.1.0-rc01")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    testImplementation("junit:junit:4.13")
}