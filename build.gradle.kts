plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://jitpack.io")
    }
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api(libs.io.github.mooy1.infinitylib)
    api(libs.org.jetbrains.annotations)
    compileOnly(libs.org.spigotmc.spigot.api)
    compileOnly(libs.com.github.slimefun.slimefun4)
    compileOnly(libs.com.google.code.findbugs.jsr305)
}

group = "me.waleks"
version = "2.2.0+orchid"
description = "SimpleMaterialGenerators"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
