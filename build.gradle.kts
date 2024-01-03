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
    implementation("com.beust:jcommander:1.81")
    implementation("io.github.openfeign:feign-core:13.1")
    implementation("io.github.openfeign:feign-gson:13.1")
}

tasks.test {
    useJUnitPlatform()
}