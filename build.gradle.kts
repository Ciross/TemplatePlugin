plugins {
    java
}

group = "me.ciross.template"
version = "0.0.1"

repositories {
	mavenCentral()
	// PaperMC
	maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
	// PaperMC
	compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
}
