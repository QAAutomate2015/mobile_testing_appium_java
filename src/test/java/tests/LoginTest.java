package tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import auth.LoginPage;
import auth.iLoginPage;

import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {

	@Test
    public void loginTest() {
        iLoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");
        loginPage.clickLoginButton();
        Assert.assertTrue(isLoggedIn());
    }

    private boolean isLoggedIn() {
    	try {
            WebElement logoutButton = driver.findElement(By.id("logoutButtonId"));
            
            // If the logout button is displayed, the user is logged in
            return logoutButton.isDisplayed();
        } catch (NoSuchElementException e) {
            // If the logout button is not found, the user is not logged in
            return false;
        }
    }

	
}