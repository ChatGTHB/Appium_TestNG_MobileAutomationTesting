package com.webdriverio.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class LoginPage {

    private AndroidDriver driver;
    private WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    private By loginMenu = new AppiumBy.ByAccessibilityId("Login");
    private By userNameInputEmail = new AppiumBy.ByAccessibilityId("input-email");
    private By userNameInputPassword = new AppiumBy.ByAccessibilityId("input-password");
    private By loginButton = new AppiumBy.ByAccessibilityId("button-LOGIN");
    private By successLoginMessages = By.id("android:id/message");
    private By loginOkButton = By.id("android:id/button1");

    /**
     * Constructor for the LoginPage class.
     * @param driver the AndroidDriver instance.
     */
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Opens the login menu.
     */
    public void openLoginMenu() {
        logger.info("Opening login menu.");
        wait.until(ExpectedConditions.elementToBeClickable(loginMenu)).click();
    }

    /**
     * Enters the email in the email input field.
     * @param email the email to be entered.
     */
    public void enterEmail(String email) {
        logger.info("Entering email: {}", email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameInputEmail)).sendKeys(email);
    }

    /**
     * Enters the password in the password input field.
     * @param password the password to be entered.
     */
    public void enterPassword(String password) {
        logger.info("Entering password.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameInputPassword)).sendKeys(password);
    }

    /**
     * Clicks the login button.
     */
    public void clickLoginButton() {
        logger.info("Clicking login button.");
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    /**
     * Retrieves the success message after login.
     * @return the success message text.
     */
    public String getSuccessMessage() {
        logger.info("Getting success message.");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successLoginMessages)).getText();
    }

    /**
     * Clicks the OK button on the success message dialog.
     */
    public void clickOkButton() {
        logger.info("Clicking OK button.");
        wait.until(ExpectedConditions.elementToBeClickable(loginOkButton)).click();
    }
}
