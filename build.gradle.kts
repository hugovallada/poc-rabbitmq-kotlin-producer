import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.1"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.0"
	kotlin("plugin.spring") version "1.6.0"
}

group = "com.github.hugovallada"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}



tasks.withType<Test> {
	useJUnitPlatform()
}



subprojects {


	version = "1.0.0"
	repositories{
		mavenCentral()
	}

	apply{
		plugin("io.spring.dependency-management")
		plugin("org.jetbrains.kotlin.jvm")
	}

	tasks.withType<JavaCompile> {
		sourceCompatibility = JavaVersion.VERSION_11.majorVersion
		targetCompatibility = JavaVersion.VERSION_11.majorVersion
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "11"
		}
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation(kotlin("test"))
	}


}
