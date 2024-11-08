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

public class CheckALeak_Loc extends BasePage {
	
	@FindBy(id="data8-address-checkyourarealanding") WebElement txtAddress;
	@FindBy(xpath="//strong[@class='wp-iclocation-link']/a") WebElement linkUseMyCurrentLocation;
	@FindBy(xpath="(//div[@class='wp-water-disruption'])[1]/h6") WebElement txtWaterDisruption;
	@FindBy(xpath="(//div[@class='wp-water-disruption'])[2]/h6") WebElement txtLeaks;
	@FindBy(xpath="//div[@class='wp-ictext wp-ictext--box']/strong") WebElement linkReportedLeak;
	@FindBy(xpath="//div[@class='wp-ictext--status']") WebElement txtInvestigatingReportedLeak;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[1]") WebElement btnContinueToReportLeak;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[2]") WebElement btnInvestigatingReportedLeakIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[2]") WebElement txtInvestigatingReportedLeakIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[2]") WebElement btnInvestigatingReportedLeakIconClose;
	@FindBy(xpath="//a[@data-content='check-your-area']") WebElement tabCheckYourArea;
	@FindBy(xpath="//h4[@class='normal']") WebElement labelLeakFoundIn;
	@FindBy(xpath="//div[@class='leak-status-teaser']") WebElement txtLeakAreaTeaser;
	@FindBy(xpath="(//div[@class='account-form wp-spacing text-center'])[1]/h6[1]") WebElement txtMoreDetails;
	@FindBy(xpath="//p[@class='leak-status-more-details']") WebElement txtMoreDetailsTeaser;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[2]") WebElement btnWhatHappensWhenIReportALeak;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[3]") WebElement btnHowLongDoesItTakeToFixALeak;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[4]") WebElement btnReportAleak;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtFixingLeaks;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtWhoFixesTheLeakInMyHome;
	
	String reportedLeakStreet;
	
	public CheckALeak_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//CheckALeak.properties");
	}

	public void enterRequiredAddress(String address) throws Exception {
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
		Thread.sleep(3000);
		elementVisible(100, txtWaterDisruption);
	}

	public void verifyLeaksSection() throws Exception {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLeaks);
		Assert.assertEquals(true, linkReportedLeak.isDisplayed());
		String[] words = linkReportedLeak.getText().toLowerCase().split(" ");
		String capitalizeWord = "";
		for (String word : words) {
			String first=word.substring(0,1);  
	        String afterfirst=word.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" "; 
		}
		reportedLeakStreet=capitalizeWord.trim();
		Assert.assertEquals(true, txtInvestigatingReportedLeak.getText().contains(c.getData("leaksTeaser")));
		Assert.assertEquals(true, btnContinueToReportLeak.isDisplayed());
	}

	public void verifyInvestigatingReportedLeakIconInformationText() throws Exception {
		btnInvestigatingReportedLeakIcon.click();
		elementVisible(100, txtInvestigatingReportedLeakIcon);
		Assert.assertEquals(true, txtInvestigatingReportedLeakIcon.getText().contains(c.getData("InvestigatingReportedLeakIconInformationText")));
		Thread.sleep(500);
	}

	public void navigateToCheckYourAreaTab() throws Exception {
		btnInvestigatingReportedLeakIconClose.click();
		Thread.sleep(1000);
		elementVisible(100, btnContinueToReportLeak);
		linkReportedLeak.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, tabCheckYourArea);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelLeakFoundIn);
		Assert.assertEquals(true, labelLeakFoundIn.getText().contains("Leak found in "+reportedLeakStreet));
		Assert.assertEquals(true, txtLeakAreaTeaser.getText().contains(c.getData("leakAreaTeaser")));
	}

	public void VerifyMoreDetailsAndUsefulInformationSections() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMoreDetails);
		Assert.assertEquals(true, txtMoreDetailsTeaser.getText().contains(c.getData("moreDetailsTeaser")));
		Assert.assertEquals(true, btnWhatHappensWhenIReportALeak.isDisplayed());
		Assert.assertEquals(true, btnHowLongDoesItTakeToFixALeak.isDisplayed());
		Assert.assertEquals(true, btnReportAleak.isDisplayed());
	}

	public void navigateToFixingLeaksPage() throws Exception {
		btnWhatHappensWhenIReportALeak.click();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, txtFixingLeaks);
		Thread.sleep(500);
		Assert.assertEquals(true, driver.getCurrentUrl().contains("fixing-leaks"));
	}

	public void navigateToWhoFixesTheLeakInMyHomePage() throws Exception {
		driver.close();
		handleMultipleTabs(1);
		elementVisible(100, btnHowLongDoesItTakeToFixALeak);
		btnHowLongDoesItTakeToFixALeak.click();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, txtWhoFixesTheLeakInMyHome);
		Thread.sleep(500);
		Assert.assertEquals(true, driver.getCurrentUrl().contains("fixing-leaks"));
	}

}
