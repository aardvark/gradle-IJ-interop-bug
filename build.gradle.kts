plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

task("echo") {
    println("JAVA_HOME: " + System.getenv("JAVA_HOME"))
    println("GRAALVM_HOME: " + System.getenv("GRAALVM_HOME"))
    println("java.vendor.version: " + System.getProperty("java.vendor.version"))
    println("java.vendor: " + System.getProperty("java.vendor"))
}

fun task(c: Char, function: () -> Unit) {
}