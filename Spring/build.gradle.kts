plugins {
	java
	application
	id("org.springframework.boot") version "3.4.5"
	id("io.spring.dependency-management") version "1.1.7"
}

group = project.properties["GROUP"].toString()
version = project.properties["VERSION_NAME"].toString()

java {
	sourceCompatibility = JavaVersion.toVersion("21")
	targetCompatibility = JavaVersion.toVersion("21")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
}

application {
	mainClass = "net.uiqui.apptest.Main"
}