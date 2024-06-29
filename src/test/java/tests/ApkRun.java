package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ApkRun {

    private AppiumDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        driver = createDriver();
    }

    @Test
    public void apkRunMethod() {
        AppiumBy loginMenu= new AppiumBy.ByAccessibilityId("Login");
        AppiumBy loginInputEMail= new AppiumBy.ByAccessibilityId("input-email");
        AppiumBy loginInputPassword= new AppiumBy.ByAccessibilityId("input-password");
        By loginButton=By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private AppiumDriver createDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setPlatformVersion("12.0")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setDeviceName("WebDriverIO")
                .setAppPackage("com.wdiodemoapp")
                .setAppActivity("com.wdiodemoapp.MainActivity")
                .setNoReset(true);

        return new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);
    }
}