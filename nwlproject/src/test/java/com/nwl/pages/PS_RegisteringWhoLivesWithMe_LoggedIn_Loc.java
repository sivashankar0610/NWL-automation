package com.nwl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;

public class PS_RegisteringWhoLivesWithMe_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='nb-col-7'])[1]/button") WebElement btnForMe;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline who-other']") WebElement btnForSomeoneElse;
	@FindBy(xpath="//input[@class='form-control their-firstname firstname']") WebElement txtTheirFirstName;
	@FindBy(xpath="//input[@class='form-control their-lastname surname']") WebElement txtTheirSurname;
	@FindBy(xpath="(//div[@id='dobBorderNone_for_someone'])") WebElement txtDOB;
	@FindBy(xpath="//input[@class='form-control their-day day']") WebElement txtDOBDate;
	@FindBy(xpath="//input[@class='form-control their-month month']") WebElement txtDOBMonth;
	@FindBy(xpath="//input[@class='form-control their-year year']") WebElement txtDOBYear;
	@FindBy(xpath="(//span[@class='checkbox'])[2]") WebElement checkBoxConsent;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-next-who']") WebElement btnNext1;
	@FindBy(xpath="(//div[@class='sub-title'])[9]") WebElement txSetPwdToProveIdentity;
	@FindBy(xpath="//input[@class='form-control bogusCallerPassword']") WebElement txtPassword;
	@FindBy(xpath="//a[@aria-label='My account']") WebElement btnMyAccount;
	@FindBy(xpath="//a[@aria-label='My account']/following-sibling::div/div/ul/li[1]") WebElement btnMyAccountDashboard;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	@FindBy(xpath="//div[@class='small-title pb-20']") WebElement txtPriorityServices_MP;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[45]") WebElement btnPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[43]") WebElement txtPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[45]") WebElement btnPriorityServices_MPInfoIconClose;
	@FindBy(xpath="(//div[@class='pb-20'])[3]") WebElement txtPriorityServices_MPTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block register-psr-back']") WebElement btnRegForPriorityServices;
	
	@FindBy(id="logoImage") WebElement txtCCBOracle;
	@FindBy(id="IM_GOBACK") WebElement btnCCBHistory;
	@FindBy(id="IM_CC_CHAR:0$GOTO_BTN") WebElement btnCCBCharacteristicsValueMenu1;
	@FindBy(xpath="//td[text()='Characteristics']") WebElement tabCCBCharacteristics;
	@FindBy(id="IM_PREM_CHAR:2$GOTO_BTN") WebElement btnCCBCharacteristicsValueMenu2;
	@FindBy(xpath="//div[@class='rtlPositioning nowrap ']/span/label") WebElement txtCCBPersonalInformation;
	
	public PS_RegisteringWhoLivesWithMe_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}

	public void userSelectsForSomeoneElseButton() throws Exception {
		btnForSomeoneElse.click();
		elementVisible(100, txtTheirFirstName);
		Thread.sleep(500);
	}

	public void entersPersonalDetailsForWhoLivesWithYou(String firstName, String surname) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnForMe);
		txtTheirFirstName.sendKeys(firstName);
		txtTheirSurname.sendKeys(surname);
		txtDOB.click();
		elementVisible(100, txtDOBDate);
		txtDOBDate.sendKeys("10");
		txtDOBMonth.sendKeys("10");
		txtDOBYear.sendKeys("2000");
		checkBoxConsent.click();
		Thread.sleep(500);
	}

	public void userSetsPassword(String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txSetPwdToProveIdentity);
		txtPassword.sendKeys(pwd);
		Thread.sleep(500);
		txSetPwdToProveIdentity.click();
		Thread.sleep(1000);
	}
	
	public void verifyPriorityServicesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnMyAccount);
		btnMyAccount.click();
		Thread.sleep(2000);
		elementVisible(100, btnMyAccountDashboard);
		btnMyAccountDashboard.click();
		elementVisible(100, tabAccountDashboard);
		tabMyProfile.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPriorityServices_MP);
		btnPriorityServices_MPInfoIcon.click();
		elementVisible(100, txtPriorityServices_MPInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPriorityServices_MPInfoIcon.getText().contains(c.getData("priorityServices_MPInformationText")));
		btnPriorityServices_MPInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPriorityServices_MPTeaser.getText().contains(c.getData("priorityServices_MPTeaser1")));
		Assert.assertEquals(true, btnRegForPriorityServices.isDisplayed());		
	}

	public void userVerifiesPSR_PersonPremiseCharacteristicsTabInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBOracle);
		btnCCBHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		elementVisible(100, btnCCBCharacteristicsValueMenu1);
		btnCCBCharacteristicsValueMenu1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBCharacteristics);
		tabCCBCharacteristics.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("premGrid_preChrGrid")));
		elementVisible(100, btnCCBCharacteristicsValueMenu2);
		Thread.sleep(500);
	}

	public void userVerifiesPSR_PersonMainTabInCCB() throws Exception {
		btnCCBCharacteristicsValueMenu2.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBCharacteristics);
		Thread.sleep(500);
	}

	public void userVerifiesPSR_PersonCharacteristicsTabInCCB() throws Exception {
		tabCCBCharacteristics.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		elementVisible(100, txtCCBPersonalInformation);
	}

}
