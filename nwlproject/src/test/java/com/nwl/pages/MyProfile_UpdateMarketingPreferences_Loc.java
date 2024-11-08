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

public class MyProfile_UpdateMarketingPreferences_Loc extends BasePage {
    
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block updatemarketing-btn  box-hidden']") WebElement btnUpdateMarketingPreferences;
	@FindBy(xpath="//div[@class='profile-edit change-marketing']/div/div[1]/div[1]") WebElement txtMarketingAndCommunicationsPreferences;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block save-btn disabled']") WebElement btnSaveChanges1;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[2]") WebElement btnCancel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[37]") WebElement btnMCPreferencesInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[35]") WebElement txtMCPreferencesInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[37]") WebElement btnMCPreferencesInfoIconClose;
	@FindBy(xpath="//input[@id='NWLProductsMarketing']/following-sibling::span") WebElement toggleProductsAndServices;
	@FindBy(xpath="//input[@id='ResearchPrograms']/following-sibling::span") WebElement toggleProductsResearchOpportunities;
	@FindBy(xpath="//input[@id='KielderProductsMarketing']/following-sibling::span") WebElement toggleKielderForestNews;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[2]") WebElement btnSaveChanges2;
	@FindBy(xpath="//div[@class='profile-success-label']/h6") WebElement txtThankYouForTheUpdate;
	@FindBy(xpath="//div[@class='alert__content profile_name_update_content']/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToMyProfile;
	@FindBy(xpath="(//div[@class='small-title'])[8]") WebElement txtMyMarketingPreferences;
	@FindBy(xpath="//div[@class='profile-box box-hidden NWLProductsMarketing']/label") WebElement txtProductsAndServices;
	@FindBy(xpath="//div[@class='profile-box box-hidden ResearchPrograms']/label") WebElement txtMarketResearchProgrammes;
	@FindBy(xpath="//div[@class='profile-box box-hidden KielderProductsMarketing']/label") WebElement txtKielderWaterAndForest;
	@FindBy(xpath="//div[@class='profile-box box-hidden']/small") WebElement txtMyMarketingPreferencesTeaser;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="(//td[@class='oraNormal oraTableData']/a)[1]") WebElement linkCCBAccountName;
	@FindBy(xpath="(//td[@class='inactiveTab'])[10]") WebElement tabCCBAccountPortal;
	@FindBy(xpath="//span[@id='title_heading_4']") WebElement txtCCBSubscriptionCommunicationPreferences;
	
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	
	@FindBy(xpath="//input[@id='IM_REFRESH']") WebElement btnCCBRefresh;
	
	public MyProfile_UpdateMarketingPreferences_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MyProfile_UpdateMarketingPreferences.properties");
	}

	public void redirectedToMarketingAndCommunicationsPreferencesPage() throws Exception {
		btnUpdateMarketingPreferences.click();
		elementVisible(100, txtMarketingAndCommunicationsPreferences);
		Thread.sleep(1000);
		Assert.assertEquals(true, btnSaveChanges1.getAttribute("class").contains("disabled"));
		Assert.assertEquals(true, btnCancel.isDisplayed());
	}

	public void redirectedToMyProfileTab() throws Exception {
		btnCancel.click();
		elementVisible(100, btnUpdateMarketingPreferences);
		Thread.sleep(500);
	}

	public void SetsAllTogglesToOn() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMarketingAndCommunicationsPreferences);
		btnMCPreferencesInfoIcon.click();
		elementVisible(100, txtMCPreferencesInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtMCPreferencesInfoIcon.getText().contains(c.getData("mcPreferencesInformationText")));
		btnMCPreferencesInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, toggleProductsAndServices.isDisplayed());
		toggleProductsAndServices.click();
		Thread.sleep(500);
		Assert.assertEquals(true, toggleProductsResearchOpportunities.isDisplayed());
		toggleProductsResearchOpportunities.click();
		Thread.sleep(500);
		Assert.assertEquals(true, toggleKielderForestNews.isDisplayed());
		toggleKielderForestNews.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSaveChanges2.isDisplayed());
	}

	public void displaySuccessMsgPopup() throws Exception {
	    btnSaveChanges2.click();
	    elementVisible(100, txtThankYouForTheUpdate);
	    Thread.sleep(2000);
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnBackToMyProfile.isDisplayed());
	}

	public void navigatedToMyProfile() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, btnUpdateMarketingPreferences);
		Thread.sleep(3000);
	}

	public void verifyMyMarketingPreferencesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyMarketingPreferences);
		Assert.assertEquals(true, txtProductsAndServices.getText().contains(c.getData("productsAndServicesLabelText")));
		Assert.assertEquals(true, txtMarketResearchProgrammes.getText().contains(c.getData("marketResearchProgrammesLabelText")));
		Assert.assertEquals(true, txtKielderWaterAndForest.getText().contains(c.getData("kielderWaterAndForestLabelText")));
		Assert.assertEquals(true, txtMyMarketingPreferencesTeaser.getText().contains(c.getData("myMarketingPreferencesTeaser")));
	}

	public void verifyMarketingPreferencesSectionInCCB(String accNo, String ccbUserName, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUserName);
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Thread.sleep(2000);
		elementVisible(100, linkCCBAccountName);
		linkCCBAccountName.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBAccountPortal);
		tabCCBAccountPortal.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBSubscriptionCommunicationPreferences);
		Thread.sleep(500);
	}

	public void backToMyProfileTab() throws Exception {
		handleMultipleTabs(0);
		elementVisible(100, txtMyMarketingPreferences);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyProfile);
		Thread.sleep(500);
	}

	public void SetsAllTogglesFromOnToOff() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMarketingAndCommunicationsPreferences);
		toggleProductsAndServices.click();
		Thread.sleep(500);
		toggleProductsResearchOpportunities.click();
		Thread.sleep(500);
		toggleKielderForestNews.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSaveChanges2.isDisplayed());
	}

	public void verifyMarketingPreferencesSectionInCCB() throws Exception {
		handleMultipleTabs(1);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBSubscriptionCommunicationPreferences);
		Thread.sleep(1000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBRefresh.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBSubscriptionCommunicationPreferences);
		Thread.sleep(500);
	}

}
