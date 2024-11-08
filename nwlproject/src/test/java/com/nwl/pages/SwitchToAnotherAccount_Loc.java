package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;

public class SwitchToAnotherAccount_Loc extends BasePage {
	
	@FindBy(id="recaptcha-demo-submit") WebElement btnLogin;
	@FindBy(xpath="(//div[@class='form-select'])[3]") WebElement dropdownSelectAccount;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> txtAccountNumber;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[8]") WebElement btnContinue;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnSwitchToDifferentAddress;
	
	@FindBy(xpath="//div[@class='wp-usage-box text-center accountSummary__accountDetails']/div/h4") WebElement txtAboutYourAccount;
	@FindBy(xpath="//p[@class='account-id account__details']") WebElement txtAccNo;
	@FindBy(xpath="(//div[@class='form-select selected'])[1]") WebElement dropdownSelectedAccount;
	@FindBy(xpath="//span[@class='sel__box__options']") WebElement btnAnotherAccount;

	public SwitchToAnotherAccount_Loc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userclicksOnLoginButtonAndSelectAccount(String accNo) throws Exception{
		btnLogin.click();
		elementVisible(200, dropdownSelectAccount);
		dropdownSelectAccount.click();
		Thread.sleep(3000);
		for (WebElement element : txtAccountNumber) {
			String str = new String(element.getText().substring(0, 10));
			if (str.equalsIgnoreCase(accNo)) {
				element.click();
				break;
			}
		}
		Thread.sleep(2000);	
	}
	
	public void userClicksOnContinueButton() throws Exception{
		btnContinue.click();
		elementVisible(200, btnSwitchToDifferentAddress);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSwitchToDifferentAddress);
		Assert.assertEquals(true, btnSwitchToDifferentAddress.isDisplayed());
	}
	
	public void verifyAccountDetails(){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYourAccount);
	}
	
	public void clicksOnSwitchToAnotherAccountButtonAndSelectAnotherProperty() throws Exception{
		Thread.sleep(1000);
		btnSwitchToDifferentAddress.click();
		elementVisible(200, btnContinue);
		Thread.sleep(3000);
		dropdownSelectedAccount.click();
		elementVisible(100, btnAnotherAccount);
		btnAnotherAccount.click();
		Thread.sleep(1000);
	}	

}
