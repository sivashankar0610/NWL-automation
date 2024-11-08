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

public class ChangePaymentPlan_Date_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-col wp-left wp-changes-details wp-col-pay-wd']/div/div[3]/div[1]") WebElement txtHowOftenDoYouWantToPay;
	@FindBy(xpath="(//div[@class='form-select selected'])[4]") WebElement dropdownFrequency;
	@FindBy(xpath="(//span[@class='sel__placeholder'])[5]") WebElement txtFrequency_Monthly;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[16]") WebElement btnPickPaymentDateInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[16]") WebElement txtPickPaymentDateInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[16]") WebElement btnPickPaymentDateInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select selected'])[5]") WebElement dropdownPaymentDate;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> btnPaymentDates;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit-new-details']") WebElement btnContinue;
	@FindBy(xpath="//h6[@class='sumbit-message-PM']") WebElement txtThanksForUpdatingPaymentPlan;
	@FindBy(xpath="//p[@class='txt-algn cmn-email-msg']") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="(//p[@class='newDirectDebitDetailsContent'])[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="(//b[@class='newDirectDebitDetailsContent confirmedNum'])[2]") WebElement txtConfirmationNumber;
	@FindBy(xpath="(//a[@class='nb-btn-link take-nwl close-btn'])[2]") WebElement linkClose;
	@FindBy(xpath="//li[@rel='billspayments']") WebElement tabMyBillsAndPayments;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(xpath="(//td[@class='oraNormal oraTableData']/a)[1]") WebElement linkCCBAccountName;
	@FindBy(xpath="(//td[@class='inactiveTab'])[8]") WebElement tabCCBCharacterstics;
	@FindBy(xpath="//input[@id='ACCT_CHAR:1$CHAR_VAL_FK1']") WebElement txtCCBNBBCalendarPaymentPreferenceValue;
	
	String confirmationNo, paymentDate;
	
	public ChangePaymentPlan_Date_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ChangePaymentPlan_Date.properties");
	}

	public void userSelectsPaymentPlan(String date) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowOftenDoYouWantToPay);
	    Assert.assertEquals(true, txtHowOftenDoYouWantToPay.getText().contains(c.getData("frequencyLabel")));
	    Assert.assertEquals(true, dropdownFrequency.isDisplayed());
	    Assert.assertEquals(true, txtFrequency_Monthly.getText().contains("Monthly"));
	    btnPickPaymentDateInfoIcon.click();
		elementVisible(100, txtPickPaymentDateInfoIcon);
		Assert.assertEquals(true, txtPickPaymentDateInfoIcon.getText().contains(c.getData("pickPaymentDateInformationText")));
		Thread.sleep(500);
		btnPickPaymentDateInfoIconClose.click();
		Thread.sleep(1000);
	    Assert.assertEquals(true, dropdownPaymentDate.isDisplayed());
	    paymentDate=date;
	    dropdownPaymentDate.click();
	    Thread.sleep(2000);
	    for (WebElement paymentdate : btnPaymentDates) {
			if (paymentdate.getText().contains(date)) {
				paymentdate.click();
				break;
			}
		}
	    Thread.sleep(1000);
	    Assert.assertEquals(true, btnContinue.isDisplayed());
	}

	public void navigateToConfirmationScreen() throws Exception {
		btnContinue.click();
		elementVisible(200, txtThanksForUpdatingPaymentPlan);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForUpdatingPaymentPlan);
	    Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
	    Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
	    confirmationNo=txtConfirmationNumber.getText();
	}

	public void navigateToMyBillsAndPaymentsScreen() throws Exception {
		Assert.assertEquals(true, linkClose.isDisplayed());
		linkClose.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyBillsAndPayments);
	}

	public void navigateToAccountDashboardScreen() throws Exception {
		tabAccountDashboard.click();
		Thread.sleep(2000);
	}
	
	public void userOpensActivityHistorySectionInCCB(String accNo, String ccbUsername, String ccbPwd) throws Exception {
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
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAcivityHistory);
		btnCCBAcivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(1000);
	}

	public void userVerifiesAccountCharactersticsTabInCCB() throws Exception {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkCCBAccountName);
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
		elementVisible(100, tabCCBCharacterstics);
		tabCCBCharacterstics.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='CharGrid_character']")));
		Thread.sleep(2000);
		/*String dateSelected=null;
		if (paymentDate.length()==3) {
			dateSelected="MON0"+paymentDate.substring(0, 1)+"-CON";
		}
		else if (paymentDate.length()==4) {
			dateSelected="MON"+paymentDate.substring(0, 2)+"-CON";
		}
		Assert.assertEquals(true, txtCCBNBBCalendarPaymentPreferenceValue.getAttribute("value").contains(dateSelected));*/	
	}

}
