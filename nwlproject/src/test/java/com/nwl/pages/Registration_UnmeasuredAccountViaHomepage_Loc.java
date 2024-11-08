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

public class Registration_UnmeasuredAccountViaHomepage_Loc extends BasePage{
	
	@FindBy(xpath = "//i[@class='btn-fa fal fa-user']") WebElement btnLoginToYourOnlineAccount;
	@FindBy(linkText="Create an account") WebElement tabCreateAnAccount;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "userId") WebElement btnCCBUserID;
	@FindBy(id = "password") WebElement btnCCBPwd;
	@FindBy(id = "loginButton") WebElement btnCCBLogin;
	@FindBy(id = "tabPage") WebElement frame1;
	@FindBy(id = "srch_frame") WebElement frame2;
	@FindBy(xpath = "//iframe[@title='zoneMapFrame_1']") WebElement frame3;
	@FindBy(id = "zoneMapFrame_2") WebElement frame4;
	@FindBy(id = "ACCT_ID") WebElement txtAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnSearch;
	@FindBy(id = "personId") WebElement txtName;
	@FindBy(xpath = "//td[@orafield='output/premise']") WebElement txtCCBAddress;
	@FindBy(xpath = "//div[@class='account-teaser']/p") WebElement txtRegistrationDescription;
	@FindBy(xpath = "//input[@class='form-control firstname']") WebElement txtFirstName;
	@FindBy(xpath = "//input[@class='form-control surname']") WebElement txtSurName;
	@FindBy(xpath = "//input[@class='form-control email']") WebElement txtEmail;
	@FindBy(xpath = "//input[@class='form-control password']") WebElement txtPassword;
	@FindBy(xpath = "//input[@class='form-control confirmpassword']") WebElement txtConfirmPassword;	
	@FindBy(xpath = "(//span[@class='checkbox'])[1]") WebElement btnCustomerYes;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnCreateAccount;
	@FindBy(xpath = "//a[@class='nb-btn-link']") WebElement linkPrivacyHandling;
	@FindBy(xpath = "//a[@href='/register/online-account-terms-and-conditions/']") WebElement linkProtectAccount;
	@FindBy(xpath = "(//div[@class='editorial__block'])[2]/div/p[1]") WebElement txtLandlordInfo;
	@FindBy(xpath = "(//a[@href='/services/landlords/'])[3]") WebElement linkLandlordInfo;
	@FindBy(xpath = "(//div[@class='editorial__block'])[3]/div/p[2]") WebElement txtManageBusinessAcct;
	@FindBy(xpath = "//a[@href='/help/how-to-manage-a-business-account-online/']") WebElement linkManageBusinessAcct;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p") WebElement txtThanks;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p[2]") WebElement txtEmailed;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p[2]/a") WebElement txtEmailAddress;
	@FindBy(xpath = "(//div[@class='alert-label'])[2]/p[3]") WebElement txtInstructions;
	@FindBy(xpath = "//a[@class='nb-btn-link notEmail']") WebElement btnNotYourEmailAddress;
	@FindBy(xpath = "//a[@class='nb-btn-link resendEmail']") WebElement btnResendEmail;
	@FindBy(xpath = "//a[@class='nb-btn-link take-nwl']") WebElement btnHomePage;
	@FindBy(id = "accept") WebElement btnYopmailCookiesAccept;
	@FindBy(xpath = "(//p[@class='fc-button-label'])[1]") WebElement btnYopmailConsent;
	@FindBy(id = "login") WebElement txtYopmailEmail;
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']") WebElement btnYopmailEnter;
	@FindBy(xpath = "//*[text()='NWL UAT']") WebElement btnEmailHeading;
	@FindBy(xpath = "//*[text()='Verify my account']") WebElement btnVerifyAccount;
	@FindBy(id = "ifinbox") WebElement frame5;
	@FindBy(id = "ifmail") WebElement frame6;
	@FindBy(id = "birthDate") WebElement txtBirthDate;
	@FindBy(xpath = "//div[@class=\"account-teaser\"]/h2") WebElement txtNameSalutation;
	@FindBy(id = "data8-address-verifyPostCode") WebElement txtAddress;
	@FindBy(id = "MyAddressIsntExistLink") WebElement btnAddressNotListed;
	@FindBy(xpath = "//span[@tabindex=\"-1\"]") WebElement btnAddress;
	@FindBy(xpath = "//input[@class=\"form-control day\"]") WebElement txtDay;
	@FindBy(xpath = "//input[@class=\"form-control month\"]") WebElement txtMonth;
	@FindBy(xpath = "//input[@class=\"form-control year\"]") WebElement txtYear;
	@FindBy(id = "NWLNo") WebElement txtAccountIDReg;
	@FindBy(id = "IDontKnowNWLAccountLink") WebElement linkIDontKnowAccountNumber;
	@FindBy(id = "ImANewCustomerLink") WebElement linkNewCustomer;
	@FindBy(xpath = "(//button[@class=\"nb-btn nb-btn-outline nb-btn-sm nb-btn-whyaks\"])[1]") WebElement btnWhyWeAsk;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-outline nb-btn-sm nb-btn-whyaks tooltip-active']") WebElement btnWhyWeAskActive;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[5]") WebElement toolTipWhyWeAsk;
	@FindBy(xpath = "(//button[@class=\"nb-btn nb-btn-block\"])[1]") WebElement btnNextPersonalDetails;
	@FindBy(xpath = "(//span[@class='toggle'])[2]") WebElement btnNorthumbrianInfo;
	@FindBy(xpath = "(//span[@class='toggle'])[4]") WebElement btnKielderInfo;
	@FindBy(xpath = "(//label[@class='switch-text text-bold'])[1]") WebElement txtNWLProducts;
	@FindBy(xpath = "//label[text()='Yes, I want to receive information about products and services from Northumbrian Water']") WebElement txtNWLProducts2;
	@FindBy(xpath = "(//label[@class='switch-text text-bold'])[2]") WebElement txtNWLResearch;
	@FindBy(xpath = "//label[text()='Yes, I want to receive information about market research programmes from Northumbrian Water']") WebElement txtNWLResearch2;
	@FindBy(xpath = "(//label[@class='switch-text text-bold'])[3]") WebElement txtKWProducts;
	@FindBy(xpath = "//label[text()='                                    Yes, I want to receive information about products and services from Kielder Water & Forest Development Trust and its members*                                ']") WebElement txtKWProducts2;
	@FindBy(xpath = "//p[@class='small-text']") WebElement txtConditionsPreferences;
	@FindBy(xpath = "//label[text()='                               *You will receive information via email and you may still receive non-personalised marketing material through your letterbox.                          ]") WebElement txtConditionsPreferences2;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block'])[5]") WebElement btnNextMarketPref;
	@FindBy(xpath = "//li[@rel='account']") WebElement btnAccountDashboard;
	@FindBy(id = "IM_REFRESH") WebElement ccbRefresh;
	@FindBy(xpath="//td[@orafield='personContactType']") List<WebElement> txtccbEmailOrPhone;
	@FindBy(xpath = "(//td[@orafield=\"contactDetailValue\"])[2]") WebElement ccbContactEmail;
	@FindBy(xpath = "//a[@class=\"nb-btn nb-btn__cta nb-btn-inline\"]") WebElement btnOK;
	
	@FindBy(id = "dataframe") WebElement frameSearchResults;
	@FindBy(id = "SEARCH_RESULTS|0") WebElement linkSearchResult;
	@FindBy(id = "tabMenu") WebElement frame7;
	@FindBy(xpath = "//td[@title=\"Customer Information\"]") WebElement tabCustomerInfo;
	@FindBy(id = "personTreeIFrame") WebElement frame8;
	@FindBy(xpath = "(//span[@class=\"clickable\"])[1]") WebElement linkPersonName;
	@FindBy(xpath = "//td[@title=\"Characteristics\"]") WebElement tabCharacteristics;
	@FindBy(id = "ENTITY_INFO") WebElement txtPersonName;
	
	String AccountID,firstName,lastName,email,address;
	
	String day,month,year;
	
	
	public Registration_UnmeasuredAccountViaHomepage_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//Registration_UnmeasuredAccountViaHomepage.properties");
	}

	public void clickLoginCTAButton()	{
		elementVisible(100, btnLoginToYourOnlineAccount);
		btnLoginToYourOnlineAccount.click();
		elementVisible(100, tabCreateAnAccount);
		tabCreateAnAccount.click();
		elementVisible(100, txtFirstName);	
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
		AccountID = AccID;
		btnSearch.click();
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
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame3);
		Thread.sleep(2000);
		String name = txtName.getText();
		String[] splitName = name.split(" ");
		firstName = splitName[1];
		String last = splitName[0];
		lastName = last.substring(0,last.length()-1); 
		
		String bDay = txtBirthDate.getText();
		String[] splitBirthDay = bDay.split("-");
		day = splitBirthDay[0];
		month = splitBirthDay[1];
		year = splitBirthDay[2];
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1); 
		driver.switchTo().frame(frame4);
		String add=txtCCBAddress.getText();
		String[] splitAddress = add.split(" ");
		System.out.println(add);
		int n = splitAddress.length;
		String houseNo = splitAddress[0];
		String post1 = splitAddress[n-2];
		String post2 = splitAddress[n-1];
		String postCode = post1 + " " + post2;
		address = houseNo + ", " + postCode;		
	}
	
	public void userDetailsReg(String password) throws Exception {
		handleMultipleTabs(0);
		elementVisible(100, txtFirstName);
		Assert.assertEquals(true, txtRegistrationDescription.getText().contains(c.getData("registrationDescription")));
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(lastName);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		LocalDateTime timeNow = LocalDateTime.now();  
		email = "nwl" + dtf.format(timeNow) + "@yopmail.com";
		txtEmail.sendKeys(email);
		System.out.println("Email address is: " + email);
		txtPassword.sendKeys(password);
		txtConfirmPassword.sendKeys(password);
		btnCustomerYes.click();
		Assert.assertTrue(linkPrivacyHandling.isDisplayed());
		Assert.assertTrue(linkProtectAccount.isDisplayed());
		Assert.assertEquals(true, txtLandlordInfo.getText().contains(c.getData("landlordInfo")));
		Assert.assertTrue(linkLandlordInfo.isDisplayed());
		Assert.assertEquals(true, txtManageBusinessAcct.getText().contains(c.getData("businessAcctInfo")));
		Assert.assertTrue(linkManageBusinessAcct.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFirstName);
		Thread.sleep(1000);
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
	
	public void activationMail() throws Exception	{
		elementVisible(100, btnYopmailEnter);
		btnYopmailEnter.click();
		Thread.sleep(4000);
		driver.switchTo().frame(frame5);
		btnEmailHeading.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame6);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnVerifyAccount);
		Thread.sleep(500); 
	}
 
	
	public void enterRegistrationDetails() throws Exception  {
		elementVisible(100, btnVerifyAccount);
		btnVerifyAccount.click();
		handleMultipleTabs(3);
		elementVisible(100, txtAddress);
		String expectedSalutation = "Hello "+ firstName;
		Assert.assertEquals(true, txtNameSalutation.getText().contains(expectedSalutation));
		Assert.assertEquals(true, txtRegistrationDescription.getText().contains(c.getData("addressDescription")));
		Assert.assertTrue(btnAddressNotListed.isDisplayed());
		txtAddress.sendKeys(address);
		Thread.sleep(3000);
	}
	
	public void enterPersonalDetails() throws Exception {
		elementVisible(100, btnAddress);
		btnAddress.click();
		elementVisible(100, txtDay);
		txtDay.sendKeys(day);
		txtMonth.sendKeys(month);
		txtYear.sendKeys(year);
		txtAccountIDReg.sendKeys(AccountID);
		Assert.assertEquals(true, linkIDontKnowAccountNumber.isDisplayed());
		Assert.assertEquals(true, linkNewCustomer.isDisplayed());
		Assert.assertEquals(true, btnWhyWeAsk.isDisplayed());
		btnWhyWeAsk.click();
		elementVisible(100, toolTipWhyWeAsk);
		Assert.assertEquals(true, toolTipWhyWeAsk.getText().contains(c.getData("whyWeAskToolTip")));
		Thread.sleep(2000);
		btnWhyWeAskActive.click();
		Thread.sleep(2000);
	}
	
	public void updateMarketingPreferences() throws Exception {
		btnNextPersonalDetails.click();
		elementVisible(100, btnNorthumbrianInfo);
		Assert.assertEquals(txtNWLProducts.getText(),txtNWLProducts2.getText());
		Assert.assertEquals(txtNWLResearch.getText(),txtNWLResearch2.getText());
	   // Assert.assertEquals(txtKWProducts.getText(),txtKWProducts2.getText());
		//Assert.assertEquals(txtConditionsPreferences.getText(),txtConditionsPreferences2.getText());
	}
	
	public void dashboardDisplayed() throws Exception	{
		btnNextMarketPref.click();
		elementVisible(100, btnAccountDashboard);
		Thread.sleep(2000);
		Assert.assertTrue(btnAccountDashboard.isDisplayed());
		Thread.sleep(5000);		
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
				Assert.assertEquals(actualEmail, email);
			}
		}
		
	}
	
	public void verifySelfServiceRegistration() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame7);
		tabCustomerInfo.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame8);
		elementVisible(100, linkPersonName);
		linkPersonName.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame7);
		tabCharacteristics.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
		elementVisible(100, txtPersonName);
		//driver.close();
		driver.quit();
		
	}
}
