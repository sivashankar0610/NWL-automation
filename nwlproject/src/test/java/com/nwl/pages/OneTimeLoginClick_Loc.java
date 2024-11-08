package com.nwl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class OneTimeLoginClick_Loc extends BasePage {
	
	@FindBy(xpath = "//a[text()='Email me a link to log in']") WebElement linkEmailMe;
	@FindBy(xpath = "//div[@class='account-teaser']/h4") WebElement txtStrugglingToLogin;
	@FindBy(xpath = "//div[@class='account-teaser']/p") WebElement teaserStrugglingToLogin;
	@FindBy(xpath = "//input[@id='emailOneTimeLogin']") WebElement txtEmailAddress;
	@FindBy(xpath = "//button[text()='Send email ']")WebElement btnSendEmail;
	@FindBy(xpath = "//div[@class='alert__content']/p") WebElement txtEmailConfirmationMsg;
	@FindBy(xpath = "//button[text()='OK']") WebElement btnOk;
	@FindBy(id = "accept") WebElement btnYopMailCookiesAccept;
	@FindBy(xpath = "//input[@id='login']") WebElement txtYopmailEmail;
	@FindBy(xpath = "//*[@id='refreshbut']/button/i") WebElement btnRightArrow;
	@FindBy(xpath = "(//div[@class='lmfd']/span[2])[1]") WebElement firstMail;
	@FindBy(xpath = "//a[text()='One click sign-in']") WebElement btnOneClickSignin;
	@FindBy(xpath = "//li[@class='owl-dot active']") WebElement tabAccountDashboard;
	
	String emailID;

	public OneTimeLoginClick_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c = new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//OneTimeLoginClick.properties");
	}

	public void clicksOnEmailMeALink() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkEmailMe);
		linkEmailMe.click();
		elementVisible(100, txtStrugglingToLogin);
		Assert.assertEquals(true, txtStrugglingToLogin.getText().contains(c.getData("strugglingToLoginLabel")));
		Assert.assertEquals(true, teaserStrugglingToLogin.getText().contains(c.getData("strugglingToLoginTeaser")));
		Assert.assertEquals(true, txtEmailAddress.isDisplayed());
		Assert.assertEquals(true, btnSendEmail.isDisplayed());
		Thread.sleep(2000);
	}

	public void userEntersAnEmail(String email) throws Exception {
		emailID = email;
		txtEmailAddress.sendKeys(emailID);
        Thread.sleep(500);
	}

	public void clicksOnSendButton() throws Exception {
		btnSendEmail.click();
		elementVisible(100, btnOk);
		Assert.assertEquals(true, txtEmailConfirmationMsg.getText().contains(c.getData("emailConfirmationMsgTeaser")));
		Assert.assertEquals(true, btnOk.isDisplayed());
	}

	public void clicksOkButton() {
		btnOk.click();
		elementVisible(100, linkEmailMe);
	}

	public void opensYopMail() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open('https://yopmail.com/en/' ,'_blank');");
		Thread.sleep(1000);
		handleMultipleTabs(1);
		elementVisible(100, btnYopMailCookiesAccept);
		btnYopMailCookiesAccept.click();
		Thread.sleep(500);
		txtYopmailEmail.sendKeys(emailID);
		Thread.sleep(500);
	}

	public void clicksOnOneTimeLoginmail() throws Exception {
		btnRightArrow.click();
		driver.switchTo().frame(driver.findElement(By.id("ifinbox")));
		elementVisible(100, firstMail);
		firstMail.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnOneClickSignin);
		Thread.sleep(500);
	}

	public void clickOneClickSigninButton() throws Exception {
		btnOneClickSignin.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		handleMultipleTabs(2);
		Thread.sleep(3000);
		elementVisible(100, tabAccountDashboard);
	}

}
