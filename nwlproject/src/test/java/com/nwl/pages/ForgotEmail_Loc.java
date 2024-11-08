package com.nwl.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ForgotEmail_Loc extends BasePage {

	@FindBy(xpath = "//a[@data-content=\"account-create\"]") WebElement tabForgotEmail;
	@FindBy(xpath = "(//div[@class=\"account-teaser\"])[2]/p") WebElement txtForgotEmailDescription;
	@FindBy(xpath = "(//a[@class='nb-btn-link'])[2]") WebElement linkBackToLogin;
	@FindBy(xpath = "//input[@type=\"email\"]") WebElement txtEmail1;
	@FindBy(xpath = "(//input[@class='searchQuery'])[2]") WebElement txtSearchQuery;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block nb-btn-outline noinfo-btn\"]") WebElement btnIDontHaveInformation;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn__cta\"]") WebElement btnOK;
	@FindBy(xpath = "//div[@class=\"alert__content\"]/p") WebElement txtErrorMessage;
	@FindBy(id = "userId") WebElement btnCCBUserID;
	@FindBy(id = "password") WebElement btnCCBPwd;
	@FindBy(id = "loginButton") WebElement btnCCBLogin;
	@FindBy(id = "tabPage") WebElement frame1;
	@FindBy(id = "srch_frame") WebElement frame2;
	@FindBy(xpath = "//iframe[@title='zoneMapFrame_1']") WebElement frame3; 
	@FindBy(id = "zoneMapFrame_2") WebElement frame4;
	@FindBy(id = "ACCT_ID") WebElement txtAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnSearch;
	@FindBy(id = "personId") WebElement txtCCBName;
	@FindBy(xpath = "//td[@orafield='output/premise']") WebElement txtCCBAddress;
	@FindBy(id = "birthDate") WebElement txtBirthDate;
	@FindBy(xpath = "//input[@class=\"form-control firstname\"]") WebElement txtFirstName;
	@FindBy(xpath = "//input[@class=\"form-control surname\"]") WebElement txtSurName;
	@FindBy(xpath = "//input[@class=\"form-control postcode\"]") WebElement txtPostCode;
	@FindBy(xpath = "//input[@class=\"form-control dateOfBirth\"]") WebElement txtDateOfBirth;
	@FindBy(xpath = "//input[@class=\"form-control nwlnumber\"]") WebElement txtAccountNumber;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block find-email\"]") WebElement btnFindEmailAddress;
	@FindBy(xpath = "(//span[@class='form-error']/p)[1]") WebElement txtValidationError;
	@FindBy(xpath = "(//span[@class=\"form-error\"]/p)[2]") WebElement txtSurNameError;
	@FindBy(xpath = "(//span[@class=\"form-error\"]/p)[3]") WebElement txtPostCodeError;
	@FindBy(xpath = "(//span[@class=\"form-error\"]/p)[4]") WebElement txtDOBError;
	@FindBy(xpath = "(//div[@class=\"account-teaser\"]/p)[1]") WebElement txtSuccessScreenDescription;
	@FindBy(xpath = "(//div[@class=\"sub-title\"])[1]") WebElement txtFoundEmailAddress;
	@FindBy(xpath = "//a[@class=\"nb-btn nb-btn-block\"]") WebElement btnLogIn;
	@FindBy(xpath = "(//input[@class=\"form-control email\"])[1]") WebElement txtEmail;
	@FindBy(xpath = "//input[@class=\"form-control loginpassword\"]") WebElement txtPassword;
	
	String firstName,surName,postCode,birthDate,accountID,wrongDOB,wrongPostCode,wrongAccountID,email;
	
	public ForgotEmail_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//ForgotEmail.properties");
	}
	
	public void forgotEmail() throws Exception {
		elementVisible(100, tabForgotEmail);
		tabForgotEmail.click();
		elementVisible(100, txtForgotEmailDescription);
		Assert.assertEquals(true, txtForgotEmailDescription.getText().contains(c.getData("forgotEmailDescription")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabForgotEmail);
	}
	
	public void userClicksOnBackToLoginLink() throws Exception {
		elementVisible(100, linkBackToLogin);
		linkBackToLogin.click();
		elementVisible(100, txtEmail1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEmail1);
		Thread.sleep(500); 
	}
	
	public void iDontHaveThisInformationButton() throws Exception {
		btnIDontHaveInformation.click();
		elementVisible(100, btnOK);
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("iDontHaveInformationError")));
	}
	
	public void helpCentrePage() throws Exception {
		btnOK.click();
		elementVisible(100, txtSearchQuery);
		Assert.assertEquals(driver.getCurrentUrl(), c.getData("urlHelpCentre"));
	}
	
	public void getCCBdetails(String AccID,String CCBEmail, String CCBPw) throws Exception {	
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(CCBEmail);
		btnCCBPwd.sendKeys(CCBPw);
		btnCCBLogin.click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame2);
		txtAccountID.sendKeys(AccID);
		accountID = AccID;
		long wrongID=Long.parseLong(accountID); 
		System.out.println(wrongID);
		wrongID = wrongID+20;
		wrongAccountID = Long.toString(wrongID);
		btnSearch.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame3);
		Thread.sleep(2000);
		String name = txtCCBName.getText();
		String[] splitName = name.split(" ");
		firstName = splitName[1];
		String last = splitName[0];
		surName = last.substring(0,last.length()-1); 
		
		String s = txtBirthDate.getText();	
		birthDate= s.replaceAll("-", "/");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(birthDate, formatter).plusDays(5);
		wrongDOB = formatter.format(localDate).toString();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1); 
		driver.switchTo().frame(frame4);
		String add=txtCCBAddress.getText();
		String[] splitAddress = add.split(" ");
		int n = splitAddress.length;
		postCode = splitAddress[n-2] + " " + splitAddress[n-1];	
		if(postCode.length()==8){
		   wrongPostCode = postCode.substring(0,5)+"6XX";
		}
		else {
		      wrongPostCode = postCode.substring(0,5)+"XX";
		}
	}
	
	public void incorrectDetailsInAllFields() {
		handleMultipleTabs(0);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
		txtFirstName.sendKeys(firstName+"abcd");
		txtSurName.sendKeys(surName+"xyz");
		txtPostCode.sendKeys(wrongPostCode);
		txtDateOfBirth.sendKeys(wrongDOB);
		txtAccountNumber.sendKeys(wrongAccountID);
	}
	
	public void emailNotFoundMessage() throws Exception {
		btnFindEmailAddress.click();
		Thread.sleep(2000);
		elementVisible(100, txtErrorMessage);
		Assert.assertEquals(true, txtErrorMessage.isDisplayed());
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("findMyEmailErrorMessage")));
	}
	
	public void redirectsToForgotEmail() {
		btnOK.click();
		elementVisible(100, txtFirstName);
	}
	
	public void allFieldsNull() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
	}
	
	public void redTextErrorMessage() throws Exception {
		btnFindEmailAddress.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtValidationError.isDisplayed());
		Assert.assertEquals(true, txtSurNameError.isDisplayed());
		Assert.assertEquals(true, txtPostCodeError.isDisplayed());
		Assert.assertEquals(true, txtDOBError.isDisplayed());
		Assert.assertEquals(true, txtValidationError.getText().contains(c.getData("firstNameErrorMessage")));
		Assert.assertEquals(true, txtSurNameError.getText().contains(c.getData("surNameErrorMessage")));
		Assert.assertEquals(true, txtPostCodeError.getText().contains(c.getData("postCodeErrorMessage")));
		Assert.assertEquals(true, txtDOBError.getText().contains(c.getData("dobErrorMessage")));	
	}
	
	public void accountNumberNull() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
	}
	
	public void firstNameNull() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void errorFirstName() throws Exception {
		btnFindEmailAddress.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtValidationError.isDisplayed());
		Assert.assertEquals(true, txtValidationError.getText().contains(c.getData("firstNameErrorMessage")));
	}
	
	public void surNameNull() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void errorSurName() throws Exception {
		btnFindEmailAddress.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtValidationError.isDisplayed());
		Assert.assertEquals(true, txtValidationError.getText().contains(c.getData("surNameErrorMessage")));
	}
	
	public void postCodeNull() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void errorPostCode() throws Exception {
		btnFindEmailAddress.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtValidationError.isDisplayed());
		Assert.assertEquals(true, txtValidationError.getText().contains(c.getData("postCodeErrorMessage")));
	}
	
	public void dateOfBirthNull() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void errorDateOfBirth() throws Exception {
		btnFindEmailAddress.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtValidationError.isDisplayed());
		Assert.assertEquals(true, txtValidationError.getText().contains(c.getData("dobErrorMessage")));
	}
	
	public void incorrectFirstName() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		txtFirstName.sendKeys("abcd"+firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void incorrectSurName() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName+"xyz");
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void incorrectPostCode() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(wrongPostCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void incorrectDateOfBirth() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(wrongDOB);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void incorrectAccountNumber() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(wrongAccountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);	
	}
	
	public void allCorrectDetails() {
		txtFirstName.clear();
		txtSurName.clear();
		txtPostCode.clear();
		txtDateOfBirth.clear();
		txtAccountNumber.clear();
		
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(surName);
		txtPostCode.sendKeys(postCode);
		txtDateOfBirth.sendKeys(birthDate);
		txtAccountNumber.sendKeys(accountID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtForgotEmailDescription);
	}
	
	public void successScreenWithEmail() throws Exception {
		btnFindEmailAddress.click();
		elementVisible(100, txtSuccessScreenDescription);
		Assert.assertEquals(true, txtSuccessScreenDescription.getText().contains(c.getData("successDescription")));
		email=txtFoundEmailAddress.getText();
		Assert.assertEquals(true, btnLogIn.isDisplayed());	
	}
	
	public void clicksLoginButton() {
		btnLogIn.click();
	}
	
	public void enterCredentials(String password) {
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);	
	}
}