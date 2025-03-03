plugins {
    id("java")
    id("com.github.ben-manes.versions") version ("0.50.0")
    id("checkstyle")
    jacoco
    application
}
application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
tasks.jacocoTestReport { reports { xml.required.set(true) } }