package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class InYourArea_Loc extends BasePage {
	
	@FindBy(linkText="Your local area") WebElement linkYourLocalArea;
	@FindBy(xpath="//a[@data-content='check-your-area']") WebElement tabCheckMyArea;
	@FindBy(xpath="//h1[@class='small-h1 normal']") WebElement txtWhatsGoingOnInMyArea;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtCheckMyAreaTeaser;
	@FindBy(id="data8-address-checkyourarealanding") WebElement txtAddress;
	@FindBy(xpath="//strong[@class='wp-iclocation-link']/a") WebElement linkUseMyCurrentLocation;
	@FindBy(xpath="(//div[@class='wp-water-disruption'])[1]/h6") WebElement txtWaterDisruption;
	@FindBy(xpath="//div[@class='form-row events']/div[2]/p/strong") WebElement txtWaterDisruptionTeaser;
	@FindBy(xpath="(//div[@class='wp-water-disruption'])[2]/h6") WebElement txtLeaks;
	@FindBy(xpath="//div[@class='form-row leak-works']/div[2]/p/strong") WebElement txtLeaksTeaser;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[1]") WebElement btnContinueToReportLeak;
	@FindBy(xpath="(//div[@class='wp-water-disruption'])[3]/h6") WebElement txtRoadWorks;
	@FindBy(xpath="//div[@class='water-quality-box']/div[1]") WebElement txtWaterQualityInformation;
	@FindBy(xpath="//a[@class='nb-btn-link']") WebElement linkMoreAboutWaterHardness;
	@FindBy(xpath="(//div[@class='form-btn'])[2]/a") WebElement btnDownloadFullReport;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[2]") WebElement btnMoreAboutWaterQuality;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[3]") WebElement btnReportAProblem;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block check-leak-map']") WebElement btnGoToOurHelpCentre;
	@FindBy(xpath="//a[@aria-label='Northumbrian Water']") WebElement linkNorthumbrianWater;

	public InYourArea_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//InYourArea.properties");
		createDirectory(System.getProperty("user.dir")+"//target//surefire-reports//");
		createDirectory(System.getProperty("user.dir")+"//target//cucumber-html-reports//");
		createDirectory(System.getProperty("user.dir")+"//target//cucumber-reports//");
	}

	public void navigateToCheckMyAreaTab() throws Exception {
		elementVisible(100, linkYourLocalArea);
		linkYourLocalArea.click();
		elementVisible(100, tabCheckMyArea);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabCheckMyArea);
		Assert.assertEquals(true, txtWhatsGoingOnInMyArea.getText().contains(c.getData("checkMyAreaLabel")));
		Assert.assertEquals(true, txtCheckMyAreaTeaser.getText().contains(c.getData("checkMyAreaTeaser")));
	}

	public void userEntersRequiredAddress(String address) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAddress);
		Assert.assertEquals(true, txtAddress.isDisplayed());
		Assert.assertEquals(true, linkUseMyCurrentLocation.isDisplayed());
		txtAddress.sendKeys(address);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		elementVisible(100, txtWaterDisruption);
		Assert.assertEquals(true, txtWaterDisruptionTeaser.getText().contains(c.getData("waterDisruptionTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAddress);
	}

	public void verifyLeaksSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLeaks);
		Assert.assertEquals(true, txtLeaksTeaser.getText().contains(c.getData("leaksTeaser")));
		Assert.assertEquals(true, btnContinueToReportLeak.isDisplayed());
	}

	public void verifyRoadWorksSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRoadWorks);
		Thread.sleep(500);
	}

	public void verifyWaterQualityInformation() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterQualityInformation);
		Assert.assertEquals(true, linkMoreAboutWaterHardness.isDisplayed());
		Assert.assertEquals(true, btnDownloadFullReport.isDisplayed());
		Assert.assertEquals(true, btnMoreAboutWaterQuality.isDisplayed());
		Assert.assertEquals(true, btnReportAProblem.isDisplayed());
		Assert.assertEquals(true, btnGoToOurHelpCentre.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterQualityInformation);
	}

	public void navigateToNWLHomePage() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkNorthumbrianWater);
		Thread.sleep(1000);
		linkNorthumbrianWater.click();
		Thread.sleep(2000);
		elementVisible(100, linkYourLocalArea);
		Thread.sleep(1000);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("nwlHomePageURL")));
	}

}
