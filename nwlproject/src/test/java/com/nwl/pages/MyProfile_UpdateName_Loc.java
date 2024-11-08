package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class MyProfile_UpdateName_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='profile-edit profile-form']/div/div[1]/h6") WebElement txtMyPersonalDetails;
	@FindBy(id="profile-edit-firstname") WebElement txtUpdateYourFirstName;
	@FindBy(id="profile-edit-surname") WebElement txtUpdateYourSurname;
	@FindBy(xpath="//div[@class='form-row reasonnamechangebox']/div/div/div") WebElement dropdownReasonForNameChange;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[1]") WebElement btnSpellingMistakeOption;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[2]") WebElement btnMarriageOrDivorceOption;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[3]") WebElement btnOtherOption;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[3]") WebElement btnSaveChanges;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[3]") WebElement btnCancel;
	@FindBy(id="profile-edit-reasonNameChangeDetails") WebElement txtPlsEnterDetailsForOtherReason;
	@FindBy(xpath="//div[@class='profile-success-label']/h6") WebElement txtThankYouForTheUpdate;
	@FindBy(xpath="//div[@class='alert__content profile_name_update_content']/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToMyProfile;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changedetail-btn model']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="//div[@class='profile-view']/div[2]/div[1]/h6") WebElement txtMyPersonalDetails_MP;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBActivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(xpath="//a[@navoptcd='cm_bprocTabMenu']") WebElement linkCCBOpenPassToProcess;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;

	public MyProfile_UpdateName_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//MyProfile_UpdateName.properties");
	}

	public void updatesFirstNameField() {
		txtUpdateYourFirstName.sendKeys("st");
		elementVisible(100, dropdownReasonForNameChange);
		Assert.assertEquals(true, dropdownReasonForNameChange.isDisplayed());
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
		Assert.assertEquals(true, btnCancel.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSaveChanges);
	}

	public void removeTheChange() throws Exception {
		txtUpdateYourFirstName.sendKeys("\u0008");
		Thread.sleep(200);
		txtUpdateYourFirstName.sendKeys("\u0008");
		Thread.sleep(200);
		Assert.assertEquals(true, !btnSaveChanges.isEnabled());
	}

	public void updatesSurnameField() throws Exception {
		txtUpdateYourSurname.sendKeys("st");
		elementVisible(100, dropdownReasonForNameChange);
		Assert.assertEquals(true, dropdownReasonForNameChange.isDisplayed());
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
	}

	public void selectsSpellingMistakeOption() throws Exception {
		dropdownReasonForNameChange.click();
		elementVisible(100, btnSpellingMistakeOption);
		btnSpellingMistakeOption.click();
		Thread.sleep(200);
	}

	public void selectsMarriageOrDivorceOption() throws Exception {
		dropdownReasonForNameChange.click();
		elementVisible(100, btnMarriageOrDivorceOption);
		btnMarriageOrDivorceOption.click();
		Thread.sleep(200);
	}

	public void selectsOtherOption() throws Exception {
		dropdownReasonForNameChange.click();
		elementVisible(100, btnOtherOption);
		btnOtherOption.click();
		elementVisible(100, txtPlsEnterDetailsForOtherReason);
		txtPlsEnterDetailsForOtherReason.sendKeys("Incorrect Name");
		Thread.sleep(200);
	}
	
	public void clicksOnSaveChangesButton() throws Exception {
		btnSaveChanges.click();
		elementVisible(100, txtThankYouForTheUpdate);
		Thread.sleep(2000);
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnBackToMyProfile.isDisplayed());
	}

	public void clicksOnBackToMyProfileButton() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPersonalDetails_MP);
	}

	public void verifiesOpenPassToProcessLink(String accNo, String ccbUsername, String ccbPwd) throws Exception {
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
		Thread.sleep(2000);	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBActivityHistory);
		btnCCBActivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(500);
		Assert.assertEquals(true, linkCCBOpenPassToProcess.isDisplayed());
	}

	public void clicksOnOpenPassToProcessLink() throws Exception {
		linkCCBOpenPassToProcess.click();
		Thread.sleep(1000);
    	Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		Thread.sleep(1000);
		elementVisible(100, txtCCBProcessInfo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
		Thread.sleep(500);
	}

}
