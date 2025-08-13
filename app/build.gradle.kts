plugins {
    application
}

application {
    mainClass.set("com.example.project.app.MainKt")
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":ui"))
    implementation(project(":core-math"))
    implementation(project(":export"))
}
