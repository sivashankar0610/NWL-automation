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

public class ContactUs_IWantCopyOfMyBillForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[4]") WebElement btnIWantCopyOfMyBillsForm;
	@FindBy(xpath="(//div[@class='plink form-row'])[5]/p") WebElement txtIWantCopyOfMyBillFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[5]") WebElement btnCreateAnOnlineAccount;
	@FindBy(xpath="(//div[@class='sub-title'])[8]") WebElement txtIWantCopyOfMyBillFormTeaser2;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h1") WebElement txtCreateAnAccount;
	@FindBy(id="billcopy-fullname") WebElement txtFullName;
	@FindBy(id="billcopy-day") WebElement txtDOBDate;
	@FindBy(id="billcopy-month") WebElement txtDOBMonth;
	@FindBy(id="billcopy-year") WebElement txtDOBYear;
	@FindBy(id="NWLNo-billCopy") WebElement txtAccountNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[13]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[13]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[13]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-billCopy") WebElement txtYourAddress;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[4]") WebElement linkMyAddressIsNotListed;
	@FindBy(id="billcopy-telephone") WebElement txtTelephoneNumber;
	@FindBy(id="billcopy-email") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[4]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='sub-title'])[15]") WebElement txtSendYourBill;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[14]") WebElement btnSendYourBillInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[14]") WebElement txtSendYourBillInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[14]") WebElement btnSendYourBillInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[4]") WebElement btnEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[4]") WebElement btnPost;
	@FindBy(xpath="(//div[@class='sub-title'])[16]") WebElement txtWhichBillsWouldYouLikeUsToSendYouField;
	@FindBy(id="billcopy-additional-details") WebElement txtWhichBillsWouldYouLikeUsToSendYou;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[4]") WebElement btnSubmit;
	@FindBy(xpath="//div[@class='form-group empty']/span[2]/p") WebElement txtErrorMessage;
	@FindBy(xpath="//div[@id='bill-copy-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='bill-copy-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	
	String email;

	public ContactUs_IWantCopyOfMyBillForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_IWantCopyOfMyBillForm_NotLoggedIn.properties");
	}

	public void clicksOnIWantCopyOfMyBillFormButton() throws Exception {
		btnIWantCopyOfMyBillsForm.click();
		elementVisible(100, txtIWantCopyOfMyBillFormTeaser1);
		Assert.assertEquals(true, txtIWantCopyOfMyBillFormTeaser1.getText().contains(c.getData("iWantCopyOfMyBillFormTeaser1")));
		Assert.assertEquals(true, btnCreateAnOnlineAccount.isDisplayed());
		Assert.assertEquals(true, txtIWantCopyOfMyBillFormTeaser2.getText().contains(c.getData("iWantCopyOfMyBillFormTeaser2")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtIWantCopyOfMyBillFormTeaser1);	
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
		txtDOBDate.sendKeys("10");
		txtDOBMonth.sendKeys("10");
		txtDOBYear.sendKeys("2000");
		Assert.assertEquals(true, txtAccountNumber.isDisplayed());
		txtAccountNumber.sendKeys("4345657677");
		Thread.sleep(1000);
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

	public void selectsEmailOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSendYourBill);
		btnSendYourBillInfoIcon.click();
		elementVisible(100, txtSendYourBillInfoIcon);
		Assert.assertEquals(true, txtSendYourBillInfoIcon.getText().contains(c.getData("sendYourBillInformationText")));
		Thread.sleep(500);
		btnSendYourBillInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnEmail.isDisplayed());
		Assert.assertEquals(true, btnPost.isDisplayed());
		btnEmail.click();
		Thread.sleep(500);		
	}

	public void changedToPostOption() throws Exception {
		btnPost.click();
		Thread.sleep(1000);		
	}

	public void clicksOnSubmitButton() throws Exception {
		Assert.assertEquals(true, txtWhichBillsWouldYouLikeUsToSendYou.isDisplayed());
		Assert.assertEquals(true, btnSubmit.isDisplayed());
		btnSubmit.click();
		elementVisible(100, txtErrorMessage);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("whichBillsWouldYouLikeUsToSendYouErrorMsg")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhichBillsWouldYouLikeUsToSendYouField);
	}

	public void fillsWhichBillsWouldYouLikeUsToSendYouField(String billName) throws Exception {
		txtWhichBillsWouldYouLikeUsToSendYou.sendKeys(billName);
		Thread.sleep(500);
	}

	public void redirectedToIWCMBConfirmationPage() throws Exception {
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
