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

public class Notifications_UpdateOccupancyCount_Loc extends BasePage {
	
	@FindBy(xpath="//li[@rel='notification']") WebElement tabNotifications;
	@FindBy(xpath="//div[@class='tab_actions_title']/h5") WebElement txtNotifications;
	@FindBy(xpath="//div[@id='update-occupancy']/div/div[1]/a") WebElement btnUpdateYourOccupancyInfoIcon;
	@FindBy(xpath="//div[@id='update-occupancy']/div/div[1]/div/span") WebElement txtUpdateYourOccupancyInfoIcon;
	@FindBy(xpath="//div[@id='update-occupancy']/div/div[1]/div/a") WebElement btnUpdateYourOccupancyInfoIconClose;
	@FindBy(xpath="//p[@class='fb-12 required']") WebElement txtUpdateYourOccupancyTeaser;
	@FindBy(xpath="//button[@class='minus']") WebElement btnMinus;
	@FindBy(id="number-of-occupiers") WebElement txtOccupancy;
	@FindBy(xpath="//button[@class='plus']") WebElement btnPlus;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[6]") WebElement btnUpdate;
	@FindBy(xpath="(//input[@class='success-text'])[2]") WebElement txtSuccessMsg;
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

	public Notifications_UpdateOccupancyCount_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Notifications_UpdateOccupancyCount.properties");
	}

	public void redirectedToNotificationsTab() throws Exception {
		Thread.sleep(3000);
		tabNotifications.click();
		Thread.sleep(1000);
		elementVisible(100, txtNotifications);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabNotifications);	
	}

	public void verifyUpdateYourOccupancySection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnUpdateYourOccupancyInfoIcon);
		btnUpdateYourOccupancyInfoIcon.click();
		elementVisible(100, txtUpdateYourOccupancyInfoIcon);
		Assert.assertEquals(true, txtUpdateYourOccupancyInfoIcon.getText().contains(c.getData("updateYourOccupancyInformationText")));
		Thread.sleep(500);
		btnUpdateYourOccupancyInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtUpdateYourOccupancyTeaser.getText().contains(c.getData("updateYourOccupancyTeaser")));
		Assert.assertEquals(true, btnMinus.isDisplayed());
		Assert.assertEquals(true, txtOccupancy.isDisplayed());
		Assert.assertEquals(true, btnPlus.isDisplayed());
		Assert.assertEquals(true, btnUpdate.isDisplayed());
	}

	public void clicksOnUpdateButton() throws Exception {
		btnUpdate.click();
		Thread.sleep(1000);
	}

	public void providesOccupancyCount(String occupancy) throws Exception {
		occupancyCount=occupancy;
		for (int i = 1; i <= Integer.parseInt(occupancy); i++) {
			btnPlus.click();
			Thread.sleep(200);
		}
	}

	public void shouldNotdisplayOccupancySection() throws Exception {
		btnUpdate.click();
		Thread.sleep(5000);
		elementVisible(100, txtNotifications);
		System.out.println(txtSuccessMsg.getAttribute("value"));
	}

	public void verifyOccupancyCountUnderMyProfileTab() throws Exception {
		Thread.sleep(1000);
		elementVisible(100, tabMyProfile);
		Thread.sleep(1000);
		tabMyProfile.click();
		elementVisible(100, txtOccupancyCount2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyProfile);
		Thread.sleep(500);
		Assert.assertEquals(true, txtOccupancyCount2.getText().contains(occupancyCount));
	}

	public void verifyOccupancyCountInCCB(String accNo, String ccbUsername, String ccbPwd, String occupancy) throws Exception {
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
