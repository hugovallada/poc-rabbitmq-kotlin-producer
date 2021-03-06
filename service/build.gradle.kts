import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
    kotlin("plugin.allopen")
}

dependencies {
    implementation(project(":client"))
    implementation(project(":domain"))
    implementation(project(":shared"))
    implementation("org.springframework.boot:spring-boot-starter-amqp")
    implementation(kotlin("stdlib"))
}