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

public class ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[2]") WebElement btnChangeOrUpdateMyPPForm;
	@FindBy(xpath="(//div[@class='plink form-row'])[2]/p") WebElement txtChangeOrUpdateMyPPFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[2]") WebElement btnCreateAnOnlineAccount;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[1]") WebElement txtChangeOrUpdateMyPPFormTeaser2;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[1]/strong/a") WebElement linkFindOutMoreAboutFinancialSupport;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[3]") WebElement txtChangeOrUpdateMyPPFormTeaser3;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[3]/a") WebElement linkSendUsFacebookMessage;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[3]/a") WebElement linkSendUsMessageOnWhatsApp;
	@FindBy(xpath="(//div[@class='sub-title'])[3]") WebElement txtChangeOrUpdateMyPPFormTeaser4;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h1") WebElement txtCreateAnAccount;
	@FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtHelpPayingMyBill;
	@FindBy(id="paymentPlan-fullname") WebElement txtFullName;
	@FindBy(id="accountNumber-paymentPlan") WebElement txtAccountNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-paymentPlan") WebElement txtYourAddress;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[2]") WebElement linkAddressIsNotListed;
	@FindBy(id="paymentPlan-telephone") WebElement txtTelephoneNumber;
	@FindBy(id="paymentPlan-email") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[2]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[2]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[2]") WebElement btnByPhone;
	@FindBy(xpath="(//div[@class='sub-title'])[7]") WebElement txtHowCanWeHelpYouLabel;
	@FindBy(xpath="//input[@id='pp-pay-monthly']//following-sibling::span[1]") WebElement radioBtnMonthly;
	@FindBy(xpath="//input[@id='pp-pay-bill-receipt']//following-sibling::span[1]") WebElement radioBtnWhenIGetMyBill;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[6]") WebElement btnPaymentDateInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[6]") WebElement txtPaymentDateInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[6]") WebElement btnPaymentDateInfoIconClose;
	@FindBy(xpath="//div[@class='form-select selected']") WebElement dropdownPleaseSelect;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> dropdownOptions;
	@FindBy(id="paymentplan-additional-details") WebElement txtAddAnyInformation;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[7]") WebElement btnAddAnyInformationInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[7]") WebElement txtAddAnyInformationInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[7]") WebElement btnAddAnyInformationInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[2]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='payment-plan-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='payment-plan-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	
	String email;

	public ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn.properties");
	}

	public void clicksOnChangeOrUpdateMyPaymentPlanFormButton() throws Exception {
		btnChangeOrUpdateMyPPForm.click();
		elementVisible(100, txtChangeOrUpdateMyPPFormTeaser1);
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser1.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser1")));
		Assert.assertEquals(true, btnCreateAnOnlineAccount.isDisplayed());
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser2.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser2")));
		Assert.assertEquals(true, linkFindOutMoreAboutFinancialSupport.isDisplayed());
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser3.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser3")));
		Assert.assertEquals(true, linkSendUsFacebookMessage.isDisplayed());
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser4.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser4")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeOrUpdateMyPPFormTeaser1);
	}

	public void redirectedToCreateAnAccountPage() throws Exception {
		btnCreateAnOnlineAccount.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtCreateAnAccount);
		Thread.sleep(500);
	}

	public void redirectedToHelpPayingMyBillPage() throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, linkFindOutMoreAboutFinancialSupport);
		linkFindOutMoreAboutFinancialSupport.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtHelpPayingMyBill);
		Thread.sleep(500);
	}

	public void redirectedToMessengerPage() throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, linkSendUsFacebookMessage);
		linkSendUsFacebookMessage.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		Thread.sleep(500);
	}
	
	public void redirectedToWhatsAppPage() throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, linkSendUsMessageOnWhatsApp);
		linkSendUsMessageOnWhatsApp.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		Thread.sleep(500);
	}

	public void fillsCustomerInformation(String address) throws Exception {
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
		Thread.sleep(1000);
		elementVisible(100, checkThisEmailToContactYou);
		checkThisEmailToContactYou.click();
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

	public void selectsMonthlyForLikeToPayField(String paymentDate) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowCanWeHelpYouLabel);
		Assert.assertEquals(true, radioBtnMonthly.isDisplayed());
		Assert.assertEquals(true, radioBtnWhenIGetMyBill.isDisplayed());
		radioBtnMonthly.click();
		Thread.sleep(500);
		elementVisible(100, btnPaymentDateInfoIcon);
		btnPaymentDateInfoIcon.click();
		elementVisible(100, txtPaymentDateInfoIcon);
		Assert.assertEquals(true, txtPaymentDateInfoIcon.getText().contains(c.getData("paymentDateInformationText")));
		Thread.sleep(500);
		btnPaymentDateInfoIconClose.click();
		Thread.sleep(500);
		dropdownPleaseSelect.click();
		Thread.sleep(2000);
		for (WebElement date : dropdownOptions) {
			if (date.getText().equalsIgnoreCase(paymentDate)) {
				date.click();
				break;
			}
		}
		Thread.sleep(500);
		Assert.assertEquals(true, txtAddAnyInformation.isDisplayed());
		btnAddAnyInformationInfoIcon.click();
		elementVisible(100, txtAddAnyInformationInfoIcon);
		Assert.assertEquals(true, txtAddAnyInformationInfoIcon.getText().contains(c.getData("addAnyInformationInformationText")));
		Thread.sleep(500);
		btnAddAnyInformationInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSubmit.isDisplayed());
	}

	public void redirectedToPaymentPlanFormConfirmationScreen() throws Exception {
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
