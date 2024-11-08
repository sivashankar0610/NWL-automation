package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;
import io.cucumber.datatable.DataTable;

public class Registration_AlreadyExistingAccount_Loc extends BasePage{

	@FindBy(xpath = "//div[@class=\"account-teaser\"]/p") WebElement txtRegistrationDescription;
	@FindBy(xpath = "//input[@class='form-control firstname']") WebElement txtFirstName;
	@FindBy(xpath = "//input[@class='form-control surname']") WebElement txtSurName;
	@FindBy(xpath = "//input[@class='form-control email']") WebElement txtEmail;
	@FindBy(xpath = "//input[@class='form-control password']") WebElement txtPassword;
	@FindBy(xpath = "//input[@class='form-control confirmpassword']") WebElement txtConfirmPassword;	
	@FindBy(xpath = "(//span[@class='checkbox'])[1]") WebElement btnCustomerYes;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnCreateAccount;
	@FindBy(xpath = "(//div[@class=\"alert-label\"])[1]") WebElement txtErrorMessage;
	@FindBy(xpath = "//a[@class=\"nb-btn nb-btn__cta nb-btn-inline nb-btn__login\"]") WebElement btnLogin;
	@FindBy(id = "recaptcha-demo-submit") WebElement btnLogin2;
	
	public Registration_AlreadyExistingAccount_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//Registration_AlreadyExistingAccount.properties");
	}
	
	public void enterAccountDetails(DataTable table) throws Exception {
		List<List<String>> data = table.cells();
		handleMultipleTabs(0);
		elementVisible(100, txtFirstName);
		Assert.assertEquals(true, txtRegistrationDescription.getText().contains(c.getData("registrationDescription")));
		txtFirstName.sendKeys(data.get(1).get(1));
		txtSurName.sendKeys(data.get(2).get(1));
		txtEmail.sendKeys(data.get(3).get(1));
		txtPassword.sendKeys(data.get(4).get(1));
		txtConfirmPassword.sendKeys(data.get(5).get(1));
		btnCustomerYes.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFirstName);
		Thread.sleep(1000);
	}
	
	public void errorMessagePopup() throws Exception   {
		btnCreateAccount.click();
		Thread.sleep(3000);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("errorMessage")));	
	}
	
	public void redirectToLogin() throws Exception {
		btnLogin.click();
		elementVisible(100, btnLogin2);
		Assert.assertEquals(driver.getCurrentUrl(), c.getData("loginURL"));
	}
}
