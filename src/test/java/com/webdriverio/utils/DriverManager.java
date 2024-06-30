package com.webdriverio.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.webdriverio.base.AppiumServer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private static AndroidDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(DriverManager.class);

    // Private constructor to prevent instantiation
    protected DriverManager() {}

    /**
     * Returns an instance of the AndroidDriver.
     * Starts the Appium server if not already started.
     * @return AndroidDriver instance
     */
    public static AndroidDriver getDriver() {
        if (driver == null) {
            AppiumServer.start();
            UiAutomator2Options options = getUiAutomator2Options();
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
                logger.info("AndroidDriver initialized successfully.");
            } catch (MalformedURLException e) {
                logger.error("Failed to initialize Android Driver: Invalid URL", e);
                throw new RuntimeException("Failed to initialize Android Driver: Invalid URL", e);
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }

    /**
     * Configures UiAutomator2 options for the AndroidDriver.
     * @return UiAutomator2Options instance
     */
    private static UiAutomator2Options getUiAutomator2Options() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("12.0");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Emulator");
        options.setAppPackage("com.wdiodemoapp");
        options.setAppActivity("com.wdiodemoapp.MainActivity");
        return options;
    }

    /**
     * Closes the application and quits the driver.
     * Stops the Appium server.
     */
    public static void closeApplication() {
        if (driver != null) {
            driver.quit();
            driver = null;
            AppiumServer.stop();
            logger.info("Application closed and AndroidDriver instance terminated.");
        }
    }

    /**
     * Sets up the test environment before the test class is executed.
     */
    @BeforeClass
    public void setUp() {
        getDriver();
    }

    /**
     * Tears down the test environment after the test class has been executed.
     */
    @AfterClass
    public void tearDown() {
        closeApplication();
    }
}
