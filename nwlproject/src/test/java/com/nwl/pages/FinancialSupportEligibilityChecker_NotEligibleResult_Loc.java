package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class FinancialSupportEligibilityChecker_NotEligibleResult_Loc extends BasePage {
	
	@FindBy(xpath="(//div[@class='check-box-container household'])/div[1]/p[1]") WebElement txtYourHousehold;
    @FindBy(xpath="//input[@name='waterMeter']/following-sibling::span") WebElement btnIHaveAWaterMeter;
    @FindBy(xpath="(//div[@class='check-box-container benefits'])/div[1]/p") WebElement txtBenefitsAndFinancialSupport;
    @FindBy(xpath="//input[@name='jobseekersAllowance']/following-sibling::span") WebElement btnIncomeBasedJobseekersAllowance;
    @FindBy(xpath="//div[@class='check-box-container water-bill-payment']/div[1]") WebElement txtWaterBillPayments;
    @FindBy(xpath="//a[@class='tooltip-btn']") WebElement btnWaterBillPaymentsInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtWaterBillPaymentsInfoIcon;
    @FindBy(xpath="//a[@class='tooltip-close']") WebElement btnWaterBillPaymentsInfoIconClose;
    @FindBy(xpath="(//input[@name='behindWaterBill'])[2]//following-sibling::span") WebElement btnNo;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-submit btn-check-eligibility']") WebElement btnCheckMyEligibility;
    @FindBy(xpath="(//div[@class='financial-eligibility-result-container'])[3]/div/h4") WebElement txtHereAreSomeWaysWeCanHelp;
    @FindBy(xpath="(//div[@class='financial-eligibility-result-container'])[3]/div[2]/p") WebElement txtConfirmationScreenTeaser;
    @FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card more-time-to-pay']/div[1]") WebElement txtGetMoreTimeToPay;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card more-time-to-pay']/div[2]/p") WebElement txtGetMoreTimeToPayTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card more-time-to-pay']/div[4]/a") WebElement btnRequestAPaymentBreak_GMTTP;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card more-time-to-pay']/div[3]/a") WebElement btnSetupPaymentPlan_GMTTP;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card benefits-entitled']/div[1]") WebElement txtCheckWhatBenefitsYouMightBeEntitledTo;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card benefits-entitled']/div[2]/p") WebElement txtCheckWhatBenefitsYouMightBeEntitledToTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card benefits-entitled']/div[3]/a") WebElement btnTryTheCalculator_CWBYMBET;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card talk-to-us']/div[1]") WebElement txtTalkToUs;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card talk-to-us']/div[2]/div[1]/p[1]") WebElement txtTalkToUsTeaser1;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card talk-to-us']/div[2]/div[1]/p[3]") WebElement txtTalkToUsTeaser2;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card talk-to-us']/div[2]/div[1]/a") WebElement LinkSendUsAMessageOnMessenger_TTU;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card talk-to-us']/div[2]/div[3]/a") WebElement LinkEmailUs_TTU;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-saving-tips']/div[2]/p") WebElement txtWaterSavingTipsTeaser;
	@FindBy(xpath="//div[@class='account__box bg__box text-center financial-result-card water-saving-tips']/div[3]/a") WebElement btnReadOurWaterSavingTips;
    @FindBy(xpath="//a[@class='nb-btn nb-btn-block btn-back-to-financial']") WebElement btnBackToFinancialSupport;
    @FindBy(xpath="//h1[@class='title qheader']") WebElement txtApplyForAPaymentBreak;
    @FindBy(xpath="//li[@class='owl-dot active']") WebElement txtAccountDashboard;
    @FindBy(xpath="//div[@class='breadcrumb-base']//following-sibling::h1") WebElement txtBenefitsCalculator;
    @FindBy(xpath="//div[@class='account-form wp-spacing']/div/h4") WebElement txtEmailUs;
    
	public FinancialSupportEligibilityChecker_NotEligibleResult_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//FinancialSupportEligibilityChecker_NotEligibleResult.properties");
	}
	
	public void selectsOptionsForYourHouseholdField() throws Exception {
		btnIHaveAWaterMeter.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourHousehold);
	}

	public void selectsOptionsForBenefitsFinancialSupportField() throws Exception {
		btnIncomeBasedJobseekersAllowance.click();
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
		btnNo.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterBillPayments);
	}
	
	public void redirectedToNotEligibleResultsScreen() throws Exception {
		btnCheckMyEligibility.click();
		elementVisible(100, txtHereAreSomeWaysWeCanHelp);
		Assert.assertEquals(true, txtConfirmationScreenTeaser.getText().contains(c.getData("confirmationScreenTeaser")));
	}
	
	public void verifyGetMoreTimeToPayAndCheckWhatBenefitsYouMightBeEntitledToSections() throws Exception {
		Assert.assertEquals(true, txtGetMoreTimeToPayTeaser.getText().contains(c.getData("getMoreTimeToPayTeaser")));
		Assert.assertEquals(true, btnRequestAPaymentBreak_GMTTP.isDisplayed());
		Assert.assertEquals(true, btnSetupPaymentPlan_GMTTP.isDisplayed());
		Assert.assertEquals(true, txtCheckWhatBenefitsYouMightBeEntitledToTeaser.getText().contains(c.getData("checkWhatBenefitsYouMightBeEntitledToTeaser")));
		Assert.assertEquals(true, btnTryTheCalculator_CWBYMBET.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGetMoreTimeToPay);
	}
	
	public void verifyTalkToUsAndWaterSavingTipsSections() throws Exception {
		Assert.assertEquals(true, txtTalkToUsTeaser1.getText().contains(c.getData("talkToUsTeaser1")));
		Assert.assertEquals(true, txtTalkToUsTeaser2.getText().contains(c.getData("talkToUsTeaser2")));
		Assert.assertEquals(true, LinkSendUsAMessageOnMessenger_TTU.isDisplayed());
		Assert.assertEquals(true, LinkEmailUs_TTU.isDisplayed());
		Assert.assertEquals(true, txtWaterSavingTipsTeaser.getText().contains(c.getData("waterSavingTipsTeaser")));
		Assert.assertEquals(true, btnReadOurWaterSavingTips.isDisplayed());
		Assert.assertEquals(true, btnBackToFinancialSupport.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtTalkToUs);
	}
	
	public void redirectedToApplyForAPaymentBreakPage() throws Exception {
		btnRequestAPaymentBreak_GMTTP.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtApplyForAPaymentBreak);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("requestAPaymentBreakButtonNavigationURL")));
	}
	
	public void redirectedToAccountDashboard() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnSetupPaymentPlan_GMTTP);
		btnSetupPaymentPlan_GMTTP.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtAccountDashboard);
	}
	
	public void redirectedToBenefitsCalculatorPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnTryTheCalculator_CWBYMBET);
		btnTryTheCalculator_CWBYMBET.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtBenefitsCalculator);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("TryTheCalculatorNavigationURL")));
	}
	
	public void redirectedToMessengerPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, LinkSendUsAMessageOnMessenger_TTU);
		LinkSendUsAMessageOnMessenger_TTU.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
	}
	
	public void redirectedToEmailUsPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, LinkEmailUs_TTU);
		LinkEmailUs_TTU.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		//driver.findElement(By.xpath("//div[@class='close-icon nb-btn']")).click();
		Thread.sleep(500);
		elementVisible(100, txtEmailUs);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("emailUsLinkNavigationURL")));
	}

}
