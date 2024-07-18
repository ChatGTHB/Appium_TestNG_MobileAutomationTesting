
# Mobile Test Automation Project

![Appium](https://img.shields.io/badge/Appium-6DB33F?style=for-the-badge&logo=appium&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Platform](https://img.shields.io/badge/platform-JVM-blue?style=for-the-badge)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![Node.js](https://img.shields.io/badge/Node.js-43853D?style=for-the-badge&logo=node.js&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

### 🚀 Overview
This project is designed to automate mobile application testing using Appium, TestNG, and Java. It focuses on testing the login functionality of a sample mobile application. The project includes a robust setup for starting and stopping the Appium server, initializing the Android driver, and running TestNG test cases.

### 📋 Table of Contents
- [🚀 Overview](#overview)
- [🔧 Prerequisites](#prerequisites)
- [⚙️ Setup](#setup)
- [📁 Project Structure](#project-structure)
- [▶️ Running the Tests](#running-the-tests)
- [📌 Project Details](#project-details)
- [📝 Logging](#logging)
- [👥 Contributors](#👥-contributors)
- [🤝 Contributing](#contributing)
- [📜 License](#license)
- [📞 Contact](#contact)

### 🔧 Prerequisites
- Java Development Kit (JDK) 11 or higher
- Apache Maven
- Node.js and npm
- Appium Server
- Appium Inspector
- Appium Doctor
- Android SDK
- Android Emulator or a Physical Android Device

### ⚙️ Setup
#### 1. Install JDK
- Download and install JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).
- Set `JAVA_HOME` environment variable.
- **Environment Variable Setup:**
    1. Open the command prompt and run `where java` to find the Java installation path.
    2. Add the Java installation path to the environment variables:
        - `Path`: `C:\Program Files\Java\jdk-11\bin`
        - `JAVA_HOME`: `C:\Program Files\Java\jdk-11`
        - Add `%JAVA_HOME%\bin` to the system `Path`.

#### 2. Install Maven
- Download and install Maven from [Maven](https://maven.apache.org/download.cgi).
- Set `MAVEN_HOME` environment variable.

#### 3. Install and Upgrade Node.js and Appium
- Install Node.js from [Node.js](https://nodejs.org/).
- Run the following commands in the command prompt:
  ```bash
  npm install -g appium
  npm install -g appium@next
  appium -v
  ```

#### 4. Install Appium Doctor
- Run the following commands in the command prompt:
  ```bash
  npm install @appium/doctor --location=global
  appium-doctor --android
  ```

#### 5. Install Appium Server
- Download the Appium Desktop application from [Appium](https://appium.io/downloads.html) and install it.
- Alternatively, you can start the Appium server from the command line:
  ```bash
  appium
  ```

#### 6. Install UiAutomator2 (for Android)
- Run the following commands in the command prompt:
  ```bash
  appium driver install uiautomator2
  appium driver list
  ```

#### 7. Install XCUITest (for iOS on MacOS)
If you are using MacOS and need to test iOS devices, you should install the XCUITest driver:
  ```bash
  appium driver install xcuitest
  ```

#### 8. Install Android SDK
- Download and install the Android SDK from [Android Studio](https://developer.android.com/studio).
- **Environment Variable Setup:**
    - Add the following to the system environment variables:
        - `ANDROID_HOME`: `C:\Users\YourUsername\AppData\Local\Android\Sdk`
        - `Path`:
            - `%ANDROID_HOME%\platform-tools`
            - `%ANDROID_HOME%\cmdline-tools`

- **SDK Setup in Android Studio:**
    1. Open Android Studio and go to `More actions` > `SDK Manager`.
    2. Under `SDK Platforms`, ensure `Android API 34` is selected.
    3. Under `SDK Tools`, ensure the following are installed:
        - `Android SDK Build-Tools 34`
        - `Android SDK Command Line Tools`
        - `Android SDK Tools (Obsolete)` (Uncheck "Hide Obsolete Packages" to see this)
        - `Android Emulator`
        - `Android Emulator hypervisor driver (for AMD processors)`
        - `Android SDK Platform-Tools`
        - `Intel x86 Emulator Accelerator (HAXM installer)` (Ensure virtualization is enabled in BIOS)

#### 9. Emulator Setup
- For AMD processors, ensure `Android Emulator Hypervisor Driver for AMD Processors (installer)` is selected and applied.

#### 10. Windows Features
- Open Windows Features and ensure the following are NOT selected:
    - `Hyper-V`
    - `Virtual Machine Platform`
    - `Windows Hypervisor Platform`

#### 11. Install Appium Inspector
Appium Inspector is a tool for inspecting mobile applications. To install it, download the latest version from the [Appium Inspector releases page](https://github.com/appium/appium-inspector/releases) and follow the installation instructions for your operating system.

### 📁 Project Structure
```plaintext
Appium_TestNG_MobileAutomationTesting
├── .idea
├── src
│   ├── apk
│   ├── main
│   └── test
│       └── java
│           └── com
│               └── webdriverio
│                   ├── base
│                   ├── pages
│                   ├── tests
│                   └── utils
│       └── resources
│           └── logs
│               └── log4j2.xml
├── target
├── .gitignore
├── Appium_TestNG_MobileAutomationTesting.iml
├── LICENSE
├── pom.xml
├── README.md
└── testng.xml
```

- **com.webdriverio.base**: Contains base classes for the project.
- **com.webdriverio.pages**: Contains page object classes for the mobile application.
- **com.webdriverio.tests**: Contains TestNG test classes.
- **com.webdriverio.utils**: Contains utility classes for the project.
- **resources.logs**: Contains log configuration files.

### ▶️ Running the Tests
**Important**: Ensure that your Android device or emulator is running and properly configured before executing the tests.

#### Using Maven
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/ChatGTHB/Appium_TestNG_MobileAutomationTesting.git
   cd Appium_TestNG_MobileAutomationTesting
   ```

2. **Start Android Emulator or Connect a Physical Device**:
    - Start your Android emulator from Android Studio or connect a physical device via USB and ensure it is in developer mode.

3. **Run the Tests**:
    - Use Maven to run the tests:
      ```bash
      mvn clean test
      ```

#### Using TestNG in IDE
1. **Start Android Emulator or Connect a Physical Device**:
    - Start your Android emulator from Android Studio or connect a physical device via USB and ensure it is in developer mode.

2. **Run the Tests from LoginTest Class**:
    - Open the `LoginTest` class in your IDE.
    - Right-click on the class or the test method and select `Run 'LoginTest'` or `Run 'testLogin'`.

### 📌 Project Details
- **AppiumServer Class**: Manages the Appium server lifecycle.
- **DriverManager Class**: Handles the initialization of the Android driver.
- **LoginPage Class**: Contains methods to interact with the login page.
- **LoginTest Class**: Contains TestNG test cases for verifying the login functionality.

### 📝 Logging
The project uses Log4j2 for logging. Configuration is set in the `log4j2.xml` file located in the `src/test/resources/logs` directory. Logs provide detailed information about the test execution and any issues encountered.

### 👥 Contributors
- [ChatGTHB](https://github.com/ChatGTHB)

### 🤝 Contributing
Contributions are welcome! Please fork the repository and create a pull request.

### 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### 📞 Contact
For any questions or suggestions, please open an issue or contact the repository owner.
