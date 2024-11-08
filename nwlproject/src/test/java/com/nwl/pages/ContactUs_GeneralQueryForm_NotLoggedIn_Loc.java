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

public class ContactUs_GeneralQueryForm_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(linkText="Help") WebElement linkHelp;
	@FindBy(xpath="//div[@class='faq-categories__block']/div/h2") WebElement txtPickTopicForSupport;
	@FindBy(xpath="(//div[@class='faq-item'])[1]/a") WebElement btnEmergencies;
	@FindBy(xpath="(//div[@class='faq-item'])[1]/a/span[1]") WebElement txtEmergencies;
	@FindBy(xpath="(//div[@class='faq-item'])[1]/a/span[2]") WebElement txtEmergenciesTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[2]/a") WebElement btnBillsAndPayments;
	@FindBy(xpath="(//div[@class='faq-item'])[2]/a/span[1]") WebElement txtBillsAndPayments;
	@FindBy(xpath="(//div[@class='faq-item'])[2]/a/span[2]") WebElement txtBillsAndPaymentsTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[3]/a") WebElement btnMovingHome;
	@FindBy(xpath="(//div[@class='faq-item'])[3]/a/span[1]") WebElement txtMovingHome;
	@FindBy(xpath="(//div[@class='faq-item'])[3]/a/span[2]") WebElement txtMovingHomeTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[4]/a") WebElement btnStrugglingToPay;
	@FindBy(xpath="(//div[@class='faq-item'])[4]/a/span[1]") WebElement txtStrugglingToPay;
	@FindBy(xpath="(//div[@class='faq-item'])[4]/a/span[2]") WebElement txtStrugglingToPayTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[5]/a") WebElement btnLeaks;
	@FindBy(xpath="(//div[@class='faq-item'])[5]/a/span[1]") WebElement txtLeaks;
	@FindBy(xpath="(//div[@class='faq-item'])[5]/a/span[2]") WebElement txtLeaksTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[6]/a") WebElement btnYourWater;
	@FindBy(xpath="(//div[@class='faq-item'])[6]/a/span[1]") WebElement txtYourWater;
	@FindBy(xpath="(//div[@class='faq-item'])[6]/a/span[2]") WebElement txtYourWaterTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[7]/a") WebElement btnYourSewerage;
	@FindBy(xpath="(//div[@class='faq-item'])[7]/a/span[1]") WebElement txtYourSewerage;
	@FindBy(xpath="(//div[@class='faq-item'])[7]/a/span[2]") WebElement txtYourSewerageTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[8]/a") WebElement btnPriorityServices;
	@FindBy(xpath="(//div[@class='faq-item'])[8]/a/span[1]") WebElement txtPriorityServices;
	@FindBy(xpath="(//div[@class='faq-item'])[8]/a/span[2]") WebElement txtPriorityServicesTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[9]/a") WebElement btnYourAccount;
	@FindBy(xpath="(//div[@class='faq-item'])[9]/a/span[1]") WebElement txtYourAccount;
	@FindBy(xpath="(//div[@class='faq-item'])[9]/a/span[2]") WebElement txtYourAccountTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[10]/a") WebElement btnWaterMeters;
	@FindBy(xpath="(//div[@class='faq-item'])[10]/a/span[1]") WebElement txtWaterMeters;
	@FindBy(xpath="(//div[@class='faq-item'])[10]/a/span[2]") WebElement txtWaterMetersTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[11]/a") WebElement btnSavingWater;
	@FindBy(xpath="(//div[@class='faq-item'])[11]/a/span[1]") WebElement txtSavingWater;
	@FindBy(xpath="(//div[@class='faq-item'])[11]/a/span[2]") WebElement txtSavingWaterTeaser;
	@FindBy(xpath="(//div[@class='faq-item'])[12]/a") WebElement btnContactUs;
	@FindBy(xpath="(//div[@class='faq-item'])[12]/a/span[1]") WebElement txtContactUs;
	@FindBy(xpath="(//div[@class='faq-item'])[12]/a/span[2]") WebElement txtContactUsTeaser;
	@FindBy(xpath="//h2[@class='pb-40']") WebElement txtWeAreHereToHelp;
	@FindBy(xpath="//div[@class='body-content w-66 center-container content-padding-adjust']/p") WebElement txtGetHelpFasterTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn__arrow animation animated fadeInLeft']") WebElement btnLoginToYourOnlineAccount;
	@FindBy(xpath="//a[@class='nb-btn d-block open-popup-contact']") WebElement btnCallUs;
	@FindBy(xpath="(//a[@class='nb-btn d-block'])[1]") WebElement btnUpdateUs;
	@FindBy(xpath="(//a[@class='nb-btn d-block'])[2]") WebElement btnEmailUs;
	@FindBy(xpath="//div[@class='account-form wp-spacing']/div/h1") WebElement txtEmailUs;
	
	@FindBy(xpath="(//div[@class='accordion__item'])[2]") WebElement accordianWriteToUs;
	@FindBy(xpath="//strong[text()='use our online contact us form']") WebElement linkContactUsForm;
	
	@FindBy(xpath="//div[@class='account-form wp-spacing']/div[2]/div/p[2]") WebElement txtWantToAskUs;
	@FindBy(xpath="//div[@class='account-form wp-spacing']/div[2]/div/h6") WebElement txtNeedQuickerResponse;
	@FindBy(xpath="//div[@class='account-form wp-spacing']/div[2]/div/p[4]") WebElement txtTalkToUsOnLiveChat;
	@FindBy(xpath="//div[@class='account-form wp-spacing']/div[2]/div/p[7]/a") WebElement linkFacebookMessenger;
	@FindBy(xpath="(//div[@class='sub-title'])[1]") WebElement txtWhatCanWeHelpYouWith;
	@FindBy(xpath="(//div[@class='wp-report-title'])[1]") WebElement btnMovingHome1;	
	@FindBy(xpath="(//div[@class='wp-report-title'])[2]") WebElement btnChangePaymentPlan;
	@FindBy(xpath="(//div[@class='wp-report-title'])[3]") WebElement btnGiveAMeterReading;
	@FindBy(xpath="(//div[@class='wp-report-title'])[4]") WebElement btnIWantCopyMyBill;
	@FindBy(xpath="(//div[@class='wp-report-title'])[5]") WebElement btnUpdateMyName;	
	@FindBy(xpath="(//div[@class='wp-report-title'])[6]") WebElement btnBereavement;
	@FindBy(xpath="(//div[@class='wp-report-title'])[7]") WebElement btnWaterSupplyProblem;
	@FindBy(xpath="(//div[@class='wp-report-title'])[8]") WebElement btnGeneralQuery;
	@FindBy(xpath="//div[@class='general-query-form']/div[1]") WebElement txtGeneralQueryFormLabel;
	@FindBy(xpath="(//input[@class='form-control fullname'])[9]") WebElement txtFullName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[22]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[22]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[22]") WebElement btnYourAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-generalQuery") WebElement txtYourAddress;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[7]") WebElement txtTelephoneNumber;
	@FindBy(xpath="(//input[@class='form-control email '])[6]") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[7]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[23]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[23]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[23]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[7]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[7]") WebElement btnByPhone;
	@FindBy(xpath="//div[@class='general-query-form']/div[3]") WebElement txtHowCanWeHelpLabel;
	@FindBy(xpath="(//textarea[@name='contactus-additional-details'])[6]") WebElement txtHowCanWeHelp;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]") WebElement txtUploadADocumentTeaser;
	@FindBy(id="upload-file-btn-generalQuery") WebElement btnUpload;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[7]") WebElement btnSubmit;
	@FindBy(xpath="//div[@class='form-group empty']/span[2]") WebElement txtErrorMessage;
	@FindBy(xpath="//div[@id='general-query-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='general-query-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[10]") WebElement btnBackToHomePage;
	@FindBy(xpath="//div[@class='account-teaser']/h1") WebElement txtCreateAnAccount;
	
	String email;

 	public ContactUs_GeneralQueryForm_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_GeneralQueryForm_NotLoggedIn.properties");
	}

	public void navigateToHelpPage() throws Exception {
		elementVisible(100, linkHelp);
		linkHelp.click();
	    elementVisible(100, txtPickTopicForSupport);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPickTopicForSupport);
	    Assert.assertEquals(true, txtPickTopicForSupport.getText().contains(c.getData("faqHeadingLabel")));
	    Assert.assertEquals(true, btnEmergencies.isDisplayed());
	    Assert.assertEquals(true, txtEmergencies.getText().contains(c.getData("faq1_Label")));
		Assert.assertEquals(true, txtEmergenciesTeaser.getText().contains(c.getData("faq1_Teaser")));
		Assert.assertEquals(true, btnBillsAndPayments.isDisplayed());
	    Assert.assertEquals(true, txtBillsAndPayments.getText().contains(c.getData("faq2_Label")));
		Assert.assertEquals(true, txtBillsAndPaymentsTeaser.getText().contains(c.getData("faq2_Teaser")));
		Assert.assertEquals(true, btnMovingHome.isDisplayed());
	    Assert.assertEquals(true, txtMovingHome.getText().contains(c.getData("faq3_Label")));
		Assert.assertEquals(true, txtMovingHomeTeaser.getText().contains(c.getData("faq3_Teaser")));
		Assert.assertEquals(true, btnStrugglingToPay.isDisplayed());
	    Assert.assertEquals(true, txtStrugglingToPay.getText().contains(c.getData("faq4_Label")));
		Assert.assertEquals(true, txtStrugglingToPayTeaser.getText().contains(c.getData("faq4_Teaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLeaks);
		Assert.assertEquals(true, btnLeaks.isDisplayed());
	    Assert.assertEquals(true, txtLeaks.getText().contains(c.getData("faq5_Label")));
		Assert.assertEquals(true, txtLeaksTeaser.getText().contains(c.getData("faq5_Teaser")));
		Assert.assertEquals(true, btnYourWater.isDisplayed());
	    Assert.assertEquals(true, txtYourWater.getText().contains(c.getData("faq6_Label")));
		Assert.assertEquals(true, txtYourWaterTeaser.getText().contains(c.getData("faq6_Teaser")));
		Assert.assertEquals(true, btnYourSewerage.isDisplayed());
	    Assert.assertEquals(true, txtYourSewerage.getText().contains(c.getData("faq7_Label")));
		Assert.assertEquals(true, txtYourSewerageTeaser.getText().contains(c.getData("faq7_Teaser")));
		Assert.assertEquals(true, btnPriorityServices.isDisplayed());
	    Assert.assertEquals(true, txtPriorityServices.getText().contains(c.getData("faq8_Label")));
		Assert.assertEquals(true, txtPriorityServicesTeaser.getText().contains(c.getData("faq8_Teaser")));
		Assert.assertEquals(true, btnYourAccount.isDisplayed());
		Assert.assertEquals(true, txtYourAccount.getText().contains(c.getData("faq9_Label")));
		Assert.assertEquals(true, txtYourAccountTeaser.getText().contains(c.getData("faq9_Teaser")));
		Assert.assertEquals(true, btnWaterMeters.isDisplayed());
	    Assert.assertEquals(true, txtWaterMeters.getText().contains(c.getData("faq10_Label")));
		Assert.assertEquals(true, txtWaterMetersTeaser.getText().contains(c.getData("faq10_Teaser")));
		Assert.assertEquals(true, btnSavingWater.isDisplayed());
	    Assert.assertEquals(true, txtSavingWater.getText().contains(c.getData("faq11_Label")));
		Assert.assertEquals(true, txtSavingWaterTeaser.getText().contains(c.getData("faq11_Teaser")));
		Assert.assertEquals(true, btnContactUs.isDisplayed());
	    Assert.assertEquals(true, txtContactUs.getText().contains(c.getData("faq12_Label")));
		Assert.assertEquals(true, txtContactUsTeaser.getText().contains(c.getData("faq12_Teaser")));
	}

	public void navigateToWeAreHereToHelpPage() throws Exception {
		btnContactUs.click();
		elementVisible(100, txtWeAreHereToHelp);
	    /*Assert.assertEquals(true, txtGetHelpFasterTeaser.getText().contains(c.getData("getHelpFasterTeaser")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnLoginToYourOnlineAccount);
	    Assert.assertEquals(true, btnLoginToYourOnlineAccount.isDisplayed());
	    Assert.assertEquals(true, btnCallUs.isDisplayed());
	    Assert.assertEquals(true, btnUpdateUs.isDisplayed());
	    Assert.assertEquals(true, btnEmailUs.isDisplayed());*/
	}

	public void navigateToEmailUsPage() throws Exception {
		//btnEmailUs.click();
		accordianWriteToUs.click();
		elementVisible(100, linkContactUsForm);
		linkContactUsForm.click();
		elementVisible(100, txtEmailUs);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEmailUs);
		Assert.assertEquals(true, txtWantToAskUs.getText().contains(c.getData("EmailUsTeaser1")));
		/*Assert.assertEquals(true, txtNeedQuickerResponse.getText().contains(c.getData("EmailUsTeaser2")));
		Assert.assertEquals(true, txtTalkToUsOnLiveChat.getText().contains(c.getData("EmailUsTeaser3")));
		Assert.assertEquals(true, linkFacebookMessenger.isDisplayed());*/
	}

	public void navigateToFacebookMessenger() throws Exception {
		linkFacebookMessenger.click();
		Thread.sleep(3000);
		handleMultipleTabs(1);
		Thread.sleep(500);
	}
	
	public void verifiesWhatCanWeHelpYouWithSection() throws Exception {
		/*driver.close();
		Thread.sleep(2000);
		handleMultipleTabs(0);*/
		elementVisible(100, txtWhatCanWeHelpYouWith);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatCanWeHelpYouWith);
		Assert.assertEquals(true, txtWhatCanWeHelpYouWith.getText().contains(c.getData("formQueryLabel")));
		Assert.assertEquals(true, btnMovingHome1.isDisplayed());
		Assert.assertEquals(true, btnChangePaymentPlan.isDisplayed());
		Assert.assertEquals(true, btnGiveAMeterReading.isDisplayed());
		Assert.assertEquals(true, btnIWantCopyMyBill.isDisplayed());
		Assert.assertEquals(true, btnUpdateMyName.isDisplayed());
		Assert.assertEquals(true, btnBereavement.isDisplayed());
		Assert.assertEquals(true, btnWaterSupplyProblem.isDisplayed());
		Assert.assertEquals(true, btnGeneralQuery.isDisplayed());
	}

	public void enterCustomerDetailsAfterClickingOnGeneralQueryButton(String address) throws Exception {
		btnGeneralQuery.click();
		elementVisible(100, txtGeneralQueryFormLabel);
		Assert.assertEquals(true, txtGeneralQueryFormLabel.getText().contains(c.getData("generalQueryFormLabel")));
		Assert.assertEquals(true, txtFullName.isDisplayed());
		txtFullName.sendKeys("Kartheek");
		Thread.sleep(1000);
		btnYourAddressInfoIcon.click();
		elementVisible(100, txtYourAddressInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddressInfoIcon.getText().contains(c.getData("yourAddressInformationText")));
		Thread.sleep(500);
		btnYourAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddress.isDisplayed());
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullName);
	}
	
	public void userSelectsPreferredContactMethodAsByPhoneOption() throws Exception {
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
	
	public void userChangesPreferredContactMethodFromByPhoneToByEmailOption() throws Exception {
		btnByEmail.click();
		Thread.sleep(1000);
	}

	public void clicksOnSubmitButtonWithoutFillingHowCanWeHelpTextField() throws Exception {
		Assert.assertEquals(true, txtHowCanWeHelp.isDisplayed());
		//Assert.assertEquals(true, txtUploadADocumentTeaser.getText().contains(c.getData("uploadADocumentTeaser")));
		Assert.assertEquals(true, btnUpload.isDisplayed());
		btnSubmit.click();
		elementVisible(100, txtErrorMessage);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("howCanWeHelpFieldErrorMsg")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowCanWeHelpLabel);
	}

	public void userFillsHowCanWeHelpTextField(String helpText) throws Exception {
		txtHowCanWeHelp.sendKeys(helpText);
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

	public void navigateToCreateAnAccountPage() throws Exception {
		linkCreateOnlineAccountHere.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtCreateAnAccount);
		Thread.sleep(500);
	}

}
