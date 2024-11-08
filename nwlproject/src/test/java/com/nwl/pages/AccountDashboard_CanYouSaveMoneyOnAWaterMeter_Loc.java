package com.nwl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nwl.framework.BasePage;

public class AccountDashboard_CanYouSaveMoneyOnAWaterMeter_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block better-off maybe-better-off']/following-sibling::a[2]") WebElement linkHowCanIUseLessWater;
	@FindBy(xpath="//div[@class='breadcrumb-base']/ul/li[3]") WebElement txtSavingWater;

	public AccountDashboard_CanYouSaveMoneyOnAWaterMeter_Loc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void redirectedToSavingMeterPage() throws Exception {
		linkHowCanIUseLessWater.click();
		elementVisible(100, txtSavingWater);
		Thread.sleep(500);
	}

}
