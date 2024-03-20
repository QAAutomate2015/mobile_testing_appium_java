package dashboard;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage implements iDashboardPage {
	
	private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

	@Override
	public void clickTelehealthElement() {
		driver.findElement(By.id("telehealth")).click();
		
	}
}
