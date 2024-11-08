package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Transunion_ForMe_SinglePensionCredit_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='your-finances-form-section']/div/p") WebElement txtPensionCreditLabel;
	@FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[1]") WebElement btnPensionCredit_Yes;
	@FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[2]") WebElement btnPensionCredit_No;
	@FindBy(xpath="//div[@class='form-row for-me-or-someone']/div/p") WebElement txtFirstSomeDetailsAboutYou;
	@FindBy(xpath="//div[@class='form-row for-me-or-someone']/div[2]/div[1]/button") WebElement btnForMe;
	@FindBy(xpath="//div[@class='form-row for-me-or-someone']/div[2]/div[2]/button") WebElement btnForSomeoneElse;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[10]") WebElement btnSingleOrJointPensionCreditInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[10]") WebElement txtSingleOrJointPensionCreditInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[10]") WebElement btnSingleOrJointPensionCreditInfoIconClose;
    @FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[3]") WebElement btnSingle;
    @FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[4]") WebElement btnJoint;
    @FindBy(xpath="//div[@class='finance-details']/div[2]/div") WebElement txtYourIncomeAndHousingCosts;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[12]") WebElement btnRentMortgagePaymentsInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[12]") WebElement txtRentMortgagePaymentsInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[12]") WebElement btnRentMortgagePaymentsInfoIconClose;
    @FindBy(id="benefits-income") WebElement txtRentMortgagePayments;
    @FindBy(xpath="//div[@class='form-group benefit-income-frequency']/div") WebElement dropdownRentMortgagePayments;
    @FindBy(xpath="//div[@class='form-group benefit-income-frequency']/div/div/div/span") List<WebElement> dropdownRentMortgagePaymentsOptions;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[14]") WebElement btnHousingBenefitEntitlementInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[14]") WebElement txtHousingBenefitEntitlementInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[14]") WebElement btnHousingBenefitEntitlementInfoIconClose;
    @FindBy(id="expense-income") WebElement txtHousingBenefitEntitlement;
    @FindBy(xpath="//div[@class='form-group expense-amount-frequency']/div") WebElement dropdownHousingBenefitEntitlement;
    @FindBy(xpath="//div[@class='form-group expense-amount-frequency']/div/div/div/span") List<WebElement> dropdownHousingBenefitEntitlementOptions;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block btnFinancesDetails']") WebElement btnNext;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline go-back'])[1]") WebElement btnGoBack;
	@FindBy(xpath="//div[@class='eligible-for-discount-pension-credit']/h5") WebElement txtMayBeEligibeForADiscountOnYourBill;
	@FindBy(xpath="//div[@class='eligible-for-discount-pension-credit']/div[1]/p") WebElement txtWeHaveReceivedYourRequest;
	@FindBy(xpath="(//p[@class='confirmation-number'])[1]") WebElement txtConfirmationNumber;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btnBackToAccount'])[1]") WebElement btnBackToMyAccount;
    @FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
    
    @FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
    @FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
    @FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch1;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	
	String confirmationNo;

	public Transunion_ForMe_SinglePensionCredit_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Transunion_ForMe_SinglePensionCredit.properties");
	}

	public void selectsPensionCreditAsYes() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPensionCreditLabel);
		Assert.assertEquals(true, txtPensionCreditLabel.getText().contains(c.getData("pensionCreditLabel")));
		Assert.assertEquals(true, btnPensionCredit_Yes.isDisplayed());
		Assert.assertEquals(true, btnPensionCredit_No.isDisplayed());
		Thread.sleep(500);
		btnPensionCredit_Yes.click();
		Thread.sleep(500);
	}

	public void selectsForMeAndSinglePensionCreditButtons() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFirstSomeDetailsAboutYou);
		Assert.assertEquals(true, btnForMe.isDisplayed());
		Assert.assertEquals(true, btnForSomeoneElse.isDisplayed());
		btnForMe.click();
		Thread.sleep(1000);
		btnSingleOrJointPensionCreditInfoIcon.click();
		elementVisible(100, txtSingleOrJointPensionCreditInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtSingleOrJointPensionCreditInfoIcon.getText().contains(c.getData("singleOrJointPensionCreditInformationText")));
		Thread.sleep(500);
		btnSingleOrJointPensionCreditInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSingle.isDisplayed());
		Assert.assertEquals(true, btnJoint.isDisplayed());
		btnSingle.click();
		Thread.sleep(500);
	}

	public void fillsYourIncomeAndHousingCosts(String income, String rent, String frequency) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourIncomeAndHousingCosts);
		btnRentMortgagePaymentsInfoIcon.click();
		elementVisible(100, txtRentMortgagePaymentsInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRentMortgagePaymentsInfoIcon.getText().contains(c.getData("rentMortgagePaymentsInformationText")));
		Thread.sleep(500);
		btnRentMortgagePaymentsInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtRentMortgagePayments.isDisplayed());
		txtRentMortgagePayments.sendKeys(income);
		dropdownRentMortgagePayments.click();
		Thread.sleep(2000);
		for (WebElement option : dropdownRentMortgagePaymentsOptions) {
			if(option.getText().contains(frequency)){
				option.click();
				break;
			}
		}
		Thread.sleep(500);
		btnHousingBenefitEntitlementInfoIcon.click();
		elementVisible(100, txtHousingBenefitEntitlementInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtHousingBenefitEntitlementInfoIcon.getText().contains(c.getData("housingBenefitEntitlementInformationText")));
		Thread.sleep(500);
		btnHousingBenefitEntitlementInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtHousingBenefitEntitlement.isDisplayed());
		txtHousingBenefitEntitlement.sendKeys(rent);
		dropdownHousingBenefitEntitlement.click();
		Thread.sleep(2000);
		for (WebElement option : dropdownHousingBenefitEntitlementOptions) {
			if(option.getText().contains(frequency)){
				option.click();
				break;
			}
		}
		Thread.sleep(500);
		Assert.assertEquals(true, btnNext.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourIncomeAndHousingCosts);
	}

	public void redirectedToMayBeEligibleForADiscountOnYourBillPage() throws Exception {
		btnNext.click();
		elementVisible(100, txtMayBeEligibeForADiscountOnYourBill);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMayBeEligibeForADiscountOnYourBill);
		Assert.assertEquals(true, txtWeHaveReceivedYourRequest.getText().contains(c.getData("discountOnYourBillTeaser")));
		confirmationNo=txtConfirmationNumber.getText();
		System.out.println(confirmationNo);
		Assert.assertEquals(true, btnBackToMyAccount.isDisplayed());
	}

	public void redirectedToAccountDashboard() throws Exception {
		btnBackToMyAccount.click();
		elementVisible(100, tabAccountDashboard);
		Thread.sleep(2000);
	}

	public void verifyBusinessProcessInfoInCCB(String ccbUsername, String ccbPwd) throws Exception {
       //((JavascriptExecutor) driver).executeScript("window.open('https://tst01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBCustomerInformation);
		btnCCBCustomerInformation.click();
		elementVisible(100, btnCCBCustomerContact);
		btnCCBCustomerContact.click();
		elementVisible(100, btnCCBSearch1);
		btnCCBSearch1.click();
		Thread.sleep(3000);
		handleMultipleTabs(2);
		txtCCBCustomerContactID.sendKeys(confirmationNo);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCharacteristics);
		tabCharacteristics.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		btnCCBMenuSymbol1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
		Thread.sleep(2000);
	}

}
