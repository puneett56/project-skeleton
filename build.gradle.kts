plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.10" apply false
}

allprojects {
    group = "com.example.project"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")

    dependencies {
        testImplementation("org.jetbrains.kotlin:kotlin-test")
    }

    tasks.test {
        useJUnitPlatform()
    }

    kotlin {
        jvmToolchain(17)
    }
}
