plugins {
    `java-library`
    `maven-publish`
	id("com.gradleup.shadow") version "8.3.0"
	id("xyz.jpenilla.run-paper") version "2.3.1"
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
	implementation("io.github.mooy1:infinitylib:1.3.10")
    implementation("org.jetbrains:annotations:26.0.2")
    compileOnly("org.spigotmc:spigot-api:1.19.4-R0.1-SNAPSHOT")
	compileOnly("com.github.Slimefun:Slimefun4:RC-29")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

group = "me.waleks"
version = "2.5.0+orchid"
description = "SimpleMaterialGenerators"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}

tasks {
	shadowJar {
		relocate("io.github.mooy1", "me.waleks.simplematerialgenerators")
	}

	runServer {
		minecraftVersion("1.20")
		downloadPlugins {
			url("https://blob.build/dl/Slimefun4/Dev/1160")
		}
	}
}

tasks.build {
	dependsOn("shadowJar")
}