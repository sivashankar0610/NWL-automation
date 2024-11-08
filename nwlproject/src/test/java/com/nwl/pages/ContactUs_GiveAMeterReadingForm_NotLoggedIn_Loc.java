package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ContactUs_GiveAMeterReadingForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[3]") WebElement btnGiveAMeterReadingForm;
	@FindBy(xpath="(//div[@class='plink form-row'])[4]/p") WebElement txtGiveAMeterReadingFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[4]") WebElement btnDownloadOurFreeApp;
	@FindBy(xpath="(//div[@class='plink'])[3]/p/a") WebElement linkFindOutHowToReadYourMeter;
	@FindBy(xpath="(//div[@class='sub-title'])[6]") WebElement txtGiveAMeterReadingFormTeaser2;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtDownloadOurApp;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtHowToReadWaterMeter;
	@FindBy(id="meterRead-fullname") WebElement txtFullName;
	@FindBy(id="accountNumber-meterRead") WebElement txtAccountNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[8]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[8]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[8]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-meterRead") WebElement txtYourAddress;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkMyAddressIsNotListed;
	@FindBy(id="meterRead-telephone") WebElement txtTelephoneNumber;
	@FindBy(id="meterRead-email") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[3]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[9]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[9]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[9]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[3]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[3]") WebElement btnByPhone;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[10]") WebElement btnYourMeterReadingInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[10]") WebElement txtYourMeterReadingInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[10]") WebElement btnYourMeterReadingInfoIconClose;
	@FindBy(id="meterread-input") WebElement txtYourMeterReading;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[11]") WebElement btnDateOfMeterReadingInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[11]") WebElement txtDateOfMeterReadingInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[11]") WebElement btnDateOfMeterReadingInfoIconClose;
	@FindBy(id="meterread-datepicker") WebElement txtDateOfMeterReading;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[12]") WebElement btnOccupancyInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[12]") WebElement txtOccupancyInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[12]") WebElement btnOccupancyInfoIconClose;
	@FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div") WebElement dropdownOccupancy;
	@FindBy(xpath="//div[@class='sel__box_inner']/span") List<WebElement> dropdownOccupancyOptions;
	@FindBy(id="upload-file-btn-meterRead") WebElement btnUpload;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[3]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='meter-read-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='meter-read-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	
	String email;
	
	public ContactUs_GiveAMeterReadingForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_GiveAMeterReadingForm_NotLoggedIn.properties");
	}

	public void clickOnGiveAMeterReadingFormButton() throws Exception {
		elementVisible(100, btnGiveAMeterReadingForm);
		btnGiveAMeterReadingForm.click();
		elementVisible(100, txtGiveAMeterReadingFormTeaser1);
		Assert.assertEquals(true, txtGiveAMeterReadingFormTeaser1.getText().contains(c.getData("giveAMeterReadingFormTeaser1")));
		Assert.assertEquals(true, btnDownloadOurFreeApp.isDisplayed());
		Assert.assertEquals(true, linkFindOutHowToReadYourMeter.isDisplayed());
		Assert.assertEquals(true, txtGiveAMeterReadingFormTeaser2.getText().contains(c.getData("giveAMeterReadingFormTeaser2")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGiveAMeterReadingFormTeaser1);
	}

	public void redirectedToDownloadOurAppPage() throws Exception {
		elementVisible(100, btnDownloadOurFreeApp);
		btnDownloadOurFreeApp.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtDownloadOurApp);
		Thread.sleep(500);
	}

	public void redirectedToHowToReadWaterMeterPage() throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, linkFindOutHowToReadYourMeter);
		linkFindOutHowToReadYourMeter.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtHowToReadWaterMeter);
		Thread.sleep(500);
	}

	public void fillsCustomerInformationForGMRForm(String address) throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, txtFullName);
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

	public void selectByPhoneOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPreferredContactMethod);
		btnPreferredContactMethodInfoIcon.click();
		elementVisible(100, txtPreferredContactMethodInfoIcon);
		Assert.assertEquals(true, txtPreferredContactMethodInfoIcon.getText().contains(c.getData("preferredContactMethodInformationText")));
		Thread.sleep(500);
		btnPreferredContactMethodInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnByEmail.isDisplayed());
		Assert.assertEquals(true, btnByPhone.isDisplayed());
		btnByPhone.click();
		Thread.sleep(500);
	}

	public void changeToByEmailOption() throws Exception {
		btnByEmail.click();
		Thread.sleep(1000);
	}

	public void providesOtherDetails(String meterReading, String meterReadingDate, String occupancy) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnYourMeterReadingInfoIcon);
		btnYourMeterReadingInfoIcon.click();
		elementVisible(100, txtYourMeterReadingInfoIcon);
		Assert.assertEquals(true, txtYourMeterReadingInfoIcon.getText().contains(c.getData("yourMeterReadingInformationText")));
		Thread.sleep(500);
		btnYourMeterReadingInfoIconClose.click();
		Thread.sleep(500);
		txtYourMeterReading.sendKeys(meterReading);
		btnDateOfMeterReadingInfoIcon.click();
		elementVisible(100, txtDateOfMeterReadingInfoIcon);
		Assert.assertEquals(true, txtDateOfMeterReadingInfoIcon.getText().contains(c.getData("dateOfMeterReadingInformationText")));
		Thread.sleep(500);
		btnDateOfMeterReadingInfoIconClose.click();
		Thread.sleep(500);
		txtDateOfMeterReading.sendKeys(meterReadingDate);
		Thread.sleep(500);
		txtYourMeterReading.click();
		Thread.sleep(500);
		btnOccupancyInfoIcon.click();
		elementVisible(100, txtOccupancyInfoIcon);
		Assert.assertEquals(true, txtOccupancyInfoIcon.getText().contains(c.getData("occupancyInformationText")));
		Thread.sleep(500);
		btnOccupancyInfoIconClose.click();
		Thread.sleep(500);
		dropdownOccupancy.click();
		Thread.sleep(2000);
		for (WebElement occupancyOption : dropdownOccupancyOptions) {
			if (occupancyOption.getText().contains(occupancy)) {
				occupancyOption.click();
				Thread.sleep(500);
				break;
			}
		}
		Assert.assertEquals(true, btnUpload.isDisplayed());
		Assert.assertEquals(true, btnSubmit.isDisplayed());
	}

	public void redirectedToGMRFormConfirmationPage() throws Exception {
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
