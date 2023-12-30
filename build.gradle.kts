plugins {
    id("java")
    id("application")
}

group = "org.hans.demo"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/com.beust/jcommander
    implementation("com.beust:jcommander:1.81")

}

tasks.test {
    useJUnitPlatform()
}