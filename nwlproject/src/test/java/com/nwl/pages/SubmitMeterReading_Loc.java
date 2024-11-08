package com.nwl.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class SubmitMeterReading_Loc extends BasePage {

	@FindBy(xpath="//li[@rel='home']") WebElement tabWaterMeterAndUsage;
	@FindBy(xpath="//div[@class='wp-your-property-information']/strong") WebElement txtWhatWouldYouLikeToDo;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-my-usage nb-btn-outline']") WebElement btnCheckMyUsage;
	
	@FindBy(xpath="(//div[@class='account-form']/h5)[21]") WebElement txtHowMuchWaterHaveIUsed;
	@FindBy(xpath="//div[@class='no-reading-data-text']/p") WebElement txtUsedWaterUnderText1;
	@FindBy(xpath="//div[@class='grap-no-reading-data-text']/p") WebElement txtUsedWaterUnderText2;
	@FindBy(xpath="//div[@class='multi-meter-data-text']/p") WebElement txtUsedWaterUnderText3;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[10]") WebElement txtTipsToSaveWater;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-white btn-detailed-usage'])[2]") WebElement btnYourUsageInMoreDetail;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-graph-view']") WebElement btnYourUsageInformation;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-table-view']") WebElement btnYourMeterReadings;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-viewmyusage'])[3]") WebElement btnGoBack;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-my-meter nb-btn-outline']") WebElement btnGiveAMeterReading;
	@FindBy(xpath="//div[@class='account-form reason-meter-box']/div[2]") WebElement txtWhyEnterMeterReading;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[32]") WebElement btnWhyEnterMeterReadingInfoIcon;
	@FindBy(xpath="//div[@class='wp-usage-link plink']/p") WebElement txtWhyEnterMeterReadingInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[32]") WebElement btnWhyEnterMeterReadingInfoIconClose;
	@FindBy(xpath="//div[@id='reason-meter-list']/label[1]") WebElement radioIHaveCard;
	@FindBy(xpath="//div[@class='meter_reading_alert_content']/h6") WebElement txtMeterReadingAlert;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block confirm-btn'])[2]") WebElement btnContinue;
	@FindBy(xpath="//span[@class='meter-last-reading']") WebElement txtLastReadingAndDate;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x7']") WebElement btnCCBMeter;
	@FindBy(xpath="//li[@id='CI_METER_subMenuItem0x7']") WebElement btnCCBMeterORItemSearch;
	@FindBy(xpath="//input[@id='ACCT_NBR']") WebElement txtCCBAccountID1;
	@FindBy(id="BU_section3_search") WebElement btnCCBSearch1;
	@FindBy(id="IM_MTR_ITEM:0$Grid_mtrCntxt") WebElement btnCCBMenuSymbol;
	@FindBy(xpath="//li[@id='CI_CONTEXTMETER_subMenuItem0x4']") WebElement btnCCBGoToReadHistory;
	@FindBy(xpath="//span[@id='MTR_INFO']") WebElement txtCCBSerialNo;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$READ_DTTM']") WebElement txtCCBLastReadingDate;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$REG_READING']") WebElement txtCCBLastReading;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$READ_TYPE_DESCR']") WebElement txtCCBReadingType;
	
	@FindBy(xpath="(//div[@class='accordion__item'])[5]") WebElement accordianMyWaterMeterDetails;
	@FindBy(xpath="(//p[@class='meter-serial-number'])[4]/b") WebElement txtSerialNo;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit-meter']") WebElement btnSubmitReading;
	@FindBy(xpath="//div[@class='meter-input']/input[1]") WebElement txtEnterMeterReading;
	@FindBy(xpath="//div[@class='msgWarning']") WebElement txtErrorMessage;
	@FindBy(xpath="//div[@class='meter-input']/input") List<WebElement> MeterReadingBox;
	@FindBy(xpath="//span[@class='correctMeterReading']") WebElement iconRightTick;
	@FindBy(xpath="//div[@class='usage_meter-confirmation']/h4") WebElement txtThanksWeGotYourReading;
	@FindBy(xpath="//div[@class='usage_meter-confirmation']/p") WebElement txtConfirmationMsg;
	@FindBy(xpath="//div[@class='usage_meter-confirmation']/p[1]/strong") WebElement confirmationNumber;
	@FindBy(xpath="//div[@class='usage_meter-confirmation']/p[2]/strong") WebElement txtYouMayReceiveShortSurvey;
	@FindBy(xpath="(//p[@class='padding font-18'])[1]") WebElement txtWorkingOnYourNewBill;
	@FindBy(xpath="(//p[@class='padding font-18'])[2]") WebElement txtWillGetRevisedBill;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-ViewMyDetailed']") WebElement btnMyUsageInDetail;
	
	@FindBy(xpath="//input[@id='IM_REFRESH']") WebElement btnCCBRefresh;
	@FindBy(xpath="//span[@id='IM_USER_HOME']") WebElement btnCCBHome;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID2;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	
	String lastCCBReading;

	public SubmitMeterReading_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//SubmitMeterReading.properties");
	}
	
	public void navigateToWaterMeterAndUsageTab() throws Exception{
		Thread.sleep(3000);
		tabWaterMeterAndUsage.click();
		elementVisible(100, tabWaterMeterAndUsage);
		Thread.sleep(1000);
	}
	
	public void verifyHowMuchWaterHaveIUsedAndCarrouselCopytext() throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatWouldYouLikeToDo);
		btnCheckMyUsage.click();
		Thread.sleep(2000);
			Assert.assertEquals(true, txtHowMuchWaterHaveIUsed.getText().contains(c.getData("averageDailyUsagetitle")));
			if (txtUsedWaterUnderText1.isDisplayed()) {
				Assert.assertEquals(true, txtUsedWaterUnderText1.getText().contains(c.getData("avgUsageTopNoDataReadingTeaser")));
			}
			else if (txtUsedWaterUnderText2.isDisplayed()) {
				Assert.assertEquals(true, txtUsedWaterUnderText2.getText().contains(c.getData("avgUsageGrapViewNoDataReadingTeaser")));
			}
			else {
				Assert.assertEquals(true, txtUsedWaterUnderText3.getText().contains(c.getData("avgUsageMultiMeterTeaser")));
			}
			Assert.assertEquals(true, txtTipsToSaveWater.getText().contains(c.getData("waterSavingTipCarouselText")));
	}
	
	public void clicksOnViewUsageInMoreDetailButton(){
		btnYourUsageInMoreDetail.click();
		elementVisible(100, btnYourUsageInformation);
	}
	
	public void clicksOnYourMeterReadingsButton() throws Exception{
		btnYourMeterReadings.click();
		Thread.sleep(2000);
	}
	
	public void clicksOnGoBackButtonAndRedirectedToWaterMetersAndUsageTab() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnGoBack);
		btnGoBack.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabWaterMeterAndUsage);
	}	
	
	public void clicksOnGiveAMeterReadingButton() throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatWouldYouLikeToDo);
		btnGiveAMeterReading.click();
		elementVisible(100, txtWhyEnterMeterReading);
		Assert.assertEquals(true, txtWhyEnterMeterReading.getText().contains(c.getData("reasonOfMeterReadLabel")));
		btnWhyEnterMeterReadingInfoIcon.click();
		elementVisible(100, txtWhyEnterMeterReadingInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtWhyEnterMeterReadingInfoIcon.getText().contains(c.getData("whyEnterMeterReadingInformationText")));
		btnWhyEnterMeterReadingInfoIconClose.click();
		Thread.sleep(1000);
	}
	
	public void userSelectsIHaveCardLetterRadioButton() throws Exception{
		radioIHaveCard.click();
		elementVisible(100, txtMeterReadingAlert);
		Assert.assertEquals(true, txtMeterReadingAlert.getText().contains(c.getData("meterReadingAlertText")));
		Assert.assertEquals(true, btnContinue.isDisplayed());
	}
	
	public void redirectedToGiveAMeterReadingScreen() throws Exception{
		btnContinue.click();
		elementVisible(100, txtLastReadingAndDate);
	}
	
	public void verifyMyWaterMeterDetails(String accNo, String username, String pwd) throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLastReadingAndDate);
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(username);
		btnCCBPwd.sendKeys(pwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBMeter);
		btnCCBMeter.click();
		elementVisible(100, btnCCBMeterORItemSearch);
		btnCCBMeterORItemSearch.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBAccountID1);
		txtCCBAccountID1.sendKeys(accNo);
		btnCCBSearch1.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
		elementVisible(100, btnCCBMenuSymbol);
		btnCCBMenuSymbol.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBGoToReadHistory);
		btnCCBGoToReadHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBSerialNo);
		String[] s1 = txtCCBSerialNo.getText().split("/");
		String expectedSerialNumber = s1[1].toString().replaceAll("\\s", "");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataGrid']")));
		String expectedLastReadingDate = txtCCBLastReadingDate.getText().substring(0, 10);
		String m = expectedLastReadingDate.substring(3, 5);
		String month = m.replaceAll("^0+(?!$)", "");
		switch (Integer.parseInt(month)) {
		    case 1:
			    month="January";
			    break;
		    case 2:
				month="February";
				break; 
		    case 3:
			    month="March";
			    break;
		    case 4:
				month="April";
				break;
		    case 5:
			    month="May";
			    break;
		    case 6:
				month="June";
				break; 
		    case 7:
			    month="July";
			    break;
		    case 8:
				month="August";
				break;	
		    case 9:
			    month="September";
			    break;
		    case 10:
				month="October";
				break; 
		    case 11:
			    month="November";
			    break;
			default:
				month="December";
			    break;
		}
		String lastReadingDate_CCB = expectedLastReadingDate.substring(0, 3)+month+expectedLastReadingDate.substring(5);
		String[] s2 = txtCCBLastReading.getText().split("\\.");
		lastCCBReading = s2[0];
		handleMultipleTabs(0);
		elementVisible(100, txtLastReadingAndDate);
		String[] lastReadingAndDate = txtLastReadingAndDate.getText().split("\n");
		String expectedLastReading = null;
		if (lastReadingAndDate[0].length()==4) {
			if (lastCCBReading.length()==3) {
				expectedLastReading="0"+lastCCBReading;
			}
			else if (lastCCBReading.length()==2) {
				expectedLastReading="00"+lastCCBReading;
			}
			else if (lastCCBReading.length()==1) {
				expectedLastReading="000"+lastCCBReading;
			}
			else {
				expectedLastReading=lastCCBReading;
			}
			Assert.assertEquals(true, lastReadingAndDate[0].contains(expectedLastReading));
		}
		
		else if (lastReadingAndDate[0].length()==5) {
			if (lastCCBReading.length()==4) {
				expectedLastReading="0"+lastCCBReading;
			}
			else if (lastCCBReading.length()==3) {
				expectedLastReading="00"+lastCCBReading;
			}
			else if (lastCCBReading.length()==2) {
				expectedLastReading="000"+lastCCBReading;
			}
			else if (lastCCBReading.length()==1) {
				expectedLastReading="0000"+lastCCBReading;
			}
			else {
				expectedLastReading=lastCCBReading;
			}
			Assert.assertEquals(true, lastReadingAndDate[0].contains(expectedLastReading));
		}
		String[] date = lastReadingAndDate[1].substring(9).split(" ");
		String lastReadingDate_App = date[0].substring(0, 2)+"‑"+date[1]+"‑"+date[2];
		Assert.assertEquals(true, lastReadingDate_App.contains(lastReadingDate_CCB));
		accordianMyWaterMeterDetails.click();
		elementVisible(100, txtSerialNo);
		Assert.assertEquals(true, txtSerialNo.getText().contains(expectedSerialNumber));
	}
	
	public void clickOnSubmitReadingButtonWithoutProvideReading() throws Exception{
		btnSubmitReading.click();
		Thread.sleep(2000);
		Assert.assertEquals(true, txtEnterMeterReading.getAttribute("class").contains("error"));
	}
	
	public void provideInvalidMeterReading() throws Exception {
		enterReading(5000);	
		elementVisible(100, txtErrorMessage);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("invalidReadingErrorMsg")));
	}
	
	public void enterReading(int read){
		String[] lastReadingAndDate = txtLastReadingAndDate.getText().split("\n");
		String newReading = Integer.toString(Integer.parseInt(lastReadingAndDate[0].toString())+read);
		if (MeterReadingBox.size()==6){
			if (newReading.length()==5) {
				newReading="0"+newReading;
			}
			else if (newReading.length()==4) {
				newReading="00"+newReading;
			}
			else if (newReading.length()==3) {
				newReading="000"+newReading;
			}
			else if (newReading.length()==2) {
				newReading="0000"+newReading;
			}
			else if (newReading.length()==1) {
				newReading="00000"+newReading;
			}
		}
		else if (MeterReadingBox.size()==5){
			if (newReading.length()==4) {
				newReading="0"+newReading;
			}
			else if (newReading.length()==3) {
				newReading="00"+newReading;
			}
			else if (newReading.length()==2) {
				newReading="000"+newReading;
			}
			else if (newReading.length()==1) {
				newReading="0000"+newReading;
			}
		}
		else if (MeterReadingBox.size()==4) {
			if (newReading.length()==3) {
				newReading="0"+newReading;
			}
			else if (newReading.length()==2) {
				newReading="00"+newReading;
			}
			else if (newReading.length()==1) {
				newReading="000"+newReading;
			}
		}
		txtEnterMeterReading.sendKeys((newReading));
	}
	
	public void enterValidMeterReading() throws Exception{
		Thread.sleep(1000);
		txtEnterMeterReading.clear();
		enterReading(5);
		elementVisible(100, iconRightTick);
	}
	
	public void clicksOnSubmitReadingButton() throws Exception{
		btnSubmitReading.click();
		elementVisible(200, txtThanksWeGotYourReading);
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksWeGotYourReading);
		Assert.assertEquals(true, txtConfirmationMsg.getText().contains(c.getData("successMsgTeaser1a")+" "+confirmationNumber.getText()+c.getData("successMsgTeaser1b")));
		Assert.assertEquals(true, txtYouMayReceiveShortSurvey.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, txtWorkingOnYourNewBill.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtWillGetRevisedBill.getText().contains(c.getData("successMsgTeaser3")));
	}
	
	public void clicksOnMyUsageInMoreDetailButton(){
		btnMyUsageInDetail.click();
		elementVisible(100, txtWhatWouldYouLikeToDo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabWaterMeterAndUsage);
	}
	
	public void verifyReadHistoryInCCB() throws Exception{
		handleMultipleTabs(1);
		driver.switchTo().frame(0);
		btnCCBRefresh.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataGrid']")));
		String date = txtCCBLastReadingDate.getText().substring(0, 10);
		String readingSubmissionDate = date.substring(0, 2)+"/"+date.substring(3, 5)+"/"+date.substring(6, 10);
		String[] s2 = txtCCBLastReading.getText().split("\\.");
		String CCBReading = s2[0];
		String submittedReading = Integer.toString(Integer.parseInt(lastCCBReading)+5);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = new Date();
		Assert.assertEquals(true, readingSubmissionDate.contains(dateFormat.format(date1)));
		Assert.assertEquals(true, CCBReading.contains(submittedReading));
		Assert.assertEquals(true, txtCCBReadingType.getText().contains("Customer Read"));
	}
	
	public void opensActivityHistoryTabInCCB(String AccNo) throws Exception{	
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBHome.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
		txtCCBAccountID2.sendKeys(AccNo);
		btnCCBSearch2.click();
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAcivityHistory);
		btnCCBAcivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
	}
		
}
