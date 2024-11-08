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

public class ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[5]") WebElement btnUpdateMyNameForm;
	@FindBy(xpath="(//div[@class='plink form-row'])[7]/p") WebElement txtUpdateMyNameFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnCreateAnOnlineAccount;
	@FindBy(xpath="(//div[@class='plink'])[4]/p") WebElement txtUpdateMyNameFormTeaser2;
	@FindBy(xpath="(//div[@class='sub-title'])[9]") WebElement txtUpdateMyNameFormTeaser3;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h1") WebElement txtCreateAnAccount;
	@FindBy(id="updateContactDetails-fullname") WebElement txtFullName;
	@FindBy(id="accountNumber-updateContactDetails") WebElement txtAccountNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[15]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[15]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[15]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-updateContactDetails") WebElement txtYourAddress;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[5]") WebElement linkMyAddressIsNotListed;
	@FindBy(id="updateContactDetails-telephone") WebElement txtTelephoneNumber;
	@FindBy(id="updateContactDetails-email") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[5]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[16]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[16]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[16]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[5]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[5]") WebElement btnByPhone;
	@FindBy(xpath="(//div[@class='sub-title required'])[10]") WebElement txtPlsTellUsAboutTheChangesField;
	@FindBy(id="updatecontact-additional-details") WebElement txtPlsTellUsAboutTheChanges;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]") WebElement txtUploadADocumentTeaser;
	@FindBy(id="upload-file-btn-contactDetails") WebElement btnUpload;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[5]") WebElement btnSubmit;
	@FindBy(xpath="//div[@class='form-group empty']/span[2]/p") WebElement txtErrorMessage;
	@FindBy(xpath="//div[@id='update-contact-details-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='update-contact-details-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	
	String email;

	public ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn.properties");
	}

	public void clicksOnUpdateMyNameOrContactDetailsFormButton() throws Exception {
		btnUpdateMyNameForm.click();
		elementVisible(100, txtUpdateMyNameFormTeaser1);
		Assert.assertEquals(true, txtUpdateMyNameFormTeaser1.getText().contains(c.getData("updateMyNameFormTeaser1")));
		Assert.assertEquals(true, btnCreateAnOnlineAccount.isDisplayed());
		Assert.assertEquals(true, txtUpdateMyNameFormTeaser2.getText().contains(c.getData("updateMyNameFormTeaser2")));
		Assert.assertEquals(true, txtUpdateMyNameFormTeaser3.getText().contains(c.getData("updateMyNameFormTeaser3")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtUpdateMyNameFormTeaser1);
	}

	public void navigateToCreateAnAccountPage() throws Exception {
		btnCreateAnOnlineAccount.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtCreateAnAccount);
		Thread.sleep(500);		
	}

	public void fillsCustomerInformation(String address) throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
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

	public void clicksOnSubmitButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPlsTellUsAboutTheChangesField);
		Assert.assertEquals(true, txtPlsTellUsAboutTheChanges.isDisplayed());
		//Assert.assertEquals(true, txtUploadADocumentTeaser.getText().contains(c.getData("uploadADocumentTeaser")));
		Assert.assertEquals(true, btnUpload.isDisplayed());
		Assert.assertEquals(true, btnSubmit.isDisplayed());
		btnSubmit.click();
		elementVisible(100, txtErrorMessage);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("plsTellUsAboutTheChangesErrorMsg")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPlsTellUsAboutTheChangesField);	
	}

	public void fillsPleaseTellUsAboutTheChangesField(String helptext) throws Exception {
		txtPlsTellUsAboutTheChanges.sendKeys(helptext);
		Thread.sleep(500);		
	}

	public void redirectedToUMNOCDConfirmationPage() throws Exception {
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
