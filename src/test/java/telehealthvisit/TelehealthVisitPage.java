package telehealthvisit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import auth.iLoginPage;

public class TelehealthVisitPage implements iTelehealthVisitPage{
	 private AppiumDriver<MobileElement> driver;

	    // Constructor
	    public TelehealthVisitPage(AppiumDriver<MobileElement> driver) {
	        this.driver = driver;
	    }

	    @Override
	    public void scheduleTelehealthVisit() {
	    	MobileElement telehealthButton = driver.findElement(By.id("telehealthButtonId"));
	        telehealthButton.click();

	        MobileElement doctorDropdown = driver.findElement(By.id("doctorDropdownId"));
	        doctorDropdown.click();
	        MobileElement selectedDoctor = driver.findElement(By.xpath("//android.widget.TextView[@text='Dr. John Doe']"));
	        selectedDoctor.click();

	        MobileElement dateField = driver.findElement(By.id("dateFieldId"));
	        dateField.click();
	        MobileElement selectDate = driver.findElement(By.id("selectedDateId"));
	        selectDate.click();

	        MobileElement submitButton = driver.findElement(By.id("submitButtonId"));
	        submitButton.click();
	    }

}
