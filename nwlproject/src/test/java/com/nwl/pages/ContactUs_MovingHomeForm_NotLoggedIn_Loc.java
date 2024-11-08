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

public class ContactUs_MovingHomeForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[1]") WebElement btnMovingHome1;
	@FindBy(xpath="(//div[@class='plink form-row'])[1]/p") WebElement txtMovingHomeFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[1]") WebElement btnTellUsYoureMovingHome;
	@FindBy(xpath="(//div[@class='plink'])[1]/p[1]") WebElement txtMovingHomeFormTeaser2;
	@FindBy(xpath="(//div[@class='plink'])[1]/p[3]") WebElement txtMovingHomeFormTeaser3;
	@FindBy(xpath="(//div[@class='plink'])[1]/p[3]/a") WebElement linkVisitTheLandlordTap;
	@FindBy(xpath="(//div[@class='sub-title'])[2]") WebElement txtMovingHomeFormTeaser4;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h1") WebElement txtMovingHome;
	@FindBy(xpath="//a[@class='navbar-brand d-flex']") WebElement txtLandlordTap;
	@FindBy(id="moveHome-fullname") WebElement txtFullName;
	@FindBy(id="accountNumber-moveHome") WebElement txtAccountNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-moveHome") WebElement txtYourAddress;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[1]") WebElement linkAddressIsNotListed;
	@FindBy(id="moveHome-telephone") WebElement txtTelephoneNumber;
	@FindBy(id="moveHome-email") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[1]") WebElement checkThisEmailToContactYou;
	@FindBy(id="movehome-day") WebElement txtDOBDate;
	@FindBy(id="movehome-month") WebElement txtDOBMonth;
	@FindBy(id="movehome-year") WebElement txtDOBYear;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[2]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[2]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[2]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[1]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[1]") WebElement btnByPhone;
	@FindBy(xpath="(//div[@class='sub-title'])[4]") WebElement txtHowCanWeHelpYouLabel;
	@FindBy(id="movehome-additional-details") WebElement txtHowCanWeHelpYou;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[1]") WebElement btnSubmit;
	@FindBy(xpath="//div[@class='form-group empty']/span[2]") WebElement txtErrorMessage;
	@FindBy(xpath="//div[@id='move-home-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='move-home-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	
	String email;

	public ContactUs_MovingHomeForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_MovingHomeForm_NotLoggedIn.properties");
	}

	public void clicksOnMovingHomeFormButton() throws Exception {
		btnMovingHome1.click();
		elementVisible(100, txtMovingHomeFormTeaser1);
		Assert.assertEquals(true, txtMovingHomeFormTeaser1.getText().contains(c.getData("movingHomeFormTeaser1")));
		Assert.assertEquals(true, btnTellUsYoureMovingHome.isDisplayed());
		Assert.assertEquals(true, txtMovingHomeFormTeaser2.getText().contains(c.getData("movingHomeFormTeaser2")));
		Assert.assertEquals(true, txtMovingHomeFormTeaser3.getText().contains(c.getData("movingHomeFormTeaser3")));
		Assert.assertEquals(true, linkVisitTheLandlordTap.isDisplayed());
		Assert.assertEquals(true, txtMovingHomeFormTeaser4.getText().contains(c.getData("movingHomeFormTeaser4")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingHomeFormTeaser1);
	}

	public void redirectedToMovingHomePage() throws Exception {
		btnTellUsYoureMovingHome.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtMovingHome);
		Thread.sleep(500);
	}

	public void redirectedToLandlordTapPage() throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, linkVisitTheLandlordTap);
		linkVisitTheLandlordTap.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtLandlordTap);
		Thread.sleep(500);
	}

	public void fillsCustomerInformation(String address) throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		Assert.assertEquals(true, txtFullName.isDisplayed());
		txtFullName.sendKeys("Kartheek");
		Assert.assertEquals(true, txtAccountNumber.isDisplayed());
		Thread.sleep(1000);
		btnYourAddressInfoIcon.click();
		elementVisible(100, txtYourAddressInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddressInfoIcon.getText().contains(c.getData("yourAddressInformationText")));
		Thread.sleep(500);
		btnYourAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddress.isDisplayed());
		Assert.assertEquals(true, linkAddressIsNotListed.isDisplayed());
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
		System.out.println(email);
		Thread.sleep(1000);
		elementVisible(100, checkThisEmailToContactYou);
		checkThisEmailToContactYou.click();
		Thread.sleep(500);
		txtDOBDate.sendKeys("10");
		Thread.sleep(200);
		txtDOBMonth.sendKeys("10");
		Thread.sleep(200);
		txtDOBYear.sendKeys("2000");
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullName);
	}
	
    public void selectByEmailOption() throws Exception {
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

	public void changeToByPhoneoption() throws Exception {
		btnByPhone.click();
		Thread.sleep(1000);
	}

	public void clicksOnSubmitButtonWithoutFillingHowCanWeHelpYouTextField() throws Exception {
		Assert.assertEquals(true, txtHowCanWeHelpYou.isDisplayed());
		btnSubmit.click();
		elementVisible(100, txtErrorMessage);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("howCanWeHelpFieldErrorMsg")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowCanWeHelpYouLabel);
	}
	
	public void fillsHowCanWeHelpYouTextField(String helpText) throws Exception {
		txtHowCanWeHelpYou.sendKeys(helpText);
		Thread.sleep(500);
	}

	public void navigateToConfirmationScreen() throws Exception {
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
