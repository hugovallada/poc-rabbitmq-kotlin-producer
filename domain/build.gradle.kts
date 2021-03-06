plugins {
    kotlin("jvm")
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":service"))
    implementation(project(":shared"))
    implementation(kotlin("stdlib"))
}