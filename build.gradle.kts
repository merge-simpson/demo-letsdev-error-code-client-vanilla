plugins {
    id("java")
}

group = "me.letsdev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.merge-simpson:letsdev-error-code-api:0.1.0")
}

tasks.test {
    useJUnitPlatform()
}