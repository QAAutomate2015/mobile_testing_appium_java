package auth;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;

public class LoginPage implements iLoginPage {
    private AppiumDriver<MobileElement> driver;

    // Constructor
    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @Override
    public void enterUsername(String username) {
        MobileElement usernameField = driver.findElement(By.id("com.doc.app:id/usernameInput"));
        usernameField.sendKeys(username);
    }

    @Override
    public void enterPassword(String password) {
        MobileElement passwordField = driver.findElement(By.id("com.doc.app:id/passwordInput"));
        passwordField.sendKeys(password);
    }

    @Override
    public void clickLoginButton() {
        MobileElement loginButton = driver.findElement(By.id("com.doc.app:id/loginButton"));
        loginButton.click();
    }
}