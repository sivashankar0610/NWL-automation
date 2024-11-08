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

public class ChangeTheDayMyDirectDebitIsTaken_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-light text-center dd-plan-change-promo']/div/h6") WebElement txtChangeYourDirectDebit;
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-light text-center dd-plan-change-promo']/div/div/p") WebElement txtChangeYourDirectDebitTeaser;
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-light text-center dd-plan-change-promo']/div/button[1]") WebElement btnChangeTheDayMyDirectDebitIsTaken;
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-light text-center dd-plan-change-promo']/div/button[3]") WebElement btnChangeMyBankDetails;
	@FindBy(xpath="//div[@class='change-dd-step1']/div/h5[1]") WebElement txtChangeTheDayMyDirectDebitIsTaken;
	@FindBy(xpath="//div[@class='change-dd-step1']/div/div/div/p") WebElement txtChangeTheDayMyDirectDebitIsTakenTeaser;
	@FindBy(xpath="(//div[@class='form-row choose-payment-day'])[2]/div[1]") WebElement txtPickYourPaymentDateLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[31]") WebElement btnPickYourPaymentDateInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[31]") WebElement txtPickYourPaymentDateInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[31]") WebElement btnPickYourPaymentDateInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select selected'])[6]") WebElement dropdownPlsSelect;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span") List<WebElement> btnPlsSelectOptions;
	@FindBy(xpath="//div[@class='form-btn change-dd-action-row']/button[1]") WebElement btnConfirm;
	@FindBy(xpath="//div[@class='form-btn change-dd-action-row']/button[2]") WebElement btnGoBack;
	@FindBy(xpath="//h5[@class='mb-20 change-payment-day-success-title']") WebElement txtUpdatedDDPaymentDate;
	@FindBy(xpath="//p[@class='confirmation-number sub-title']") WebElement txtConfirmationNumber;
	@FindBy(xpath="(//div[@class='form-row thank-you-teaser'])[2]/p[1]") WebElement txtSuccessMsgTeaser1;
	@FindBy(xpath="(//div[@class='form-row thank-you-teaser'])[2]/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-to-billspayments']") WebElement btnBackToMyBillsAndPayments;
	@FindBy(xpath="//li[@rel='billspayments']") WebElement tabMyBillsAndPayments;
	
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
	
	public ChangeTheDayMyDirectDebitIsTaken_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ChangeTheDayMyDirectDebitIsTaken.properties");
	}
	
	public void verifiesChangeYourDirectDebitSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeYourDirectDebit);
		Assert.assertEquals(true, txtChangeYourDirectDebit.getText().contains(c.getData("changeYourDirectDebitLabel")));
		Assert.assertEquals(true, txtChangeYourDirectDebitTeaser.getText().contains(c.getData("changeYourDirectDebitTeaser")));
		Assert.assertEquals(true, btnChangeTheDayMyDirectDebitIsTaken.isDisplayed());
		Assert.assertEquals(true, btnChangeMyBankDetails.isDisplayed());
	}
	public void clicksOnChangeTheDayMyDirectDebitIsTakenButton() throws Exception {
		btnChangeTheDayMyDirectDebitIsTaken.click();
		elementVisible(100, txtChangeTheDayMyDirectDebitIsTaken);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeTheDayMyDirectDebitIsTaken);
		Assert.assertEquals(true, txtChangeTheDayMyDirectDebitIsTaken.getText().contains(c.getData("changeTheDayMyDirectDebitIsTakenLabel")));
		Assert.assertEquals(true, txtChangeTheDayMyDirectDebitIsTakenTeaser.getText().contains(c.getData("changeTheDayMyDirectDebitIsTakenTeaser")));
		Assert.assertEquals(true, txtPickYourPaymentDateLabel.getText().contains(c.getData("paymentDateLabel")));
		btnPickYourPaymentDateInfoIcon.click();
		elementVisible(100, txtPickYourPaymentDateInfoIcon);
		Assert.assertEquals(true, txtPickYourPaymentDateInfoIcon.getText().contains(c.getData("pickYourPaymentDateInformationText")));
		Thread.sleep(500);
		btnPickYourPaymentDateInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, dropdownPlsSelect.isDisplayed());
		Assert.assertEquals(true, btnConfirm.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeTheDayMyDirectDebitIsTaken);
	}

	public void selectsPaymentDate(String date) throws Exception {
		dropdownPlsSelect.click();
		paymentDate=date;
		Thread.sleep(2000);
	    for (WebElement paymentdate : btnPlsSelectOptions) {
			if (paymentdate.getText().contains(date)) {
				paymentdate.click();
				break;
			}
		}
	    Thread.sleep(500);
	}

	public void clicksOnConfirmButton() throws Exception {
		btnConfirm.click();
		elementVisible(100, txtUpdatedDDPaymentDate);
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtUpdatedDDPaymentDate);
		confirmationNo=txtConfirmationNumber.getText();
		System.out.println(confirmationNo);
		Assert.assertEquals(txtSuccessMsgTeaser1.getText(), c.getData("successMsgTeaser1a")+" "+paymentDate+" "+c.getData("successMsgTeaser1b"));
	    Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
	    Assert.assertEquals(true, btnBackToMyBillsAndPayments.isDisplayed());
	}

	public void clicksOnBackToMyBillsAndPaymentsButton() throws Exception {
		btnBackToMyBillsAndPayments.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyBillsAndPayments);
	}
	
	public void verifiesActivityHistorySectionInCCB(String accNo, String ccbUsername, String ccbPwd) throws Exception {
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
		String dateSelected=null;
		if (paymentDate.length()==3) {
			dateSelected="MON0"+paymentDate.substring(0, 1)+"-CON";
		}
		else if (paymentDate.length()==4) {
			dateSelected="MON"+paymentDate.substring(0, 2)+"-CON";
		}
		Assert.assertEquals(true, txtCCBNBBCalendarPaymentPreferenceValue.getAttribute("value").contains(dateSelected));	
	}

}
