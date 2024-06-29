package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ApkRun {

    @Test
    public static void apkRunMethod() throws MalformedURLException {

        UiAutomator2Options options= new UiAutomator2Options()
                .setPlatformName("Android")
                .setPlatformVersion("12.0")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setDeviceName("WebDriverIO")
                .setAppPackage("com.wdiodemoapp")
                .setAppActivity("com.wdiodemoapp.MainActivity")
                .setNoReset(true);

        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/"),options);

    }
}
