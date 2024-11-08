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

public class WaterMeterAndUsage_UpdateOccupancyCount_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-your-property-information']/strong") WebElement txtWhatWouldYouLikeToDo;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-am-i-better-off']") WebElement btnCanYouSaveMoneyOnAWaterMeter;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-request-a-water-meter nb-btn-outline']") WebElement btnApplyForAWaterMeter;
	@FindBy(xpath="//div[@class='wp-usage-box wp-usage-households']/div/p[1]") WebElement txtOurUsageCalculatorcanEstimate;
	@FindBy(xpath="//div[@class='form-row wp-select-households']/div/div") WebElement dropdownPleaseSelect;
    @FindBy(xpath="//div[@class='form-row wp-select-households']/div/div/div/div/span") List<WebElement> btnOccupancyOptions;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block update-number-occupiers-btn']") WebElement btnUpdateDetails;
    @FindBy(xpath="//div[@class='alert_window profileAlert profile-success success']/div/div/div[2]/p") WebElement txtSuccessPopupTeaser;
    @FindBy(xpath="(//button[@class='nb-btn nb-btn__cta'])[1]") WebElement btnOk;
    @FindBy(xpath="//div[@class='form-row wp-select-households']/div/div/span[1]") WebElement txtOccupancyCount1;
    @FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
    @FindBy(xpath="//label[@class='lbl-occupiers']") WebElement txtOccupancyCount2;
    
    @FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//td[@orafield='output/numberOfOccupiers']") WebElement txtCCBOccupancyCount;
    
    String occupancyCount;
    
	public WaterMeterAndUsage_UpdateOccupancyCount_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//WaterMeterAndUsage_UpdateOccupancyCount.properties");
	}

	public void verifyCanYouSaveMoneyOnAWaterMeterPage() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatWouldYouLikeToDo);
		Assert.assertEquals(true, btnCanYouSaveMoneyOnAWaterMeter.isEnabled());
		Assert.assertEquals(true, btnApplyForAWaterMeter.isDisplayed());
		Assert.assertEquals(true, txtOurUsageCalculatorcanEstimate.getText().contains(c.getData("CanYouSaveMoneyOnMeterTeaser")));
		Assert.assertEquals(true, dropdownPleaseSelect.isDisplayed());
	}

	public void entersOccupancyCount(String occupancy) throws Exception {
		dropdownPleaseSelect.click();
		Thread.sleep(2000);
		occupancyCount=occupancy;
		for (WebElement occupancyOption : btnOccupancyOptions) {
			if (occupancyOption.getText().equalsIgnoreCase(occupancyCount)) {
				occupancyOption.click();
				Thread.sleep(1000);
				break;
			}
		}
		Assert.assertEquals(true, btnUpdateDetails.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCanYouSaveMoneyOnAWaterMeter);
	}

	public void displaySuccessPopup() throws Exception {
		btnUpdateDetails.click();
		elementVisible(100, txtSuccessPopupTeaser);
		Assert.assertEquals(true, txtSuccessPopupTeaser.getText().contains(c.getData("successPopupTeaser")));
		Assert.assertEquals(true, btnOk.isDisplayed());
	}

	public void redirectedToWaterMeterAndUsageTab() throws Exception {
		btnOk.click();
		elementVisible(100, btnCanYouSaveMoneyOnAWaterMeter);
		Thread.sleep(3000);
		Assert.assertEquals(true, txtOccupancyCount1.getText().contains(occupancyCount));
	}

	public void verifyOccupancyCountUnderMyProfileTab() throws Exception {
		elementVisible(100, tabMyProfile);
		tabMyProfile.click();
		elementVisible(100, txtOccupancyCount2);
		Thread.sleep(500);
		Assert.assertEquals(true, txtOccupancyCount2.getText().contains(occupancyCount));
	}

	public void verifyOccupancyCountInCCB(String accNo, String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(accNo);
		btnCCBSearch.click();
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Thread.sleep(2000);
		if (Integer.parseInt(occupancyCount)>=5) {
			Assert.assertEquals(true, txtCCBOccupancyCount.getText().contains("5+"));
		}
		else {
			Assert.assertEquals(true, txtCCBOccupancyCount.getText().contains(occupancyCount));
		}
	}

}
