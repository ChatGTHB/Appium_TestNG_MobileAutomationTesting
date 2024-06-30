package com.webdriverio.tests;

import com.webdriverio.utils.DriverManager;
import com.webdriverio.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends DriverManager {

    private LoginPage loginPage;
    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    /**
     * Tests the login functionality.
     */
    @Test
    public void testLogin() {
        logger.info("Starting login test.");
        loginPage = new LoginPage(getDriver()); // Initialize LoginPage with the driver from DriverManager
        loginPage.openLoginMenu();
        loginPage.enterEmail("appiumtest@gmail.com");
        loginPage.enterPassword("appiUm.123!");
        loginPage.clickLoginButton();
        String actualText = loginPage.getSuccessMessage();
        logger.info("Actual login message: {}", actualText);
        Assert.assertEquals(actualText, "You are logged in!");
        loginPage.clickOkButton();
    }
}
