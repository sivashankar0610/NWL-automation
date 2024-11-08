package com.nwl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Notifications_UpdateTelephoneNo_Loc extends BasePage {
	
	@FindBy(xpath="//div[@id='update-phone-number']/div/div[1]/a") WebElement btnPhoneNoInfoIcon;
	@FindBy(xpath="//div[@id='update-phone-number']/div/div[1]/div/span") WebElement txtPhoneNoInfoIcon;
	@FindBy(xpath="//div[@id='update-phone-number']/div/div[1]/div/a") WebElement btnPhoneNoInfoIconClose;
	@FindBy(id="telephone-number") WebElement txtPhoneNo;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[5]") WebElement btnUpdate;
	@FindBy(xpath="//span[@class='form-error']/p") WebElement txtPhoneNoErrorMsg;
	@FindBy(xpath="//div[@class='tab_actions_title']/h5") WebElement txtNotifications;
	@FindBy(xpath="(//input[@class='success-text'])[1]") WebElement txtSuccessMsg;
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
    @FindBy(xpath="//label[@class='lbl-tel']") WebElement txtPhoneNo2;
    
    @FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//label[@oralabel='person/personId']") WebElement txtCCBPersonID;
    
    String phoneNumber;

	public Notifications_UpdateTelephoneNo_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Notifications_UpdatePhoneNo.properties");
	}

	public void verifyPhoneNoSection() throws Exception {
		btnPhoneNoInfoIcon.click();
		elementVisible(100, txtPhoneNoInfoIcon);
		Assert.assertEquals(true, txtPhoneNoInfoIcon.getText().contains(c.getData("phoneNoInformationText")));
		Thread.sleep(500);
		btnPhoneNoInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtPhoneNo.isDisplayed());
		Assert.assertEquals(true, btnUpdate.isDisplayed());		
	}

	public void clicksOnUpdateButton() throws Exception {
		btnUpdate.click();
		elementVisible(100, txtPhoneNoErrorMsg);
		Assert.assertEquals(true, txtPhoneNoErrorMsg.getText().contains(c.getData("phoneNoErrorMsg")));
	}

	public void providesPhoneNo(String phoneNo) throws Exception {
		phoneNumber=phoneNo;
		txtPhoneNo.sendKeys(phoneNo);
		Thread.sleep(500);
	}

	public void shouldNotdisplayPhoneNoSection() throws Exception {
		btnUpdate.click();
		Thread.sleep(5000);
		elementVisible(100, txtNotifications);
		System.out.println(txtSuccessMsg.getAttribute("value"));
	}

	public void verifyPhoneNoUnderMyProfileTab() throws Exception {
		elementVisible(100, tabMyProfile);
		Thread.sleep(1000);
		tabMyProfile.click();
		elementVisible(100, txtPhoneNo2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyProfile);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPhoneNo2.getText().contains(phoneNumber));
	}

	public void verifyPhoneNoInCCB(String accNo, String ccbUsername, String ccbPwd, String phoneNo) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(accNo);
		btnCCBSearch.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		if (driver.findElement(By.xpath("//td[@class='activeTab']")).getText().contains("Main")) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
			elementVisible(100, btnCCBAccountName);
			btnCCBAccountName.click();
			Thread.sleep(2000);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBPersonID);
	}

}
