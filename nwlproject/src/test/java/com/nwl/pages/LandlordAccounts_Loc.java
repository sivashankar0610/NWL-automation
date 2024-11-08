package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class LandlordAccounts_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='usage-break-down-title']/h5") WebElement txtMyUsageBreakdown;
	@FindBy(xpath="//div[@class='mb-10 your-usage-gdpr-landlord-message']/p") WebElement txtGDPRLandlordMessage;
	@FindBy(xpath="//p[@class='user-guide-detail']") WebElement linkUserGuide;
	@FindBy(id="daily") WebElement btnDaily;
	@FindBy(id="weekly") WebElement btnWeekly;
	@FindBy(id="monthly") WebElement btnMonthly;
	@FindBy(id="yearly") WebElement btnYearly;

	public LandlordAccounts_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//LandlordAccounts.properties");
	}

	public void verifyDailyConsumptionGraphShouldBeDisabled() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyUsageBreakdown);
		Assert.assertEquals(true, txtGDPRLandlordMessage.getText().contains(c.getData("gdprLandlordMessage")));
		Assert.assertEquals(true, linkUserGuide.isDisplayed());
		Assert.assertEquals(true, !btnDaily.isEnabled());
		Assert.assertEquals(true, btnWeekly.isEnabled());
		Assert.assertEquals(true, btnMonthly.isEnabled());
		Assert.assertEquals(true, btnYearly.isEnabled());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyUsageBreakdown);
	}

}
