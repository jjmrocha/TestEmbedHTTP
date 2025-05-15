plugins {
    id("java")
    application
}

group = project.properties["GROUP"].toString()
version = project.properties["VERSION_NAME"].toString()

java {
    sourceCompatibility = JavaVersion.toVersion("21")
    targetCompatibility = JavaVersion.toVersion("21")
}

repositories {
    mavenLocal()
    mavenCentral()
}

var embedhttpVersion = "0.5.4"

dependencies {
    implementation("net.uiqui:embedhttp:$embedhttpVersion")
}

application {
    mainClass = "net.uiqui.apptest.Main"
}
