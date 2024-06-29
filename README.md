
# Appium TestNG Mobile Automation Testing

This project uses Appium and TestNG for automating tests on mobile applications. The project is configured to run tests on Android devices.

## Requirements

- Java 11+
- Maven 3.6+
- Android SDK
- Appium Server
- An Android Emulator or Real Device

## Project Structure

```plaintext
Appium_TestNG_MobileAutomationTesting/
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

1. **Java Installation**
   - Install Java JDK 11 or later.
   - Set JAVA_HOME and PATH environment variables.

2. **Maven Installation**
   - Download and install Maven from [here](https://maven.apache.org/download.cgi).
   - Set MAVEN_HOME and PATH environment variables.

3. **Android SDK Installation**
   - Install Android Studio and configure the Android SDK.
   - Set ANDROID_HOME and PATH environment variables.

4. **Appium Server Installation**
   - Download and install Appium Desktop from [here](https://github.com/appium/appium-desktop/releases).
   - Start Appium.

5. **Loading Project Dependencies**
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
