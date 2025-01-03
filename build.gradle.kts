plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Jakarta RESTful Web Services API
    implementation("jakarta.ws.rs:jakarta.ws.rs-api:3.1.0")

    // Jersey Core for Jakarta RESTful Web Services
    implementation("org.glassfish.jersey.core:jersey-server:3.1.8")

    implementation("org.glassfish.jersey.inject:jersey-hk2:3.1.8")

    // JSON Processing
    implementation("jakarta.json:jakarta.json-api:2.0.0")

    implementation("org.eclipse.persistence:org.eclipse.persistence.json:4.0.4")

    // Grizzly HTTP server for embedded use
    implementation("org.glassfish.jersey.containers:jersey-container-grizzly2-http:3.1.8")

    // Jersey Client for calling external REST APIs
    implementation("org.glassfish.jersey.core:jersey-client:3.1.8")

    // Jersey JSON Binding for JSON support with Jakarta
    implementation("org.glassfish.jersey.media:jersey-media-json-binding:3.1.8")


    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")


}

tasks.test {
    useJUnitPlatform()
}