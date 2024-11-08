package com.nwl.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import com.nwl.framework.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class ServiceHooks extends BasePage{
	
	@AfterStep
	public void endTest(Scenario scenario) throws Exception {
				
		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "Screenshot_Failure");
			}
			catch (WebDriverException e) {
				e.printStackTrace();
			}
		}
		
		else {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "Screenshot_Success");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@After
	public void closeBrowser() {
		//driver.quit();
	}

}
