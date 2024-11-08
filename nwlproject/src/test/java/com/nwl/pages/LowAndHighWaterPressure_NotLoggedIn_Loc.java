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

public class LowAndHighWaterPressure_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='lbl']") WebElement txtYourContactDetailsLabel;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	@FindBy(xpath = "//td[@orafield='output/premise']") WebElement txtCCBAddress;
	
	@FindBy(xpath="//input[@id='firstname-waterpressure']") WebElement txtFirstName;
	@FindBy(xpath="//input[@id='surname-waterpressure']") WebElement txtSurname;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[9]") WebElement btnEmailAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[9]") WebElement txtEmailAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[9]") WebElement btnEmailAddressInfoIconClose;
	@FindBy(xpath="//input[@id='email-waterpressure']") WebElement txtEmailAddress;
	@FindBy(xpath="//input[@id='telephone-waterpressure']") WebElement txtContactNumber;
	@FindBy(xpath="(//div[@class='row-your-contact-detail'])[2]/div[2]/div[1]") WebElement txtAddressLabel;
	@FindBy(id="data8-address-waterpressure") WebElement txtAddress;
	@FindBy(xpath="(//div[@class='row-your-contact-detail'])[2]/div[2]/div[3]/a") WebElement linkAddressIsNotListed;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit']") WebElement btnSubmit;

	public LowAndHighWaterPressure_NotLoggedIn_Loc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void entersYourContactDetailsAsPerCCB(String ccbUserName, String ccbPwd, String accNo, String email) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourContactDetailsLabel);
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='zoneMapFrame_1']")));
		Thread.sleep(2000);
		String name = txtCCBFullName.getText();
		String[] splitName = name.split(" ");
		String firstName = splitName[1];
		String lastName = splitName[0].substring(0,splitName[0].length()-1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='zoneMapFrame_2']")));
		String add=txtCCBAddress.getText();
		String[] splitAddress = add.split(" ");
		int n = splitAddress.length;
		String houseno=null;
		for (String str : splitAddress) {
			if (str != null && str.matches("[0-9.]+")) {
				houseno = str;
				break;
			}
		}
		String address = houseno+", "+splitAddress[n-2]+" "+splitAddress[n-1];
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, txtFirstName);
		Assert.assertEquals(true, txtFirstName.isDisplayed());
		txtFirstName.sendKeys(firstName);
		Assert.assertEquals(true, txtSurname.isDisplayed());
		txtSurname.sendKeys(lastName);
		Assert.assertEquals(true, txtEmailAddress.isDisplayed());
		/*btnEmailAddressInfoIcon.click();
		elementVisible(100, txtEmailAddressInfoIcon);
		Assert.assertEquals(true, txtEmailAddressInfoIcon.getText().contains(c.getData("emailAddressInformationText")));
		Thread.sleep(500);
		btnEmailAddressInfoIconClose.click();
		Thread.sleep(500);*/
		txtEmailAddress.sendKeys(email);
		Assert.assertEquals(true, txtContactNumber.isDisplayed());
		txtContactNumber.sendKeys("01234567890");
		Assert.assertEquals(true, txtAddress.isDisplayed());
		Assert.assertEquals(true, linkAddressIsNotListed.isDisplayed());
		txtAddress.sendKeys(address);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		Assert.assertEquals(true, btnSubmit.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourContactDetailsLabel);
	}

}
