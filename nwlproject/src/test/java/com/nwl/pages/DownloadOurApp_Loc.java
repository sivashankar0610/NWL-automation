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

public class DownloadOurApp_Loc extends BasePage {
	
	@FindBy(xpath="//li[@rel='home']") WebElement tabWaterMeterAndUsage;
	@FindBy(xpath="//li[@rel='home']") WebElement txtWaterMeterAndUsage;
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-light text-center download-app']/h5") WebElement titleDownloadOurApp;
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-light text-center download-app']/p") WebElement txtDownloadOurAppTeaser;
	@FindBy(xpath="//div[@class='download-features']/span") List<WebElement> titleIcons;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-white download-app-btn']") WebElement btnDownloadTheApp;
	@FindBy(linkText="Help") WebElement btnHelp;
	@FindBy(id="cookiescript_accept") WebElement btnAcceptCookies;

	public DownloadOurApp_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//DownloadOurApp.properties");
	}

	public void clicksOnMyUsageTabAndNavigateMyUsageTab() throws Exception {
		Thread.sleep(3000);
		tabWaterMeterAndUsage.click();
		elementVisible(100, txtWaterMeterAndUsage);
		Thread.sleep(1000);
		//Assert.assertEquals(true, txtMyUsage.getText().contains(c.getData("tabName3")));
	}
	
	public void verifyDownloadAppBannerCopyText() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleDownloadOurApp);
		Assert.assertEquals(true, titleDownloadOurApp.getText().contains(c.getData("DownladAppHeading")));
		if (driver.getCurrentUrl().contains("nwl")) {
			Assert.assertEquals(true, txtDownloadOurAppTeaser.getText().contains(c.getData("DownloadAppteaser_NWL")));
		}
		else {
			Assert.assertEquals(true, txtDownloadOurAppTeaser.getText().contains(c.getData("DownloadAppteaser_ESWater")));
		}
		Assert.assertEquals(true, titleIcons.get(0).getText().contains("Richer insights"));
		Assert.assertEquals(true, titleIcons.get(1).getText().contains("Usage comparisons"));
		Assert.assertEquals(true, titleIcons.get(2).getText().contains("Efficiency medals"));
		Assert.assertEquals(true, titleIcons.get(3).getText().contains("Leak and high usage alerts"));	
    }
	
	public void clicksOnDownloadTheAppButtonAndNavigateDownloadOurAppWebsite() throws Exception {
		btnDownloadTheApp.click();
		//elementVisible(100, btnAcceptCookies);
	    //btnAcceptCookies.click();
		elementVisible(100, btnHelp);
		if (driver.getCurrentUrl().contains("nwl")) {
			Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("DownloadAppButtonNavigationURL_NWL")));
		}
		else {
			Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("DownloadAppButtonNavigationURL_ESWater")));
		}
	}
	
}
