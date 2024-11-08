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

public class ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[2]") WebElement btnChangeOrUpdateMyPPForm;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[1]") WebElement txtChangeOrUpdateMyPPFormTeaser1;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[1]/strong/a") WebElement linkFindOutMoreAboutFinancialSupport;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[3]") WebElement txtChangeOrUpdateMyPPFormTeaser2;
	@FindBy(xpath="(//div[@class='plink'])[2]/p[3]/a") WebElement linkSendUsFacebookMessage;
	@FindBy(xpath="(//div[@class='plink form-row'])[2]/p") WebElement txtChangeOrUpdateMyPPFormTeaser3;
	@FindBy(xpath="(//div[@class='form-btn'])[3]/a") WebElement btnGoToMyAccount;
	@FindBy(xpath="(//div[@class='sub-title'])[3]") WebElement txtChangeOrUpdateMyPPFormTeaser4;
	@FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtHelpPayingMyBill;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	@FindBy(id="paymentPlan-fullname") WebElement txtFullNameField;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	
	@FindBy(xpath="//input[@id='paymentPlan-fullname']//following-sibling::span[1]") WebElement txtFullName;
	@FindBy(xpath="//input[@id='accountNumber-paymentPlan']//following-sibling::span[1]") WebElement txtAccountNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnYourAddressInfoIconClose;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[2]") WebElement linkMyAddressIsNotListed;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[2]") WebElement txtTelephoneNumber;
	@FindBy(xpath="//input[@id='paymentPlan-email']//following-sibling::span[1]") WebElement txtEmail;
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
	@FindBy(id="paymentplan-additional-details") WebElement txtAddAnyInformation;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[7]") WebElement btnAddAnyInformationInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[7]") WebElement txtAddAnyInformationInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[7]") WebElement btnAddAnyInformationInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[2]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='payment-plan-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='payment-plan-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToHomePage;
	
	String firstName, lastName;

	public ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn.properties");
	}

	public void clickOnChangeOrUpdateMyPaymentPlanFormButton() throws Exception {
		btnChangeOrUpdateMyPPForm.click();
		elementVisible(100, txtChangeOrUpdateMyPPFormTeaser1);
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser1.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser1")));
		Assert.assertEquals(true, linkFindOutMoreAboutFinancialSupport.isDisplayed());
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser2.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser2")));
		Assert.assertEquals(true, linkSendUsFacebookMessage.isDisplayed());
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser3.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser3")));
		Assert.assertEquals(true, btnGoToMyAccount.isDisplayed());
		Assert.assertEquals(true, txtChangeOrUpdateMyPPFormTeaser4.getText().contains(c.getData("changeOrUpdateMyPPFormTeaser4")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeOrUpdateMyPPFormTeaser1);
	}

	public void redirectedToHelpPayingMyBillPage() throws Exception {
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

	public void redirectedToAccountDashboardPage() throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, btnGoToMyAccount);
		btnGoToMyAccount.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		//elementVisible(100, tabAccountDashboard);
		Thread.sleep(500);
	}

	public void verifiesCustomerInformationWithCCB(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullNameField);
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='zoneMapFrame_1']")));
		Thread.sleep(2000);
		String name = txtCCBFullName.getText();
		String[] splitName = name.split(" ");
		firstName = splitName[1];
		lastName = splitName[0].substring(0,splitName[0].length()-1);
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, txtFullNameField);
		Assert.assertEquals(true, txtFullName.getText().contains(firstName+" "+lastName));
		Assert.assertEquals(true, txtAccountNo.getText().contains(accNo));
		Thread.sleep(1000);
		btnYourAddressInfoIcon.click();
		elementVisible(100, txtYourAddressInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddressInfoIcon.getText().contains(c.getData("yourAddressInformationText")));
		Thread.sleep(500);
		btnYourAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, linkMyAddressIsNotListed.isDisplayed());
		txtTelephoneNumber.clear();
		Thread.sleep(500);
		txtTelephoneNumber.sendKeys("09876543210");
		Assert.assertEquals(true, txtEmail.getText().contains(email));
		Assert.assertEquals(true, checkThisEmailToContactYou.isDisplayed());
		checkThisEmailToContactYou.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullNameField);
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

	public void changeToByEmailoption() throws Exception {
		btnByEmail.click();
		Thread.sleep(1000);
	}

	public void selectsWhenIGetMyBillForLikeToPayField(String additionalText) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowCanWeHelpYouLabel);
		Assert.assertEquals(true, radioBtnMonthly.isDisplayed());
		Assert.assertEquals(true, radioBtnWhenIGetMyBill.isDisplayed());
		radioBtnWhenIGetMyBill.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtAddAnyInformation.isDisplayed());
		btnAddAnyInformationInfoIcon.click();
		elementVisible(100, txtAddAnyInformationInfoIcon);
		Assert.assertEquals(true, txtAddAnyInformationInfoIcon.getText().contains(c.getData("addAnyInformationInformationText")));
		Thread.sleep(500);
		btnAddAnyInformationInfoIconClose.click();
		Thread.sleep(500);
		txtAddAnyInformation.sendKeys(additionalText);
		Assert.assertEquals(true, btnSubmit.isDisplayed());
	}

	public void navigateToPaymentPlanFormConfirmationScreen() throws Exception {
		btnSubmit.click();
		elementVisible(100, txtThanksForYourMessage);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourMessage);
		Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
		/*Assert.assertEquals(true, linkCreateOnlineAccountHere.isDisplayed());
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));*/
		Assert.assertEquals(true, btnBackToHomePage.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourMessage);
	}

}
