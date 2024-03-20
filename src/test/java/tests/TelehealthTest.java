package tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import auth.LoginPage;
import auth.iLoginPage;
import dashboard.DashboardPage;
import dashboard.iDashboardPage;
import telehealthvisit.iTelehealthVisitPage;
import telehealthvisit.TelehealthVisitPage;

import org.openqa.selenium.WebElement;


public class TelehealthTest extends BaseTest{
	@Test
    public void scheduleTelehealthVisit() {
        iLoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");
        loginPage.clickLoginButton();

        // Navigate to telehealth page
        iDashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickTelehealthElement();

        iTelehealthVisitPage telehealthvisitPage = new TelehealthVisitPage(driver);
        telehealthvisitPage.scheduleTelehealthVisit();
        
        WebElement successMessageElement = driver.findElement(By.id("successMessageId"));
        String successMessage = successMessageElement.getText();
        Assert.assertEquals(successMessage, "Request is successful", "Telehealth visit scheduling was not successful.");
    }
}
