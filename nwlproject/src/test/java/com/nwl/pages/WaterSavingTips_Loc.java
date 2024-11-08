package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class WaterSavingTips_Loc extends BasePage {
	
	@FindBy(xpath="//li[@rel='home']") WebElement txtMyUsage;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/img") WebElement efficiencyStatusIcon;
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]/div/a/div[2]") WebElement linkWaterSavingTip;
	@FindBy(linkText="Help") WebElement btnHelp;

	public WaterSavingTips_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//WaterSavingTips.properties");
	}
	
	public void verifyWaterSavingTipsLink(String status) {
		if (status.equalsIgnoreCase("Smart")) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyUsage);	
		}	
		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", efficiencyStatusIcon);
		}
	}
	
	public void navigateToWaterSavingTipsWebsite() throws Exception{
        if (linkWaterSavingTip.isDisplayed()) {
		    linkWaterSavingTip.click();
		    elementVisible(100, btnHelp);
		    if (driver.getCurrentUrl().contains("nwl")) {
		    	Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("WSTLinkNavigationURL_NWL")));
			}
			else {
				Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("WSTLinkNavigationURL_ESWater")));
			}
		}	
	}

}
