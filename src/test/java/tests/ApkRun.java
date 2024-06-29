package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.DriverManager;

public class ApkRun {

    private AndroidDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverManager.getAndroidDriver();
    }

    @Test
    public void apkRunMethod() {
        // Locate elements
        AppiumBy loginMenu = new AppiumBy.ByAccessibilityId("Login");
        AppiumBy loginInputEMail = new AppiumBy.ByAccessibilityId("input-email");
        AppiumBy loginInputPassword = new AppiumBy.ByAccessibilityId("input-password");
        By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");

        // Perform actions
        driver.findElement(loginMenu).click();
        driver.findElement(loginInputEMail).sendKeys("test@example.com");
        driver.findElement(loginInputPassword).sendKeys("password123");
        driver.findElement(loginButton).click();
    }

    @AfterClass
    public void tearDown() {
        DriverManager.closeApplication();
    }
}
