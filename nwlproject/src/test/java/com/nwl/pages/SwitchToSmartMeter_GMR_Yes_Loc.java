package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class SwitchToSmartMeter_GMR_Yes_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='sub-title'])[3]") WebElement LabelGiveAMeterReading;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnGiveMeterReadingInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtGiveMeterReadingInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnGiveMeterReadingInfoIconClose;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline meterYes']") WebElement btnYes;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline meterNo']") WebElement btnNo;
	@FindBy(xpath="//div[@class='enter-meter-read']/div[1]") WebElement fieldGiveAMeterReading;
	@FindBy(xpath="//div[@class='meter-input']/input") List<WebElement> MeterReadingBox;
	@FindBy(xpath="//div[@class='meter-input']/input[1]") WebElement txtGiveYourMeterReadingHere;
	
	@FindBy(xpath="(//a[@class='tooltip-btn'])[6]") WebElement btnOccupancyInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[6]") WebElement txtOccupancyInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[6]") WebElement btnOccupancyInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement dropdownOccupancy;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span") List<WebElement> dropdownOccupancyOptions;
	@FindBy(xpath="//span[@class='checkbox-label']/p") WebElement txtIAgreeToTermsAndConditions;
	@FindBy(xpath="//span[@class='checkbox-label']/p/strong/a") WebElement linkTermsAndConditions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block meter-confirm']") WebElement btnDone;

	public SwitchToSmartMeter_GMR_Yes_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//SwitchToSmartMeter_GMR_Yes.properties");
	}

	public void selectsNoOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LabelGiveAMeterReading);
		btnGiveMeterReadingInfoIcon.click();
		elementVisible(100, txtGiveMeterReadingInfoIcon);
		Assert.assertEquals(true, txtGiveMeterReadingInfoIcon.getText().contains(c.getData("giveMeterReadingInformationText")));
		Thread.sleep(500);
		btnGiveMeterReadingInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		btnNo.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, dropdownOccupancy.isDisplayed());
		btnOccupancyInfoIcon.click();
		elementVisible(100, txtOccupancyInfoIcon);
		Assert.assertEquals(true, txtOccupancyInfoIcon.getText().contains(c.getData("occupancyInformationText")));
		Thread.sleep(500);
		btnOccupancyInfoIconClose.click();
		Thread.sleep(1000);
	}

	public void changesFromNoToYesOption(String occupancy) throws Exception {
		btnYes.click();
		elementVisible(100, fieldGiveAMeterReading);
		Assert.assertEquals(true, fieldGiveAMeterReading.isDisplayed());
		String reading;
		if (MeterReadingBox.size()==6) {
			reading = "000050";
		} else if (MeterReadingBox.size()==5) {
			reading = "00050";
		} else {
			reading = "0050";
		}
		txtGiveYourMeterReadingHere.sendKeys(reading);
		dropdownOccupancy.click();
		Thread.sleep(2000);
		for (WebElement occupancyOption : dropdownOccupancyOptions) {
			if (occupancyOption.getText().equalsIgnoreCase(occupancy)) {
				occupancyOption.click();
				Thread.sleep(1000);
				break;
			}
		}
		Assert.assertEquals(true, txtIAgreeToTermsAndConditions.getText().contains(c.getData("termsAndConditionsTeaserText")));
		Assert.assertEquals(true, linkTermsAndConditions.isDisplayed());
		Assert.assertEquals(true, btnDone.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LabelGiveAMeterReading);
	}

}
