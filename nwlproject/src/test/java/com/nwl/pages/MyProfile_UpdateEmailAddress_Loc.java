package com.nwl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class MyProfile_UpdateEmailAddress_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='profile-edit profile-form']/div/div[1]/h6") WebElement txtMyPersonalDetails;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[39]") WebElement btnMyEmailAdressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[37]") WebElement txtMyEmailAdressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[39]") WebElement btnMyEmailAdressInfoIconClose;
	@FindBy(id="profile-edit-email") WebElement txtMyEmailAddress;
	@FindBy(id="profile-edit-confirm-email") WebElement txtReEnterNewEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[3]") WebElement btnSaveChanges;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[3]") WebElement btnCancel;
	@FindBy(xpath="//input[@id='profile-edit-confirm-email']/following-sibling::span[2]") WebElement txtConfirmEmailErrorMsg;
	@FindBy(xpath="//input[@id='profile-edit-confirm-email']/following-sibling::span[3]") WebElement txtConfirmEmailSuccessMsg;
	@FindBy(xpath="//div[@class='profile-success-label']/h6") WebElement txtThankYouForTheUpdate;
	@FindBy(xpath="//div[@class='alert__content profile_name_update_content']/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToMyProfile;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changedetail-btn model']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="//div[@class='profile-view']/div[2]/div[1]/h6") WebElement txtMyPersonalDetails_MP;
	@FindBy(xpath="//div[@class='profile-view']/div[2]/div[3]/div") WebElement txtMyEmailAddressLabel_MP;
	@FindBy(xpath="//div[@class='profile-view']/div[2]/div[3]/label") WebElement txtMyEmailAddress_MP;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//label[@oramdlabel='CONTACT_DET_LBL']") WebElement txtCCBContactDetails;
	@FindBy(xpath="//td[@orafield='contactDetailPrimary']") List<WebElement> txtCCBPrimaryList;
	
	@FindBy(xpath="(//p[@class='fc-button-label'])[1]") WebElement btnYopmailConsent;
	@FindBy(id="login") WebElement txtYopmailEmail;
	@FindBy(xpath="//i[@class='material-icons-outlined f36']") WebElement btnYopmailEnter;
	
	String correctEmail, correctEmail1;
	
	public MyProfile_UpdateEmailAddress_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//MyProfile_UpdateEmailAddress.properties");
	}

	public void entersNewEmail(String newEmail) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPersonalDetails);
		btnMyEmailAdressInfoIcon.click();
		elementVisible(100, txtMyEmailAdressInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtMyEmailAdressInfoIcon.getText().contains(c.getData("myEmailAddressInformationText")));
		btnMyEmailAdressInfoIconClose.click();
		Thread.sleep(500);
		txtMyEmailAddress.clear();
		Thread.sleep(500);
		correctEmail = newEmail;
		txtMyEmailAddress.sendKeys(newEmail);
		elementVisible(100, txtReEnterNewEmail);
		Assert.assertEquals(true, txtReEnterNewEmail.isDisplayed());
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
		Assert.assertEquals(true, btnCancel.isDisplayed());
	}

	public void clicksOnSaveChangesButtonWithOutFillingReEnterNewEmailField() throws Exception {
		btnSaveChanges.click();
		elementVisible(100, txtConfirmEmailErrorMsg);
		Assert.assertEquals(true, txtConfirmEmailErrorMsg.getText().contains(c.getData("confirmEmailErrorMsg")));
		Thread.sleep(500);
	}

	public void entersNewEmailInReEnterNewEmailField(String inCorrectEmail) throws Exception {
		txtReEnterNewEmail.sendKeys(inCorrectEmail);
		txtMyPersonalDetails.click();
		elementVisible(100, txtConfirmEmailErrorMsg);
		Assert.assertEquals(true, txtConfirmEmailErrorMsg.getText().contains(c.getData("inCorrectConfirmEmailErrorMsg")));
		Thread.sleep(500);
	}

	public void entersCorrectEmailAddress() throws Exception {
		txtReEnterNewEmail.clear();
		Thread.sleep(500);
		txtReEnterNewEmail.sendKeys(correctEmail);
		txtMyPersonalDetails.click();
		elementVisible(100, txtConfirmEmailSuccessMsg);
		Assert.assertEquals(true, txtConfirmEmailSuccessMsg.getText().contains(c.getData("confirmEmailSuccessMsg")));
		Thread.sleep(500);
	}

	public void clicksOnSaveChangesButton() throws Exception {
		btnSaveChanges.click();
		elementVisible(100, txtThankYouForTheUpdate);
		Thread.sleep(2000);
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnBackToMyProfile.isDisplayed());
	}

	public void verifyChangedEmailAddressIsDisplayed() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(5000);
		Assert.assertEquals(true, txtMyEmailAddressLabel_MP.getText().contains(c.getData("myEmailAddressLabel_MP")));
		Assert.assertEquals(true, txtMyEmailAddress_MP.getText().contains(correctEmail));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPersonalDetails_MP);
	}

	public void verifyAccountInformationInCCB(String accNo, String username, String pwd, String newEmail) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(username);
		btnCCBPwd.sendKeys(pwd);
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
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBContactDetails);	
		correctEmail1=newEmail;
		for (WebElement primaryOption : txtCCBPrimaryList) {
            if (primaryOption.getText().equalsIgnoreCase("Yes")) {
				String txtCCBEmail=null;
				if(primaryOption.findElement(By.xpath("preceding-sibling::td[3]")).getText().contains("Email")){
					txtCCBEmail = primaryOption.findElement(By.xpath("preceding-sibling::td[2]")).getText();
					Assert.assertEquals(true, txtCCBEmail.equalsIgnoreCase(newEmail));
		            break;
				}
            }
		}
	}

	public void userOpensYopMailWebsite() throws Exception {
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.open('https://yopmail.com/en/' ,'_blank');");
		Thread.sleep(1000);
		handleMultipleTabs(2);
		elementVisible(100, btnYopmailConsent);
		btnYopmailConsent.click();
		Thread.sleep(500);
		txtYopmailEmail.sendKeys(correctEmail1);
		Thread.sleep(500);
		elementVisible(100, btnYopmailEnter);
		btnYopmailEnter.click();
		Thread.sleep(2000);
	}

}
