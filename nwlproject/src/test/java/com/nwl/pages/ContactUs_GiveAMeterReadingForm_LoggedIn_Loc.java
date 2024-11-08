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

public class ContactUs_GiveAMeterReadingForm_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[3]") WebElement btnGiveAMeterReadingForm;
	@FindBy(xpath="(//div[@class='plink form-row'])[3]/p") WebElement txtGiveAMeterReadingFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[3]") WebElement btnDownloadOurFreeApp;
	@FindBy(xpath="(//div[@class='plink'])[3]/p/a") WebElement linkFindOutHowToReadYourMeter;
	@FindBy(xpath="(//div[@class='sub-title'])[6]") WebElement txtGiveAMeterReadingFormTeaser2;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtDownloadOurApp;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtHowToReadWaterMeter;
	@FindBy(id="meterRead-fullname") WebElement txtFullNameField;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	
	@FindBy(xpath="//input[@id='meterRead-fullname']//following-sibling::span[1]") WebElement txtFullName;
	@FindBy(xpath="//input[@id='accountNumber-meterRead']//following-sibling::span[1]") WebElement txtAccountNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[8]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[8]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[8]") WebElement btnYourAddressInfoIconClose;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkMyAddressIsNotListed;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[3]") WebElement txtTelephoneNumber;
	@FindBy(xpath="//input[@id='meterRead-email']//following-sibling::span[1]") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[3]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[9]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[9]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[9]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[3]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[3]") WebElement btnByPhone;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[3]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='meter-read-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='meter-read-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToHomePage;
	
	String firstName, lastName;

	public ContactUs_GiveAMeterReadingForm_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_GiveAMeterReadingForm_LoggedIn.properties");
	}

	public void clickOnGiveMeterReadingFormButton() throws Exception {
		elementVisible(100, btnGiveAMeterReadingForm);
		btnGiveAMeterReadingForm.click();
		elementVisible(100, txtGiveAMeterReadingFormTeaser1);
		Assert.assertEquals(true, txtGiveAMeterReadingFormTeaser1.getText().contains(c.getData("giveAMeterReadingFormTeaser1")));
		Assert.assertEquals(true, btnDownloadOurFreeApp.isDisplayed());
		Assert.assertEquals(true, linkFindOutHowToReadYourMeter.isDisplayed());
		Assert.assertEquals(true, txtGiveAMeterReadingFormTeaser2.getText().contains(c.getData("giveAMeterReadingFormTeaser2")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGiveAMeterReadingFormTeaser1);
	}

	public void navigateToDownloadOurAppPage() throws Exception {
		elementVisible(100, btnDownloadOurFreeApp);
		btnDownloadOurFreeApp.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtDownloadOurApp);
		Thread.sleep(500);		
	}

	public void navigateToHowToReadWaterMeterPage() throws Exception {
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

	public void verifiesCustomerInformationOfGMRFormWithCCB(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
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
		txtTelephoneNumber.sendKeys("01876543210");
		Assert.assertEquals(true, txtEmail.getText().contains(email));
		Assert.assertEquals(true, checkThisEmailToContactYou.isDisplayed());
		checkThisEmailToContactYou.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullNameField);
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

	public void changeToByPhoneOption() throws Exception {
		btnByPhone.click();
		Thread.sleep(1000);
	}

	public void navigateToGMRFormConfirmationPage() throws Exception {
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
