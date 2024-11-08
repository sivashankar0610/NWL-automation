package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class AccountDashboard_UpdateMyDetails_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-usage-box text-center accountSummary__accountDetails']/div/h4") WebElement txtAboutYourAccount;
	@FindBy(xpath="//p[@class='account-id account__details']/span[1]") WebElement txtAccountNumber;
	@FindBy(xpath="(//i[@class='copy-icon far fa-copy'])[2]") WebElement btnCopyAccountNumber;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-change-detail']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="(//div[@class='alert__content'])[1]/p[1]") WebElement txtAlertMsgTeaser1;
	@FindBy(xpath="(//div[@class='alert__content'])[1]/p[2]") WebElement txtAlertMsgTeaser2;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block confirm-btn'])[1]") WebElement btnConfirm;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block back-btn'])[1]") WebElement btnGoBack;
	
	public AccountDashboard_UpdateMyDetails_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//AccountDashboard_UpdateMyDetails.properties");
	}

	public void verifyAboutYourAccountSection(String accNo) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYourAccount);
		Assert.assertEquals(true, txtAccountNumber.getText().equalsIgnoreCase(accNo));
		Assert.assertEquals(true, btnCopyAccountNumber.isDisplayed());
		Assert.assertEquals(true, btnUpdateMyDetails.isDisplayed());
	}

	public void displayAlertPopup() throws Exception {
		btnUpdateMyDetails.click();
		elementVisible(100, txtAlertMsgTeaser1);
		Assert.assertEquals(true, txtAlertMsgTeaser1.getText().contains(c.getData("alertMsgTeaser1")));
		Assert.assertEquals(true, txtAlertMsgTeaser2.getText().contains(c.getData("alertMsgTeaser2")));
		Assert.assertEquals(true, btnConfirm.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
	}
	
}
