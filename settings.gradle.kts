rootProject.name = "otusJava"
include("L01-gradle")

include("L02-gradle2")
include("L02-gradle2-libApi")
include("L02-gradle2-libApiUse")
include("L02-logging")

include("L03-qa")
include("L04-generics")
include("L05-collections")
include("L06-annotations")
include("L08-gc")
include("L10-aop")
include("L12-solid")
include("L15-patterns")
include("L16-io")
include("L18-jdbc")
include("L21-hibernate")
include("L22-cache")
include("L24-web-server")
include("L25-IoC")
include("L28-springdata-jdbc")
include("L31-synchronized")
include("L33-concurrent-collections")

pluginManagement {
    val jgitver: String by settings
    val dependencyManagement: String by settings
    val springframeworkBoot: String by settings
    val johnrengelmanShadow: String by settings
    val jib: String by settings
    val protobufVer: String by settings
    val sonarlint: String by settings
    val spotless: String by settings
    val lombok: String by settings

    plugins {
        id("fr.brouillard.oss.gradle.jgitver") version jgitver
        id("io.spring.dependency-management") version dependencyManagement
        id("org.springframework.boot") version springframeworkBoot
        id("com.github.johnrengelman.shadow") version johnrengelmanShadow
        id("com.google.cloud.tools.jib") version jib
        id("com.google.protobuf") version protobufVer
        id("name.remal.sonarlint") version sonarlint
        id("com.diffplug.spotless") version spotless
        id("io.freefair.lombok") version lombok
    }
}