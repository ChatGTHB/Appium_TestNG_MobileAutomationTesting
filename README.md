
# Mobile Test Automation Project

## Overview

This project is designed to automate mobile application testing using Appium, TestNG, and Java. It focuses on testing the login functionality of a sample mobile application. The project includes a robust setup for starting and stopping the Appium server, initializing the Android driver, and running TestNG test cases.

## Project Structure

```plaintext
Appium_TestNG_MobileAutomationTesting
├── .idea
├── src
│   ├── main
│   └── test
│       └── java
│           └── com
│               └── webdriverio
│                   ├── base
│                   │   └── AppiumServer.java
│                   ├── pages
│                   │   └── LoginPage.java
│                   ├── tests
│                   │   └── LoginTest.java
│                   └── utils
│                       └── DriverManager.java
├── target
├── .gitignore
├── Appiumlog.txt
├── LICENSE
├── pom.xml
├── README.md
└── testng.xml
```

- **com.webdriverio.base**
  - `AppiumServer.java`: Manages the Appium server lifecycle.
  
- **com.webdriverio.pages**
  - `LoginPage.java`: Contains methods to interact with the login page of the mobile application.

- **com.webdriverio.tests**
  - `LoginTest.java`: Contains TestNG test cases for testing the login functionality.

- **com.webdriverio.utils**
  - `DriverManager.java`: Initializes and provides the Android driver.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- Node.js and npm
- Appium Server
- Android SDK
- Android Emulator or a Physical Android Device

## Setup

### 1. Install JDK

- Download and install JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).
- Set `JAVA_HOME` environment variable.

### 2. Install Maven

- Download and install Maven from [Maven](https://maven.apache.org/download.cgi).
- Set `MAVEN_HOME` environment variable.

### 3. Install Node.js and Appium

- Install Node.js from [Node.js](https://nodejs.org/).
- Install Appium globally using npm:
  ```bash
  npm install -g appium
  npm install -g appium-doctor
  ```
- Verify Appium installation:
  ```bash
  appium-doctor --android
  ```

### 4. Set Environment Variables

- `APPIUM_PATH`: Path to Appium's main.js file (usually in the global npm modules directory).
- `NODE_PATH`: Path to Node.js executable.

### 5. Install Android SDK

- Download and install Android Studio from [Android Developers](https://developer.android.com/studio).
- Install necessary SDK tools and platform tools.
- Set `ANDROID_HOME` environment variable.

## Running the Tests

**Important**: Ensure that your Android device or emulator is running and properly configured before executing the tests.

### Using Maven

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

### Using TestNG in IDE

1. **Start Android Emulator or Connect a Physical Device**:
   - Start your Android emulator from Android Studio or connect a physical device via USB and ensure it is in developer mode.

2. **Run the Tests from LoginTest Class**:
   - Open the `LoginTest` class in your IDE.
   - Right-click on the class or the test method and select `Run 'LoginTest'` or `Run 'testLogin'`.

## Project Details

- **AppiumServer Class**: Manages the Appium server lifecycle.
- **DriverManager Class**: Handles the initialization of the Android driver.
- **LoginPage Class**: Contains methods to interact with the login page.
- **LoginTest Class**: Contains TestNG test cases for verifying the login functionality.

## Logging

The project uses SLF4J with Logback for logging. Logs are written to `Appiumlog.txt` and the console, providing detailed information about the test execution and any issues encountered.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, please open an issue or contact the repository owner.