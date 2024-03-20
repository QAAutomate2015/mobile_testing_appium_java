package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import config.AndroidConfig;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTest {
	protected AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", AndroidConfig.PLATFORM_NAME);
        capabilities.setCapability("deviceName", AndroidConfig.DEVICE_NAME);
        capabilities.setCapability("app", AndroidConfig.APP_PATH);
        
        // Add more desired capabilities as needed

        URL appiumServerURL = new URL(AndroidConfig.APPIUM_SERVER_URL);
        driver = new AndroidDriver<>(appiumServerURL, capabilities);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
