plugins {
    id("com.github.ben-manes.versions") version "0.51.0"
    id("org.sonarqube") version "7.1.0.6387"
    checkstyle
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.test {

}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "snevg04_java-project-61")
        property("sonar.organization", "sn-evg-04")
    }
}