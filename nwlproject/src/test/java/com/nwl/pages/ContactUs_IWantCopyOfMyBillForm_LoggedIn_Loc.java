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

public class ContactUs_IWantCopyOfMyBillForm_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='wp-report-title'])[4]") WebElement btnIWantCopyOfMyBillForm;
	@FindBy(xpath="(//div[@class='plink form-row'])[4]/p") WebElement txtIWantCopyOfMyBillFormTeaser1;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[4]") WebElement btnGoToMyAccount;
	@FindBy(xpath="(//div[@class='sub-title'])[8]") WebElement txtIWantCopyOfMyBillFormTeaser2;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	@FindBy(id="billcopy-fullname") WebElement txtFullNameField;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	@FindBy(id = "birthDate") WebElement txtCCBBirthDate;
	
	@FindBy(xpath="//input[@id='billcopy-fullname']//following-sibling::span[1]") WebElement txtFullName;
	@FindBy(xpath="//input[@id='billcopy-day']//following-sibling::span[1]") WebElement txtDOBDate;
	@FindBy(xpath="//input[@id='billcopy-month']//following-sibling::span[1]") WebElement txtDOBMonth;
	@FindBy(xpath="//input[@id='billcopy-year']//following-sibling::span[1]") WebElement txtDOBYear;
	@FindBy(xpath="//input[@id='NWLNo-billCopy']//following-sibling::span[1]") WebElement txtAccountNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[13]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[13]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[13]") WebElement btnYourAddressInfoIconClose;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[4]") WebElement txtTelephoneNumber;
	@FindBy(xpath="//input[@id='billcopy-email']//following-sibling::span[1]") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[4]") WebElement checkThisEmailToContactYou;
	
	@FindBy(xpath="(//div[@class='sub-title'])[15]") WebElement txtSendYourBill;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[14]") WebElement btnSendYourBillInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[14]") WebElement txtSendYourBillInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[14]") WebElement btnSendYourBillInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline email'])[4]") WebElement btnEmail;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline post'])[4]") WebElement btnPost;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[4]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='bill-copy-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='bill-copy-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToHomePage;
	
	String firstName, lastName;

	public ContactUs_IWantCopyOfMyBillForm_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_IWantCopyOfMyBillForm_LoggedIn.properties");
	}

	public void clickOnIWantCopyOfMYBillForm() throws Exception {
		btnIWantCopyOfMyBillForm.click();
		elementVisible(100, txtIWantCopyOfMyBillFormTeaser1);
		Assert.assertEquals(true, txtIWantCopyOfMyBillFormTeaser1.getText().contains(c.getData("iWantCopyOfMyBillFormTeaser1")));
		Assert.assertEquals(true, btnGoToMyAccount.isDisplayed());
		Assert.assertEquals(true, txtIWantCopyOfMyBillFormTeaser2.getText().contains(c.getData("iWantCopyOfMyBillFormTeaser2")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtIWantCopyOfMyBillFormTeaser1);
	}

	public void navigateToAccountDashboardPage() throws Exception {
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
		String s = txtCCBBirthDate.getText();
		String[] dob = s.split("-");
		String ccbDate = dob[0];
		String ccbMonth = dob[1];
		String ccbYear = dob[2];
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, txtFullNameField);
		Assert.assertEquals(true, txtFullName.getText().contains(firstName+" "+lastName));
		Thread.sleep(200);
		Assert.assertEquals(true, txtDOBDate.getText().contains(ccbDate));
		Thread.sleep(100);
		Assert.assertEquals(true, txtDOBMonth.getText().contains(ccbMonth));
		Thread.sleep(100);
		Assert.assertEquals(true, txtDOBYear.getText().contains(ccbYear));
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

	public void selectsPostOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSendYourBill);
		btnSendYourBillInfoIcon.click();
		elementVisible(100, txtSendYourBillInfoIcon);
		Assert.assertEquals(true, txtSendYourBillInfoIcon.getText().contains(c.getData("sendYourBillInformationText")));
		Thread.sleep(500);
		btnSendYourBillInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnEmail.isDisplayed());
		Assert.assertEquals(true, btnPost.isDisplayed());
		btnPost.click();
		Thread.sleep(500);
	}

	public void changedToEmailOption() throws Exception {
		btnEmail.click();
		Thread.sleep(1000);		
	}

	public void navigateToIWCMBConfirmationPage() throws Exception {
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
