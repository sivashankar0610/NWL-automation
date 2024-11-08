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

public class Transunion_HouseholdRagStatus_GreenOrAmber_Loc extends BasePage {
	
	@FindBy(xpath="//p[@class='cl-eligibility-checker']") WebElement txtIsYourHouseholdIncome;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block btn-try-our-eligibility-checker']") WebElement btnTryOurEligibilityChecker;
    @FindBy(xpath="//div[@class='bill-eligible-content-area']/h4") WebElement txtDiscountOnYourBill;
    @FindBy(xpath="//div[@class='bill-eligible-content-area']/div[1]/p") WebElement txtDiscountOnYourBillTeaser1;
    @FindBy(xpath="//div[@class='bill-eligible-content-area']/div[2]/p[1]") WebElement txtDiscountOnYourBillTeaser2;
    @FindBy(xpath="//div[@class='bill-eligible-content-area']/div[2]/p[3]") WebElement txtDiscountOnYourBillTeaser3;
    @FindBy(xpath="//div[@class='bill-eligible-content-area']/div[2]/p[5]") WebElement txtDiscountOnYourBillTeaser4;
    @FindBy(xpath="//div[@class='bill-eligible-content-area']/div[2]/p[7]") WebElement txtDiscountOnYourBillTeaser5;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[7]") WebElement btnFirstNameInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[7]") WebElement txtFirstNameInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[7]") WebElement btnFirstNameInfoIconClose;
    @FindBy(xpath="//input[@id='firstname']//following-sibling::span[1]") WebElement txtFirstName;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[8]") WebElement btnSurnameInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[8]") WebElement txtSurnameInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[8]") WebElement btnSurnameInfoIconClose;
    @FindBy(xpath="//input[@id='surname']//following-sibling::span[1]") WebElement txtSurname;
    @FindBy(xpath="//input[@id='day']//following-sibling::span[1]") WebElement txtDOB_Date;
    @FindBy(xpath="//input[@id='month']//following-sibling::span[1]") WebElement txtDOB_Month;
    @FindBy(xpath="//input[@id='year']//following-sibling::span[1]") WebElement txtDOB_Year;
    @FindBy(id="deMoveInMonth") WebElement txtMICurrentAddressMonth;
    @FindBy(id="deMoveInYear") WebElement txtMICurrentAddressYear;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block btnPersonalDetails']") WebElement btnNext1;
    @FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline btnBackToAccount'])[1]") WebElement btnGoBack1;
    
    @FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	@FindBy(id = "birthDate") WebElement txtCCBDOB;
	
	@FindBy(xpath="(//div[@class='your-finances-content-area'])[1]/h4") WebElement txtYourFinances1;
	@FindBy(xpath="(//div[@class='your-finances-content-area'])[1]/div[1]/p") WebElement txtYourFinancesTeaser1;
	@FindBy(xpath="//div[@class='your-finances-form-section']/div/p") WebElement txtPensionCreditLabel;
	@FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[1]") WebElement btnPensionCredit_Yes;
	@FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[2]") WebElement btnPensionCredit_No;
	@FindBy(xpath="//div[@class='finance-details']/div[2]/div") WebElement txtYourIncomeAndHousingCosts;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[13]") WebElement btnHouseholdIncomeInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[13]") WebElement txtHouseholdIncomeInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[13]") WebElement btnHouseholdIncomeInfoIconClose;
    @FindBy(id="benefits-income") WebElement txtHouseholdIncome;
    @FindBy(xpath="//div[@class='form-group benefit-income-frequency']/div") WebElement dropdownHouseholdIncome;
    @FindBy(xpath="//div[@class='form-group benefit-income-frequency']/div/div/div/span") List<WebElement> dropdownHouseholdIncomeOptions;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[14]") WebElement btnRentOrMortgageInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[14]") WebElement txtRentOrMortgageInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[14]") WebElement btnRentOrMortgageInfoIconClose;
    @FindBy(id="expense-income") WebElement txtRentOrMortgage;
    @FindBy(xpath="//div[@class='form-group expense-amount-frequency']/div") WebElement dropdownRentOrMortgage;
    @FindBy(xpath="//div[@class='form-group expense-amount-frequency']/div/div/div/span") List<WebElement> dropdownRentOrMortgageOptions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btnFinancesDetails']") WebElement btnNext2;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline go-back'])[1]") WebElement btnGoBack2;
	@FindBy(xpath="(//div[@class='your-finances-content-area'])[2]/h4") WebElement txtYourFinances2;
	@FindBy(xpath="(//div[@class='your-finances-content-area'])[2]/div[1]/p") WebElement txtYourFinancesTeaser2;
	@FindBy(xpath="//div[@class='form-row db-top-space']/div[1]") WebElement txtHowManyPeopleAreOverAgeOf18;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[15]") WebElement btnPeopleOverAgeOf18InfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[15]") WebElement txtPeopleOverAgeOf18InfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[15]") WebElement btnPeopleOverAgeOf18InfoIconClose;
    @FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div") WebElement dropdownPeopleOverAgeOf18;
    @FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div/div/div/span") List<WebElement> dropdownPeopleOverAgeOf18Options;
	@FindBy(xpath="//input[@id='member-1-firstname']/following-sibling::span[1]") WebElement txtFirstName1;
	@FindBy(xpath="//input[@id='member-1-surname']/following-sibling::span[1]") WebElement txtSurname1;
	@FindBy(xpath="//input[@id='member-1-day']/following-sibling::span[1]") WebElement txtDOB_Date1;
	@FindBy(xpath="//input[@id='member-1-month']/following-sibling::span[1]") WebElement txtDOB_Month1;
	@FindBy(xpath="//input[@id='member-1-year']/following-sibling::span[1]") WebElement txtDOB_Year1;
	@FindBy(xpath="//div[@class='sub-title top-space required']") WebElement txtSelectTypeOfBenefitsYoureceive1;
	@FindBy(xpath="//ul[@class='chosen-choices']") WebElement dropdownAddDisabilityBenefits1;
	@FindBy(xpath="//ul[@class='chosen-results']/li[36]") WebElement optionNotApplicable1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btnCheckDiscountEligibility']") WebElement btnSubmit;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline go-back'])[2]") WebElement btnGoBack3;
	@FindBy(xpath="//div[@class='eligible-for-discount']/h5") WebElement txtEligibleForADiscountOnYourBill;
	@FindBy(xpath="//div[@class='eligible-for-discount']/div[1]/p") WebElement txtEligibleForADiscountOnYourBillTeaser1;
	@FindBy(xpath="//div[@class='eligible-for-discount']/div[2]/p[1]") WebElement txtEligibleForADiscountOnYourBillTeaser2;
	@FindBy(xpath="//div[@class='eligible-for-discount']/div[2]/p[2]") WebElement txtEligibleForADiscountOnYourBillTeaser3;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkHowWeHandleYourData;
	@FindBy(xpath="//label[@class='form-checkbox transUnion-eligibility']/span[1]") WebElement checkConsentbox;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btnCheckTransUnionEligibilityForNotPensionCredit']") WebElement btnSubmitMyApplication;
    @FindBy(xpath="(//h5[@class='cl-main mb-10'])[1]") WebElement txtYourIncomeVerificationCheckWasSuccessful;
    @FindBy(xpath="(//p[@class='confirmation-number'])[2]") WebElement txtConfirmationNumber;
    @FindBy(xpath="(//div[@class='sub-content-eligible mb-10'])[1]/p[1]") WebElement txtSuccessMsgTeaser1;
    @FindBy(xpath="(//div[@class='sub-content-eligible mb-10'])[1]/p[2]") WebElement txtSuccessMsgTeaser2;
    @FindBy(xpath="(//div[@class='sub-content-eligible mb-10'])[1]/p[3]") WebElement txtSuccessMsgTeaser3;
    @FindBy(xpath="(//button[@class='nb-btn nb-btn-block btnBackToAccount'])[2]") WebElement btnBackToMyAccount;
    @FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
    
    @FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
    @FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch1;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//div[@class='oraSectionFull'])[2]/h1/label") WebElement txtCCBPassToDetails;
	
	@FindBy(xpath="//h6[@class='text-center other-person-details']") WebElement txtSecondOccupierDetails;
	@FindBy(id="member-2-firstname") WebElement txtFirstName2;
	@FindBy(id="member-2-surname") WebElement txtSurname2;
	@FindBy(id="member-2-day") WebElement txtDOB_Date2;
    @FindBy(id="member-2-month") WebElement txtDOB_Month2;
    @FindBy(id="member-2-year") WebElement txtDOB_Year2;
    @FindBy(id="member-2-other-income") WebElement txtSecondPersonIncome;
    @FindBy(xpath="//div[@class='form-group income-benefit-frequency']/div") WebElement dropdownSecondPersonIncome;
    @FindBy(xpath="//div[@class='form-group income-benefit-frequency']/div/div/div/span") List<WebElement> dropdownSecondPersonIncomeOptions;
    @FindBy(xpath="(//div[@class='sub-title top-space required'])[2]") WebElement txtSelectTypeOfBenefitsYoureceive2;
	@FindBy(xpath="(//ul[@class='chosen-choices'])[2]") WebElement dropdownAddDisabilityBenefits2;
	@FindBy(xpath="(//ul[@class='chosen-results'])[2]/li[36]") WebElement optionNotApplicable2;
    
	String firstName, lastName, day, month, year, confirmationNo;
    
    public Transunion_HouseholdRagStatus_GreenOrAmber_Loc(WebDriver driver) throws Exception {
    	PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Transunion_HouseholdRagStatus_GreenOrAmber.properties");
	}

	public void verifyTryOurEligiblilityCheckerButton() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtIsYourHouseholdIncome);
		Assert.assertEquals(true, txtIsYourHouseholdIncome.getText().contains(c.getData("IsYourHouseholdIncomeLabel")));
		Assert.assertEquals(true, btnTryOurEligibilityChecker.isDisplayed());
		Thread.sleep(5000);
	}

	public void navigateToDiscountOnYourBillPage() throws Exception {
		Thread.sleep(5000);
		btnTryOurEligibilityChecker.click();
		elementVisible(100, txtDiscountOnYourBill);
		Assert.assertEquals(true, txtDiscountOnYourBillTeaser1.getText().contains(c.getData("discountOnYourBillTeaser1")));
		Assert.assertEquals(true, txtDiscountOnYourBillTeaser2.getText().contains(c.getData("discountOnYourBillTeaser2")));
		Assert.assertEquals(true, txtDiscountOnYourBillTeaser3.getText().contains(c.getData("discountOnYourBillTeaser3")));
		Assert.assertEquals(true, txtDiscountOnYourBillTeaser4.getText().contains(c.getData("discountOnYourBillTeaser4")));
		Assert.assertEquals(true, txtDiscountOnYourBillTeaser5.getText().contains(c.getData("discountOnYourBillTeaser5")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDiscountOnYourBill);
	}

	public void verifyUserDetailsWithCCB(String accNo, String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnFirstNameInfoIcon);
		Thread.sleep(500);
		//((JavascriptExecutor) driver).executeScript("window.open('https://tst01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(accNo);
		btnCCBSearch.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		if (driver.findElement(By.xpath("//td[@class='activeTab']")).getText().contains("Main")) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
			elementVisible(100, btnCCBAccountName);
			btnCCBAccountName.click();
			Thread.sleep(2000);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='zoneMapFrame_1']")));
		Thread.sleep(2000);
		String name = txtCCBFullName.getText();
		String[] splitName = name.split(" ");
		firstName = splitName[1];
		lastName = splitName[0].substring(0,splitName[0].length()-1);
		String dob = txtCCBDOB.getText();
		String[] ccbDOB = dob.split("-");
		day = ccbDOB[0];
		month = ccbDOB[1];
		year = ccbDOB[2];
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, btnFirstNameInfoIcon);
		btnFirstNameInfoIcon.click();
		elementVisible(100, txtFirstNameInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtFirstNameInfoIcon.getText().contains(c.getData("firstNameInformationText")));
		Thread.sleep(500);
		btnFirstNameInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtFirstName.getText().contains(firstName));
		btnSurnameInfoIcon.click();
		elementVisible(100, txtSurnameInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtSurnameInfoIcon.getText().contains(c.getData("surnameInformationText")));
		Thread.sleep(500);
		btnSurnameInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtSurname.getText().contains(lastName));
		Assert.assertEquals(true, txtDOB_Date.getText().contains(day));
		Assert.assertEquals(true, txtDOB_Month.getText().contains(month));
		Assert.assertEquals(true, txtDOB_Year.getText().contains(year));
	}

	public void entersMoveInCurrentAddressDetails(String miMonth, String miYear) {
		Assert.assertEquals(true, txtMICurrentAddressMonth.isDisplayed());
		txtMICurrentAddressMonth.sendKeys("05");
		Assert.assertEquals(true, txtMICurrentAddressYear.isDisplayed());
		txtMICurrentAddressYear.sendKeys("2023");
		Assert.assertEquals(true, btnNext1.isDisplayed());
		Assert.assertEquals(true, btnGoBack1.isDisplayed());
	}

	public void redirectedToYourFinancesPage() throws Exception {
		btnNext1.click();
		elementVisible(100, txtYourFinances1);
		Assert.assertEquals(true, txtYourFinancesTeaser1.getText().contains(c.getData("yourFinancesTeaser1")));
	}

	public void selectsPensionCreditAsNo() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPensionCreditLabel);
		Assert.assertEquals(true, txtPensionCreditLabel.getText().contains(c.getData("pensionCreditLabel")));
		Assert.assertEquals(true, btnPensionCredit_Yes.isDisplayed());
		Assert.assertEquals(true, btnPensionCredit_No.isDisplayed());
		Thread.sleep(500);
		btnPensionCredit_No.click();
		Thread.sleep(500);
	}

	public void fillsYourIncomeAndHousingCostsFields(String income, String rent, String frequency) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourIncomeAndHousingCosts);
		btnHouseholdIncomeInfoIcon.click();
		elementVisible(100, txtHouseholdIncomeInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtHouseholdIncomeInfoIcon.getText().contains(c.getData("householdIncomeInformationText")));
		Thread.sleep(500);
		btnHouseholdIncomeInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtHouseholdIncome.isDisplayed());
		txtHouseholdIncome.sendKeys(income);
		dropdownHouseholdIncome.click();
		Thread.sleep(2000);
		for (WebElement option : dropdownHouseholdIncomeOptions) {
			if(option.getText().contains(frequency)){
				option.click();
				break;
			}
		}
		Thread.sleep(500);
		btnRentOrMortgageInfoIcon.click();
		elementVisible(100, txtRentOrMortgageInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRentOrMortgageInfoIcon.getText().contains(c.getData("rentOrMortgageInformationText")));
		Thread.sleep(500);
		btnRentOrMortgageInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtRentOrMortgage.isDisplayed());
		txtRentOrMortgage.sendKeys(rent);
		dropdownRentOrMortgage.click();
		Thread.sleep(2000);
		for (WebElement option : dropdownRentOrMortgageOptions) {
			if(option.getText().contains(frequency)){
				option.click();
				break;
			}
		}
		Thread.sleep(500);
		Assert.assertEquals(true, btnNext2.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourIncomeAndHousingCosts);
	}

	public void navigateToYourFinancesPage() throws Exception {
		Thread.sleep(2000);
		btnNext2.click();
		elementVisible(100, txtYourFinances2);
		Assert.assertEquals(true, txtYourFinancesTeaser2.getText().contains(c.getData("yourFinancesTeaser2")));
		Thread.sleep(2000);
	}

	public void providesHowManyPeopleAreOverAgeOfEighteen(String people) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowManyPeopleAreOverAgeOf18);
		btnPeopleOverAgeOf18InfoIcon.click();
		elementVisible(100, txtPeopleOverAgeOf18InfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPeopleOverAgeOf18InfoIcon.getText().contains(c.getData("peopleOverAgeOf18InformationText")));
		Thread.sleep(500);
		btnPeopleOverAgeOf18InfoIconClose.click();
		Thread.sleep(500);
		dropdownPeopleOverAgeOf18.click();
		Thread.sleep(2000);
		for (WebElement option : dropdownPeopleOverAgeOf18Options) {
			if(option.getText().contains(people)){
				option.click();
				break;
			}
		}
		Thread.sleep(2000);
		Assert.assertEquals(true, txtFirstName1.getText().contains(firstName));
		Assert.assertEquals(true, txtSurname1.getText().contains(lastName));
		Assert.assertEquals(true, txtDOB_Date1.getText().contains(day));
		Assert.assertEquals(true, txtDOB_Month1.getText().contains(month));
		Assert.assertEquals(true, txtDOB_Year1.getText().contains(year));
		dropdownAddDisabilityBenefits1.click();
		Thread.sleep(2000);
		optionNotApplicable1.click();
		Thread.sleep(500);
		txtSelectTypeOfBenefitsYoureceive1.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHowManyPeopleAreOverAgeOf18);
	}
	
	public void fillsSecondOccupierDetails(String secondPersonIncome) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSecondOccupierDetails);
		txtFirstName2.sendKeys("Oscar");
		txtSurname2.sendKeys("Manx");
		txtDOB_Date2.sendKeys("11");
		txtDOB_Month2.sendKeys("05");
		txtDOB_Year2.sendKeys("1960");
		txtSecondPersonIncome.sendKeys(secondPersonIncome);
		dropdownSecondPersonIncome.click();
		Thread.sleep(500);
		for (WebElement option : dropdownSecondPersonIncomeOptions) {
			if(option.getText().contains("Monthly")){
				option.click();
				break;
			}
		}
		Thread.sleep(500);
		dropdownAddDisabilityBenefits2.click();
		Thread.sleep(2000);
		optionNotApplicable2.click();
		Thread.sleep(500);
		txtSelectTypeOfBenefitsYoureceive2.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSubmit.isDisplayed());
		Assert.assertEquals(true, btnGoBack3.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSecondOccupierDetails);
	}

	public void navigateToEligibleForADiscountOnYourBillPage() throws Exception {
		btnSubmit.click();
		elementVisible(100, txtEligibleForADiscountOnYourBill);
		//Assert.assertEquals(true, txtEligibleForADiscountOnYourBillTeaser1.getText().contains(c.getData("eligibleForADiscountOnYourBillTeaser1")));
		Assert.assertEquals(true, txtEligibleForADiscountOnYourBillTeaser2.getText().contains(c.getData("eligibleForADiscountOnYourBillTeaser2")));
		Assert.assertEquals(true, txtEligibleForADiscountOnYourBillTeaser3.getText().contains(c.getData("eligibleForADiscountOnYourBillTeaser3")));
		Assert.assertEquals(true, linkHowWeHandleYourData.isDisplayed());
		Thread.sleep(500);
		checkConsentbox.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSubmitMyApplication.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEligibleForADiscountOnYourBill);
	}

	public void navigateToConfirmationScreen() throws Exception {
		btnSubmitMyApplication.click();
		elementVisible(100, txtYourIncomeVerificationCheckWasSuccessful);
		confirmationNo = txtConfirmationNumber.getText();
		System.out.println(confirmationNo);
		Assert.assertEquals(true, txtSuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")));
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtSuccessMsgTeaser3.getText().contains(c.getData("successMsgTeaser3")));
		Assert.assertEquals(true, btnBackToMyAccount.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourIncomeVerificationCheckWasSuccessful);
	}

	public void navigateToAccountDashboardTab() throws Exception {
		btnBackToMyAccount.click();
		elementVisible(100, tabAccountDashboard);
		Thread.sleep(2000);
	}

	public void verifyBusinessProcessInfoInCCB(String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://tst01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
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

	public void verifyPassToDetailsSectionInCCB() throws Exception {
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBPassToDetails);
		Thread.sleep(2000);
	}
	
}
