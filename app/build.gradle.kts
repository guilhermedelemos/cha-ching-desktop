import java.io.File
import java.io.FileInputStream
import java.util.*
/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4.2/userguide/building_java_projects.html
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("io.freefair.lombok") version "6.4.2"
}

// Memory leak???
val prop = Properties().apply {
    load(FileInputStream(File(rootProject.rootDir, "app/src/main/resources/application.properties")))
}
val customVersion: String = prop.getProperty("version")

version = customVersion
// description = "aaaa"
// group = "bbbb"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.1-jre")
    // implementation("commons-io:commons-io:2.6")

    implementation("org.apache.logging.log4j:log4j-api:2.17.2")
    implementation("org.apache.logging.log4j:log4j-core:2.17.2")
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.8.1")
        }
    }
}

application {
    // Define the main class for the application.
    mainClass.set("chaching.App")
    applicationDefaultJvmArgs = listOf("-Dgreeting.language=en")
}

java {
    withJavadocJar()
    withSourcesJar()
}

/*tasks.jar {
  manifest {
    archiveFileName.set("${project.name}-AAA-${project.version}.jar")
  }
}*/
