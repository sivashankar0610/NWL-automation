package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ContactUs_BereavementForm_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[6]") WebElement btnBereavementForm;
	@FindBy(xpath="(//div[@class='sub-title'])[11]/p") WebElement txtBereavementFormTeaser;
    @FindBy(id="bereavement-fullname") WebElement txtFullNameField;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	
	@FindBy(xpath="//input[@id='bereavement-fullname']//following-sibling::span[1]") WebElement txtFullName;
	@FindBy(xpath="//input[@id='accountNumber-bereavement']//following-sibling::span[1]") WebElement txtAccountNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[17]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[17]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[17]") WebElement btnYourAddressInfoIconClose;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[6]") WebElement linkMyAddressIsNotListed;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[6]") WebElement txtTelephoneNumber;
	@FindBy(xpath="//input[@id='bereavement-email']//following-sibling::span[1]") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[6]") WebElement checkThisEmailToContactYou;
	@FindBy(xpath="(//div[@class='form-row preferred_contact_method'])[5]/div[1]") WebElement txtPreferredContactMethod;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[18]") WebElement btnPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[18]") WebElement txtPreferredContactMethodInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[18]") WebElement btnPreferredContactMethodInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[6]") WebElement btnByEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[6]") WebElement btnByPhone;
	@FindBy(xpath="(//div[@class='sub-title'])[12]") WebElement txtDeceasedAccNoAndAddressField;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline yes']") WebElement btnDeceasedAccNoAndAddress_Yes;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline no']") WebElement btnDeceasedAccNoAndAddress_No;
	@FindBy(id="deseased-fullname") WebElement txtDeceasedName;
	@FindBy(id="deseased-passedAwayDate") WebElement dropdownPassedAwayDate;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[20]") WebElement btnExecutorNameInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[20]") WebElement txtExecutorNameInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[20]") WebElement btnExecutorNameInfoIconClose;
	@FindBy(id="executor-fullname") WebElement txtExecutorName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[21]") WebElement btnExecutorAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[21]") WebElement txtExecutorAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[21]") WebElement btnExecutorAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-2") WebElement txtExecutorAddress;
	
	@FindBy(id="deseased-nwlnumber") WebElement txtDeceasedAccNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[19]") WebElement btnDeceasedAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[19]") WebElement txtDeceasedAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[19]") WebElement btnDeceasedAddressInfoIconClose;
	@FindBy(id="data8-address-contactUsForm-1") WebElement txtDeceasedAddress;
	
	@FindBy(xpath="(//div[@class='sub-title'])[13]") WebElement txtAdditionalInformationField;
	@FindBy(id="bereavement-additional-details") WebElement txtAdditionalInformation;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]") WebElement txtUploadADocumentTeaser;
	@FindBy(id="upload-file-btn-bereavement") WebElement btnUpload;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[6]") WebElement btnSubmit;
	
	@FindBy(xpath="//div[@id='bereavment-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='bereavment-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToHomePage;
	
	String firstName, lastName;

	public ContactUs_BereavementForm_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_BereavementForm_LoggedIn.properties");
	}

	public void clickOnBereavementFormButton() throws Exception {
		btnBereavementForm.click();
		elementVisible(100, txtBereavementFormTeaser);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBereavementFormTeaser);
		Assert.assertEquals(true, txtBereavementFormTeaser.getText().contains(c.getData("bereavementFormTeaser")));
	}

	public void verifiesCustomerInformationWithCCB(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
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
		txtTelephoneNumber.sendKeys("09876543210");
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

	public void selectsYesOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDeceasedAccNoAndAddressField);
		Assert.assertEquals(true, btnDeceasedAccNoAndAddress_Yes.isDisplayed());
		Assert.assertEquals(true, btnDeceasedAccNoAndAddress_No.isDisplayed());
		btnDeceasedAccNoAndAddress_Yes.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtDeceasedName.isDisplayed());
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

	public void changedToNoOption(String date) throws Exception {
		btnDeceasedAccNoAndAddress_No.click();
		Thread.sleep(1000);
		txtDeceasedName.sendKeys("test");
		Assert.assertEquals(true, txtDeceasedAccNo.isDisplayed());
		btnDeceasedAddressInfoIcon.click();
		elementVisible(100, txtDeceasedAddressInfoIcon);
		Assert.assertEquals(true, txtDeceasedAddressInfoIcon.getText().contains(c.getData("deceasedAddressInformationText")));
		Thread.sleep(500);
		btnDeceasedAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtDeceasedAddress.isDisplayed());
		txtDeceasedAddress.sendKeys("1, NE46 2BW");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		dropdownPassedAwayDate.sendKeys(date);
		txtExecutorName.sendKeys("user");
		txtExecutorAddress.sendKeys("2, NE46 2BW");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDeceasedAccNoAndAddressField);
	}

	public void navigateToBereavementFormConfirmationPage() throws Exception {
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
