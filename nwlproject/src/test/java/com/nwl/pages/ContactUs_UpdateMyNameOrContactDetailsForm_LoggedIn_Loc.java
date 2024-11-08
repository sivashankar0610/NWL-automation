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

public class ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[5]") WebElement btnUpdateMyNameForm;
	@FindBy(xpath="(//div[@class='plink'])[4]/p") WebElement txtUpdateMyNameFormTeaser1;
	@FindBy(xpath="(//div[@class='plink form-row'])[5]/p") WebElement txtUpdateMyNameFormTeaser2;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[5]") WebElement btnGoToMyAccount;
	@FindBy(xpath="(//div[@class='sub-title'])[9]") WebElement txtUpdateMyNameFormTeaser3;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
    @FindBy(id="updateContactDetails-fullname") WebElement txtFullNameField;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	
	@FindBy(xpath="//input[@id='updateContactDetails-fullname']//following-sibling::span[1]") WebElement txtFullName;
	@FindBy(xpath="//input[@id='accountNumber-updateContactDetails']//following-sibling::span[1]") WebElement txtAccountNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[15]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[15]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[15]") WebElement btnYourAddressInfoIconClose;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[5]") WebElement txtTelephoneNumber;
	@FindBy(xpath="//input[@id='updateContactDetails-email']//following-sibling::span[1]") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[5]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])[4]/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[16]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[16]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[16]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[5]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[5]") WebElement btnByPhone;
	
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[5]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='update-contact-details-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='update-contact-details-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToHomePage;
	
	String firstName, lastName;

	public ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn.properties");
	}

	public void clickOnUpdateMyNameOrContactDetailsFormButton() throws Exception {
		btnUpdateMyNameForm.click();
		elementVisible(100, txtUpdateMyNameFormTeaser1);
		Assert.assertEquals(true, txtUpdateMyNameFormTeaser1.getText().contains(c.getData("updateMyNameFormTeaser1")));
		Assert.assertEquals(true, txtUpdateMyNameFormTeaser2.getText().contains(c.getData("updateMyNameFormTeaser2")));
		Assert.assertEquals(true, btnGoToMyAccount.isDisplayed());
		Assert.assertEquals(true, txtUpdateMyNameFormTeaser3.getText().contains(c.getData("updateMyNameFormTeaser3")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtUpdateMyNameFormTeaser1);
	}

	public void redirectedToAccountDashboardPage() throws Exception {
		btnGoToMyAccount.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, tabAccountDashboard);
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
		Thread.sleep(100);
		Assert.assertEquals(true, txtAccountNo.getText().contains(accNo));
		btnYourAddressInfoIcon.click();
		elementVisible(100, txtYourAddressInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAddressInfoIcon.getText().contains(c.getData("yourAddressInformationText")));
		Thread.sleep(500);
		btnYourAddressInfoIconClose.click();
		Thread.sleep(1000);
		txtTelephoneNumber.clear();
		Thread.sleep(500);
		txtTelephoneNumber.sendKeys("01876543210");
		Assert.assertEquals(true, txtEmail.getText().contains(email));
		Assert.assertEquals(true, checkThisEmailToContactYou.isDisplayed());
		checkThisEmailToContactYou.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullNameField);
	}

	public void selectsByPhoneOption() throws Exception {
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
	
	public void changedToByEmailOption() throws Exception {
		btnByEmail.click();
		Thread.sleep(1000);		
	}

	public void navigateToUMNOCDFormConfirmationPage() throws Exception {
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
