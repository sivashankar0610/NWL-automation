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

public class ReportALeak_LoggedIn_Loc extends BasePage {
	
	@FindBy(linkText="My local area") WebElement linkMyLocalArea;
	@FindBy(xpath="//a[@data-content='check-your-area']") WebElement tabCheckMyArea;
	@FindBy(xpath="//h1[@class='small-h1 normal']") WebElement txtWhatsGoingOnInMyArea;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtCheckMyAreaTeaser;
	@FindBy(id="data8-address-checkyourarealanding") WebElement txtAddress1;
	@FindBy(xpath="//strong[@class='wp-iclocation-link']/a") WebElement linkUseMyCurrentLocation;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[3]") WebElement btnReportAProblem;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block check-leak-map']") WebElement btnGoToOurHelpCentre;
	@FindBy(xpath="//a[@data-content='report-a-problem']") WebElement tabReportAProblem;
	@FindBy(xpath="//h1[@class='small-h1 normal']") WebElement txtReportAProblem;
	@FindBy(xpath="//div[@class='account-teaser form-row']/p") WebElement txtReportAProblemTeaser;
	@FindBy(id="idleaks") WebElement btnLeaks;
	@FindBy(id="idnowater") WebElement btnNoWater;
	@FindBy(id="idwaterpressure") WebElement btnWaterPressure;
	@FindBy(id="idwaterquality") WebElement btnWaterQuality;
	@FindBy(id="idsewerege") WebElement btnSewerage;
	@FindBy(id="idpollution") WebElement btnPollution;
	@FindBy(id="idcover") WebElement btnDrainsAndCovers;
	@FindBy(xpath="(//p[@class='sub-title'])[1]") WebElement txtItIsAnEmergency;
	@FindBy(xpath="(//div[@class='plink editorial__block editorial__block-none leak_emg_box'])[1]/p[1]") WebElement txtEmergencyTeaser;
	@FindBy(xpath="(//div[@class='plink editorial__block editorial__block-none leak_emg_box'])[1]/p[2]/a") WebElement linkEmergency;
	@FindBy(xpath="(//div[@class='plink editorial__block editorial__block-none leak_emg_box'])[2]/p[1]") WebElement txtLeakInsideYourHomeTeaser;
	@FindBy(xpath="(//div[@class='plink editorial__block editorial__block-none leak_emg_box'])[2]/p[2]/a") WebElement linkLocalApprovedPlumber;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/p") WebElement txtLeaksTeaser;
	@FindBy(xpath="//input[@id='data8-address-reportLeak']") WebElement txtAddress2;
	@FindBy(xpath="//div[@class='zero-leaks-found']/p") WebElement txtNoLeaksFound;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block report-leak-btn']") WebElement btnContinueToReportALeak;
	@FindBy(xpath="//div[@class='form-row start-report-leak']/div[1]") WebElement txtWhereIsTheLeak;
	@FindBy(xpath="//div[@class='form-row start-report-leak']/div[2]/button") WebElement btnRoadLaneOrFootPath;
	@FindBy(xpath="//div[@class='form-row start-report-leak']/div[3]/button") WebElement btnVergeFieldWoodLandOrPark;
	@FindBy(xpath="//div[@class='form-row start-report-leak']/div[4]/button") WebElement btnOnDriveWayOrInGarden;
	@FindBy(xpath="//div[@class='form-row row-describe-issus wp-leak-road']/div[1]") WebElement txtInformationAboutWherethisLeak;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnInformationAboutWherethisLeakInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtInformationAboutWherethisLeakInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnInformationAboutWherethisLeakInfoIconClose;
	@FindBy(xpath="//textarea[@class='msg-leaks limit500']") WebElement txtLandMarks;
	@FindBy(xpath="//div[@class='form-row serverity-check-row']/div") WebElement txtHowBadIsTheLeak;
	@FindBy(xpath="//div[@class='form-row serverity-check-row']/ul/li[1]") WebElement btnPuddle;
	@FindBy(xpath="//div[@class='form-row serverity-check-row']/ul/li[2]") WebElement btnSteadyFlow;
	@FindBy(xpath="//div[@class='form-row serverity-check-row']/ul/li[3]") WebElement btnGushing;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnAddingPhotoOrVideoInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtAddingPhotoOrVideoInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnAddingPhotoOrVideoInfoIconClose;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]/p") WebElement txtAddingPhotoOrVideoTeaser;
	@FindBy(xpath="//label[@class='nb-btn nb-btn-block']") WebElement btnAddingPhotoOrVideo;
	@FindBy(xpath="(//div[@class='sub-title'])[5]") WebElement txtContactDetails;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnContactDetailsInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtContactDetailsInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnContactDetailsInfoIconClose;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]/p") WebElement txtContactDetailsTeaser;
	@FindBy(xpath="(//span[@class='form-line'])[4]") WebElement txtEmail;
	@FindBy(xpath="(//input[@class='form-control telephone'])[1]") WebElement txtPhoneNo;
	@FindBy(id="lnkLeakSubmit1") WebElement btnFinishReportingThisLeak;
	@FindBy(xpath="//div[@class='leak-report-confirmation']/div/div/h4") WebElement txtThanksForReportingALeak;
	@FindBy(xpath="//p[@class='leak-confirmation-no']") WebElement txtReportReferenceNumber;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]/p[1]") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]/p[3]") WebElement txtSuccessMsgTeaser3;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[3]") WebElement btnHowWeFixLeaks;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[4]") WebElement btnHowLongItTakesToFixLeaks;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtFixingLeaks;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBCharacterstics;
	@FindBy(id="CC_CHAR:3$CHAR_VAL_FK1") WebElement txtCCBOwnerProcessNo;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x22']") WebElement btnCCBBusinessProcesses;
	@FindBy(xpath="//li[@id='CM_BP_subMenuItem1x0']") WebElement btnCCBProcess;
	@FindBy(id="cm_bprqrTabMenu") WebElement btnCCBSearch3;
	@FindBy(xpath="//input[@class='oraInput oraDefault']") WebElement txtCCBProcessID;
	@FindBy(xpath="(//input[@id='anTLZ1Refresh'])[1]") WebElement btnCCBSearch4;
	@FindBy(xpath="//a[@navoptcd='cm_bprocTabMenu']") WebElement linkCCBLeakage;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//img[@class='oraExpandCollapse'])[3]") WebElement txtCCBFieldActivityDetails;
	
	String reportReferenceNumber;

	public ReportALeak_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ReportALeak_LoggedIn.properties");
	}

	public void navigateToCheckMyAreaTab() throws Exception {
		elementVisible(100, linkMyLocalArea);
		linkMyLocalArea.click();
		elementVisible(100, tabCheckMyArea);
		Assert.assertEquals(true, txtWhatsGoingOnInMyArea.getText().contains(c.getData("checkMyAreaLabel")));
		Assert.assertEquals(true, txtCheckMyAreaTeaser.getText().contains(c.getData("checkMyAreaTeaser")));
		Assert.assertEquals(true, txtAddress1.isDisplayed());
		Assert.assertEquals(true, linkUseMyCurrentLocation.isDisplayed());
		Assert.assertEquals(true, btnReportAProblem.isDisplayed());
		Assert.assertEquals(true, btnGoToOurHelpCentre.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabCheckMyArea);
	}

	public void navigateToReportAProblemTab() throws Exception {
		tabReportAProblem.click();
		elementVisible(100, txtReportAProblem);
		//Assert.assertEquals(true, txtReportAProblemTeaser.getText().contains(c.getData("reportAProblemTeaser")));
		Assert.assertEquals(true, btnLeaks.isDisplayed());
		Assert.assertEquals(true, btnNoWater.isDisplayed());
		Assert.assertEquals(true, btnWaterPressure.isDisplayed());
		Assert.assertEquals(true, btnWaterQuality.isDisplayed());
		Assert.assertEquals(true, btnSewerage.isDisplayed());
		Assert.assertEquals(true, btnPollution.isDisplayed());
		Assert.assertEquals(true, btnDrainsAndCovers.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabReportAProblem);
	}

	public void userClicksOnLeaksButton() throws Exception {
		btnLeaks.click();
		elementVisible(100, txtItIsAnEmergency);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtItIsAnEmergency);
		Assert.assertEquals(true, txtEmergencyTeaser.getText().contains(c.getData("emergencyTeaser")));
		Assert.assertEquals(true, linkEmergency.isDisplayed());
		Assert.assertEquals(true, txtLeakInsideYourHomeTeaser.getText().contains(c.getData("leakInsideYourHomeTeaser")));
		Assert.assertEquals(true, linkLocalApprovedPlumber.isDisplayed());
		Assert.assertEquals(true, txtLeaksTeaser.getText().contains(c.getData("leaksTeaser")));
	}

	public void userEntersRequiredAddress(String address) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAddress2);
		Assert.assertEquals(true, txtAddress2.isDisplayed());
		Assert.assertEquals(true, linkUseMyCurrentLocation.isDisplayed());
		txtAddress2.sendKeys(address);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		/*elementVisible(100, txtNoLeaksFound);
		Assert.assertEquals(true, txtNoLeaksFound.getText().contains(c.getData("noLeaksFoundText")));*/
		Assert.assertEquals(true, btnContinueToReportALeak.isDisplayed());
	}

	public void userClicksOnContinueToReportALeakButton() throws Exception {
		btnContinueToReportALeak.click();
		elementVisible(100, txtWhereIsTheLeak);
		Assert.assertEquals(true, btnRoadLaneOrFootPath.isDisplayed());
		Assert.assertEquals(true, btnVergeFieldWoodLandOrPark.isDisplayed());
		Assert.assertEquals(true, btnOnDriveWayOrInGarden.isDisplayed());
		Thread.sleep(500);
	}

	public void userClicksOnInTheRoadLaneOrFootPathButton() throws Exception {
		btnRoadLaneOrFootPath.click();
		elementVisible(100, txtInformationAboutWherethisLeak);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtInformationAboutWherethisLeak.getText().contains(c.getData("informationAboutWherethisLeakLabel")));
		btnInformationAboutWherethisLeakInfoIcon.click();
		elementVisible(100, txtInformationAboutWherethisLeakInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtInformationAboutWherethisLeakInfoIcon.getText().contains(c.getData("informationAboutWherethisLeakInformationText")));
		Thread.sleep(500);
		btnInformationAboutWherethisLeakInfoIconClose.click();
		elementVisible(100, txtLandMarks);
		txtLandMarks.sendKeys("Police Station");
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnRoadLaneOrFootPath);
	}

	public void UserSelectsSteadyFlowFromHowBadIsTheLeakSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowBadIsTheLeak);
		Assert.assertEquals(true, btnPuddle.isDisplayed());
		Assert.assertEquals(true, btnSteadyFlow.isDisplayed());
		Assert.assertEquals(true, btnGushing.isDisplayed());
		btnSteadyFlow.click();
		btnAddingPhotoOrVideoInfoIcon.click();
		elementVisible(100, txtAddingPhotoOrVideoInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtAddingPhotoOrVideoInfoIcon.getText().contains(c.getData("addingPhotoOrVideoInformationText")));
		Thread.sleep(500);
		btnAddingPhotoOrVideoInfoIconClose.click();
		elementVisible(100, txtAddingPhotoOrVideoTeaser);
		Assert.assertEquals(true, txtAddingPhotoOrVideoTeaser.getText().contains(c.getData("addingPhotoOrVideoTeaser")));
		Assert.assertEquals(true, btnAddingPhotoOrVideo.isDisplayed());
	}

	public void userVerifiesContactDetails(String email) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtContactDetails);
		btnContactDetailsInfoIcon.click();
		elementVisible(100, txtContactDetailsInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtContactDetailsInfoIcon.getText().contains(c.getData("contactDetailsInformationText")));
		Thread.sleep(500);
		btnContactDetailsInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtContactDetailsTeaser.getText().contains(c.getData("contactDetailsTeaser")));
		Assert.assertEquals(true, txtEmail.getText().contains(email));
		txtPhoneNo.clear();
		Thread.sleep(500);
		txtPhoneNo.sendKeys("09876543210");
		Assert.assertEquals(true, btnFinishReportingThisLeak.isDisplayed());
		Thread.sleep(500);
	}

	public void navigateToConfirmationScreen() throws Exception {
		btnFinishReportingThisLeak.click();
		elementVisible(100, txtThanksForReportingALeak);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForReportingALeak);
		reportReferenceNumber=txtReportReferenceNumber.getText();
		Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtSuccessMsgTeaser3.getText().contains(c.getData("successMsgTeaser3")));
		Assert.assertEquals(true, btnHowWeFixLeaks.isDisplayed());
		Assert.assertEquals(true, btnHowLongItTakesToFixLeaks.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForReportingALeak);
	}

	public void navigateToFixingLeaksPage1() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSuccessMsgTeaser3);
		btnHowWeFixLeaks.click();
		handleMultipleTabs(1);
		elementVisible(100, txtFixingLeaks);
		Assert.assertEquals(true, driver.getCurrentUrl().contains("fixing-leaks"));
		Thread.sleep(500);
	}

	public void navigateToFixingLeaksPage2() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnHowLongItTakesToFixLeaks);
		btnHowLongItTakesToFixLeaks.click();
		handleMultipleTabs(1);
		elementVisible(100, txtFixingLeaks);
		Assert.assertEquals(true, driver.getCurrentUrl().contains("fixing-leaks"));
		Thread.sleep(500);
	}

	public void userVerifiesCustomerContactMainTabInCCB(String username, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(2);
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
		handleMultipleTabs(3);
		elementVisible(100, txtCCBCustomerContactID);
		txtCCBCustomerContactID.sendKeys(reportReferenceNumber);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(2);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCCBCharacterstics);
		tabCCBCharacterstics.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		elementVisible(100, txtCCBOwnerProcessNo);
		Thread.sleep(500);
	}

	public void userVerifiesBusinessProcessSectionInCCB() throws Exception {
		String processID = txtCCBOwnerProcessNo.getAttribute("value");
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
		txtCCBProcessID.sendKeys(processID);
		btnCCBSearch4.click();
		elementVisible(100, linkCCBLeakage);
		linkCCBLeakage.click();
		elementVisible(100, txtCCBProcessInfo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
	}

	public void userVerifiesProcessActivityHistoryInCCB() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_3']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBFieldActivityDetails);
	}

}
