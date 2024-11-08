package com.nwl.pages;

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

public class Smart_MeterAndUsageEfficiencyStatus_Loc extends BasePage {
	
	@FindBy(id="cookiescript_accept") WebElement btnCookieClose;
	@FindBy(xpath="//button[@class='nb-btn']") WebElement btnPopupMsgClose;
	@FindBy(xpath="//li[@class='mega__has-sub nav-account']") WebElement linkAccount;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[2]/li[1]/a") WebElement linkLoginOrCreateAnAccount;
	@FindBy(linkText="Log in") WebElement tabLogin;
	@FindBy(xpath="//h1[@class='small-h1']") WebElement txtLogin;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnEmailInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtEmailInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnEmailInfoIconClose;
	@FindBy(xpath="(//input[@class='form-control email'])[1]") WebElement txtEmail;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[2]") WebElement btnPasswordInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[2]") WebElement txtPasswordInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[2]") WebElement btnPasswordInfoIconClose;
	@FindBy(xpath="//input[@class='form-control loginpassword']") WebElement txtPassword;
	@FindBy(xpath="//input[@id='password']/following-sibling::a") WebElement linkShowPassword;
	@FindBy(xpath="//input[@id='remember-me-label']/following-sibling::span[1]") WebElement checkRememberMe;
	@FindBy(id="recaptcha-demo-submit") WebElement btnLogin;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[2]") WebElement linkIHaveForgottenMyEmail;
	@FindBy(xpath="//li[@class='owl-dot active']") WebElement tabAccountDashboard;
	@FindBy(xpath="(//div[@class='form-select'])[3]") WebElement dropdownSelectAccount;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> txtAccountNumber;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnContinue;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnSwitchToDifferentAddress;
	@FindBy(xpath="//div[@class='wp-your-usage-smart-metered-container']/h5") WebElement txtYourWaterMeter;	
	@FindBy(xpath="//div[@class='wp-your-usage-smart-metered-container']/div[1]/p") WebElement txtYourHomeHasA;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x7']") WebElement btnCCBMeter;
	@FindBy(xpath="//li[@id='CI_METER_subMenuItem0x7']") WebElement btnCCBMeterORItemSearch;
	@FindBy(xpath="//input[@id='ACCT_NBR']") WebElement txtCCBAccountID1;
	@FindBy(id="BU_section3_search") WebElement btnCCBSearch1;
	@FindBy(id="IM_MTR_ITEM:0$Grid_mtrCntxt") WebElement btnCCBMenuSymbol;
	@FindBy(xpath="//li[@id='CI_CONTEXTMETER_subMenuItem0x4']") WebElement btnCCBGoToReadHistory;
	@FindBy(xpath="//span[@id='MTR_INFO']") WebElement txtCCBSerialNo;
	
	@FindBy(xpath="//div[@class='wp-your-usage-smart-metered-container']/div[1]/div") WebElement txtSmartMeter;
	@FindBy(xpath="(//div[@class='wp-your-usage-smart-metered-container']/div[2]/p)[1]") WebElement txtYourMeterSerialNo;
	@FindBy(xpath="(//p[@class='meter-serial-number']/b)[2]") WebElement txtSerialNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnSmartMeteredInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtSmartMeteredInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnInfoClose;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[1]") WebElement txtStatus_AD;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[1]/h5") WebElement txtUsageStatus_AD;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[1]/div/p") WebElement txtUsageStatusUnderText_AD;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-my-usage-summary'])[2]") WebElement btnViewMyUsage;
	@FindBy(xpath="//li[@rel='home']") WebElement txtMyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]") WebElement txtStatus_MyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/h5") WebElement txtUsageStatus_MyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/div/p") WebElement txtUsageStatusUnderText_MyUsage;
	
	public Smart_MeterAndUsageEfficiencyStatus_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//Smart_MeterAndUsageEfficiencyStatus.properties");
		createDirectory(System.getProperty("user.dir")+"//target//surefire-reports//");
		createDirectory(System.getProperty("user.dir")+"//target//cucumber-html-reports//");
		createDirectory(System.getProperty("user.dir")+"//target//cucumber-reports//");
	}
	
	public void navigateToLoginTab() throws Exception{
		elementVisible(100, linkAccount);
	    linkAccount.click();
		elementVisible(100, linkLoginOrCreateAnAccount);
		linkLoginOrCreateAnAccount.click();
		elementVisible(100, tabLogin);
		btnEmailInfoIcon.click();
		elementVisible(100, txtEmailInfoIcon);
		Assert.assertEquals(true, txtEmailInfoIcon.getText().contains(c.getData("emailInformationText")));
		Thread.sleep(500);
		btnEmailInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtEmail.isDisplayed());
		btnPasswordInfoIcon.click();
		elementVisible(100, txtPasswordInfoIcon);
		Assert.assertEquals(true, txtPasswordInfoIcon.getText().contains(c.getData("passwordInformationText")));
		Thread.sleep(500);
		btnPasswordInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword.isDisplayed());
		Assert.assertEquals(true, btnLogin.isDisplayed());
		Assert.assertEquals(true, linkIHaveForgottenMyEmail.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLogin);
	}
	
	public void enterCredentials(String username, String password) throws Exception {
		txtEmail.sendKeys(username);
		txtPassword.sendKeys(password);
		linkShowPassword.click();
		Thread.sleep(500);
	}
	
	public void clickOnLoginButtonAndNavigateADTab(String accNo) throws Exception{
		btnLogin.click();
		Thread.sleep(13000);
		elementVisible(100, tabAccountDashboard);
		Thread.sleep(3000);
		if (!dropdownSelectAccount.isDisplayed()) {
			Assert.assertEquals(true, tabAccountDashboard.getText().contains(c.getData("tabName1")));
		}
    	else {
    		dropdownSelectAccount.click();
			Thread.sleep(3000);
			for (WebElement element : txtAccountNumber) {
				String str = new String(element.getText().substring(0, 10));
				if (str.equalsIgnoreCase(accNo)) {
					element.click();
					break;
				}
			}
			Thread.sleep(2000);
			btnContinue.click();
			elementVisible(200, btnSwitchToDifferentAddress);
		}
	}
    
    public void verifyMeterStatus(String acc) throws Exception{
    	Thread.sleep(2000);
    	elementVisible(100, txtYourHomeHasA);
    	((JavascriptExecutor) driver).executeScript("window.open('https://tst01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys("allak");
		btnCCBPwd.sendKeys("Monda16!");
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBMeter);
		btnCCBMeter.click();
		elementVisible(100, btnCCBMeterORItemSearch);
		btnCCBMeterORItemSearch.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBAccountID1);
		txtCCBAccountID1.sendKeys(acc);
		btnCCBSearch1.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
		elementVisible(100, btnCCBMenuSymbol);
		btnCCBMenuSymbol.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBGoToReadHistory);
		btnCCBGoToReadHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBSerialNo);
		String[] s1 = txtCCBSerialNo.getText().split("/");
		String expectedSerialNumber = s1[1].toString().replaceAll("\\s", "");
		handleMultipleTabs(0);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourWaterMeter);
		if (driver.getCurrentUrl().contains("nwl")) {
    		Assert.assertEquals(true, txtYourHomeHasA.getText().contains(c.getData("propertyMeterLabel_NWL")));
    		Assert.assertEquals(true, txtSmartMeter.getText().contains(c.getData("propertyMeterType_NWL")));
		}
    	else{
    		Assert.assertEquals(true, txtYourHomeHasA.getText().contains(c.getData("propertyMeterLabel_ESWater")));
    		Assert.assertEquals(true, txtSmartMeter.getText().contains(c.getData("propertyMeterType_ESWater"))); 
    	}
    	Assert.assertEquals(true, txtYourMeterSerialNo.getText().contains(c.getData("serialNumberLabel")));
		Assert.assertEquals(true, txtSerialNo.getText().contains(expectedSerialNumber));
    }
    
    public void verifySmartMeteredInfoText() throws Exception{
    	btnSmartMeteredInfoIcon.click();
    	elementVisible(100, txtSmartMeteredInfoIcon);
    	Thread.sleep(1000);
    	if (driver.getCurrentUrl().contains("nwl")) {
    		Assert.assertEquals(true, txtSmartMeteredInfoIcon.getText().contains(c.getData("propertyMeterTooltip_NWL")));
		}
    	else {
    		Assert.assertEquals(true, txtSmartMeteredInfoIcon.getText().contains(c.getData("propertyMeterTooltip_ESWater")));
    	}
    }
    
    public void verifyWaterUsageStatus_AD() throws Exception {
    	//btnInfoClose.click();
    	Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourMeterSerialNo); 	
		if (txtStatus_AD.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			Assert.assertEquals(true, txtUsageStatus_AD.getText().contains(c.getData("efficiencyMessage_NoUsage")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_AD.getText().contains(c.getData("shortDescription_NoUsage")));
		}
		
		else if (txtStatus_AD.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("0"))) {
			Assert.assertEquals(true, txtUsageStatus_AD.getText().contains(c.getData("efficiencyMessage_Efficient")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_AD.getText().contains(c.getData("shortDescription_Efficient")));
		}
		
		else if (txtStatus_AD.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("1"))) {
			Assert.assertEquals(true, txtUsageStatus_AD.getText().contains(c.getData("efficiencyMessage_Average")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_AD.getText().contains(c.getData("shortDescription_Average")));
		}
		
		else if (txtStatus_AD.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("2"))) {	
			Assert.assertEquals(true, txtUsageStatus_AD.getText().contains(c.getData("efficiencyMessage_High")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_AD.getText().contains(c.getData("shortDescription_High")));
		}
		
		else if (txtStatus_AD.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("3"))) {	
			Assert.assertEquals(true, txtUsageStatus_AD.getText().contains(c.getData("efficiencyMessage_VeryHigh")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_AD.getText().contains(c.getData("shortDescription_VeryHigh")));
		}	
	}
	
	public void clicksOnViewMyUsageAndNavigateToMyUsageTab() throws Exception{
    	btnViewMyUsage.click(); 
    	elementVisible(100, txtMyUsage);
    	Thread.sleep(1000);
		//Assert.assertEquals(true, txtMyUsage.getText().contains(c.getData("tabName3")));
    }	
	
	public void verifyWaterUsageStatus_MyUsage() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyUsage);
		if (txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			Assert.assertEquals(true, txtUsageStatus_MyUsage.getText().contains(c.getData("efficiencyMessage_NoUsage")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_MyUsage.getText().contains(c.getData("shortDescription_NoUsage")));
		}
		
		else if (txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("0"))) {
			Assert.assertEquals(true, txtUsageStatus_MyUsage.getText().contains(c.getData("efficiencyMessage_Efficient")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_MyUsage.getText().contains(c.getData("shortDescription_Efficient")));
		}
		
		else if (txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("1"))) {
			Assert.assertEquals(true, txtUsageStatus_MyUsage.getText().contains(c.getData("efficiencyMessage_Average")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_MyUsage.getText().contains(c.getData("efficiencyMessage_Average")));
		}
		
		else if (txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("2"))) {	
			Assert.assertEquals(true, txtUsageStatus_MyUsage.getText().contains(c.getData("efficiencyMessage_High")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_MyUsage.getText().contains(c.getData("shortDescription_High")));
		}
		
		else if (txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("3"))) {	
			Assert.assertEquals(true, txtUsageStatus_MyUsage.getText().contains(c.getData("efficiencyMessage_VeryHigh")));
	    	Assert.assertEquals(true, txtUsageStatusUnderText_MyUsage.getText().contains(c.getData("shortDescription_VeryHigh")));
		}
	}

}
