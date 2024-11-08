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

public class LowWaterPressure_LoggedIn_Loc extends BasePage {
	
	@FindBy(id="idwaterpressure") WebElement btnWaterPressure;
	@FindBy(xpath="//div[@class='wp-report-content wp-water-pressure']/div/div/div[1]/p[1]") WebElement txtWaterPressureTeaser1;
	@FindBy(xpath="//div[@class='wp-report-content wp-water-pressure']/div/div/div[1]/p[3]") WebElement txtWaterPressureTeaser2;
	@FindBy(xpath="//div[@class='wp-report-content wp-water-pressure']/div/div/div[1]/p[3]/strong/a") WebElement linkOurChecklist;
	@FindBy(xpath="//div[@class='wp-report-content wp-water-pressure']/div/div[2]/div[1]") WebElement txtLowOrHighWaterPressureLabel;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline low']") WebElement btnLowPressure;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline high']") WebElement btnHighPressure;
	@FindBy(xpath="//div[@class='form-row row-issue-affecting water-pressure-low']/div[1]") WebElement txtAffectingCWSLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[7]") WebElement btnAffectingCWSInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[7]") WebElement txtAffectingCWSInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[7]") WebElement btnAffectingCWSInfoIconClose;
	@FindBy(xpath="//div[@class='form-row row-issue-affecting water-pressure-low']/div[2]/div[1]/button") WebElement btnYes_CWS;
	@FindBy(xpath="//div[@class='form-row row-issue-affecting water-pressure-low']/div[2]/div[2]/button") WebElement btnNo_CWS;
	@FindBy(xpath="//div[@class='form-row row-low-issus-no']/p[1]") WebElement txtAffectingCWSTeaser1_No;
	@FindBy(xpath="//div[@class='form-row row-low-issus-no']/p[2]") WebElement txtAffectingCWSTeaser2_No;
	@FindBy(xpath="//div[@class='form-row row-low-issus-no']/p[2]/strong/a") WebElement linkWaterSafe;
	@FindBy(xpath="//div[@class='form-row row-low-issus-yes']") WebElement txtAffectingCWSTeaser_Yes;
	@FindBy(xpath="//div[@class='row-issus-yes water-pressure-low']/div[1]/div[1]") WebElement txtWhereIsmyStopTapLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[8]") WebElement btnWhereIsmyStopTapInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[8]") WebElement txtWhereIsmyStopTapInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[8]") WebElement btnWhereIsmyStopTapInfoIconClose;
	@FindBy(xpath="//div[@class='row-issus-yes water-pressure-low']/div[1]/div[2]") WebElement txtWhereIsmyStopTapTeaser;
	@FindBy(xpath="//div[@class='row-issus-yes water-pressure-low']/div[2]/div[1]") WebElement txtFixTheProblemLabel;
	@FindBy(xpath="//div[@class='row-issus-yes water-pressure-low']/div[2]/div[2]/div[1]/button") WebElement btnYes_FTP;
	@FindBy(xpath="//div[@class='row-issus-yes water-pressure-low']/div[2]/div[2]/div[2]/button") WebElement btnNo_FTP;
	@FindBy(xpath="//div[@class='row-thank-you']/div/div/p") WebElement txtThatIsGreatNews;
	@FindBy(xpath="//div[@class='form-row row-problem']/div[1]") WebElement txtWhenDidTheProblemStartLabel;
	@FindBy(xpath="(//input[@name='wp-problem-start'])[1]/following-sibling::span[1]") WebElement radioItsIntermittent;
	@FindBy(xpath="(//input[@name='wp-problem-start'])[2]/following-sibling::span[1]") WebElement radioItsOnlyJustStarted;
	@FindBy(xpath="(//input[@name='wp-problem-start'])[3]/following-sibling::span[1]") WebElement radioToday;
	@FindBy(xpath="(//input[@name='wp-problem-start'])[4]/following-sibling::span[1]") WebElement radioYesterday;
	@FindBy(xpath="(//input[@name='wp-problem-start'])[5]/following-sibling::span[1]") WebElement radioAWeekAgo;
	@FindBy(xpath="(//input[@name='wp-problem-start'])[6]/following-sibling::span[1]") WebElement radioMoreThanAWeekAgo;
	@FindBy(xpath="//div[@class='row-call-us']/div[1]") WebElement txtCallUsLabel;
	@FindBy(xpath="//div[@class='row-call-us']/div[2]/a") WebElement btnArrowPhoneNo;
	@FindBy(xpath="//div[@class='row-call-us']/div[2]/a/span[1]") WebElement txtPhoneNo;
	@FindBy(xpath="//div[@class='lbl']") WebElement txtYourContactDetailsLabel;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	
	@FindBy(xpath="//input[@id='firstname-waterpressure']/following-sibling::span[1]") WebElement txtFirstName;
	@FindBy(xpath="//input[@id='surname-waterpressure']/following-sibling::span[1]") WebElement txtSurname;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[9]") WebElement btnEmailAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[9]") WebElement txtEmailAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[9]") WebElement btnEmailAddressInfoIconClose;
	@FindBy(xpath="//input[@id='email-waterpressure']/following-sibling::span[1]") WebElement txtEmailAddress;
	@FindBy(xpath="//input[@id='telephone-waterpressure']") WebElement txtContactNumber;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit']") WebElement btnSubmit;
	@FindBy(xpath="//div[@class='alert_window success reportProblemAlert']/div/div/div[2]/div[1]/p[1]") WebElement txtYourConfirmationNumberIs;
	@FindBy(xpath="//p[@class='confimation-no']/strong") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='alert_window success reportProblemAlert']/div/div/div[2]/div[2]/p[1]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//a[@class='nb-btn close-btn']") WebElement btnClose;
	
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
    @FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch1;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:1$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//img[@oramdlabel='F1_COLLAPSE_SECTION'])[2]/following-sibling::label") WebElement txtCCBNWAndLPCJ;
	@FindBy(id="ProcLevelInfo_custwtrSuplyAfct") WebElement txtCCBLowPressure;
	@FindBy(xpath="//span[@id='IM_accountInfoButton']") WebElement btnCCBAccountInformation;
	@FindBy(xpath="//label[@oramdlabel='CM_MAIN_DTLS']") WebElement txtCCBMainDetails;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	
	String confirmationNo;
	
	public LowWaterPressure_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//LowWaterPressure.properties");
	}

	public void userClicksOnWaterPressureButton() throws Exception {
		elementVisible(100, btnWaterPressure);
		btnWaterPressure.click();
		elementVisible(100, txtWaterPressureTeaser1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterPressureTeaser1);
		Assert.assertEquals(true, txtWaterPressureTeaser1.getText().contains(c.getData("waterPressureTeaser1")));
		Assert.assertEquals(true, txtWaterPressureTeaser2.getText().contains(c.getData("waterPressureTeaser2")));
		Assert.assertEquals(true, linkOurChecklist.isDisplayed());
		Assert.assertEquals(true, txtLowOrHighWaterPressureLabel.getText().contains(c.getData("lowOrHighWaterPressureLabel")));
		Assert.assertEquals(true, btnLowPressure.isDisplayed());
		Assert.assertEquals(true, btnHighPressure.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterPressureTeaser1);
	}

	public void clicksOnLowPressureButton() throws Exception {
		btnLowPressure.click();
		elementVisible(100, txtAffectingCWSLabel);
		Assert.assertEquals(true, txtAffectingCWSLabel.getText().contains(c.getData("affectingCWSLabel")));
		btnAffectingCWSInfoIcon.click();
		elementVisible(100, txtAffectingCWSInfoIcon);
		Assert.assertEquals(true, txtAffectingCWSInfoIcon.getText().contains(c.getData("affectingCWSInformationText")));
		Thread.sleep(500);
		btnAffectingCWSInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnYes_CWS.isDisplayed());
		Assert.assertEquals(true, btnNo_CWS.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLowOrHighWaterPressureLabel);
		
	}

	public void clicksOnNoButton_AffectingCWS() throws Exception {
		btnNo_CWS.click();
		elementVisible(100, txtAffectingCWSTeaser1_No);
		Assert.assertEquals(true, txtAffectingCWSTeaser1_No.getText().contains(c.getData("affectingCWSTeaser1_No")));
		Assert.assertEquals(true, txtAffectingCWSTeaser2_No.getText().contains(c.getData("affectingCWSTeaser2_No")));
		Assert.assertEquals(true, linkWaterSafe.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAffectingCWSLabel);
	}

	public void clicksOnYesButton_AffectingCWS() throws Exception {
		btnYes_CWS.click();
		elementVisible(100, txtAffectingCWSTeaser_Yes);
		String[] teaser = txtAffectingCWSTeaser_Yes.getText().split("\n");
		Assert.assertEquals(true, teaser[0].contains(c.getData("affectingCWSTeaser1_Yes")));
		Assert.assertEquals(true, teaser[2].contains(c.getData("affectingCWSTeaser2_Yes")));
		Assert.assertEquals(true, txtWhereIsmyStopTapLabel.getText().contains(c.getData("whereIsmyStopTapLabel")));
		btnWhereIsmyStopTapInfoIcon.click();
		elementVisible(100, txtWhereIsmyStopTapInfoIcon);
		Assert.assertEquals(true, txtWhereIsmyStopTapInfoIcon.getText().contains(c.getData("whereIsmyStopTapInformationText")));
		Thread.sleep(500);
		btnWhereIsmyStopTapInfoIconClose.click();
		Thread.sleep(500);
		String[] teaser1 = txtWhereIsmyStopTapTeaser.getText().split("\n");
		Assert.assertEquals(true, teaser1[0].contains(c.getData("whereIsmyStopTapTeaser1")));
		Assert.assertEquals(true, teaser1[2].contains(c.getData("whereIsmyStopTapTeaser2")));
		Assert.assertEquals(true, txtFixTheProblemLabel.getText().contains(c.getData("fixTheProblemLabel")));
		Assert.assertEquals(true, btnYes_FTP.isDisplayed());
		Assert.assertEquals(true, btnNo_FTP.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAffectingCWSLabel);
	}

	public void clickOnYesButton_FTP() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFixTheProblemLabel);
		btnYes_FTP.click();
		elementVisible(100, txtThatIsGreatNews);
		Assert.assertEquals(true, txtThatIsGreatNews.getText().contains(c.getData("fixTheProblemTeaser_Yes")));
	}

	public void clickOnNoButton_FTP() throws Exception {
		btnNo_FTP.click();
		elementVisible(100, txtWhenDidTheProblemStartLabel);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtWhenDidTheProblemStartLabel.getText().contains(c.getData("problemStartLabel")));
	}
	
	public void selectsItsIntermittentRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenDidTheProblemStartLabel);
		Assert.assertEquals(true, radioItsIntermittent.isDisplayed());
		radioItsIntermittent.click();
		elementVisible(100, txtYourContactDetailsLabel);
		Assert.assertEquals(true, txtYourContactDetailsLabel.getText().contains(c.getData("contactDetailsLabel")));
	}
	
	public void selectsItsOnlyJustStartedRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenDidTheProblemStartLabel);
		Assert.assertEquals(true, radioItsOnlyJustStarted.isDisplayed());
		radioItsOnlyJustStarted.click();
		elementVisible(100, txtCallUsLabel);
		verifyCallUsSection();
	}
	
	public void selectsTodayRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenDidTheProblemStartLabel);
		Assert.assertEquals(true, radioToday.isDisplayed());
		radioToday.click();
		elementVisible(100, txtCallUsLabel);
		verifyCallUsSection();
	}
	
	public void selectsYesterdayRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenDidTheProblemStartLabel);
		Assert.assertEquals(true, radioYesterday.isDisplayed());
		radioYesterday.click();
		elementVisible(100, txtCallUsLabel);
		verifyCallUsSection();
	}
	
	public void verifyCallUsSection() throws Exception{
		Assert.assertEquals(true, txtCallUsLabel.getText().contains(c.getData("callUsLabel")));
		Assert.assertEquals(true, btnArrowPhoneNo.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.getText().contains(c.getData("phoneNumber")));
	}
	
	public void selectsAWeekAgoRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenDidTheProblemStartLabel);
		Assert.assertEquals(true, radioAWeekAgo.isDisplayed());
		radioAWeekAgo.click();
		elementVisible(100, txtYourContactDetailsLabel);
		Assert.assertEquals(true, txtYourContactDetailsLabel.getText().contains(c.getData("contactDetailsLabel")));
	}
	
	public void selectsMoreThanAWeekAgoRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenDidTheProblemStartLabel);
		Assert.assertEquals(true, radioMoreThanAWeekAgo.isDisplayed());
		radioMoreThanAWeekAgo.click();
		elementVisible(100, txtYourContactDetailsLabel);
		Assert.assertEquals(true, txtYourContactDetailsLabel.getText().contains(c.getData("contactDetailsLabel")));
	}

	public void verifyYourContactDetailsWithCCB(String ccbUsername, String ccbPwd, String accNo, String email) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourContactDetailsLabel);
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
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
		String firstName = splitName[1];
		String lastName = splitName[0].substring(0,splitName[0].length()-1);
		Thread.sleep(500);
		handleMultipleTabs(0);
		Assert.assertEquals(true, txtFirstName.getText().contains(firstName));
		Assert.assertEquals(true, txtSurname.getText().contains(lastName));
		/*btnEmailAddressInfoIcon.click();
		elementVisible(100, txtEmailAddressInfoIcon);
		Assert.assertEquals(true, txtEmailAddressInfoIcon.getText().contains(c.getData("emailAddressInformationText")));
		Thread.sleep(500);
		btnEmailAddressInfoIconClose.click();
		Thread.sleep(500);*/
		Assert.assertEquals(true, txtEmailAddress.getText().contains(email));
		txtContactNumber.clear();
		Thread.sleep(500);
		txtContactNumber.sendKeys("01234567890");
		Assert.assertEquals(true, btnSubmit.isDisplayed());
	}

	public void redirectedToWPConfirmationScreen() throws Exception {
		btnSubmit.click();
		elementVisible(100, txtYourConfirmationNumberIs);
		Assert.assertEquals(true, txtYourConfirmationNumberIs.getText().contains(c.getData("successMsgTeaser1")));
		confirmationNo=txtConfirmationNumber.getText();
		System.out.println(confirmationNo);
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, btnClose.isDisplayed());
	}

	public void clicksOnCloseButton() throws Exception {
		btnClose.click();
		elementVisible(100, txtWaterPressureTeaser1);
		Thread.sleep(1000);
	}

	public void verifiesMainProcessDetailsSectionInCCB() throws Exception {
		handleMultipleTabs(1);
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

	public void opensNoWaterAndLowPressureCustomerJourneyInCCB() {
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		elementVisible(100, txtCCBNWAndLPCJ);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBNWAndLPCJ);
		//Assert.assertEquals(true, txtCCBLowPressure.getText().contains("Low Pressure"));
	}

	public void verifiesActivityHistorySectionInCCB() throws Exception {
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
		btnCCBAccountInformation.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		elementVisible(100, txtCCBMainDetails);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAcivityHistory);
		btnCCBAcivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(1000);
	}

}
