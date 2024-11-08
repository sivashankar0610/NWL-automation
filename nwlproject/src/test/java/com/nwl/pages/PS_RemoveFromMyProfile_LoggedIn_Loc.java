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

public class PS_RemoveFromMyProfile_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block remove-psr']") WebElement btnRemovePriorityServices;
	@FindBy(xpath="(//h6[@class='pb-30'])[1]") WebElement txtAreYouSure;
	@FindBy(xpath="(//h6[@class='pb-30'])[1]/following-sibling::p") WebElement txtAreYouSureTeaser;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block remove-priority-conf-btn mb-20']") WebElement btnConfirm;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline remove-priority-goback-btn']") WebElement btnGoBack;
	@FindBy(xpath="//div[@class='small-title pb-20']") WebElement txtPriorityServices_MP;
	@FindBy(xpath="(//h6[@class='pb-30'])[2]") WebElement txtRemovalConfirmed;
	@FindBy(xpath="(//h6[@class='pb-30'])[2]/following-sibling::p") WebElement txtRemovalConfirmedTeaser;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block backto-profile-conf-btn mb-20']") WebElement btnBackToMyProfile;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[45]") WebElement btnPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[43]") WebElement txtPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[45]") WebElement btnPriorityServices_MPInfoIconClose;
	@FindBy(xpath="(//div[@class='pb-20'])[3]") WebElement txtPriorityServices_MPTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block register-psr-back']") WebElement btnRegForPriorityServices;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;

	public PS_RemoveFromMyProfile_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//PS_RemoveFromMyProfile_LoggedIn.properties");
	}

	public void displayAreYouSurePopup() throws Exception {
		btnRemovePriorityServices.click();
		elementVisible(100, txtAreYouSure);
		Assert.assertEquals(true, txtAreYouSureTeaser.getText().contains(c.getData("areYouSureTeaser")));
		Assert.assertEquals(true, btnConfirm.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
	}

	public void clicksOnGoBackButton() throws Exception {
		btnGoBack.click();
		elementVisible(100, txtPriorityServices_MP);
		Thread.sleep(500);
	}

	public void displayRemovalConfirmedPopup() throws Exception {
		btnConfirm.click();
		elementVisible(100, txtRemovalConfirmed);
		Assert.assertEquals(true, txtRemovalConfirmedTeaser.getText().contains(c.getData("removalConfirmedTeaser")));
		Assert.assertEquals(true, btnBackToMyProfile.isDisplayed());
	}

	public void clicksOnBackToMyProfileButton() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, txtPriorityServices_MP);
		Thread.sleep(3000);
		btnPriorityServices_MPInfoIcon.click();
		elementVisible(100, txtPriorityServices_MPInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPriorityServices_MPInfoIcon.getText().contains(c.getData("priorityServices_MPInformationText")));
		btnPriorityServices_MPInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPriorityServices_MPTeaser.getText().contains(c.getData("priorityServices_MPTeaser")));
		Assert.assertEquals(true, btnRegForPriorityServices.isDisplayed());
	}

	public void verifiesAccountInformationInCCB(String accNo, String ccbUsername, String ccbPwd) throws Exception {
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
		Thread.sleep(3000);
	}

}
