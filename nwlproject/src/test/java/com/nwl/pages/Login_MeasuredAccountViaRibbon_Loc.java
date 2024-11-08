package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;


public class Login_MeasuredAccountViaRibbon_Loc extends BasePage{

	@FindBy(xpath = "//li[@class=\"mega__has-sub nav-account\"]") WebElement btnAccount;
	@FindBy(xpath = "(//a[@href='/login/'])[1]") WebElement subMenuLogin;
	@FindBy(xpath = "//i[@class='btn-fa fal fa-credit-card']") WebElement btnMakeAPayment;
	@FindBy(xpath = "//i[@class='btn-fa fal fa-home']") WebElement btnMovingHome;
	@FindBy(xpath = "//i[@class='btn-fa fas fa-exclamation-triangle']") WebElement btnReportProblem;
	@FindBy(xpath = "//i[@class='btn-fa fal fa-circle-notch']") WebElement btnSubmitReading;
	@FindBy(xpath = "//i[@class='btn-fa fal fa-user']") WebElement btnLogin;
	@FindBy(xpath = "//a[@data-content=\"account-login\"]") WebElement tabLogin;
	@FindBy(xpath = "//input[@type=\"email\"]") WebElement txtEmail;
	@FindBy(xpath = "//input[@type=\"password\"]") WebElement txtPassword;
	@FindBy(id = "recaptcha-demo-submit") WebElement btnSubmit;
	@FindBy(xpath = "(//i[@class='fal fa-info-circle'])[1]") WebElement tooltipEmail;
	@FindBy(xpath = "(//i[@class='fal fa-info-circle'])[2]") WebElement tooltipPassword;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[1]") WebElement txtTooltipEmail;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[2]") WebElement txtTooltipPassword;
	@FindBy(xpath = "//a[@class='form-show']") WebElement btnShowPassword;
	@FindBy(xpath = "(//a[@class=\"nb-btn nb-btn-block nb-btn-white\"])[2]") WebElement btnHelp;
	@FindBy(xpath = "//li[@class=\"owl-dot active\"]") WebElement btnDashboard;
	@FindBy(xpath = "//div[@class='account-teaser']/p") WebElement txtAccountTeaser;
	
	
	@FindBy(xpath="//div[@class='wp-your-usage-metered']/h5") WebElement txtMyWaterMeter;
	@FindBy(xpath="(//i[@class='copy-icon far fa-copy'])[2]") WebElement btnCopySerialNumber;
	@FindBy(xpath="(//span[@class='copy-text'])[2]") WebElement txtCopied;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-my-usage-summary'])[1]") WebElement btnCheckMyUsage;
	@FindBy(xpath="//li[@class='owl-dot active']") WebElement tabWaterMetersAndUsage;
	@FindBy(xpath = "//li[@class=\"mega__has-sub nav-account logined\"]") WebElement btnAccount2;
	@FindBy(xpath = "//a[@class=\"account-logout\"]") WebElement btnLogout;
	@FindBy(xpath="//li[@class='mega__has-sub nav-account']") WebElement linkAccount;
	
	public Login_MeasuredAccountViaRibbon_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Login_MeasuredAccountViaRibbon.properties");
	}
	
	public void copySerialNumber() throws Exception {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyWaterMeter);
		btnCopySerialNumber.click();
		elementVisible(100, txtCopied);
		Assert.assertEquals(true, txtCopied.getText().contains("Copied!"));
	}

	public void navigateTotoWaterMetersAndUsageTab() throws Exception {
		btnCheckMyUsage.click();
		elementVisible(100, tabWaterMetersAndUsage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabWaterMetersAndUsage);
		Thread.sleep(2000);
	}
	
	public void logoutAccount() throws Exception {
		elementVisible(100, btnAccount2);
		btnAccount2.click();
		elementVisible(100, btnLogout);
		btnLogout.click();
		Thread.sleep(2000);
		elementVisible(100, linkAccount);
		Thread.sleep(2000); 
	}
	
	

	public void loginAccount() {
		elementVisible(100, btnAccount);
		Assert.assertTrue(btnMakeAPayment.isDisplayed());
		Assert.assertTrue(btnMovingHome.isDisplayed());
		Assert.assertTrue(btnReportProblem.isDisplayed());
		Assert.assertTrue(btnSubmitReading.isDisplayed());
		Assert.assertTrue(btnLogin.isDisplayed());
		btnAccount.click();
		elementVisible(100, subMenuLogin);
		subMenuLogin.click();
	}

	public void verifyCredentials(String username, String password) throws Exception {
		elementVisible(100, btnSubmit);
		Thread.sleep(3000);
		tooltipEmail.click();
		System.out.println(txtTooltipEmail.getText());
		Assert.assertEquals(true, txtTooltipEmail.getText().contains(c.getData("email")));
		tooltipEmail.click();
		tooltipPassword.click();
		System.out.println(txtTooltipPassword.getText());
		Assert.assertEquals(true, txtTooltipPassword.getText().contains(c.getData("password")));
		tooltipPassword.click();
		txtEmail.sendKeys(username);
		txtPassword.sendKeys(password);
		btnShowPassword.click();
		Thread.sleep(2000);
	}

	public void dashboardDisplayed() throws Exception {
		btnSubmit.click();
		elementVisible(100, btnHelp);
		Assert.assertEquals(true, btnHelp.isDisplayed());
		Thread.sleep(2000);
		Assert.assertEquals(true, txtAccountTeaser.getText().contains(c.getData("accountTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnDashboard);
		Thread.sleep(500); 
	}

}

