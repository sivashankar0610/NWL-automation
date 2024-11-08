package com.nwl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Login_DoesnotRecogniseEmail_Loc extends BasePage{

	@FindBy(xpath = "//input[@type=\"email\"]") WebElement txtEmail;
	@FindBy(xpath = "//input[@type=\"password\"]") WebElement txtPassword;
	@FindBy(id = "recaptcha-demo-submit") WebElement btnSubmit;
	@FindBy(xpath = "(//i[@class='fal fa-info-circle'])[1]") WebElement tooltipEmail;
	@FindBy(xpath = "(//i[@class='fal fa-info-circle'])[2]") WebElement tooltipPassword;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[1]") WebElement txtTooltipEmail;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[2]") WebElement txtTooltipPassword;
	@FindBy(xpath = "//a[@class='form-show']") WebElement btnShowPassword;
	@FindBy(xpath = "//div[@class='alert__content']/p/p") WebElement txtErrorMessage;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn__cta']") WebElement btnOK;
	
	Actions actions = new Actions(driver);
	
	public Login_DoesnotRecogniseEmail_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Login_DoesnotRecogniseEmail.properties");
	}

	public void enterIncorrectCredentials(String email, String password) throws Exception {
		elementVisible(100, btnSubmit);
		Thread.sleep(4000);
		tooltipEmail.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtTooltipEmail.getText().contains(c.getData("email")));
		tooltipEmail.click();
		tooltipPassword.click();
		Thread.sleep(1000);
		//Assert.assertEquals(true, txtTooltipPassword.getText().contains(c.getData("password")));
		tooltipPassword.click();
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnShowPassword.click();
		Thread.sleep(3000);
	}

	public void errorMessageDisplayed() throws Exception {
		btnSubmit.click();
		elementVisible(100, btnOK);
		Assert.assertTrue(btnOK.isDisplayed());
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("errorMessage")));
	}
	
	public void redirectsBackToLogin() {
		btnOK.click();
		elementVisible(100, btnSubmit);
		Assert.assertTrue(btnSubmit.isDisplayed());
	}
	
}

