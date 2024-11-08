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

public class Smart_UMTB_MeterAndUsageEfficiencyStatus_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-your-usage-smart-unmetered-container']/h5") WebElement txtMyMeter;	
	@FindBy(xpath="(//div[@class='wp-your-usage-smart-unmetered-container']/div/p)[1]") WebElement txtYourMSNIs;
	@FindBy(xpath="(//p[@class='meter-serial-number'])[3]/b") WebElement txtMeterSerialNumber;
	@FindBy(xpath="//div[@class='meter-location']") WebElement txtUnmeteredTariff;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[6]") WebElement btnUnmeteredTariffInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[6]") WebElement txtUnmeteredTariffInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[6]") WebElement btnInfoClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-my-usage-summary'])[3]") WebElement btnViewMyUsage;
	@FindBy(xpath="//li[@rel='home']") WebElement txtMyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/img") WebElement efficiencyStatusIcon;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]") WebElement txtStatus_MyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/h5") WebElement txtUsageStatus_MyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/div/p") WebElement txtUsageStatusUnderText_MyUsage;
	
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

	public Smart_UMTB_MeterAndUsageEfficiencyStatus_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Smart_UMTB_MeterAndUsageEfficiencyStatus.properties");
	}
	
	public void verifyMeterStatusAndUnmeteredTariffBillText(String acc) throws Exception{
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyMeter);
		Thread.sleep(1000);
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
		Assert.assertEquals(true, txtYourMSNIs.getText().contains(c.getData("serialNumberLabel")));
    	Assert.assertEquals(true, txtUnmeteredTariff.getText().contains(c.getData("MeterBillLabel")));
		Assert.assertEquals(true, txtMeterSerialNumber.getText().contains(expectedSerialNumber)); 
    }
	
	public void verifyUnmeteredTariffInfoText() throws Exception{
    	btnUnmeteredTariffInfoIcon.click();
    	elementVisible(100, txtUnmeteredTariffInfoIcon);
    	Thread.sleep(1000);
    	Assert.assertEquals(true, txtUnmeteredTariffInfoIcon.getText().contains(c.getData("MeterBillTooltip")));
	}
	
	public void ClicksOnViewMyUsage() throws Exception{
		//btnInfoClose.click();
    	Thread.sleep(1000);
    	btnViewMyUsage.click(); 
    	elementVisible(100, txtMyUsage);
    	Thread.sleep(1000);
		//Assert.assertEquals(true, txtMyUsage.getText().contains(c.getData("tabName3")));
    }
	
	public void verifyWaterUsageStatus_MyUsage() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", efficiencyStatusIcon);
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
	    	Assert.assertEquals(true, txtUsageStatusUnderText_MyUsage.getText().contains(c.getData("shortDescription_Average")));
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