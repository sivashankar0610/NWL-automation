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

public class RequestPayPointCard_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-usage-box wp-box-accordion wp-request-paypoint text-center']/div/div/h5/a") WebElement txtPayPoint;
    @FindBy(xpath="//div[@class='wp-usage-box wp-box-accordion wp-request-paypoint text-center']/div/div/div/div/div/p") WebElement txtPayPointTeaser;
 	@FindBy(xpath="(//a[@class='tooltip-btn'])[17]") WebElement btnAddressInfoIcon;
 	@FindBy(xpath="(//span[@class='tooltip-label'])[17]") WebElement txtAddressInfoIcon;
 	@FindBy(xpath="(//a[@class='tooltip-close'])[17]") WebElement btnAddressInfoIconClose;
 	@FindBy(xpath="(//b[@class='address-street'])[1]") WebElement txtStreet1;
 	@FindBy(xpath="(//b[@class='address-city'])[1]") WebElement txtCity1;
 	@FindBy(xpath="(//b[@class='address-postcode'])[1]") WebElement txtPostCode1;
 	
 	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//td[@orafield='output/premise']") WebElement txtCCBAddress;
 	
 	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-request-paypoint-card']") WebElement btnGetAPlasticPayPointCard;
    @FindBy(xpath="//h6[@class='sumbit-message-PC']") WebElement txtWeWillSendYouPayPointCard;
    @FindBy(xpath="//p[@class='pc-msg']/b") WebElement txtAlertSuccessMsgTeaser;
    @FindBy(xpath="//b[@class='requestPaypointCardContent confirmedNum']") WebElement txtConfirmationNumber;
    @FindBy(xpath="(//b[@class='address-street'])[2]") WebElement txtStreet2;
 	@FindBy(xpath="(//b[@class='address-city'])[2]") WebElement txtCity2;
 	@FindBy(xpath="(//b[@class='address-postcode'])[2]") WebElement txtPostCode2;
    @FindBy(xpath="(//a[@class='nb-btn-link take-nwl close-btn'])[2]") WebElement linkClose;
    
    @FindBy(xpath="(//td[@class='oraNormal oraTableData']/a)[1]") WebElement linkCCBAccountName;
	@FindBy(xpath="(//td[@class='inactiveTab'])[8]") WebElement tabCCBCharacteristics;
	@FindBy(xpath="//input[@id='IM_REFRESH']") WebElement btnCCBRefresh;
    
    String ccbAddress;
 	
	public RequestPayPointCard_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//RequestPayPointCard.properties");
	}

	public void verifyPayPointSection(String accNo, String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayPoint);
		String[] payPointTeaser = txtPayPointTeaser.getText().split("\n");
		Assert.assertEquals(true, payPointTeaser[0].contains(c.getData("payPointTeaser1")));
		Assert.assertEquals(true, payPointTeaser[2].contains(c.getData("payPointTeaser2")));
		Assert.assertEquals(true, payPointTeaser[4].contains(c.getData("payPointTeaser3")));
		btnAddressInfoIcon.click();
		elementVisible(100, txtAddressInfoIcon);
		Assert.assertEquals(true, txtAddressInfoIcon.getText().contains(c.getData("addressInformationText")));
		Thread.sleep(500);
		btnAddressInfoIconClose.click();
		Thread.sleep(500);
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Thread.sleep(2000);
		String[] str = txtCCBAddress.getText().split(", ");
		ccbAddress=str[0]+" "+str[2]+" "+str[3];
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, btnGetAPlasticPayPointCard);
		String address1 = txtStreet1.getText()+" "+txtCity1.getText()+" "+txtPostCode1.getText();
		Assert.assertEquals(true, ccbAddress.contains(address1));
		Assert.assertEquals(true, btnGetAPlasticPayPointCard.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayPoint);
	}

	public void displaySuccessAlertPopup() throws Exception {
		btnGetAPlasticPayPointCard.click();
		elementVisible(100, txtWeWillSendYouPayPointCard);
		Assert.assertEquals(true, txtAlertSuccessMsgTeaser.getText().contains(c.getData("alertSuccessMsgTeaser")));
		System.out.println(txtConfirmationNumber.getText());
		String address2= txtStreet2.getText()+" "+txtCity2.getText()+" "+txtPostCode2.getText();
		Assert.assertEquals(true, ccbAddress.contains(address2));
		Thread.sleep(500);
		Assert.assertEquals(true, linkClose.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWeWillSendYouPayPointCard);
	}

	public void verifyGetAPlasticPayPointCardButton_GreyedOut() throws Exception {
		linkClose.click();
		elementVisible(100, txtPayPoint);
		Assert.assertEquals(true, !btnGetAPlasticPayPointCard.isEnabled());
		Thread.sleep(500);
	}

	public void verifyAccountCharacteristicsInCCB() throws Exception {
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
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
		elementVisible(100, tabCCBCharacteristics);
		tabCCBCharacteristics.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBRefresh.click();
		Thread.sleep(2000);
	}

}
