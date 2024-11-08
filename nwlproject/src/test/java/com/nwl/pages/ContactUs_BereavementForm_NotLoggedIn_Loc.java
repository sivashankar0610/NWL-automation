package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ContactUs_BereavementForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[6]") WebElement btnBereavementForm;
	@FindBy(xpath="(//div[@class='sub-title'])[11]/p") WebElement txtBereavementFormTeaser;
	@FindBy(id="bereavement-fullname") WebElement txtFullName;
	@FindBy(id="accountNumber-bereavement") WebElement txtAccountNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[17]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[17]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[17]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-bereavement") WebElement txtYourAddress;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[6]") WebElement linkMyAddressIsNotListed;
	@FindBy(id="bereavement-telephone") WebElement txtTelephoneNumber;
	@FindBy(id="bereavement-email") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[6]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[18]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[18]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[18]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[6]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[6]") WebElement btnByPhone;
	@FindBy(xpath="(//div[@class='sub-title'])[12]") WebElement txtDeceasedAccNoAndAddressField;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline yes']") WebElement btnDeceasedAccNoAndAddress_Yes;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline no']") WebElement btnDeceasedAccNoAndAddress_No;
	@FindBy(id="deseased-fullname") WebElement txtDeceasedName;
	@FindBy(id="deseased-nwlnumber") WebElement txtDeceasedAccNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[19]") WebElement btnDeceasedAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[19]") WebElement txtDeceasedAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[19]") WebElement btnDeceasedAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-1") WebElement txtDeceasedAddress;
	@FindBy(id="deseased-passedAwayDate") WebElement dropdownPassedAwayDate;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[20]") WebElement btnExecutorNameInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[20]") WebElement txtExecutorNameInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[20]") WebElement btnExecutorNameInfoIconClose;
	@FindBy(id="executor-fullname") WebElement txtExecutorName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[21]") WebElement btnExecutorAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[21]") WebElement txtExecutorAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[21]") WebElement btnExecutorAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-2") WebElement txtExecutorAddress;
	@FindBy(xpath="(//div[@class='sub-title'])[13]") WebElement txtAdditionalInformationField;
	@FindBy(id="bereavement-additional-details") WebElement txtAdditionalInformation;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]") WebElement txtUploadADocumentTeaser;
	@FindBy(id="upload-file-btn-bereavement") WebElement btnUpload;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[6]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='bereavment-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='bereavment-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	
	String email;

	public ContactUs_BereavementForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_BereavementForm_NotLoggedIn.properties");
	}

	public void clicksOnBereavementFormButton() throws Exception {
		btnBereavementForm.click();
		elementVisible(100, txtBereavementFormTeaser);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBereavementFormTeaser);
		Assert.assertEquals(true, txtBereavementFormTeaser.getText().contains(c.getData("bereavementFormTeaser")));
	}
	
	public void fillsCustomerInformation(String address) throws Exception {
		elementVisible(100, txtFullName);
		txtFullName.sendKeys("Kartheek");
		Assert.assertEquals(true, txtAccountNumber.isDisplayed());
		Thread.sleep(300);
		btnYourAddressInfoIcon.click();
		elementVisible(100, txtYourAddressInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddressInfoIcon.getText().contains(c.getData("yourAddressInformationText")));
		Thread.sleep(500);
		btnYourAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddress.isDisplayed());
		Assert.assertEquals(true, linkMyAddressIsNotListed.isDisplayed());
		txtYourAddress.sendKeys(address);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		Assert.assertEquals(true, txtTelephoneNumber.isDisplayed());
		txtTelephoneNumber.sendKeys("01876543210");
		Assert.assertEquals(true, txtEmail.isDisplayed());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		LocalDateTime timeNow = LocalDateTime.now();  
		email = "nwl" + dtf.format(timeNow) + "@yopmail.com";
		txtEmail.sendKeys(email);
		Thread.sleep(1000);
		elementVisible(100, checkThisEmailToContactYou);
		checkThisEmailToContactYou.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullName);
	}
	
	public void selectsByEmailOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPreferredContactMethod);
		btnPreferredContactMethodInfoIcon.click();
		elementVisible(100, txtPreferredContactMethodInfoIcon);
		Assert.assertEquals(true, txtPreferredContactMethodInfoIcon.getText().contains(c.getData("preferredContactMethodInformationText")));
		Thread.sleep(500);
		btnPreferredContactMethodInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnByEmail.isDisplayed());
		Assert.assertEquals(true, btnByPhone.isDisplayed());
		btnByEmail.click();
		Thread.sleep(500);
	}
	
	public void changedToByPhoneOption() throws Exception {
		btnByPhone.click();
		Thread.sleep(1000);
	}

	public void selectsNoOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDeceasedAccNoAndAddressField);
		Assert.assertEquals(true, btnDeceasedAccNoAndAddress_Yes.isDisplayed());
		Assert.assertEquals(true, btnDeceasedAccNoAndAddress_No.isDisplayed());
		btnDeceasedAccNoAndAddress_No.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtDeceasedName.isDisplayed());
		Assert.assertEquals(true, txtDeceasedAccNo.isDisplayed());
		btnDeceasedAddressInfoIcon.click();
		elementVisible(100, txtDeceasedAddressInfoIcon);
		Assert.assertEquals(true, txtDeceasedAddressInfoIcon.getText().contains(c.getData("deceasedAddressInformationText")));
		Thread.sleep(500);
		btnDeceasedAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtDeceasedAddress.isDisplayed());
		Assert.assertEquals(true, dropdownPassedAwayDate.isDisplayed());
		btnExecutorNameInfoIcon.click();
		elementVisible(100, txtExecutorNameInfoIcon);
		Assert.assertEquals(true, txtExecutorNameInfoIcon.getText().contains(c.getData("executorNameInformationText")));
		Thread.sleep(500);
		btnExecutorNameInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtExecutorName.isDisplayed());
		btnExecutorAddressInfoIcon.click();
		elementVisible(100, txtExecutorAddressInfoIcon);
		Assert.assertEquals(true, txtExecutorAddressInfoIcon.getText().contains(c.getData("executorAddressInformationText")));
		Thread.sleep(500);
		btnExecutorAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtExecutorAddress.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDeceasedAccNoAndAddressField);
	}

	public void changedToYesOption(String date) throws Exception {
		btnDeceasedAccNoAndAddress_Yes.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtDeceasedName.isDisplayed());
		txtDeceasedName.sendKeys("test");
		Assert.assertEquals(true, dropdownPassedAwayDate.isDisplayed());
		dropdownPassedAwayDate.sendKeys(date);
		btnExecutorNameInfoIcon.click();
		elementVisible(100, txtExecutorNameInfoIcon);
		Assert.assertEquals(true, txtExecutorNameInfoIcon.getText().contains(c.getData("executorNameInformationText")));
		Thread.sleep(500);
		btnExecutorNameInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtExecutorName.isDisplayed());
		txtExecutorName.sendKeys("user");
		btnExecutorAddressInfoIcon.click();
		elementVisible(100, txtExecutorAddressInfoIcon);
		Assert.assertEquals(true, txtExecutorAddressInfoIcon.getText().contains(c.getData("executorAddressInformationText")));
		Thread.sleep(500);
		btnExecutorAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtExecutorAddress.isDisplayed());
		txtExecutorAddress.sendKeys("2, NE46 2BW");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDeceasedAccNoAndAddressField);
	}

	public void fillsAdditionalInformationField(String helpText) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAdditionalInformationField);
		Assert.assertEquals(true, txtAdditionalInformation.isDisplayed());
		txtAdditionalInformation.sendKeys(helpText);
		//Assert.assertEquals(true, txtUploadADocumentTeaser.getText().contains(c.getData("uploadADocumentTeaser")));
		Assert.assertEquals(true, btnUpload.isDisplayed());
		Assert.assertEquals(true, btnSubmit.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAdditionalInformationField);
	}

	public void redirectedToBereavementFormConfirmationPage() throws Exception {
		btnSubmit.click();
		elementVisible(100, txtThanksForYourMessage);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourMessage);
		Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
		Assert.assertEquals(true, linkCreateOnlineAccountHere.isDisplayed());
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, btnBackToHomePage.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourMessage);
	}

}
