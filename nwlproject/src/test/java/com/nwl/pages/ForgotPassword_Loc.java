package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ForgotPassword_Loc extends BasePage{
	
	@FindBy(xpath = "//input[@type=\"email\"]") WebElement txtEmail;
	@FindBy(xpath = "(//a[@class=\"nb-btn-link\"])[2]") WebElement linkForgotPassword;
	@FindBy(xpath = "(//div[@class=\"account-teaser\"])[2]/p") WebElement txtDescription1;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block login-btn\"]") WebElement btnSetPassword;
	@FindBy(xpath = "//div[@class=\"alert__content\"]/p") WebElement txtSuccessPopup;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn__cta\"]") WebElement btnOK;
	@FindBy(id = "accept") WebElement btnYopmailCookiesAccept;
	@FindBy(xpath = "(//p[@class='fc-button-label'])[1]") WebElement btnYopmailConsent;
	@FindBy(id = "login") WebElement txtYopmailEmail;
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']") WebElement btnYopmailEnter;
	@FindBy(xpath = "//*[text()='NWL UAT']") WebElement btnEmailHeading;
	@FindBy(id = "ifinbox") WebElement frame1;
	@FindBy(id = "ifmail") WebElement frame2;
	@FindBy(xpath = "//*[text()='Reset password']") WebElement btnResetPassword;
	@FindBy(xpath = "(//div[@class=\"account-teaser\"])[1]/p") WebElement txtNewPasswordDescription;
	@FindBy(xpath = "//input[@name=\"password\"]") WebElement txtNewPassword;
	@FindBy(xpath = "//input[@name=\"confirmpassword\"]") WebElement txtConfirmPassword;
	@FindBy(xpath = "(//a[@class=\"form-show\"])[1]") WebElement btnShowPassword1;
	@FindBy(xpath = "(//button[@class=\"nb-btn nb-btn-block\"])[1]") WebElement btnSaveContinue;
	@FindBy(xpath = "(//span[@class=\"form-error\"])[2]/p") WebElement txtConfirmPWValidation;
	@FindBy(xpath = "(//div[@class='alert__content']/p)[1]") WebElement txtPWValidation;
	@FindBy(xpath = "//label[text()='The new password is invalid']") WebElement txtPWValidation2;
	@FindBy(id = "recaptcha-demo-submit") WebElement btnLogin;
	@FindBy(xpath = "//li[@rel='account']") WebElement btnAccountDashboard;
	
	public ForgotPassword_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ForgotPassword.properties");
	}

	public void forgotEmailPassword() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEmail);
		Thread.sleep(500); 
		elementVisible(100, linkForgotPassword);
		linkForgotPassword.click();
		elementVisible(100, txtEmail);
		Assert.assertEquals(true, txtDescription1.getText().contains(c.getData("forgotPasswordDescription")));
	}
	
	public void clickSetNewPassword(String email) {
		txtEmail.sendKeys(email);
		elementVisible(100, btnSetPassword);	
	}
	
	public void successScreen1() throws Exception {
		btnSetPassword.click();
		elementVisible(100, btnOK);
		Assert.assertEquals(true, txtSuccessPopup.getText().contains(c.getData("successPopupDescription")));
	}
	
	public void redirectsToLogin() {
		btnOK.click();
		elementVisible(100, txtEmail);
	}
	
	public void opensYopMail(String yopmailLink,String email) {
		((JavascriptExecutor) driver).executeScript("window.open('"+ yopmailLink +"' ,'_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnYopmailConsent);
		btnYopmailConsent.click();
		/*elementVisible(100, btnYopmailCookiesAccept);
		btnYopmailCookiesAccept.click();*/
		txtYopmailEmail.sendKeys(email);
	}
	
	public void resetPasswordLink() throws Exception {
		btnYopmailEnter.click();
		Thread.sleep(4000);
		driver.switchTo().frame(frame1);
		btnEmailHeading.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnResetPassword);
		Thread.sleep(1000); 
	}
	
	public void incorrectPasswordLessThanEight(String lessThan8) throws Exception {
		btnResetPassword.click();
		handleMultipleTabs(2);
		elementVisible(100, txtNewPassword);
		Assert.assertEquals(true, txtNewPasswordDescription.getText().contains(c.getData("newPasswordDescription")));
		txtNewPassword.sendKeys(lessThan8);
		txtConfirmPassword.sendKeys(lessThan8);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNewPasswordDescription);	
		btnShowPassword1.click();
		Thread.sleep(1000);
		btnShowPassword1.click();
	}
	
	public void incorrectPasswordValidation() throws Exception {
		btnSaveContinue.click();
		Thread.sleep(2000);
		txtNewPassword.click();
		//elementVisible(100, txtConfirmPWValidation);
		//Assert.assertEquals(true, txtConfirmPWValidation.getText().contains(c.getData("confirmPasswordValidation")));
		Thread.sleep(2000);
	}
	
	public void incorrectPasswordLowerCase(String lowerCase) {
		txtNewPassword.clear();
		txtConfirmPassword.clear();
		txtNewPassword.sendKeys(lowerCase);
		txtConfirmPassword.sendKeys(lowerCase);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNewPasswordDescription);	
	}
	
	public void incorrectPasswordUppercase(String upperCase) {
		txtNewPassword.clear();
		txtConfirmPassword.clear();
		txtNewPassword.sendKeys(upperCase);
		txtConfirmPassword.sendKeys(upperCase);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNewPasswordDescription);	
	}
	
	public void incorrectPasswordNumbersOnly(String numbersOnly) {
		txtNewPassword.clear();
		txtConfirmPassword.clear();
		txtNewPassword.sendKeys(numbersOnly);
		txtConfirmPassword.sendKeys(numbersOnly);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNewPasswordDescription);	
	}
	
	public void entersOldPassword(String oldPassword) {
		txtNewPassword.clear();
		txtConfirmPassword.clear();
		txtNewPassword.sendKeys(oldPassword);
		txtConfirmPassword.sendKeys(oldPassword);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNewPasswordDescription);	
	}

	public void invalidPasswordPopup() throws Exception {
		btnSaveContinue.click();
		elementVisible(100, btnOK);
		//Assert.assertEquals(true, txtPWValidation.getText().contains(c.getData("The new password is invalid")));
		Assert.assertEquals(txtPWValidation.getText(),txtPWValidation2.getText());
		btnOK.click();
	}
	
	public void entersCorrectpassword(String newPassword) {
	//	btnOK.click();
		txtNewPassword.clear();
		txtConfirmPassword.clear();
		txtNewPassword.sendKeys(newPassword);
		txtConfirmPassword.sendKeys(newPassword);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNewPasswordDescription);	
	}
	
	public void successScreen2() throws Exception {
		btnSaveContinue.click();
		elementVisible(100, btnOK);
		//Assert.assertEquals(txtPWValidation.getText().contains(c.getData("correctPasswordValidation")));
		btnOK.click();
	}
	
	public void redirectsToLoginAgain() {
		btnOK.click();
		elementVisible(100, txtEmail);
	}
	
	public void loginUsingNewPassword(String email,String password) {
		txtEmail.sendKeys(email);
		txtNewPassword.sendKeys(password);
	}
	
	public void redirectsToDashboard() throws Exception {
		btnLogin.click();
		elementVisible(100, btnAccountDashboard);
		Assert.assertTrue(btnAccountDashboard.isDisplayed());
		Thread.sleep(3000);	
	}
}