package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ApplyForWaterMeter_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-your-property-information']/strong") WebElement txtWhatWouldYouLikeToDo;
	@FindBy(xpath="//div[@class='wp-your-property-information']/div[2]/button[2]") WebElement btnApplyForAWaterMeter;
	@FindBy(xpath="//div[@class='wrapper-box wp-spacing']/p") WebElement txtApplyForMeterTeaser1;
	@FindBy(xpath="(//div[@class='form-group'])[55]/div") WebElement dropdownPlsSelect1;
	@FindBy(xpath="(//div[@class='sel__box_inner'])[1]/span") List<WebElement> btnOccupancyValues;
	@FindBy(xpath="//div[@class='wrapper-box wp-spacing']/button") WebElement btnWhyDoWeAskThis;
	@FindBy(xpath="(//span[@class='tooltip-label'])[47]") WebElement txtWhyDoWeAskThisInfo;
	@FindBy(xpath="//div[@class='row-bedrooms form-row']/div[2]/div/div/div/div") WebElement dropdownNoOfBedRooms;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span[3]") WebElement btnNoofBeddRoomsOption;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[35]") WebElement btnExternalStopTapInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[33]") WebElement txtExternalStopTapInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[35]") WebElement btnExternalStopTapInfoIconClose;
	@FindBy(xpath="//div[@class='form-btn nb-row-padding external-stop-tap']/div[2]/button") WebElement btnNo1;
	@FindBy(xpath="//div[@class='form-btn nb-row-padding external-stop-tap']/div[1]/button") WebElement btnYes1;
	@FindBy(xpath="//textarea[@class='msg limit50']") WebElement txtExternalStopTapDescription;
	@FindBy(xpath="(//div[@class='form-btn nb-row-padding is-property-a-flat'])[2]/div[2]/button") WebElement btnNo2;
	@FindBy(xpath="//div[@class='wrapper-box wp-spacing']/div[6]/div[1]") WebElement txtDoYouRentYourHome;
	@FindBy(xpath="//div[@class='form-btn nb-row-padding is-rented']/div[2]/button") WebElement btnNo3;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement dropdownPlsSelect2;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span[4]") WebElement btnAnyTime;
	@FindBy(xpath="(//input[@type='number'])[5]") WebElement txtPhoneNumber;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit-request-norented']") WebElement btnSubmitMyApplication;
	@FindBy(xpath="//div[@class='contact-preferences']/div[2]/div[4]/p[1]") WebElement txtApplyForMeterTeaser2;
	@FindBy(xpath="//div[@class='contact-preferences']/div[2]/div[4]/p[3]/strong/a") WebElement linkTermsAndConditions;
	@FindBy(xpath="//div[@class='contact-preferences']/div[2]/div[4]/p[4]") WebElement txtApplyForMeterTeaser3;
	@FindBy(xpath="//div[@class='account-teaser no-teaser']/h4") WebElement txtThanksForYourApplication;
	@FindBy(xpath="//strong[@class='nub_confirm']") WebElement txtReceiptNumber;
	@FindBy(xpath="//div[@class='form-row font-18']/p[1]") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='form-row font-18']/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-myhome-unmeter']") WebElement btnGoBackToMyAccount;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	@FindBy(xpath="//div[@class='accountSummary--allComponents']/div[7]/div/h5") WebElement txtYourRecentActivity;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(id="CC_LOG:0$CC_LOG_CONTENT") WebElement txtCCBLogEntryNumber;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x22']") WebElement btnCCBBusinessProcesses;
	@FindBy(xpath="//li[@id='CM_BP_subMenuItem1x0']") WebElement btnCCBProcess;
	@FindBy(id="cm_bprqrTabMenu") WebElement btnCCBSearch3;
	@FindBy(xpath="//input[@class='oraInput oraDefault']") WebElement txtCCBProcessID;
	@FindBy(xpath="(//input[@id='anTLZ1Refresh'])[1]") WebElement btnCCBSearch4;
	@FindBy(xpath="//a[@navoptcd='cm_bprocTabMenu']") WebElement linkCCBMeterOption;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="//label[@oramdlabel='CM_TERMCONDTYPE']") WebElement txtCCBTermsAndConditions;
	@FindBy(id="IM_accountInfoButton") WebElement btnCCBAccountInformation;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBActivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	
	String receiptNo;
	
	public ApplyForWaterMeter_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ApplyForWaterMeter.properties");
	}

	public void clicksOnApplyForWaterMeterButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatWouldYouLikeToDo);
		btnApplyForAWaterMeter.click();
		elementVisible(100, txtApplyForMeterTeaser1);
		Assert.assertEquals(true, txtApplyForMeterTeaser1.getText().contains(c.getData("applyForMeterTeaser1")));
	}

	public void clicksOnWhyDoWeAskThisButton(String occupancy) throws Exception {
		dropdownPlsSelect1.click();
		Thread.sleep(2000);
		for (WebElement occupancyValue : btnOccupancyValues) {
			if (occupancyValue.getText().equalsIgnoreCase(occupancy)) {
				occupancyValue.click();
				break;
			}
		}
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatWouldYouLikeToDo);
		btnWhyDoWeAskThis.click();
		elementVisible(100, txtWhyDoWeAskThisInfo);
		Assert.assertEquals(true, txtWhyDoWeAskThisInfo.getText().contains(c.getData("whyDoWeAskThisInformationText")));
		Thread.sleep(1000);
		dropdownNoOfBedRooms.click();
		elementVisible(100, btnNoofBeddRoomsOption);
		btnNoofBeddRoomsOption.click();
		Thread.sleep(500);
	}

	public void selectsNoForExternalStopTap() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnExternalStopTapInfoIcon);
		btnExternalStopTapInfoIcon.click();
		elementVisible(100, txtExternalStopTapInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtExternalStopTapInfoIcon.getText().contains(c.getData("externalStopTapInformationText")));
		btnExternalStopTapInfoIconClose.click();
		btnNo1.click();
	}

	public void selectsYesForExternalStopTap() {
		btnYes1.click();
		elementVisible(100, txtExternalStopTapDescription);
		txtExternalStopTapDescription.sendKeys("Hello, Good Morning...");
	}

	public void selectsNoForDoYouLiveInAFlat() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtExternalStopTapDescription);
		btnNo2.click();
	}

	public void selectsNoForDoYouRentYourHome() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDoYouRentYourHome);
		btnNo3.click();
		elementVisible(100, dropdownPlsSelect2);
		dropdownPlsSelect2.click();
		elementVisible(100, btnAnyTime);
		btnAnyTime.click();
		Thread.sleep(1000);
		txtPhoneNumber.clear();
		Thread.sleep(500);
		txtPhoneNumber.sendKeys("09876543210");
	}

	public void userClicksOnTermsAndConditionsLink() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSubmitMyApplication);
		Assert.assertEquals(true, txtApplyForMeterTeaser2.getText().contains(c.getData("applyForMeterTeaser2")));
		Assert.assertEquals(true, txtApplyForMeterTeaser3.getText().contains(c.getData("applyForMeterTeaser3")));
		Assert.assertEquals(true, linkTermsAndConditions.isDisplayed());
		linkTermsAndConditions.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
	}

	public void navigateToConfirmationScreen() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnSubmitMyApplication);
		btnSubmitMyApplication.click();
		elementVisible(200, txtThanksForYourApplication);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourApplication);
		receiptNo=txtReceiptNumber.getText().replace(".", "");
		System.out.println(receiptNo);
		Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
	}

	public void navigateToAccountDashboardTab() throws Exception {
		btnGoBackToMyAccount.click();
		elementVisible(100, tabAccountDashboard);
		Thread.sleep(3000);
	}

	public void userVerifiesYourRecentActivitySection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourRecentActivity);
		Thread.sleep(500);
		
	}

	public void userVerifiesCustomerContactMainTabInCCB(String username, String pwd) throws Exception {
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
		txtCCBCustomerContactID.sendKeys(receiptNo);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_LOG_GRID")));
		elementVisible(100, txtCCBLogEntryNumber);
		Thread.sleep(500);
	}

	public void userVerifiesBusinessProcessSectionInCCB() throws Exception {
		String[] ccblogEntryNo = txtCCBLogEntryNumber.getText().split(":");
		String logEntryNo = ccblogEntryNo[1].replaceAll("\\s+", "");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBBusinessProcesses);
		btnCCBBusinessProcesses.click();
		elementVisible(100, btnCCBProcess);
		btnCCBProcess.click();
		elementVisible(100, btnCCBSearch3);
		btnCCBSearch3.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		elementVisible(100, txtCCBProcessID);
		txtCCBProcessID.sendKeys(logEntryNo);
		btnCCBSearch4.click();
		elementVisible(100, linkCCBMeterOption);
		linkCCBMeterOption.click();
		elementVisible(100, txtCCBProcessInfo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
	}

	public void userVerifiesProcessActivityHistoryInCCB() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_3']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBTermsAndConditions);
	}

	public void userVerifiesActivityHistoryInCCB() throws Exception {
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
		elementVisible(100, btnCCBAccountInformation);
		btnCCBAccountInformation.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, btnCCBActivityHistory);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBActivityHistory);
		btnCCBActivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
	}

}
