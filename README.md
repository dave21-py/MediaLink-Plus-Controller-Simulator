<p align="center">
  <!-- Replace with your own logo if you like -->
  <img width="160px" src="logo.png" alt="MediaLink Simulator logo" />
  <h2 align="center">MediaLink‑Plus Controller Simulator</h2>
  <p align="center">A JavaFX clone of an Extron EB‑50 AV control panel.</p>
</p>

<p align="center">
  <!-- Shields.io badges -->
  <img alt="Java"   src="https://img.shields.io/badge/Java-21+-ED8B00?logo=openjdk&logoColor=white" />
  <img alt="JavaFX" src="https://img.shields.io/badge/JavaFX-23.0-FF0000?logo=java&logoColor=white" />
  <img alt="Gradle" src="https://img.shields.io/badge/Gradle-8.x-02303A?logo=gradle&logoColor=white" />
  <img alt="VS Code" src="https://img.shields.io/badge/VS%20Code-0078D4?logo=visualstudiocode&logoColor=white" />
  <img alt="Git"    src="https://img.shields.io/badge/Git-E44C30?logo=git&logoColor=white" />
  <img alt="Stars"  src="https://img.shields.io/github/stars/bjucps209/group-project-team-jd?style=social" />
</p>

<p align="center">
  <a href="demo.mp4">View Demo</a> ·
  <a href="https://github.com/bjucps209/group-project-team-jd/issues/new?labels=bug&template=bug_report.md">Report Bug</a> ·
  <a href="https://github.com/bjucps209/group-project-team-jd/issues/new?labels=enhancement&template=feature_request.md">Request Feature</a>
</p>

---

## ❔ Overview

The **MediaLink‑Plus Controller Simulator** is a JavaFX GUI that mirrors the look‑and‑feel of an Extron EB‑50‑style AV control panel. It lets users:

* Toggle system **ON / OFF** with realistic LED feedback  
* Switch sources between **HDMI** and **Wireless** inputs  
* Adjust **Volume** via a virtual encoder ring  
* Observe state changes in real‑time just like a physical controller  

Built for AV‑technician training, UI prototyping, or as a portfolio showcase demonstrating JavaFX component design.

---

## 👀 Demo

🎬 [Watch the demo](demo.mp4)

### ✨ Simulator Screen
<p align="center">
  <img src="Screenshot 2025-06-01 at 10.09.28 PM.png" width="400" alt="Simulator Screen">
</p>

---

#### System Requirements
> Tested on macOS & Windows (Java 21, Gradle 8).

---

## 🛠️ Quick Start

```bash
# 1) Clone the repo
git clone https://github.com/bjucps209/group-project-team-jd.git
cd group-project-team-jd

# 2) Build & run (macOS/Linux)
./gradlew clean run

#    Windows PowerShell
.\gradlew.bat clean run
```
#### Gradle Setup

```bash
gradle init --type java-application --dsl groovy --package app --test-framework junit-jupiter --use-defaults --overwrite 
```
#### Gradle commands

```bash
gradle clean build
```

```bash
gradle run
```

#### JavaFX Setup
##### Add a line to app/build.gradle
```bash
plugins {
    id 'application'
    id 'jacoco'
    id 'org.openjfx.javafxplugin' version '0.1.0'
}
```
#### Add a new block to the bottom of app/build.gradle:
```bash
javafx {
    version = "23.0.1"
    modules = [ 'javafx.controls', 'javafx.fxml', 'javafx.media' ]
}
```
