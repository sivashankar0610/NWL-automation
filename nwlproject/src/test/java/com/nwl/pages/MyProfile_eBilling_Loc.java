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

public class MyProfile_eBilling_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[2]/h6") WebElement txtMyPreferences1;
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[2]/div[1]/strong") WebElement txteBillingLabel1;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[43]") WebElement btneBillingInfoIcon1;
	@FindBy(xpath="(//span[@class='tooltip-label'])[41]") WebElement txteBillingInfoIcon1;
	@FindBy(xpath="(//a[@class='tooltip-close'])[43]") WebElement btneBillingInfoIconClose1;
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[2]/div[2]/div/label[1]/span") WebElement btneBillingToggle1;
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[2]/div[2]/div/label[2]") WebElement txteBillingOnTeaser;
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[2]/div[3]/a") WebElement linkeBillingTermsAndConditions1;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[3]") WebElement btnSaveChanges;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[3]") WebElement btnCancel;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToMyProfile;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changedetail-btn model']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[3]/h6") WebElement txtMyPreferences2;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[3]/div") WebElement txteBillingLabel2;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[44]") WebElement btneBillingInfoIcon2;
	@FindBy(xpath="(//span[@class='tooltip-label'])[42]") WebElement txteBillingInfoIcon2;
	@FindBy(xpath="(//a[@class='tooltip-close'])[44]") WebElement btneBillingInfoIconClose2;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[3]/label[2]") WebElement txteBillingOffTeaser_MP;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[3]/following-sibling::div[1]/a") WebElement linkeBillingTermsAndConditions2;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	@FindBy(xpath="//div[@class='wp-e-billing switch-to-ebiling-container']/div/div/h6") WebElement txtWantToSwitchToeBillingLabel;
	@FindBy(xpath="//div[@class='wp-e-billing switch-to-ebiling-container']/div/div/p") WebElement txtSwitchToeBillingTeaser;
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[1]/div/div/label/span") WebElement btneBillingToggle2;
	@FindBy(xpath="(//div[@class='row-ebilling box-hidden'])[1]/div[2]/a") WebElement linkeBillingTermsAndConditions_AD;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//label[@oramdlabel='CM_MAIN_DTLS']") WebElement txtCCBMainDetails;
	@FindBy(xpath="//td[@oraerrorelement='output/billRoute']") WebElement txtCCBBillRoute;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBActivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(xpath="(//span[@title='Display Customer Contact Comments'])[1]/span") WebElement txtCCBeBillDeRegister;
	
	@FindBy(xpath="//div[@class='alert_window profileAlert success']/div/div/div[2]/p") WebElement txteBillingPreferenceUpdated;
	@FindBy(xpath="//div[@class='alert_window profileAlert success']/div/div/div[2]/button") WebElement btnOk;
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[3]/label[1]") WebElement txteBillingOnTeaser_MP;
	
	@FindBy(xpath="//input[@id='IM_REFRESH']") WebElement btnCCBRefresh;
	@FindBy(xpath="(//span[@title='Display Customer Contact Comments'])[1]/span") WebElement txtCCBUpdateAccountDetailseBill;
	
	public MyProfile_eBilling_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MyProfile_eBilling.properties");
	}

	public void verifiesEBillingToggleIsSetToOn() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPreferences1);
		Assert.assertEquals(true, txteBillingLabel1.getText().contains(c.getData("eBillingLabel")));
		btneBillingInfoIcon1.click();
		elementVisible(100, txteBillingInfoIcon1);
		Thread.sleep(500);
		Assert.assertEquals(true, txteBillingInfoIcon1.getText().contains(c.getData("eBillingInformationText")));
		btneBillingInfoIconClose1.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btneBillingToggle1.isDisplayed());
		Assert.assertEquals(true, txteBillingOnTeaser.getText().contains(c.getData("eBillingOnTeaser")));
		Assert.assertEquals(true, linkeBillingTermsAndConditions1.isDisplayed());
		Assert.assertEquals(true, !btnSaveChanges.isEnabled());
		Assert.assertEquals(true, btnCancel.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPreferences1);
	}

	public void changesEBillingToggleFromOnToOff() throws Exception {
		btneBillingToggle1.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPreferences1);
	}

	public void clicksOnBackToMyProfileTab() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPreferences2);
		Assert.assertEquals(true, txteBillingLabel2.getText().contains(c.getData("eBillingLabel")));
		btneBillingInfoIcon2.click();
		elementVisible(100, txteBillingInfoIcon2);
		Thread.sleep(500);
		Assert.assertEquals(true, txteBillingInfoIcon2.getText().contains(c.getData("eBillingInformationText")));
		btneBillingInfoIconClose2.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txteBillingOffTeaser_MP.getText().contains(c.getData("eBillingOffTeaser")));
		Assert.assertEquals(true, linkeBillingTermsAndConditions2.isDisplayed());
	}

	public void clicksOnAccountDashboard() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabAccountDashboard);
		tabAccountDashboard.click();
		Thread.sleep(3000);
		elementVisible(100, txtWantToSwitchToeBillingLabel);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWantToSwitchToeBillingLabel);
		Assert.assertEquals(true, txtWantToSwitchToeBillingLabel.getText().contains(c.getData("switchToeBillingLabel")));
		Assert.assertEquals(true, txtSwitchToeBillingTeaser.getText().contains(c.getData("switchToeBillingTeaser")));
		Assert.assertEquals(true, btneBillingToggle2.isDisplayed());
		Assert.assertEquals(true, linkeBillingTermsAndConditions_AD.isDisplayed());
	}

	public void verifiesBillRouteInCCB(String accNo, String userName, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(userName);
		btnCCBPwd.sendKeys(pwd);
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		Thread.sleep(2000);
		elementVisible(100, txtCCBMainDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBMainDetails);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Assert.assertEquals(true, txtCCBBillRoute.getText().contains("HH-POST"));
		Thread.sleep(500);
	}

	public void verifyActivityHistorySection1() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBActivityHistory);
		btnCCBActivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(500);
		Assert.assertEquals(true, txtCCBeBillDeRegister.getText().contains("EBILL_DE-REGISTER message sent"));
	}

	public void switchOneBillingToggleUnderAD() throws Exception {
		handleMultipleTabs(0);
		elementVisible(100, txtWantToSwitchToeBillingLabel);
		btneBillingToggle2.click();
		Thread.sleep(500);
		elementVisible(100, txteBillingPreferenceUpdated);
		Assert.assertEquals(true, txteBillingPreferenceUpdated.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnOk.isDisplayed());
	}

	public void clicksOnOkButton() throws Exception {
		btnOk.click();
		Thread.sleep(2000);
		elementVisible(100, tabAccountDashboard);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabAccountDashboard);
	}

	public void verifyeBillingIsOnUnderMyProfile() throws Exception {
		tabMyProfile.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyPreferences2);
		Assert.assertEquals(true, txteBillingLabel2.getText().contains(c.getData("eBillingLabel")));
		btneBillingInfoIcon2.click();
		elementVisible(100, txteBillingInfoIcon2);
		Thread.sleep(500);
		Assert.assertEquals(true, txteBillingInfoIcon2.getText().contains(c.getData("eBillingInformationText")));
		btneBillingInfoIconClose2.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txteBillingOnTeaser_MP.getText().contains(c.getData("eBillingOnTeaser")));
		Assert.assertEquals(true, linkeBillingTermsAndConditions2.isDisplayed());
	}

	public void verifiesBillRouteInCCB() throws Exception {
		handleMultipleTabs(1);
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
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		btnCCBRefresh.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		Thread.sleep(2000);
		elementVisible(100, txtCCBMainDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBMainDetails);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Assert.assertEquals(true, txtCCBBillRoute.getText().contains("Email"));
		Thread.sleep(500);
	}
	
	public void verifyActivityHistorySection2() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBActivityHistory);
		btnCCBActivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(500);
		Assert.assertEquals(true, txtCCBUpdateAccountDetailseBill.getText().contains("UPDATE_ACCOUNT_DETAILS_EBILL_R message sent"));
	}

}
