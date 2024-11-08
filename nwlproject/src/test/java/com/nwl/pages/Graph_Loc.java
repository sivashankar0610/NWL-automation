package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Graph_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='usage-break-down-title']/h5") WebElement txtYourUsageBreakdown;
	@FindBy(id="daily") WebElement btnDaily;
	@FindBy(xpath="//span[@class='usage-chart-title']") WebElement txtYourBreakdown;
	@FindBy(xpath="//span[@class='slider round']") WebElement toggleLitresAndPounds;
	@FindBy(xpath="//div[@class='chartDiv daily']/div/div/strong") WebElement txtNoUsageCopyTextForDaily;
	@FindBy(id="weekly") WebElement btnWeekly;
	@FindBy(xpath="//div[@class='chartDiv weekly']/div/div/strong") WebElement txtNoUsageCopyTextForWeekly;
	@FindBy(id="monthly") WebElement btnMonthly;
	@FindBy(xpath="//div[@class='chartDiv monthly']/div/div/strong") WebElement txtNoUsageCopyTextForMonthly;
	@FindBy(id="yearly") WebElement btnYearly;
	
	@FindBy(xpath="(//div[@class='smart-usage-efficiency-message'])[2]") WebElement txtStatus_MyUsage;

	public Graph_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Graph.properties");
	}
	
	public void userInDailyGraph() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			if(toggleLitresAndPounds.isDisplayed()){
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("dailyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
				Assert.assertEquals(true, txtNoUsageCopyTextForDaily.getText().contains(c.getData("noDailyChartDataText")));
			}
		}	
	}
	
	public void clicksOnToggle_Daily() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			if(toggleLitresAndPounds.isDisplayed()){
				toggleLitresAndPounds.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("dailyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
				Assert.assertEquals(true, txtNoUsageCopyTextForDaily.getText().contains(c.getData("noDailyChartDataText")));
			}
		}
	}
	
	public void clicksonWeeklyButton() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
		    btnWeekly.click();
		    Thread.sleep(2000);
			if(toggleLitresAndPounds.isDisplayed()){
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("weeklyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
				Assert.assertEquals(true, txtNoUsageCopyTextForWeekly.getText().contains(c.getData("noWeeklyChartDataText")));
			}
		}	
	}
	
	public void clicksonToggleButton_Weekly() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			if(toggleLitresAndPounds.isDisplayed()){
				toggleLitresAndPounds.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("weeklyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
				Assert.assertEquals(true, txtNoUsageCopyTextForWeekly.getText().contains(c.getData("noWeeklyChartDataText")));
			}
		}
	}
	
	public void clicksonMonthlyButton() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
		    btnMonthly.click();
		    Thread.sleep(2000);
			if(toggleLitresAndPounds.isDisplayed()){
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("monthlyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
				Assert.assertEquals(true, txtNoUsageCopyTextForMonthly.getText().contains(c.getData("noMonthlyChartDataText")));
			}
		}	
	}
	
	public void clicksonToggleButton_Monthly() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			if(toggleLitresAndPounds.isDisplayed()){
				toggleLitresAndPounds.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("monthlyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
				Assert.assertEquals(true, txtNoUsageCopyTextForMonthly.getText().contains(c.getData("noMonthlyChartDataText")));
			}
		}
	}
	
	public void clicksOnYearlyButton() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			if (btnYearly.isEnabled()) {
				btnYearly.click();
				elementVisible(100, toggleLitresAndPounds);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("yearlyChartTitle")));	
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
			}
		}
	}
	
	public void clicksOnToggleButton_Yearly() throws Exception{
		if (!txtStatus_MyUsage.getAttribute("data-usage-efficiency").equalsIgnoreCase(String.valueOf("-1"))) {
			if (btnYearly.isEnabled()) {
				toggleLitresAndPounds.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBreakdown);
				Assert.assertEquals(true, txtYourBreakdown.getText().contains(c.getData("yearlyChartTitle")));
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourUsageBreakdown);
			}
	    }	
	}	

}
