package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class AccountClosedMsg_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-your-usage-smart-closed-account-container h-100']/h5") WebElement txtYourWaterMeter;
	@FindBy(xpath="//div[@class='flex-container h-100']/div/p") WebElement txtAccountClosedMsg_AD;
	@FindBy(xpath="//li[@rel='home']") WebElement txtWaterMeterAndUsage;
	@FindBy(xpath="//div[@class='wp-usage-box text-center smart-usage-smart-closed-account']/div/p") WebElement txtAccountClosedMsg_MyUsage;

	public AccountClosedMsg_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//AccountClosedMsg.properties");
	}
	
	public void verifyAccountClosedMsg_AD() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourWaterMeter);
		Thread.sleep(2000);
    	Assert.assertEquals(true, txtAccountClosedMsg_AD.getText().contains(c.getData("closingMessage_AD")));
	}
	
	public void verifyAccountClosedMsg_MyUsage() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterMeterAndUsage);
    	Assert.assertEquals(true, txtAccountClosedMsg_MyUsage.getText().contains(c.getData("closingMessage_MyUsage")));
	}

}
