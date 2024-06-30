package com.webdriverio.tests;

import com.webdriverio.base.AppiumServer;
import com.webdriverio.pages.LoginPage;
import com.webdriverio.utils.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private AndroidDriver driver;
    private LoginPage loginPage;
    private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);

    /**
     * Sets up the test environment before the test class is executed.
     */
    @BeforeClass
    public void setUp() {
        AppiumServer.start();
        driver = DriverManager.getAndroidDriver();
        loginPage = new LoginPage(driver);
    }

    /**
     * Tests the login functionality.
     */
    @Test
    public void testLogin() {
        logger.info("Starting login test.");
        loginPage.openLoginMenu();
        loginPage.enterEmail("appiumtest@gmail.com");
        loginPage.enterPassword("appiUm.123!");
        loginPage.clickLoginButton();
        String actualText = loginPage.getSuccessMessage();
        logger.info("Actual login message: {}", actualText);
        Assert.assertEquals(actualText, "You are logged in!");
        loginPage.clickOkButton();
    }

    /**
     * Tears down the test environment after the test class has been executed.
     */
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        AppiumServer.stop();
    }
}
