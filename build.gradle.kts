plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // import lombok for getter and setter
    implementation("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")

    // install jersey-media-json-jackson
    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:3.1.8")
    // Jakarta RESTful Web Services API
    implementation("jakarta.ws.rs:jakarta.ws.rs-api:3.1.0")

    // Jersey Core for Jakarta RESTful Web Services
    implementation("org.glassfish.jersey.core:jersey-server:3.1.8")

    // Grizzly HTTP server for embedded use
    implementation("org.glassfish.jersey.containers:jersey-container-grizzly2-http:3.1.8")

    // Jersey Dependency Injection
    implementation("org.glassfish.jersey.inject:jersey-hk2:3.1.8")

    implementation("org.glassfish.jaxb:jaxb-runtime:4.0.5")
}

tasks.test {
    useJUnitPlatform()
}