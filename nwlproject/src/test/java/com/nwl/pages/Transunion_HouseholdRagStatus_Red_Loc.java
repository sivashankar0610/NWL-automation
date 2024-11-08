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

public class Transunion_HouseholdRagStatus_Red_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btnCheckTransUnionEligibilityForNotPensionCredit']") WebElement btnSubmitMyApplication;
    @FindBy(xpath="(//h5[@class='cl-main mb-10'])[2]") WebElement txtWeNeedSomeMoreInformation;
    @FindBy(xpath="(//div[@class='sub-content-eligible mb-10'])[2]/p[1]") WebElement txtSuccessMsgTeaser1;
    @FindBy(xpath="(//div[@class='sub-content-eligible mb-10'])[2]/p[2]/a") WebElement linkWhatInformationDoINeedToProvide;
    @FindBy(xpath="(//div[@class='sub-content-eligible mb-10'])[2]/p[3]") WebElement txtSuccessMsgTeaser2;
    @FindBy(xpath="(//p[@class='confirmation-number'])[3]") WebElement txtConfirmationNumber;
    @FindBy(xpath="(//button[@class='nb-btn nb-btn-block btnBackToAccount'])[3]") WebElement btnBackToMyAccount;
    @FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
    
    @FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
    @FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
    @FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch1;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
    
    String confirmationNo;

	public Transunion_HouseholdRagStatus_Red_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Transunion_HouseholdRagStatus_Red.properties");
	}

	public void navigateToConfirmationScreen() throws Exception {
		btnSubmitMyApplication.click();
		elementVisible(100, txtWeNeedSomeMoreInformation);
		Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
		Assert.assertEquals(true, linkWhatInformationDoINeedToProvide.isDisplayed());
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
		confirmationNo = txtConfirmationNumber.getText();
		System.out.println(confirmationNo);
		Assert.assertEquals(true, btnBackToMyAccount.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWeNeedSomeMoreInformation);
	}

	public void navigateToAccountDashboardTab() throws Exception {
		btnBackToMyAccount.click();
		elementVisible(100, tabAccountDashboard);
		Thread.sleep(2000);
	}

	public void verifyBusinessProcessInfoInCCB(String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://tst01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBCustomerInformation);
		btnCCBCustomerInformation.click();
		elementVisible(100, btnCCBCustomerContact);
		btnCCBCustomerContact.click();
		elementVisible(100, btnCCBSearch1);
		btnCCBSearch1.click();
		Thread.sleep(3000);
		handleMultipleTabs(2);
		txtCCBCustomerContactID.sendKeys(confirmationNo);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCharacteristics);
		tabCharacteristics.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		btnCCBMenuSymbol1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
		Thread.sleep(2000);
	}

}
