package com.nwl.pages;

import java.text.DecimalFormat;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;
import io.cucumber.datatable.DataTable;

public class WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='form-row wp-select-households']/div/div") WebElement dropdownPleaseSelect;
    @FindBy(xpath="//div[@class='form-row wp-select-households']/div/div/div/div/span") List<WebElement> btnOccupancyOptions;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block update-number-occupiers-btn']") WebElement btnUpdateDetails;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-am-i-better-off']") WebElement btnCanYouSaveMoneyOnAWaterMeter;
	@FindBy(xpath="//div[@class='wp-usage-box wp-usage-households']/div/div[4]") WebElement txtInWeekHowOftenDoesYourHousehold;
	@FindBy(id="flush-toilet") WebElement txtFlushTheToilet;
	@FindBy(id="bath") WebElement txtTakeABath;
	@FindBy(id="shower") WebElement txtHaveAShower;
	@FindBy(id="washing-machine") WebElement txtUseTheWashingMachine;
	@FindBy(id="sink") WebElement txtFillTheKitchenSink;
	@FindBy(id="dishwasher") WebElement txtUseTheDishWasher;
	@FindBy(id="hose") WebElement txtUseAGardenHose;
	@FindBy(xpath="(//p[@class='font-18'])[3]") WebElement txtReadyForYourResults;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block calculate-usage-btn']") WebElement btnEstimateMyBill;
	@FindBy(xpath="//input[@class='calculatorParameter_NoOfOccupiersLitresPerUse']") WebElement txtNoOfOccupiersLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_ToiletLitresPerUse']") WebElement txtToiletLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_BathLitresPerUse']") WebElement txtBathLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_ShowerLitresPerUse']") WebElement txtShowerLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_WashingMachineLitresPerUse']") WebElement txtWashingMachineLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_SinkLitresPerUse']") WebElement txtSinkLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_DishwasherLitresPerUse']") WebElement txtDishWasherLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_SprinklerLitresPerUse']") WebElement txtSprinklerLitresPerUse;
	@FindBy(xpath="//input[@class='calculatorParameter_NwlWaterFixedCharge']") WebElement txtNwlWaterFixedCharge;
	@FindBy(xpath="//input[@class='calculatorParameter_NwlSewerageFixedCharge']") WebElement txtNwlSewerageFixedCharge;
	@FindBy(xpath="//input[@class='calculatorParameter_NwlWaterVolumeCharge']") WebElement txtNwlWaterVolumeCharge;
	@FindBy(xpath="//input[@class='calculatorParameter_NwlSewerageVolumeCharge']") WebElement txtNwlSewerageVolumeCharge;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[36]") WebElement btnYourEstimatedUsageInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[34]") WebElement txtYourEstimatedUsageInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[36]") WebElement btnYourEstimatedUsageInfoIconClose;
	@FindBy(xpath="//h2[@class='usage-dvt estimated-volume']") WebElement txtYourEstimatedUsage;
	@FindBy(xpath="//h2[@class='usage-dvt estimated-bill']") WebElement txtYourEstimatedAnnualBill;
	@FindBy(xpath="//h2[@class='usage-dvt estimated-bill']//following-sibling::p") WebElement txtYourEstimatedUsageTeaser;
	@FindBy(xpath="//div[@class='sub-title better-off']") WebElement txtGoodNews;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block better-off maybe-better-off']") WebElement btnApplyForAMeter;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block better-off maybe-better-off']/following-sibling::a[2]") WebElement linkHowCanIUseLessWater;
	@FindBy(xpath="//li[@rel='home']") WebElement tabWaterMeterAndUsage;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-request-a-water-meter']") WebElement btnApplyForWaterMeter;
	
	String occupancyCount, input_Toilet, input_Bath, input_Shower, input_WashingMachine, input_Sink, input_DishWasher, input_GardenHose;
	
	public WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter.properties");
	}

	public void enterOccupancyCount(String occupancy) throws Exception {
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

	public void fillsYourHouseholdFields(DataTable table) throws Exception {
		List<List<String>> data = table.cells();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtInWeekHowOftenDoesYourHousehold);
		input_Toilet=data.get(1).get(1);
		txtFlushTheToilet.sendKeys(input_Toilet);
		input_Bath=data.get(2).get(1);
		txtTakeABath.sendKeys(input_Bath);
		input_Shower=data.get(3).get(1);
		txtHaveAShower.sendKeys(input_Shower);
		input_WashingMachine=data.get(4).get(1);
		txtUseTheWashingMachine.sendKeys(input_WashingMachine);
		input_Sink=data.get(5).get(1);
		txtFillTheKitchenSink.sendKeys(input_Sink);
		input_DishWasher=data.get(6).get(1);
		txtUseTheDishWasher.sendKeys(input_DishWasher);
		input_GardenHose=data.get(7).get(1);
		txtUseAGardenHose.sendKeys(input_GardenHose);
		Assert.assertEquals(true, txtReadyForYourResults.getText().contains(c.getData("CanYouSaveMoneyOnMeterTeaser")));
		Assert.assertEquals(true, btnEstimateMyBill.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtInWeekHowOftenDoesYourHousehold);
	}

	public void displayYourEstimatedUsageSection() throws Exception {
		btnEstimateMyBill.click();
		elementVisible(100, btnYourEstimatedUsageInfoIcon);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnYourEstimatedUsageInfoIcon);
		btnYourEstimatedUsageInfoIcon.click();
		elementVisible(100, txtYourEstimatedUsageInfoIcon);
		Assert.assertEquals(true, txtYourEstimatedUsageInfoIcon.getText().contains(c.getData("yourEstimatedUsageInformationText")));
		Thread.sleep(500);
		btnYourEstimatedUsageInfoIconClose.click();
		Thread.sleep(500);
		int occupancyValue = Integer.parseInt(occupancyCount)*Integer.parseInt(txtNoOfOccupiersLitresPerUse.getAttribute("value"));
		int ToiletValue = Integer.parseInt(input_Toilet)*Integer.parseInt(txtToiletLitresPerUse.getAttribute("value"));
		int BathValue = Integer.parseInt(input_Bath)*Integer.parseInt(txtBathLitresPerUse.getAttribute("value"));
		int ShowerValue = Integer.parseInt(input_Shower)*Integer.parseInt(txtShowerLitresPerUse.getAttribute("value"));
		int WashingMachineValue = Integer.parseInt(input_WashingMachine)*Integer.parseInt(txtWashingMachineLitresPerUse.getAttribute("value"));
		int SinkValue = Integer.parseInt(input_Sink)*Integer.parseInt(txtSinkLitresPerUse.getAttribute("value"));
		int DishWasherValue = Integer.parseInt(input_DishWasher)*Integer.parseInt(txtDishWasherLitresPerUse.getAttribute("value"));
		int HoseValue = Integer.parseInt(input_GardenHose)*Integer.parseInt(txtSprinklerLitresPerUse.getAttribute("value"));
		double additionValue = occupancyValue+ToiletValue+BathValue+ShowerValue+WashingMachineValue+SinkValue+DishWasherValue+HoseValue;
		long totalValue = Math.round((additionValue*52)/1000);
		String estimatedUsage = Long.toString(totalValue);
		Assert.assertEquals(true, txtYourEstimatedUsage.getText().equalsIgnoreCase(estimatedUsage+"m3"));
		double waterFixedValue = Double.parseDouble(txtNwlWaterFixedCharge.getAttribute("value"));
		double sewerageFixedValue = Double.parseDouble(txtNwlSewerageFixedCharge.getAttribute("value"));
		double waterVolumeValue = Double.parseDouble(txtNwlWaterVolumeCharge.getAttribute("value"))*totalValue;
		double sewerageVolumeValue = Double.parseDouble(txtNwlSewerageVolumeCharge.getAttribute("value"))*totalValue;
		double totalBill = waterFixedValue+sewerageFixedValue+waterVolumeValue+sewerageVolumeValue;
		DecimalFormat f = new DecimalFormat("##.00");
		String estimatedAnnualBill = f.format(totalBill);
		Assert.assertEquals(true, txtYourEstimatedAnnualBill.getText().equalsIgnoreCase("£"+estimatedAnnualBill));
		Assert.assertEquals(true, txtYourEstimatedUsageTeaser.getText().contains(c.getData("yourEstimatedUsageTeaser")));
		Assert.assertEquals(true, txtGoodNews.getText().contains(c.getData("ApplyForMeterLabel")));
		Assert.assertEquals(true, btnApplyForAMeter.isDisplayed());
		Assert.assertEquals(true, linkHowCanIUseLessWater.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnYourEstimatedUsageInfoIcon);
	}

	public void redirectedToApplyForWaterMeter() throws Exception {
		btnApplyForAMeter.click();
		elementVisible(100, tabWaterMeterAndUsage);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabWaterMeterAndUsage);
		Assert.assertEquals(true, btnApplyForWaterMeter.isEnabled());
	}

}
