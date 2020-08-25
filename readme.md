# Dreambot 3 Scripts
This is a collection of Dreambot 3 open source scripts for eductional purposes.  The scripts might not be the most advanced or fully featured but hopefully they can be of use to aspiring scripters looking for a place to start.  This repository utilizes Apache Maven for managing external dependencies and building of the scripts.  Anyone is more than welcome to create pull request updating/implmenting new features to the scripts located in this repository.

If you use large sections of a scripts source in your own please let me know I would love to see!

---

## What is Maven?
Maven is a Java build automation tool used to help build and manage your projects.  No more manually adding dependencies to the build path making it awkward and clunky sharing projects with others or developing across multiple environments.

Apache Maven homepage -> https://maven.apache.org/

A solid introduction to Apache Maven guide on YouTube -> https://youtu.be/KNGQ9JBQWhQ

## Why use Maven for Dreambot OSRS scripting?
While these scripts can not be used on the Dreambot SDN for personal script or private script development the less time you spend dealing with environmental issues the more time you have to dedicate towards development!  For large complex OSRS farms that may have many moving parts developers may find it easier to use existing libraries to speed up their development.  Theses libraries could be a simple pre-made JSON library or a developers own dependencies such as custom solvers/handlers or mouse algorithms.  This allows them to write once and easily implement and deploy across their entire farm/collection of scripts.

---

## Managing script dependencies with Maven
### Global dependencies
These dependencies will be available to all scripts/submodules in your project.  An example of this is the Dreambot client.jar which we need to compile our scripts.
### Local dependencies
These dependencies will only be available in their respective project folders.

---

## Building scripts
With this Maven setup all of your scripts built using the provided build plugins will contain any global or local dependencies added by the developer in the respective pom files.  
### Building all scripts at once
Building all of your scripts in a single command is as simple as running the below command in the root project folder.  This will build all of your scripts/submodules at once and place the script named *insert-script-name*-0.0.1-SNAPSHOT-dep-included.jar into your Dreambot scripts folder located ${user.home}/Dreambot/Scripts/.

```sh
# In the root folder of the dreambot-scripts/ folder.

mvn install

# This will result in ALL scripts/submodules listed under the root pom.xml file in the modules section being built.
```
### Building individual or select scripts
If you are only looking to build select scripts from your environment while in the root folder of your project you can run the below command and specify the scripts/submodules you want to build.

```sh
# In the specific script folder (ex dreambot-scripts/yeet-slayerAIO/).

mvn install

# This will result in only yeet-slayAIO being built and not build all of the other scripts in the project.
```

The following command will build multiple selected scripts in a singel command.

```sh
# This is to be ran inside the root project folder (dreambot-scripts/).

mvn -pl yeet-slayerAIO, yeet-flipper -amd install

# This will result in only yeet-slayerAIO, yeet-flipper being built, all other scripts/submodules will be ignored unless they depend on them.
```