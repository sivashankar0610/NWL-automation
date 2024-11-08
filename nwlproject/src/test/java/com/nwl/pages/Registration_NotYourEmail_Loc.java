package com.nwl.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

public class Registration_NotYourEmail_Loc extends BasePage{

	@FindBy(xpath = "//a[@class='nb-btn-link notEmail']") WebElement btnNotYourEmailAddress;
	@FindBy(xpath = "//input[@class='form-control email']") WebElement txtEmail;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnCreateAccount;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p") WebElement txtThanks;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p[2]") WebElement txtEmailed;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p[2]/a") WebElement txtEmailAddress;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p[3]") WebElement txtInstructions;
	@FindBy(xpath = "//a[@class='nb-btn-link resendEmail']") WebElement btnResendEmail;
	@FindBy(xpath = "//a[@class='nb-btn-link take-nwl']") WebElement btnHomePage;
	
	@FindBy(xpath = "(//p[@class='fc-button-label'])[1]") WebElement btnYopmailConsent;
	@FindBy(id = "login") WebElement txtYopmailEmail;
	@FindBy(xpath = "//a[@class=\"nb-btn nb-btn__cta nb-btn-inline\"]") WebElement btnOK;
	
	@FindBy(id = "IM_REFRESH") WebElement ccbRefresh;
	@FindBy(xpath="//td[@orafield='personContactType']") List<WebElement> txtccbEmailOrPhone;
	@FindBy(id = "birthDate") WebElement txtBirthDate;
	@FindBy(id = "tabPage") WebElement frame1;
	@FindBy(xpath = "//iframe[@title='zoneMapFrame_1']") WebElement frame3;
	
	String email;
	
	public Registration_NotYourEmail_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//Registration_NotYourEmail.properties");
	}
	
	public void notYourEmail() throws Exception {
		elementVisible(100, btnNotYourEmailAddress);
		btnNotYourEmailAddress.click();
		Thread.sleep(2000);
	}
	
	public void changeEmailAddress() {
		elementVisible(100, txtEmail);
		txtEmail.clear();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		LocalDateTime timeNow = LocalDateTime.now();  
		email = "nwl" + dtf.format(timeNow) + "@yopmail.com";
		txtEmail.sendKeys(email);
	}
	
	public void successScreen() throws Exception	{
		btnCreateAccount.click();
		Thread.sleep(3000);
		elementVisible(100, btnHomePage);
		Assert.assertEquals(true, txtThanks.getText().contains(c.getData("thanks")));
		Assert.assertEquals(true, txtEmailed.getText().contains(c.getData("emailed")));
		Assert.assertEquals(true, txtEmailAddress.getText().contains(email));
		Assert.assertEquals(true, txtInstructions.getText().contains(c.getData("instructions")));
		
		Assert.assertTrue(btnNotYourEmailAddress.isDisplayed());
		Assert.assertTrue(btnResendEmail.isDisplayed());
		Assert.assertTrue(btnHomePage.isDisplayed());
	}
	
	public void opensYopmail(String mailAddress) throws Exception	{
		Thread.sleep(1000);
		if(btnOK.isDisplayed())
			btnOK.click();
		else
			btnHomePage.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.open('"+ mailAddress +"' ,'_blank');");
		handleMultipleTabs(2);
		elementVisible(100, btnYopmailConsent);
		btnYopmailConsent.click();
		txtYopmailEmail.sendKeys(email);
	}
	
	public void verifyEmailinCCB() throws Exception 	{
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		ccbRefresh.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1); 
		driver.switchTo().frame(frame3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBirthDate);
		Thread.sleep(500); 
		for (WebElement emailOrPhone : txtccbEmailOrPhone) {
			if (emailOrPhone.getText().equalsIgnoreCase("Email")) {
				String actualEmail=emailOrPhone.findElement(By.xpath("./following-sibling::td[1]")).getText();
				//Assert.assertEquals(actualEmail, email);
				Thread.sleep(500);
			}
		}
		
	}
	
}
