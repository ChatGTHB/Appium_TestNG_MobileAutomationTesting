
# Appium TestNG Mobile Automation Testing

## Overview

This project is a comprehensive framework for mobile automation testing using Appium, Cucumber, TestNG, and the Page Object Model (POM) design pattern.

## Features

- Appium for mobile automation
- TestNG for test management
- Support for Android platform
- Configurable via external files

## Project Structure

```
Appium_Cucumber_MobileAutomationTesting/
├── .idea/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── resources/
│   ├── test/
│   │   └── java/
│   │       ├── tests/
│   │       │   └── ApkRun.java
│   │       └── utilities/
│   │           └── DriverManager.java
├── target/
├── .gitignore
├── pom.xml
├── README.md
├── LICENSE
└── testng.xml
```

## Setup

1. Clone the repository:
   ```sh
   git clone https://github.com/ChatGTHB/Appium_TestNG_MobileAutomationTesting.git
   cd Appium_TestNG_MobileAutomationTesting
   ```

2. **Java Installation**
   - Install Java JDK 11 or later.
   - Set JAVA_HOME and PATH environment variables.

3. **Maven Installation**
   - Download and install Maven from [here](https://maven.apache.org/download.cgi).
   - Set MAVEN_HOME and PATH environment variables.

4. **Android SDK Installation**
   - Install Android Studio and configure the Android SDK.
   - Set ANDROID_HOME and PATH environment variables.

5. **Appium Server Installation**
   - Download and install Appium Desktop from [here](https://github.com/appium/appium-desktop/releases).
   - Start Appium.

6. **Loading Project Dependencies**
   - Navigate to the root directory of your project in the terminal or command line.
   - Run the following command to load the Maven dependencies:
     ```sh
     mvn clean install
     ```

## Running the Project

1. **Starting Appium Server**
   - Start the Appium server using Appium Desktop or via terminal.

2. **Starting Android Emulator or Real Device**
   - Start an Android emulator or connect a real device via USB.

3. **Running the Tests**
   - Navigate to the root directory of your project in the terminal or command line.
   - Run the following command to execute the tests:
     ```sh
     mvn test
     ```

## Test Files

- **tests/ApkRun.java**: An example test file.
- **utilities/DriverManager.java**: A utility class that manages the Appium driver.

## Contributing

If you want to contribute to the project, please create a pull request. All contributions are welcome.

## License

This project is licensed under the MIT License. For more information, see the [LICENSE](LICENSE) file.
