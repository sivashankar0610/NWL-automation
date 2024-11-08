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

public class PS_ChangeOptionsFromMyProfile_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='small-title pb-20']") WebElement txtPriorityServices_MP;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[45]") WebElement btnPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[43]") WebElement txtPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[45]") WebElement btnPriorityServices_MPInfoIconClose;
	@FindBy(xpath="(//div[@class='pb-20'])[2]") WebElement txtPriorityServices_MPTeaser;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block change-psr-options']") WebElement btnChangePriorityServicesOptions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block remove-psr']") WebElement btnRemovePriorityServices;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]/h2") WebElement txtYourPriorityServicesOptions;
	@FindBy(xpath="(//div[@class='sub-title'])[10]") WebElement txtRegPersonAffectedBy;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[17]") WebElement btnRegPersonAffectedByInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[17]") WebElement txtRegPersonAffectedByInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[17]") WebElement btnRegPersonAffectedByInfoIconClose;
	@FindBy(xpath="//label[@for='id_blindField']") WebElement btnBlind;
	@FindBy(xpath="//label[@for='id_deafField']") WebElement btnDeaf;
	@FindBy(xpath="(//div[@class='sub-title'])[12]") WebElement txtRegPersonWithBottledWater;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[19]") WebElement btnRegPersonWithBottledWaterInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[19]") WebElement txtRegPersonWithBottledWaterInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[19]") WebElement btnRegPersonWithBottledWaterInfoIconClose;
	@FindBy(xpath="(//label[@class='chk-button'])[18]") WebElement btnRegPersonWithBottledWater_Yes;
	@FindBy(xpath="(//label[@class='chk-button'])[19]") WebElement btnRegPersonWithBottledWater_No;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[20]") WebElement btnSupportRegPersonInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[20]") WebElement txtSupportRegPersonInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[20]") WebElement btnSupportRegPersonInfoIconClose;
	@FindBy(xpath="//p[@class='normal']") WebElement txtSupportRegPersonTeaser;
	@FindBy(xpath="//textarea[@name='contactus-additional-details']") WebElement txtSupportRegPerson;
	@FindBy(xpath="//label[@class='form-checkbox consent']/span[1]") WebElement checkBoxConsent;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit']") WebElement btnNext;
	@FindBy(xpath="//a[@class='breadcrumb-home']") WebElement txtHome;
	@FindBy(xpath="(//div[@class='account-teaser'])[6]/h2[2]") WebElement txtWeHaveUpdatedYourChoices;
	//@FindBy(xpath="//span[@class='psr-completion-teaser']") WebElement txtSuccessMsgTeaser;
	@FindBy(id="lblCompleteContactId") WebElement txtConfirmationNo;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block nb-btn-outline'])[2]") WebElement btnBackToPriorityServices;
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBCharacteristics;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin '])[1]/label") WebElement txtCCBCustomerContactInfo;
	
	String confirmationNumber;
 
	public PS_ChangeOptionsFromMyProfile_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//PS_ChangeOptionsFromMyProfile_LoggedIn.properties");
	}
	
	public void verifyPriorityServicesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPriorityServices_MP);
		btnPriorityServices_MPInfoIcon.click();
		elementVisible(100, txtPriorityServices_MPInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPriorityServices_MPInfoIcon.getText().contains(c.getData("priorityServices_MPInformationText")));
		btnPriorityServices_MPInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPriorityServices_MPTeaser.getText().contains(c.getData("priorityServices_MPTeaser")));
		Assert.assertEquals(true, btnChangePriorityServicesOptions.isDisplayed());
		Assert.assertEquals(true, btnRemovePriorityServices.isDisplayed());
	}
	
	public void navigateToYourPriorityServicesOptionsPage() throws Exception {
		btnChangePriorityServicesOptions.click();
		elementVisible(100, txtYourPriorityServicesOptions);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourPriorityServicesOptions);
		Thread.sleep(3000);
	}
	
	public void userUnselectsBlindOptionAndSelectsDeafOptionForRegisteredPersonAffectedBy() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonAffectedBy);
		btnRegPersonAffectedByInfoIcon.click();
		elementVisible(100, txtRegPersonAffectedByInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRegPersonAffectedByInfoIcon.getText().contains(c.getData("regPersonAffectedByInformationText")));
		btnRegPersonAffectedByInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnBlind.isEnabled());
		btnBlind.click();
		Thread.sleep(500);
		btnDeaf.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonAffectedBy);
	}
	
	public void userChangesFromYesToNoOptionForRegisteredPersonWithBottledWater() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonWithBottledWater);
		btnRegPersonWithBottledWaterInfoIcon.click();
		elementVisible(100, txtRegPersonWithBottledWaterInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRegPersonWithBottledWaterInfoIcon.getText().contains(c.getData("regPersonWithBottledWaterInformationText")));
		btnRegPersonWithBottledWaterInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnRegPersonWithBottledWater_Yes.isEnabled());
		Assert.assertEquals(true, btnRegPersonWithBottledWater_No.isDisplayed());
		btnRegPersonWithBottledWater_No.click();
		Thread.sleep(500);
		btnSupportRegPersonInfoIcon.click();
		elementVisible(100, txtSupportRegPersonInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtSupportRegPersonInfoIcon.getText().contains(c.getData("supportRegPersonInformationText")));
		btnSupportRegPersonInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtSupportRegPersonTeaser.getText().contains(c.getData("supportRegPersonTeaser")));
		txtSupportRegPerson.sendKeys("Hello, Good Morning...");
		Thread.sleep(500);
	}
	
	public void userSelectsIConsentForNWGCheckBox() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkBoxConsent);
		checkBoxConsent.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnNext.isDisplayed());
	}
	
	public void navigateToPSRUpdateConfirmationScreen() throws Exception {
		btnNext.click();
		elementVisible(100, txtWeHaveUpdatedYourChoices);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHome);
		//Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		confirmationNumber=txtConfirmationNo.getText();
		System.out.println(confirmationNumber);
		Assert.assertEquals(true, btnBackToPriorityServices.isDisplayed());
	}

	public void navigateToMyProfile() throws Exception {
		btnBackToPriorityServices.click();
		elementVisible(100, tabMyProfile);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPriorityServices_MP);
		btnPriorityServices_MPInfoIcon.click();
		elementVisible(100, txtPriorityServices_MPInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPriorityServices_MPInfoIcon.getText().contains(c.getData("priorityServices_MPInformationText")));
		btnPriorityServices_MPInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPriorityServices_MPTeaser.getText().contains(c.getData("priorityServices_MPTeaser")));
		Assert.assertEquals(true, btnChangePriorityServicesOptions.isDisplayed());
		Assert.assertEquals(true, btnRemovePriorityServices.isDisplayed());
	}
	
	public void userVerifyCustomerContactCharacteristicsInCCB(String username, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		Thread.sleep(1000);
		btnCCBUserID.sendKeys(username);
		btnCCBPwd.sendKeys(pwd);
		btnCCBLogin.click();
	    Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBCustomerInformation);
		btnCCBCustomerInformation.click();
		elementVisible(100, btnCCBCustomerContact);
		btnCCBCustomerContact.click();
		elementVisible(100, btnCCBSearch);
		btnCCBSearch.click();
		Thread.sleep(10000);
		handleMultipleTabs(2);
		elementVisible(100, txtCCBCustomerContactID);
		txtCCBCustomerContactID.sendKeys(confirmationNumber);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCCBCharacteristics);
		tabCCBCharacteristics.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		//driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		elementVisible(100, txtCCBCustomerContactInfo);
		Thread.sleep(500);
	}

}
