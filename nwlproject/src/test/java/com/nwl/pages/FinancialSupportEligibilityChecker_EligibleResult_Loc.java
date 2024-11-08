package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class FinancialSupportEligibilityChecker_EligibleResult_Loc extends BasePage {
	
	@FindBy(xpath="//nav[@id='loginedMenu']/ul/li[1]") WebElement linkServices;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[3]/li[3]/a") WebElement linkExtraSupport;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[3]/li[3]/ul/li[2]/a") WebElement linkFinancialSupport;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtFinancialSupport;
	@FindBy(xpath="//h2[@class='jumbotron']") WebElement txtEligibilityChecker;
	@FindBy(xpath="//div[@class='featured__content']/p") WebElement txtEligibilityCheckerTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-inline']") WebElement btnEligibilityChecker;
	@FindBy(xpath="//div[@class='financial-eligibility-checker-form-container']/div/h4") WebElement txtFSEChecker;
	@FindBy(xpath="//div[@class='financial-eligibility-checker-form-container']/div[1]") WebElement txtFSECheckerTeaser;
    @FindBy(xpath="(//div[@class='check-box-container household'])/div[1]/p[1]") WebElement txtYourHousehold;
	@FindBy(xpath="//input[@name='lesshouseholdIncome']/following-sibling::span") WebElement btnMyHouseholdIncomeIsLessThan;
    @FindBy(xpath="//input[@name='numberofChildren']/following-sibling::span") WebElement btnIHave3OrMoreChildren;
    @FindBy(xpath="//input[@name='medicalCondition']/following-sibling::span") WebElement btnmedicalCondition;
    @FindBy(xpath="//input[@name='incomeInsufficient']/following-sibling::span") WebElement btnMyHouseholdIncomeIsNotEnough;
    @FindBy(xpath="//input[@name='waterMeter']/following-sibling::span") WebElement btnIHaveAWaterMeter;
    @FindBy(xpath="(//div[@class='check-box-container benefits'])/div[1]/p") WebElement txtBenefitsAndFinancialSupport;
    @FindBy(xpath="//input[@name='incomeSupport']/following-sibling::span") WebElement btnIncomeSupport;
    @FindBy(xpath="//input[@name='jobseekersAllowance']/following-sibling::span") WebElement btnIncomeBasedJobseekersAllowance;
    @FindBy(xpath="//input[@name='supportAllowance']/following-sibling::span") WebElement btnIncomeBasedEmploymentAndSupportAllowance;
    @FindBy(xpath="//input[@name='pensionCredit']/following-sibling::span") WebElement btnPensionCredit;
    @FindBy(xpath="//input[@name='universalCredit']/following-sibling::span") WebElement btnUniversalCredit;
    @FindBy(xpath="//input[@name='workingTaxCredit']/following-sibling::span") WebElement btnWorkingTaxCredit;
    @FindBy(xpath="//input[@name='childTaxCredit']/following-sibling::span") WebElement btnChildTaxCredit;
    @FindBy(xpath="//input[@name='housingBenefit']/following-sibling::span") WebElement btnHousingBenefit;
    @FindBy(xpath="//div[@class='check-box-container water-bill-payment']/div[1]") WebElement txtWaterBillPayments;
    @FindBy(xpath="//a[@class='tooltip-btn']") WebElement btnWaterBillPaymentsInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtWaterBillPaymentsInfoIcon;
    @FindBy(xpath="//a[@class='tooltip-close']") WebElement btnWaterBillPaymentsInfoIconClose;
    @FindBy(xpath="(//input[@name='behindWaterBill'])[1]//following-sibling::span") WebElement btnYes;
    @FindBy(xpath="(//input[@name='behindWaterBill'])[2]//following-sibling::span") WebElement btnNo;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-submit btn-check-eligibility']") WebElement btnCheckMyEligibility;
	@FindBy(xpath="(//label[@class='chk-button nb-btn-error'])[1]") WebElement btnYes_Error;
	@FindBy(xpath="(//label[@class='chk-button nb-btn-error'])[2]") WebElement btnNo_Error;
	@FindBy(xpath="(//div[@class='financial-eligibility-result-container'])[1]/div/h4") WebElement txtYouMayBeEligibleForFinancialSupport;
    @FindBy(xpath="(//div[@class='financial-eligibility-result-container'])[1]/div[2]/p") WebElement txtConfirmationScreenTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card support-plus']/div[1]") WebElement txtLowIncomeDiscount;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card support-plus']/div[2]/p") WebElement txtLowIncomeDiscountTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card support-plus']/div[3]/a") WebElement btnApplyOnline_LID;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-sure']/div[2]/p") WebElement txtWaterSureTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-sure']/div[3]/a") WebElement btnFindOutMore_WS;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-direct']/div[1]") WebElement txtWaterDirect;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-direct']/div[2]/p") WebElement txtWaterDirectTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-direct']/div[3]/a") WebElement btnFindOutMore_WD;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-saving-tips']/div[2]/p") WebElement txtWaterSavingTipsTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-saving-tips']/div[3]/a") WebElement btnReadOurWaterSavingTips;
    @FindBy(xpath="//a[@class='nb-btn nb-btn-block btn-back-to-financial']") WebElement btnBackToFinancialSupport;
    @FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtLowIncomeDiscount2;
    @FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtBillCapScheme_WS;
    @FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtWaterDirect2;
    @FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtSaveWater;
    
	public FinancialSupportEligibilityChecker_EligibleResult_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//FinancialSupportEligibilityChecker_EligibleResult.properties");
	}
	
	public void redirectedToFinancialSupportPage() throws Exception {
		elementVisible(100, linkServices);
		Thread.sleep(2000);
		linkServices.click();
		elementVisible(100, linkExtraSupport);
		linkExtraSupport.click();
		Thread.sleep(1000);
		elementVisible(100, linkFinancialSupport);
		linkFinancialSupport.click();
		elementVisible(100, txtFinancialSupport);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEligibilityChecker);
		Assert.assertEquals(true, txtEligibilityCheckerTeaser.getText().contains(c.getData("eligibilityCheckerTeaser")));
		Assert.assertEquals(true, btnEligibilityChecker.isDisplayed());
	}

	public void redirectedToFinancialSupportEligibilityCheckerPage() throws Exception {
		btnEligibilityChecker.click();
		elementVisible(100, txtFSEChecker);
		String[] FSECheckerTeaser = txtFSECheckerTeaser.getText().split("\n");
		Assert.assertEquals(FSECheckerTeaser[1], c.getData("FSECheckerTeaser"));
		Assert.assertEquals(true, btnMyHouseholdIncomeIsLessThan.isDisplayed());
		Assert.assertEquals(true, btnIHave3OrMoreChildren.isDisplayed());
		Assert.assertEquals(true, btnmedicalCondition.isDisplayed());
		Assert.assertEquals(true, btnMyHouseholdIncomeIsNotEnough.isDisplayed());
		Assert.assertEquals(true, btnIHaveAWaterMeter.isDisplayed());
		Assert.assertEquals(true, btnIncomeSupport.isDisplayed());
		Assert.assertEquals(true, btnIncomeBasedJobseekersAllowance.isDisplayed());
		Assert.assertEquals(true, btnIncomeBasedEmploymentAndSupportAllowance.isDisplayed());
		Assert.assertEquals(true, btnPensionCredit.isDisplayed());
		Assert.assertEquals(true, btnUniversalCredit.isDisplayed());
		Assert.assertEquals(true, btnWorkingTaxCredit.isDisplayed());
		Assert.assertEquals(true, btnChildTaxCredit.isDisplayed());
		Assert.assertEquals(true, btnHousingBenefit.isDisplayed());
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		Assert.assertEquals(true, btnCheckMyEligibility.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFSEChecker);
	}

	public void clicksOnCheckMyEligibilityButtonWithoutSelectingAnyOption() {
		btnCheckMyEligibility.click();
		elementVisible(100, btnYes_Error);
		Assert.assertEquals(true, btnYes_Error.isDisplayed());
		Assert.assertEquals(true, btnNo_Error.isDisplayed());
	}

	public void selectsOptionsForYourHouseholdField() throws Exception {
		btnIHave3OrMoreChildren.click();
		Thread.sleep(500);
		btnIHaveAWaterMeter.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourHousehold);
	}

	public void selectsOptionsForBenefitsFinancialSupportField() throws Exception {
		btnPensionCredit.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBenefitsAndFinancialSupport);
	}

	public void selectsOptionsForWaterBillPaymentsField() throws Exception {
		btnWaterBillPaymentsInfoIcon.click();
		elementVisible(100, txtWaterBillPaymentsInfoIcon);
		Assert.assertEquals(txtWaterBillPaymentsInfoIcon.getText(), c.getData("waterBillPaymentsInformationText"));
		Thread.sleep(500);
		btnWaterBillPaymentsInfoIconClose.click();
		Thread.sleep(500);
		btnYes.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterBillPayments);
	}

	public void redirectedToEligibleResultsScreen() throws Exception {
		btnCheckMyEligibility.click();
		elementVisible(100, txtYouMayBeEligibleForFinancialSupport);
		Assert.assertEquals(txtConfirmationScreenTeaser.getText(), c.getData("confirmationScreenTeaser"));
	}

	public void verifyLowIncomeDiscountAndWaterSureSections() throws Exception {
		Assert.assertEquals(true, txtLowIncomeDiscountTeaser.getText().contains(c.getData("lowIncomeDiscountTeaser")));
		Assert.assertEquals(true, btnApplyOnline_LID.isDisplayed());
		Assert.assertEquals(true, txtWaterSureTeaser.getText().contains(c.getData("waterSureTeaser")));
		Assert.assertEquals(true, btnFindOutMore_WS.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLowIncomeDiscount);
	}

	public void verifyWaterDirectAndWaterSavingTipsSections() throws Exception {
		Assert.assertEquals(true, txtWaterDirectTeaser.getText().contains(c.getData("waterDirectTeaser")));
		Assert.assertEquals(true, btnFindOutMore_WD.isDisplayed());
		Assert.assertEquals(true, txtWaterSavingTipsTeaser.getText().contains(c.getData("waterSavingTipsTeaser")));
		Assert.assertEquals(true, btnReadOurWaterSavingTips.isDisplayed());
		Assert.assertEquals(true, btnBackToFinancialSupport.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterDirect);
	}

	public void redirectedToLowIncomeDiscountPage() throws Exception {
		btnApplyOnline_LID.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtLowIncomeDiscount2);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("lowIncomeDiscountNavigationURL")));
	}

	public void redirectedToBillCapScheme_WaterSurePage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnFindOutMore_WS);
		btnFindOutMore_WS.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtBillCapScheme_WS);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("waterSureNavigationURL")));
	}

	public void redirectedToWaterDirectPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnFindOutMore_WD);
		btnFindOutMore_WD.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtWaterDirect2);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("waterDirectNavigationURL")));
	}

	public void redirectedToSaveWaterPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnReadOurWaterSavingTips);
		btnReadOurWaterSavingTips.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtSaveWater);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("waterSavingTipsNavigationURL")));
	}

	public void redirectedToFSECheckerPage() {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnBackToFinancialSupport);
		btnBackToFinancialSupport.click();
		elementVisible(100, txtFSEChecker);
	}

}
