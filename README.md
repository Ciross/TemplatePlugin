# <img src="https://cdn.icon-icons.com/icons2/159/PNG/96/java_22523.png" width="35px" /> Plugin Template
This is a basic Minecraft Java Plugin template using Gradle.
 The goal of this repository is to provide the most clean setup to start making your plugin with.

⚙️ Prerequisites
----------------
Correct [Java SDK](https://adoptium.net/temurin/releases/) (latest LTS - here Java 21)
 [Gradle](https://gradle.org/install/) (here 8.7)

🖥️ Build
--------
Before doing anything you should get the **gradle's wrapper** to be able to compile the project. To get it, run this command inside the project's directory:
```shell
gradle wrapper
```

Then to build the project you can simply run the command:
```shell
./gradlew build
```

The builded `.jar` will be located inside `build/libs`