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

public class ContactUs_MovingHomeForm_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[1]") WebElement btnTellUsYoureMovingHome;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]/h1") WebElement txtMovingHome;
	@FindBy(id="moveHome-fullname") WebElement txtFullNameField;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	@FindBy(id = "birthDate") WebElement txtCCBBirthDate;
	
	@FindBy(xpath="//input[@id='moveHome-fullname']//following-sibling::span[1]") WebElement txtFullName;
	@FindBy(xpath="//input[@id='accountNumber-moveHome']//following-sibling::span[1]") WebElement txtAccountNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnYourAddressInfoIconClose;
	@FindBy(xpath="(//input[@class='form-control telephone required'])[1]") WebElement txtTelephoneNumber;
	@FindBy(xpath="//input[@id='moveHome-email']//following-sibling::span[1]") WebElement txtEmail;
	@FindBy(xpath="(//span[@class='checkbox'])[1]") WebElement checkThisEmailToContactYou;
	@FindBy(id="movehome-day") WebElement txtDOBDate;
	@FindBy(id="movehome-month") WebElement txtDOBMonth;
	@FindBy(id="movehome-year") WebElement txtDOBYear;
	
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-submit'])[1]") WebElement btnSubmit;
	@FindBy(xpath="//div[@id='move-home-confirmation']/div/h1") WebElement txtThanksForYourMessage;
	@FindBy(xpath="//div[@id='move-home-confirmation']/div[2]/p") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center']/p[2]/a") WebElement linkCreateOnlineAccountHere;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToHomePage;
	
	String firstName, lastName;	

	public ContactUs_MovingHomeForm_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ContactUs_MovingHomeForm_LoggedIn.properties");
	}

	public void redirectedToMovingHomePage() throws Exception {
		btnTellUsYoureMovingHome.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtMovingHome);
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
		Assert.assertEquals(true, txtAccountNo.getText().contains(accNo));
		Thread.sleep(1000);
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
		txtDOBDate.sendKeys(ccbDate);
		Thread.sleep(200);
		txtDOBMonth.sendKeys(ccbMonth);
		Thread.sleep(200);
		txtDOBYear.sendKeys(ccbYear);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullNameField);
	}

	public void navigateToConfirmationScreen() throws Exception {
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
