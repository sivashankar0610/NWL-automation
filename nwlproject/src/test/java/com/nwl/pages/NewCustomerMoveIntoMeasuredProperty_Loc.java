package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

public class NewCustomerMoveIntoMeasuredProperty_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-newcustomer']") WebElement btnIAmNewCustomer;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block nb-btn-outline'])[1]") WebElement btnCheckOurSupplyArea;
	@FindBy(xpath="(//li[@class='has-submenu'])[1]/a") WebElement txtWaterSupply;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block nb-btn-outline'])[2]") WebElement btnAreYouLandlord;
	@FindBy(xpath="//nav[@id='nonLoginedMenu']/ul/li[1]/a") WebElement txtServices;
	@FindBy(xpath="//div[@class='move-in__step1 wp-spacing']/div/h4") WebElement titleTellUsAboutYourself;
	@FindBy(xpath="//p[@class='lbl not-loginteaser']") WebElement txtWeNeedFewDetailsAboutYou;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement dropdownTitle;
	@FindBy(xpath="(//span[@class='sel__box__options'])[1]") WebElement dropdownTitleMr;
	@FindBy(xpath="(//input[@class='form-control firstname'])[1]") WebElement txtFirstName;
	@FindBy(xpath="(//input[@class='form-control surname'])[1]") WebElement txtSurName;
	@FindBy(xpath="//input[@class='form-control day']") WebElement txtDOBDate;
	@FindBy(xpath="//input[@class='form-control month']") WebElement txtDOBMonth;
	@FindBy(xpath="//input[@class='form-control year']") WebElement txtDOBYear;
	@FindBy(xpath="//input[@class='form-control telephone required']") WebElement txtPhoneNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnPhoneNoInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtPhoneNoInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnPhoneNoInfoIconClose;
	@FindBy(xpath="//input[@class='form-control email']") WebElement txtEmail;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnAAHInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtAAHInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnAAHInfoIconClose;
	@FindBy(xpath="//p[@class='normal']") WebElement txtAdditionalAccountHolderTeaser1;
	@FindBy(xpath="//div[@class='normal small']") WebElement txtAdditionalAccountHolderTeaser2;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[1]") WebElement btnYes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[1]") WebElement btnNo;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span[1]") WebElement dropdownAAHTitleMr;
	@FindBy(xpath="(//input[@class='form-control firstname'])[2]") WebElement txtAAHFirstName;
	@FindBy(xpath="(//input[@class='form-control surname'])[2]") WebElement txtAAHSurName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnPSInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtPSInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnPSInfoIconClose;
	@FindBy(xpath="(//div[@class='normal'])[1]") WebElement txtPSTeaser;
	@FindBy(xpath="(//span[@class='checkbox'])[1]") WebElement checkPriorityServices;
	@FindBy(xpath="(//textarea[@class='msg'])[1]") WebElement txtPriorityServices;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnHWYBInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtHWYBInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnHWYBInfoIconClose;
	@FindBy(xpath="(//div[@class='normal'])[2]") WebElement txtHelpWithYourBillsTeaser1;
	@FindBy(xpath="(//span[@class='checkbox'])[2]") WebElement checkHelpWithYourBills;
	@FindBy(xpath="//div[@class='sub-title how-to-receive-info form-btn']") WebElement txtHelpWithYourBillsTeaser2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step']") WebElement btnNext1;
	@FindBy(xpath="//div[@class='move-in__step2 wp-spacing']/div/h4") WebElement txtYourNewHome;
	@FindBy(xpath="//div[@class='move-in__step2 wp-spacing']/div[3]") WebElement txtWhenMovingIntoNewHome;
	@FindBy(xpath="//div[@class='form-group form-date row-moveInDate']/input") WebElement btnMoveInDate;
	@FindBy(xpath="//div[@class='form-group form-date row-moveInDate active show-date']/input") WebElement txtMoveInDate;
	@FindBy(id="data8-address-movein") WebElement txtFindMyAddress;
	@FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div") WebElement btnPlsSelect;
	@FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div/div/div/span[4]") WebElement dropdownOccupancyCount;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[1]") WebElement btnYes1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block no nb-btn-outline']") WebElement btnNo1;
	@FindBy(xpath="(//button[@data-toggle='tooltip'])[2]") WebElement btnWhyWeAsk;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block go-next']") WebElement btnNext2;
    @FindBy(xpath="//div[@class='move-in__step3 wp-spacing']/div/h4") WebElement txtYourBills;
	@FindBy(xpath="//div[@class='morethan5days']/p") WebElement txtbillMeterReadAdvanceMsgTeaser;
	@FindBy(xpath="//div[@class='morethan5days']/p") WebElement txtbillMeterRead5daysTeaser;
	@FindBy(xpath="//div[@class='metered']/p") WebElement txtbillMeterReadTeaser;
	@FindBy(xpath="//p[@class='meter-serial-number']") WebElement txtSerialNo;
	@FindBy(xpath="//p[@class='meter-last-reading']") WebElement txtLastReadingAndDate;
	@FindBy(xpath="//p[@class='meter-reading-type']") WebElement txtReadingType;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x7']") WebElement btnCCBMeter;
	@FindBy(xpath="//li[@id='CI_METER_subMenuItem0x7']") WebElement btnCCBMeterORItemSearch;
	@FindBy(xpath="//input[@id='ACCT_NBR']") WebElement txtCCBAccountID1;
	@FindBy(id="BU_section3_search") WebElement btnCCBSearch1;
	@FindBy(id="IM_MTR_ITEM:0$Grid_mtrCntxt") WebElement btnCCBMenuSymbol;
	@FindBy(xpath="//li[@id='CI_CONTEXTMETER_subMenuItem0x4']") WebElement btnCCBGoToReadHistory;
	@FindBy(xpath="//span[@id='MTR_INFO']") WebElement txtCCBSerialNo;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$READ_DTTM']") WebElement txtCCBLastReadingDate;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$REG_READING']") WebElement txtCCBLastReading;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$READ_TYPE_DESCR']") WebElement txtCCBReadingType;
	@FindBy(xpath="//span[@id='youAreLoggedInAsSpan']") WebElement btnCCBCredentialsName;
	@FindBy(xpath="//li[@id='Logout']") WebElement btnCCBLogout;
	
	@FindBy(xpath="//div[@class='sub-title dd-normal required']") WebElement txtsetupDirectDebitLabel;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[2]") WebElement btnDirectDebitYes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[3]") WebElement btnDirectDebitNo;
	@FindBy(xpath="//div[@class='form-row font-18 setup-direct-debit-title']") WebElement txtSetupDirectDebitTeaser1;
	@FindBy(xpath="//div[@class='setup-diractdebit-no']/div[1]") WebElement txtSetupDirectDebitTeaser2;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement dropdownYouPay;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span") List<WebElement> btnPaymentPlan;
	@FindBy(xpath="(//div[@class='form-select selected'])[4]") WebElement dropdownPaymentDate;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[1]") WebElement btnPaymentDate;
	@FindBy(xpath="//div[@class='row-paypoint-heading']/p[1]") WebElement txtPayPointTeaser1;
	@FindBy(xpath="//div[@class='row-paypoint-heading']/p[2]") WebElement txtPayPointTeaser2;
	@FindBy(xpath="//div[@class='row-paypoint-heading']/p[2]/a[1]") WebElement linkDownloadGooglePlayStore;
	@FindBy(xpath="//h1[@class='Fd93Bb F5UCq xwcR9d']") WebElement txtNorthumbrianWater1;
	@FindBy(xpath="//div[@class='row-paypoint-heading']/p[2]/a[2]") WebElement linkAppStore;
	@FindBy(xpath="//h1[@class='product-header__title app-header__title']") WebElement txtNorthumbrianWater2;
	@FindBy(xpath="(//span[@class='checkbox'])[5]") WebElement checkSendMePayPointCard;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[18]") WebElement btnSendMePayPointCardInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[18]") WebElement txtSendMePayPointCardInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[18]") WebElement btnSendMePayPointCardInfoIconClose;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block  btn-next']") WebElement btnNext3;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack1;
	@FindBy(xpath="//div[@class='move-in__step4 wp-spacing']/div[2]/div/h4") WebElement txtReady;
	@FindBy(xpath="(//div[@class='account-teaser']/div)[3]/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="(//p[@class='name'])[1]") WebElement txtFullName;
	@FindBy(xpath="(//p[@class='email'])[1]") WebElement txtEmailID;
	@FindBy(xpath="//p[@class='dob']") WebElement txtDOB;
	@FindBy(xpath="(//p[@class='phone'])[1]") WebElement txtMobile;
	@FindBy(xpath="//p[@class='additional']") WebElement txtAAHName;
	@FindBy(xpath="(//p[@class='moveindate'])[1]") WebElement txtMIDate;
	@FindBy(xpath="(//p[@class='occupier'])[1]") WebElement txtOccupancy;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-next'])[2]") WebElement btnDone;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-review']") WebElement btnGoBack2;
	@FindBy(xpath="//div[@class='account-teaser']/h1") WebElement txtGreatYouAreDone;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtEmailYouInformation;
	@FindBy(xpath="//div[@class='sub-title no-margin']") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='account-page text-center']/div/p[1]") WebElement txtYouCanCheckAboutMove;
	@FindBy(xpath="//div[@class='account-page text-center']/div/p[3]") WebElement txtUpdateYourAccount;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[1]") WebElement txtYourNewCustomerAccountTeaser;
	@FindBy(xpath="//div[@class='move-in-confirmation-metered']/p[1]") WebElement txtconfirmationFinalBillTeaser1;
	@FindBy(xpath="//div[@class='move-in-confirmation-metered']/p[3]") WebElement txtconfirmationFinalBillTeaser2;
	@FindBy(xpath="//div[@class='move-in-confirmation-metered']/p[5]") WebElement txtconfirmationFinalBillTeaser3;
	@FindBy(xpath="//a[@href='/help/saving-water/'][@rel='noopener']") WebElement linkSaveWater;
	//@FindBy(xpath="(//a[@href='/services/'])[1]") WebElement txtServices1;
	@FindBy(xpath="//a[@href='/account/'][@rel='noopener']") WebElement linkEBilling;
	@FindBy(xpath="(//div[@class='accordion__item'])[1]/h5/a") WebElement accordianShowMeDetails;
	@FindBy(xpath="(//div[@class='row-bg'])[1]/p[2]") WebElement txtFullName1;
	@FindBy(xpath="(//div[@class='row-bg'])[2]/p[2]") WebElement txtEmailID1;
	@FindBy(xpath="(//div[@class='row-bg'])[3]/p[2]") WebElement txtDOB1;
	@FindBy(xpath="(//div[@class='row-bg'])[5]/p[2]") WebElement txtAAHName1;
	@FindBy(xpath="(//div[@class='row-bg'])[6]/p[2]") WebElement txtMovingInDate;
	@FindBy(xpath="(//div[@class='row-bg'])[8]/p[2]") WebElement txtOccupancy1;
	@FindBy(xpath="//div[@class='accordion__item']/h5/a") WebElement accordianMarketingPreferences;
	@FindBy(xpath="//label[@class='form-toggle']") List<WebElement> toggles;
	@FindBy(xpath="(//button[@type='submit'])[2]") WebElement btnSubmit;
	@FindBy(xpath="//button[@class='nb-btn nb-btn__cta']") WebElement btnOK;
	@FindBy(xpath="(//div[@class='accordion__item active'])[2]/h5/a") WebElement txtMarketingPreferences;
	@FindBy(xpath="(//div[@class='row-bg'])[9]") WebElement txtSuccessMsgTeaser4;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-outline']") WebElement btnGoToHelpCentre;
	
	@FindBy(xpath="(//p[@class='fc-button-label'])[1]") WebElement btnYopmailConsent;
	@FindBy(id="login") WebElement txtYopmailEmail;
	@FindBy(xpath="//i[@class='material-icons-outlined f36']") WebElement btnYopmailEnter;
	@FindBy(xpath="//*[text()='NWL UAT']") WebElement btnEmailHeading;
	@FindBy(xpath="//*[text()='Set password']") WebElement btnSetPassword;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h4") WebElement txtCreateNewPwd;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/p") WebElement txtCreateNewPwdTeaser;
	@FindBy(xpath="(//div[@class='sub-title'])[1]") WebElement txtEmailID2;
	@FindBy(xpath="//input[@name='password']") WebElement txtNewPwd;
	@FindBy(xpath="//a[@class='tooltip-btn']") WebElement btnNewPwdInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtNewPwdInfoIcon;
	@FindBy(xpath="//a[@class='tooltip-close']") WebElement btnNewPwdInfoIconClose;
	@FindBy(xpath="(//a[@class='form-show'])[1]") WebElement linkShowPwd1;
	@FindBy(xpath="//input[@name='confirmpassword']") WebElement txtConfirmPwd;
	@FindBy(xpath="(//a[@class='form-show'])[2]") WebElement linkShowPwd2;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnSaveAndContinue;
	@FindBy(xpath="//div[@class='alert__content']/p") WebElement txtPwdSuccessMsg;
	@FindBy(xpath="//button[@class='nb-btn nb-btn__cta']") WebElement btnOk;
	@FindBy(linkText="Log in") WebElement tabLogin;
	@FindBy(xpath="(//input[@class='form-control email'])[1]") WebElement txtEmail1;
	@FindBy(xpath="//input[@class='form-control loginpassword']") WebElement txtPassword;
	@FindBy(id="recaptcha-demo-submit") WebElement btnLogin;
	@FindBy(xpath="//li[@class='owl-dot active']") WebElement tabAccountDashboard;
	@FindBy(xpath="(//div[@class='account-form'])[1]/h4") WebElement txtaccountSummaryInprocessHeading;
	@FindBy(xpath="(//div[@class='account-form'])[1]/p[2]") WebElement txtaccountSummaryInprocessTeaser1;
	@FindBy(xpath="(//div[@class='account-form'])[1]/p[4]") WebElement txtaccountSummaryInprocessTeaser2;
	@FindBy(xpath="(//div[@class='account-form'])[1]/p[5]") WebElement txtaccountSummaryInprocessTeaser3;
	
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="//td[@class='activeTab']") WebElement tabCCBMain;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBCharacteristics;
	@FindBy(xpath="//span[@id='IM_accountInfoButton']") WebElement btnCCBAccountInformation;
	@FindBy(xpath="(//td[@class='inactiveTab'])[3]") WebElement tabCCBAccountTree;
	@FindBy(xpath="//span[@id='title_heading_1']") WebElement txtCCBAccountTree;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBAccountInformation;
	@FindBy(xpath="//label[@oramdlabel='CM_MAIN_DTLS']") WebElement txtCCBMainDetails;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(xpath="//span[@id='personId']/a") WebElement linkCCBPersonName;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin ']/label)[1]") WebElement txtCCBPersonInformation;
	@FindBy(xpath="//span[@id='IM_GOBACK']") WebElement btnCCBHistory;
	@FindBy(xpath="(//td[@class='oraNormal oraTableData']/a)[1]") WebElement linkCCBAccountName;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBPersons;
	@FindBy(xpath="//img[@id='IM_Sect2_RtArrow']") WebElement symbolCCBAccountPersonsRightArrow;
	@FindBy(xpath="(//td[@class='inactiveTab'])[10]") WebElement tabCCBAccountPortal;
	@FindBy(xpath="//span[@id='title_heading_4']") WebElement txtCCBSubscriptionCommunicationPreferences;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[2]") WebElement txtCCBMIDate;
	@FindBy(xpath="(//span[@class='oraNormal'])[24]") WebElement txtCCBOccupancy;
	@FindBy(xpath="//label[@oramdlabel='CM_MIMO_AVAIL_START_MR_LBL']") WebElement txtCCBAvailableStartMeterReads;
	@FindBy(xpath="(//a[@class='normal oraLink'])[6]") WebElement linkCCBAddress;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin '])[1]") WebElement txtCCBPremise;
	
	String name="Karthi A", dob="10/10/2000", mobile="09876543210", aahName="Faisal A", miDate_App, miDate_CCB, emailID, confirmationNo, password, ccbUsername, ccbPassword;

	public NewCustomerMoveIntoMeasuredProperty_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//NewCustomerMoveIntoMeasuredProperty.properties");
	}

	public void ourSupplyAreaButtonNavigation() throws Exception {
		btnCheckOurSupplyArea.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtWaterSupply);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("ourSupplyAreaNavigationURL")));
	}

	public void landlordButtonNavigation() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnAreYouLandlord);
		btnAreYouLandlord.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtServices);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("landlordButtonNavigationURL")));
	}

	public void navigateToTellUsAboutYourselfPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnIAmNewCustomer);
		btnIAmNewCustomer.click();
		elementVisible(100, titleTellUsAboutYourself);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleTellUsAboutYourself);
		Assert.assertEquals(true, txtWeNeedFewDetailsAboutYou.getText().contains(c.getData("tellUsAboutYourselfTeaser")));
		Assert.assertEquals(true, dropdownTitle.isDisplayed());
		Assert.assertEquals(true, txtFirstName.isDisplayed());
		Assert.assertEquals(true, txtSurName.isDisplayed());
		Assert.assertEquals(true, txtDOBDate.isDisplayed());
		Assert.assertEquals(true, txtDOBMonth.isDisplayed());
		Assert.assertEquals(true, txtDOBYear.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.isDisplayed());
		btnPhoneNoInfoIcon.click();
		elementVisible(100, txtPhoneNoInfoIcon);
		Assert.assertEquals(true, txtPhoneNoInfoIcon.getText().contains(c.getData("phoneNoInformationText")));
		Thread.sleep(1000);
		btnPhoneNoInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtEmail.isDisplayed());
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		Assert.assertEquals(true, btnNext1.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleTellUsAboutYourself);
	}

	public void enterCustomerDetails() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownTitle);
		dropdownTitle.click();
		elementVisible(100, dropdownTitleMr);
		dropdownTitleMr.click();
		String[] fullName = name.split(" ");
		txtFirstName.sendKeys(fullName[0]);
		txtSurName.sendKeys(fullName[1]);
		String[] dob1 = dob.split("/");
		txtDOBDate.sendKeys(dob1[0]);
		txtDOBMonth.sendKeys(dob1[1]);
		txtDOBYear.sendKeys(dob1[2]);
		txtPhoneNo.sendKeys(mobile);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime timeNow = LocalDateTime.now();
		emailID = "nwl" + dtf.format(timeNow) + "@yopmail.com";
		txtEmail.sendKeys(emailID);
		Thread.sleep(1000);
	}

	public void clicksAAH_Yes() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnAAHInfoIcon);
		btnAAHInfoIcon.click();
		elementVisible(100, txtAAHInfoIcon);
		Assert.assertEquals(true, txtAAHInfoIcon.getText().contains(c.getData("additionalAccountHolderInformationText")));
		Thread.sleep(1000);
		btnAAHInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtAdditionalAccountHolderTeaser1.getText().contains(c.getData("additionalAccountHolderTeaser1")));
		Assert.assertEquals(true, txtAdditionalAccountHolderTeaser2.getText().contains(c.getData("additionalAccountHolderTeaser2")));
		btnYes.click();
		elementVisible(100, dropdownTitle);
		Assert.assertEquals(true, dropdownTitle.isDisplayed());
		dropdownTitle.click();
		elementVisible(100, dropdownAAHTitleMr);
		dropdownAAHTitleMr.click();
		Assert.assertEquals(true, txtAAHFirstName.isDisplayed());
		String[] aahName1 = aahName.split(" ");
		txtAAHFirstName.sendKeys(aahName1[0]);
		Assert.assertEquals(true, txtAAHSurName.isDisplayed());
		txtAAHSurName.sendKeys(aahName1[1]);
	}

	public void clicksPS_Yes() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnPSInfoIcon);
		btnPSInfoIcon.click();
		elementVisible(100, txtPSInfoIcon);
		Assert.assertEquals(true, txtPSInfoIcon.getText().contains(c.getData("psrInformationText")));
		Thread.sleep(1000);
		btnPSInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPSTeaser.getText().contains(c.getData("psrTeaser")));
		Assert.assertEquals(true, checkPriorityServices.isDisplayed());
		checkPriorityServices.click();
		elementVisible(100, txtPriorityServices);
		txtPriorityServices.sendKeys(c.getData("psrAdditionaltext"));
	}

	public void clicksHWYB_Yes() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnHWYBInfoIcon);
		btnHWYBInfoIcon.click();
		elementVisible(100, txtHWYBInfoIcon);
		Assert.assertEquals(true, txtHWYBInfoIcon.getText().contains(c.getData("helpWithYourBillsInformationText")));
		Thread.sleep(1000);
		btnHWYBInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtHelpWithYourBillsTeaser1.getText().contains(c.getData("helpWithYourBillsTeaser1")));
		Assert.assertEquals(true, checkHelpWithYourBills.isDisplayed());
		checkHelpWithYourBills.click();
		elementVisible(100, txtHelpWithYourBillsTeaser2);
		Assert.assertEquals(true, txtHelpWithYourBillsTeaser2.getText().contains(c.getData("helpWithYourBillsTeaser2")));
	}

	public void navigateToYourNewHomePage(String moveInDate) throws Exception {
		btnNext1.click();
		elementVisible(100, txtYourNewHome);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourNewHome);
        Assert.assertEquals(true, txtWhenMovingIntoNewHome.getText().contains(c.getData("moveInDateLabel")));
        btnMoveInDate.click();
		Thread.sleep(1000);
		miDate_App = moveInDate;
		miDate_CCB = moveInDate.replaceAll("/", "-");
		txtMoveInDate.sendKeys(moveInDate);
		//txtYourNewHome.click();
		txtFindMyAddress.click();
		Thread.sleep(1000);
	}

	public void enterMeasuredPremiseAddress(String miAddress) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
		txtFindMyAddress.sendKeys(miAddress);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		btnPlsSelect.click();
		Thread.sleep(1000);
		dropdownOccupancyCount.click();
		Assert.assertEquals(true, btnYes1.isDisplayed());
		Assert.assertEquals(true, btnNo1.isDisplayed());
		btnNo1.click();
		Assert.assertEquals(true, btnWhyWeAsk.isDisplayed());
		Assert.assertEquals(true, btnNext2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
	}
	
	public void navigateToYourBillsPage(String miAccNo, String username, String pwd) throws Exception{
		btnNext2.click();
		elementVisible(100, txtYourBills);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
		String moveInDate = miDate_App.substring(6)+"-"+miDate_App.substring(3, 5)+"-"+miDate_App.substring(0, 2);
		ccbUsername=username;
		ccbPassword=pwd;
		if (moveInDate.compareTo(LocalDate.now().minusDays(5).toString())<0) {
			Assert.assertEquals(true, txtbillMeterReadAdvanceMsgTeaser.getText().contains(c.getData("billMeterReadAdvanceMsgTeaser")));
		}
		else if (moveInDate.compareTo(LocalDate.now().plusDays(5).toString())>0) {
			Assert.assertEquals(true, txtbillMeterRead5daysTeaser.getText().contains(c.getData("billMeterRead5daysTeaser")));
		}
        else {
        	Assert.assertEquals(true, txtbillMeterReadTeaser.getText().contains(c.getData("billMeterReadTeaser")));
        	((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
    		handleMultipleTabs(1);
    		elementVisible(100, btnCCBUserID);
    		btnCCBUserID.sendKeys(ccbUsername);
    		btnCCBPwd.sendKeys(ccbPassword);
    		btnCCBLogin.click();
    		Thread.sleep(3000);
    		driver.switchTo().frame(0);
    		elementVisible(100, btnCCBMenu);
    		btnCCBMenu.click();
    		elementVisible(100, btnCCBMeter);
    		btnCCBMeter.click();
    		elementVisible(100, btnCCBMeterORItemSearch);
    		btnCCBMeterORItemSearch.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
    		elementVisible(100, txtCCBAccountID1);
    		txtCCBAccountID1.sendKeys(miAccNo);
    		btnCCBSearch1.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
    		elementVisible(100, btnCCBMenuSymbol);
    		btnCCBMenuSymbol.click();
    		Thread.sleep(2000);
    		driver.switchTo().defaultContent();
    		driver.switchTo().frame(0);
    		elementVisible(100, btnCCBGoToReadHistory);
    		btnCCBGoToReadHistory.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
    		elementVisible(100, txtCCBSerialNo);
    		String[] s1 = txtCCBSerialNo.getText().split("/");
    		String expectedSerialNumber = s1[1].toString().replaceAll("\\s", "");
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataGrid']")));
    		String date = txtCCBLastReadingDate.getText().substring(0, 10);
    		String expectedLastReadingDate = date.substring(0, 2)+"/"+date.substring(3, 5)+"/"+date.substring(6, 10);
    		String[] s2 = txtCCBLastReading.getText().split("\\.");    		
    		String lastCCBReading = s2[0];
    		String expectedLastReadingType = txtCCBReadingType.getText();
    		
    		driver.switchTo().defaultContent();
    		driver.switchTo().frame(0);
    		elementVisible(100, btnCCBCredentialsName);
    		btnCCBCredentialsName.click();
    		elementVisible(100, btnCCBLogout);
    		btnCCBLogout.click();
    		Thread.sleep(2000);
    		driver.switchTo().defaultContent();
    		elementVisible(100, btnCCBUserID);
    		
    		driver.close();
    		handleMultipleTabs(0);
    		elementVisible(100, txtSerialNo);
    		Assert.assertEquals(true, txtSerialNo.getText().contains(expectedSerialNumber));	
    		String[] reading = txtLastReadingAndDate.getText().split(" ");
    		String expectedLastReading = null;
    		if (reading[0].length()==4) {
    			if (lastCCBReading.length()==3) {
    				expectedLastReading="0"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==2) {
    				expectedLastReading="00"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==1) {
    				expectedLastReading="000"+lastCCBReading;
    			}
    			else {
    				expectedLastReading=lastCCBReading;
    			    Assert.assertEquals(true, txtLastReadingAndDate.getText().contains(expectedLastReading+" on "+expectedLastReadingDate));
    			}
    		}
    		else if (reading[0].length()==5) {
    			if (lastCCBReading.length()==4) {
    				expectedLastReading="0"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==3) {
    				expectedLastReading="00"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==2) {
    				expectedLastReading="000"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==1) {
    				expectedLastReading="0000"+lastCCBReading;
    			}
    			else {
    				expectedLastReading=lastCCBReading;
    				Assert.assertEquals(true, txtLastReadingAndDate.getText().contains(expectedLastReading+" on "+expectedLastReadingDate));
    			}
    		}	
    		
    		if (expectedLastReadingType.contains("Estimate")) {
    	    	Assert.assertEquals(true, txtReadingType.getText().contains("Estimate"));
    		}
    	    else if (expectedLastReadingType.contains("Regular")) {
    	    	Assert.assertEquals(true, txtReadingType.getText().contains("NWL read"));
    		}
    		else {
    			Assert.assertEquals(true, txtReadingType.getText().toLowerCase().contains(expectedLastReadingType.toLowerCase()));
    		}
        }
	}

	public void selectedSetupDirectDebitAsNo(String paymentPlan) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtsetupDirectDebitLabel);
		Assert.assertEquals(true, txtsetupDirectDebitLabel.getText().contains(c.getData("setupDirectDebitLabel")));
		Assert.assertEquals(true, btnDirectDebitYes.isDisplayed());
		Assert.assertEquals(true, btnDirectDebitNo.isDisplayed());
		Assert.assertEquals(true, txtSetupDirectDebitTeaser1.getText().contains(c.getData("setupDirectDebitTeaser1")));
		btnDirectDebitNo.click();
		elementVisible(100, txtSetupDirectDebitTeaser2);
		Assert.assertEquals(true, txtSetupDirectDebitTeaser2.getText().contains(c.getData("setupDirectDebitTeaser2")));
		dropdownYouPay.click();
		Thread.sleep(2000);
		for (WebElement paymentMethod : btnPaymentPlan) {
			if (paymentMethod.getText().contains(paymentPlan)) {
				paymentMethod.click();
				Thread.sleep(1000);
				if (dropdownPaymentDate.isDisplayed()) {
					dropdownPaymentDate.click();
					elementVisible(100, btnPaymentDate);
					btnPaymentDate.click();
					break;
				}
			}
		}
		Assert.assertEquals(true, txtPayPointTeaser1.getText().contains(c.getData("payPointTeaser1")));
		Assert.assertEquals(true, txtPayPointTeaser2.getText().contains(c.getData("payPointTeaser2")));
		Assert.assertEquals(true, checkSendMePayPointCard.isDisplayed());
		btnSendMePayPointCardInfoIcon.click();
		elementVisible(100, txtSendMePayPointCardInfoIcon);
		Assert.assertEquals(true, txtSendMePayPointCardInfoIcon.getText().contains(c.getData("sendMePayPointCardInformationText")));
		Thread.sleep(1000);
		btnSendMePayPointCardInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnNext3.isDisplayed());
		Assert.assertEquals(true, btnGoBack1.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtsetupDirectDebitLabel);
	}

	public void googlePlayStoreNavigation() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayPointTeaser1);
		linkDownloadGooglePlayStore.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtNorthumbrianWater1);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("downloadGooglePlayStoreNavigationURL")));
	}

	public void appStoreNavigation() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, linkAppStore);
		linkAppStore.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtNorthumbrianWater2);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("appStoreNavigationURL")));
	}

	public void navigateToReadyPage() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnNext3);
		btnNext3.click();
		elementVisible(100, txtReady);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtReady);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		Assert.assertEquals(true, txtFullName.getText().equalsIgnoreCase("Mr. "+name));
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(emailID));
		Assert.assertEquals(true, txtDOB.getText().equalsIgnoreCase(dob));
		Assert.assertEquals(true, txtMobile.getText().equalsIgnoreCase(mobile));
		Assert.assertEquals(true, txtAAHName.getText().equalsIgnoreCase("Mr. "+aahName));
		Assert.assertEquals(true, txtMIDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy.getText().equalsIgnoreCase("4"));
		Assert.assertEquals(true, btnDone.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullName);
	}

	public void navigateToConfirmationPage() throws Exception {
		btnDone.click();
		elementVisible(200, txtGreatYouAreDone);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);	
		Assert.assertEquals(true, txtEmailYouInformation.getText().contains(c.getData("successMsgTeaser1")+" "+emailID));
		confirmationNo=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtYouCanCheckAboutMove.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtUpdateYourAccount.getText().contains(c.getData("successMsgTeaser3")));
	}

	public void saveWaterLinkNavigation() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourNewCustomerAccountTeaser);
		Assert.assertEquals(true, txtYourNewCustomerAccountTeaser.getText().contains(c.getData("newOnlineAccountTeaser")));
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser1.getText().contains(c.getData("confirmationFinalBillTeaser1")));
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser2.getText().contains(c.getData("confirmationFinalBillTeaser2")));
		linkSaveWater.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtServices);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("saveWaterLinkNavigationURL")));
	}

	public void eBillingLinkNavigation() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, txtconfirmationFinalBillTeaser3);
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser3.getText().contains(c.getData("confirmationFinalBillTeaser3")));
		linkEBilling.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtServices);
		//Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("eBillingLinkNavigationURL")));
	}

	public void showMeTheDetailsSection() {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, accordianShowMeDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordianShowMeDetails);
		Assert.assertEquals(true, accordianShowMeDetails.isDisplayed());
		accordianShowMeDetails.click();
		elementVisible(100, txtFullName1);
		Assert.assertEquals(true, txtFullName1.getText().equalsIgnoreCase("Mr. "+name));
		Assert.assertEquals(true, txtEmailID1.getText().equalsIgnoreCase(emailID));
		Assert.assertEquals(true, txtDOB1.getText().equalsIgnoreCase(dob));
		Assert.assertEquals(true, txtAAHName1.getText().equalsIgnoreCase("Mr. "+aahName+" is also moving to the new address"));
		Assert.assertEquals(true, txtMovingInDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy1.getText().equalsIgnoreCase("4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullName1);
	}

	public void marketingPreferencesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordianMarketingPreferences);
		Assert.assertEquals(true, accordianMarketingPreferences.isDisplayed());
		accordianMarketingPreferences.click();
		Thread.sleep(2000);
		for (WebElement toggle : toggles) {
			toggle.click();
			Thread.sleep(1000);
		}
		btnSubmit.click();
		elementVisible(100, btnOK);
		btnOK.click();
		elementVisible(100, btnSubmit);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMarketingPreferences);
	}

	public void helpCentreButtonNavigation() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSuccessMsgTeaser4);
		Assert.assertEquals(true, txtSuccessMsgTeaser4.getText().contains(c.getData("successMsgTeaser4")));
		Assert.assertEquals(true, btnGoToHelpCentre.isDisplayed());
		btnGoToHelpCentre.click();
		Thread.sleep(3000);
		elementVisible(100, txtServices);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("helpCentreButtonNavigation")));
	}

	public void userOpensYopMailWebsite() throws Exception {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.open('https://yopmail.com/en/' ,'_blank');");
		Thread.sleep(1000);
		handleMultipleTabs(1);
		elementVisible(100, btnYopmailConsent);
		btnYopmailConsent.click();
		Thread.sleep(500);
		txtYopmailEmail.sendKeys(emailID);
		Thread.sleep(500);
	}

	public void userClicksOnTheSetPwdMail() throws Exception {
		elementVisible(100, btnYopmailEnter);
		btnYopmailEnter.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("ifinbox")));
		btnEmailHeading.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSetPassword);
		Thread.sleep(500);
	}

	public void navigateToCreateNewPwdScreen(String pwd) throws Exception {
		Thread.sleep(500);
		btnSetPassword.click();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, txtCreateNewPwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCreateNewPwd);
		Assert.assertEquals(true, txtCreateNewPwdTeaser.getText().contains(c.getData("createNewPwdTeaser")));
		Assert.assertEquals(true, txtEmailID2.getText().contains(emailID));
		Assert.assertEquals(true, txtNewPwd.isDisplayed());
		btnNewPwdInfoIcon.click();
		elementVisible(100, txtNewPwdInfoIcon);
		Assert.assertEquals(true, txtNewPwdInfoIcon.getText().contains(c.getData("newPwdInformationText")));
		Thread.sleep(500);
		btnNewPwdInfoIconClose.click();
		Thread.sleep(1000);
		password=pwd;
		txtNewPwd.sendKeys(password);
		Assert.assertEquals(true, linkShowPwd1.isDisplayed());
		Assert.assertEquals(true, linkShowPwd2.isDisplayed());
		linkShowPwd1.click();
		Assert.assertEquals(true, txtConfirmPwd.isDisplayed());
		txtConfirmPwd.sendKeys(password);
		linkShowPwd1.click();
		Assert.assertEquals(true, btnSaveAndContinue.isDisplayed());
	}

	public void userClicksOnSaveAndContinuebutton() throws Exception {
		btnSaveAndContinue.click();
		elementVisible(200, txtPwdSuccessMsg);
		Assert.assertEquals(true, txtPwdSuccessMsg.getText().contains(c.getData("pwdSuccessMsg")));
		Assert.assertEquals(true, btnOk.isDisplayed());
	}

	public void userClicksOnOkbutton() throws Exception {
		btnOk.click();
		elementVisible(100, tabLogin);
		Assert.assertEquals(true, txtEmail1.isDisplayed());
		Assert.assertEquals(true, txtPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPwd1.isDisplayed());
		Assert.assertEquals(true, btnLogin.isDisplayed());
	}

	public void enterCredentials() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabLogin);
		txtEmail1.sendKeys(emailID);
		txtPassword.sendKeys(password);
		Thread.sleep(500);
		linkShowPwd1.click();
		Thread.sleep(500);
	}

	public void clickOnLoginButtonAndNavigateADTab() throws Exception {
		btnLogin.click();
		Thread.sleep(13000);
		elementVisible(100, tabAccountDashboard);
		Assert.assertEquals(true, tabAccountDashboard.getText().contains(c.getData("tabName1")));
	}

	public void verifyPreAccountSetupMsg() throws Exception {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtaccountSummaryInprocessHeading);
    	Thread.sleep(1000);
    	Assert.assertEquals(true, txtaccountSummaryInprocessHeading.getText().contains(c.getData("accountSummaryInprocessHeading")));
    	Assert.assertEquals(true, txtaccountSummaryInprocessTeaser1.getText().contains(c.getData("accountSummaryInprocessTeaser1")));
    	Assert.assertEquals(true, txtaccountSummaryInprocessTeaser2.getText().contains(c.getData("accountSummaryInprocessTeaser2")));
    	Assert.assertEquals(true, txtaccountSummaryInprocessTeaser3.getText().contains(c.getData("accountSummaryInprocessTeaser3")));
	}

	public void verifyCCMainTabInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(3);
		Thread.sleep(1000);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPassword);
		btnCCBLogin.click();
	    Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBCustomerInformation);
		btnCCBCustomerInformation.click();
		elementVisible(100, btnCCBCustomerContact);
		btnCCBCustomerContact.click();
		elementVisible(100, btnCCBSearch);
		btnCCBSearch.click();
		Thread.sleep(3000);
		handleMultipleTabs(4);
		txtCCBCustomerContactID.sendKeys(confirmationNo);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(3);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCCBMain);
		Thread.sleep(500);
	}

	public void verifyCCCharactersticsTabInCCB() throws Exception {
		elementVisible(100, tabCCBCharacteristics);
		tabCCBCharacteristics.click();
		Thread.sleep(500);
	}
	
	public void verifyAccountTreeTabInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBAccountInformation.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBAccountTree);
		tabCCBAccountTree.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		elementVisible(100, txtCCBAccountTree);
	}

	public void verifyMainDetailsSectionInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		tabCCBAccountInformation.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		elementVisible(100, txtCCBMainDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBMainDetails);
	}

	public void verifyActivityHistorySectionInCCB() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAcivityHistory);
		btnCCBAcivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
	}

	public void verifyPersonCharactersticsTabInCCB() throws Exception {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBMainDetails);
		elementVisible(100, linkCCBPersonName);
		linkCCBPersonName.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBCharacteristics);
		tabCCBCharacteristics.click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBPersonInformation);
	}

	public void verifyAccountPerson1_PersonsTabInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBHistory.click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		elementVisible(100, linkCCBAccountName);
		linkCCBAccountName.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBPersons);
		tabCCBPersons.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		Thread.sleep(1000);
		elementVisible(100, symbolCCBAccountPersonsRightArrow);
	}

	public void verifyAccountPerson2_PersonsTabInCCB() throws Exception {
		symbolCCBAccountPersonsRightArrow.click();
		Thread.sleep(1000);
	}

	public void verifyAccountPortalTabInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBAccountPortal);
		tabCCBAccountPortal.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBSubscriptionCommunicationPreferences);
	}

	public void verifyMIMOProcessInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBHistory.click();
		Thread.sleep(2000);
		btnCCBHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		elementVisible(100, btnCCBMenuSymbol1);
		btnCCBMenuSymbol1.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		elementVisible(100, txtCCBProcessInfo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		Assert.assertEquals(true, txtCCBMIDate.getText().contains(miDate_CCB));
		Assert.assertEquals(true, txtCCBOccupancy.getText().contains("4"));
	}

	public void verifyASMRInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBAvailableStartMeterReads);
		Thread.sleep(500);
	}

	public void verifyPremiseMainTabInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkCCBAddress);
		linkCCBAddress.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBPremise);
		Thread.sleep(2000);
		
	}

}
