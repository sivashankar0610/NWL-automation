package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class FinancialSupportEligibilityChecker_MayBeEligibleResult_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='check-box-container household'])/div[1]/p[1]") WebElement txtYourHousehold;
	@FindBy(xpath="//input[@name='incomeInsufficient']/following-sibling::span") WebElement btnMyHouseholdIncomeIsNotEnough;
	@FindBy(xpath="(//div[@class='check-box-container benefits'])/div[1]/p") WebElement txtBenefitsAndFinancialSupport;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-submit btn-check-eligibility']") WebElement btnCheckMyEligibility;
	@FindBy(xpath="(//div[@class='financial-eligibility-result-container'])[2]/div/h4") WebElement txtYouMayBeEligibleForFinancialSupport;
    @FindBy(xpath="(//div[@class='financial-eligibility-result-container'])[2]/div[2]/p") WebElement txtConfirmationScreenTeaser;
    @FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card debt-advice']/div[1]") WebElement txtReducedBill;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card debt-advice']/div[2]/p") WebElement txtReducedBillTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card debt-advice']/div[3]/a") WebElement btnFindOutMore_RB;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-meter']/div[1]") WebElement txtGetAWaterMeter;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-meter']/div[2]/p") WebElement txtGetAWaterMeterTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-meter']/div[3]/a") WebElement btnSaveOnAMeter_GWM;
	@FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtReducedBill1;
	@FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtApplyForAWaterMeter;
	
	public FinancialSupportEligibilityChecker_MayBeEligibleResult_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//FinancialSupportEligibilityChecker_MayBeEligibleResult.properties");
	}

	public void selectOptionsForYourHouseholdField() throws Exception {
		btnMyHouseholdIncomeIsNotEnough.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourHousehold);
	}

	public void doesNotSelectsAnyOptionForBenefitsFinancialSupportField() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBenefitsAndFinancialSupport);
		Thread.sleep(500);
	}

	public void redirectedToMayBeEligibleResultsScreen() throws Exception {
		btnCheckMyEligibility.click();
		elementVisible(100, txtYouMayBeEligibleForFinancialSupport);
		Assert.assertEquals(true, txtConfirmationScreenTeaser.getText().contains(c.getData("confirmationScreenTeaser")));
	}

	public void verifyWeRecommendSpeakingToADebtAdviceOrganisationSection() throws Exception {
		Assert.assertEquals(true, txtReducedBillTeaser.getText().contains(c.getData("reducedBillTeaser")));
		Assert.assertEquals(true, btnFindOutMore_RB.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtReducedBill);
	}

	public void verifyGetAWaterMeterSection() throws Exception {
		Assert.assertEquals(true, txtGetAWaterMeterTeaser.getText().contains(c.getData("getAWaterMeterTeaser")));
		Assert.assertEquals(true, btnSaveOnAMeter_GWM.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGetAWaterMeter);
	}

	public void redirectedToDebtAdviceAndSupportOrganisationsPage() throws Exception {
		btnFindOutMore_RB.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtReducedBill1);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("reducedBillNavigationURL")));
	}

	public void redirectedToApplyForAWaterMeterPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnSaveOnAMeter_GWM);
		btnSaveOnAMeter_GWM.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtApplyForAWaterMeter);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("SaveOnAMeterNavigationURL")));
	}

}
