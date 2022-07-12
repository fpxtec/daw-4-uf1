plugins { id("application") }

application { mainClass.set("daw4.uf1.App") }

repositories { mavenCentral() }

dependencies {
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("org.glassfish.jersey.containers:jersey-container-jetty-http:2.23.1")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
