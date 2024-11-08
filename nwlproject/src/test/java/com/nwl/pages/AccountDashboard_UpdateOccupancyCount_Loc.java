package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class AccountDashboard_UpdateOccupancyCount_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-your-usage-unmetered']/h5") WebElement txtMyWaterMeter;
	@FindBy(xpath="//div[@class='wp-your-usage-unmetered']/div[1]/p") WebElement txtYourHomeIs;
	@FindBy(xpath="//div[@class='wp-your-usage-unmetered']/div[1]/div") WebElement txtUnmetered;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnUnmeteredInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtUnmeteredInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnUnmeteredInfoIconClose;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-am-i-better-meter']") WebElement btnCanISaveMoneyOnAMeter;
	@FindBy(xpath="//div[@class='wp-your-property-information']/strong") WebElement txtWhatWouldYouLikeToDo;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-am-i-better-off']") WebElement btnCanYouSaveMoneyOnAWaterMeter;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-request-a-water-meter nb-btn-outline']") WebElement btnApplyForAWaterMeter;
	@FindBy(xpath="//div[@class='wp-usage-box wp-usage-households']/div/p[1]") WebElement txtOurUsageCalculatorcanEstimate;
	@FindBy(xpath="//div[@class='form-row wp-select-households']/div/div") WebElement dropdownPleaseSelect;
		
	public AccountDashboard_UpdateOccupancyCount_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//AccountDashboard_UpdateOccupancyCount.properties");
	}

	public void verifyCanISaveMoneyOnAMeterButton() throws Exception {
		elementVisible(100, txtMyWaterMeter);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyWaterMeter);
		Assert.assertEquals(true, (txtYourHomeIs.getText()+" "+txtUnmetered.getText()).contains(c.getData("unmeteredLabel")));
		/*btnUnmeteredInfoIcon.click();
		elementVisible(100, txtUnmeteredInfoIcon);
		Assert.assertEquals(true, txtUnmeteredInfoIcon.getText().contains(c.getData("unmeteredInformationText")));
		Thread.sleep(500);
		btnUnmeteredInfoIconClose.click();
		Thread.sleep(500);*/
		Assert.assertEquals(true, btnCanISaveMoneyOnAMeter.isDisplayed());
	}

	public void redirectedToCanYouSaveMoneyOnAWaterMeterPage() throws Exception {
		btnCanISaveMoneyOnAMeter.click();
		Thread.sleep(2000);
		elementVisible(100, txtWhatWouldYouLikeToDo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatWouldYouLikeToDo);
		Assert.assertEquals(true, btnCanYouSaveMoneyOnAWaterMeter.isEnabled());
		Assert.assertEquals(true, btnApplyForAWaterMeter.isDisplayed());
		Assert.assertEquals(true, txtOurUsageCalculatorcanEstimate.getText().contains(c.getData("CanYouSaveMoneyOnMeterTeaser")));
		Assert.assertEquals(true, dropdownPleaseSelect.isDisplayed());
	}

}
