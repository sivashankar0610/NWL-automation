package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class NewCustomerMoveIntoUnmeasuredProperty_Loc extends BasePage {
	
	@FindBy(linkText="Create an account") WebElement tabCreateAnAccount;
	@FindBy(xpath="//h1[@class='small-h1']") WebElement txtCreateAnAccount;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtCreateAnAccountTeaser;
	@FindBy(xpath="//input[@class='form-control firstname']") WebElement txtFirstName;
	@FindBy(xpath="//input[@class='form-control surname']") WebElement txtSurName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnEmailInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtEmailInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnEmailInfoIconClose;
	@FindBy(xpath="//input[@class='form-control email']") WebElement txtEmail;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[2]") WebElement btnPasswordInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[2]") WebElement txtPasswordInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[2]") WebElement btnPasswordInfoIconClose;
	@FindBy(xpath="//input[@class='form-control password']") WebElement txtPassword;
	@FindBy(xpath="(//a[@class='form-show'])[1]") WebElement linkShowPassword;
	@FindBy(xpath="//input[@class='form-control confirmpassword']") WebElement txtConfirmPassword;
	@FindBy(xpath="(//a[@class='form-show'])[2]") WebElement linkShowPassword1;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnOurCustomerInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtOurCustomerInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnOurCustomerInfoIconClose;
	@FindBy(xpath="(//span[@class='checkbox'])[1]") WebElement btnCustomerYes;
	@FindBy(xpath="(//span[@class='checkbox'])[2]") WebElement btnCustomerNo;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[1]") WebElement btnCreateMyOnlineAccount;
	@FindBy(xpath="//a[@class='nb-btn-link']") WebElement linkYourPrivacy;
	@FindBy(xpath="//div[@class='editorial__block']/div/p[2]/a") WebElement linkProtectYourAccount;
	@FindBy(xpath="(//div[@class='container'])[9]/p[1]") WebElement txtLandlordTeaser;
	@FindBy(xpath="(//a[@rel='noopener'])[6]") WebElement linkLandlordMoreInformation;
	@FindBy(xpath="(//div[@class='container'])[10]/p[2]") WebElement txtBusinessAccountOnlineTeaser;
	@FindBy(xpath="(//a[@rel='noopener'])[7]") WebElement linkBusinessAccountOnline;
	@FindBy(xpath="(//div[@class='alert-label'])[2]") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="//a[@class='nb-btn-link notEmail']") WebElement linkNotYourEmailAddress;
	@FindBy(xpath="//a[@class='nb-btn-link resendEmail']") WebElement linkResendEmail;
	@FindBy(xpath="//a[@class='nb-btn-link take-nwl']") WebElement linkGoToHomePage;
	@FindBy(xpath="(//i[@class='far fa-user-alt'])[2]") WebElement linkAccount;
	
	@FindBy(xpath="(//p[@class='fc-button-label'])[1]") WebElement btnYopmailConsent;
	@FindBy(id="login") WebElement txtYopmailEmail;
	@FindBy(xpath="//i[@class='material-icons-outlined f36']") WebElement btnYopmailEnter;
	@FindBy(xpath="//*[text()='NWL UAT']") WebElement btnEmailHeading;
	@FindBy(xpath="//*[text()='Verify my account']") WebElement btnVerifyAccount;
	
	@FindBy(xpath="//p[@class='teaser-new']") WebElement txtWelcomeTeaser;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-inline nb-btn__cta']") WebElement btnNext1;
	@FindBy(xpath="//div[@class='move-in__step1 wp-spacing']/div/h4") WebElement titleTellUsAboutYourself;
	@FindBy(xpath="(//div[@class='sub-title'])[1]") WebElement txtLetsStartWithYourName;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement dropdownTitle;
	@FindBy(xpath="(//span[@class='sel__box__options'])[1]") WebElement dropdownTitleMr;
	@FindBy(xpath="(//div[@class='form-group active completed'])[1]/span[1]") WebElement txtFirstName1;
	@FindBy(xpath="(//div[@class='form-group active completed'])[2]/span[1]") WebElement txtSurName1;
	@FindBy(xpath="//input[@class='form-control day']") WebElement txtDOBDate;
	@FindBy(xpath="//input[@class='form-control month']") WebElement txtDOBMonth;
	@FindBy(xpath="//input[@class='form-control year']") WebElement txtDOBYear;
	@FindBy(xpath="//input[@class='form-control telephone required']") WebElement txtPhoneNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnPhoneNoInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtPhoneNoInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnPhoneNoInfoIconClose;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnAAHInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtAAHInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnAAHInfoIconClose;
	@FindBy(xpath="//p[@class='normal']") WebElement txtAdditionalAccountHolderTeaser1;
	@FindBy(xpath="//div[@class='normal small']") WebElement txtAdditionalAccountHolderTeaser2;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[1]") WebElement btnYes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[1]") WebElement btnNo;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnPSInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtPSInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnPSInfoIconClose;
	@FindBy(xpath="(//div[@class='normal'])[1]") WebElement txtPSTeaser;
	@FindBy(xpath="(//span[@class='checkbox'])[1]") WebElement checkPriorityServices;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnHWYBInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtHWYBInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnHWYBInfoIconClose;
	@FindBy(xpath="(//div[@class='normal'])[2]") WebElement txtHelpWithYourBillsTeaser;
	@FindBy(xpath="(//span[@class='checkbox'])[2]") WebElement checkHelpWithYourBills;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[1]") WebElement linkIAmCurrentlyACustomer;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step']") WebElement btnNext2;
	@FindBy(xpath="//div[@class='move-in__step2 wp-spacing']/div/h4") WebElement txtYourNewHome;
	@FindBy(xpath="//div[@class='move-in__step2 wp-spacing']/div[3]") WebElement txtWhenMovingIntoNewHome;
	@FindBy(xpath="//div[@class='form-group form-date row-moveInDate']/input") WebElement btnMoveInDate;
	@FindBy(xpath="//div[@class='form-group form-date row-moveInDate active show-date']/input") WebElement txtMoveInDate;
	@FindBy(id="data8-address-movein") WebElement txtFindMyAddress;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[6]") WebElement btnFindMyAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[6]") WebElement txtFindMyAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[6]") WebElement btnFindMyAddressInfoIconClose;
	@FindBy(xpath="//a[@class='nb-btn-link address-not-list-link']") WebElement linkAddressIsNotListed;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[7]") WebElement btnOccupancyInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[7]") WebElement txtOccupancyInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[7]") WebElement btnOccupancyInfoIconClose;
	@FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div") WebElement btnPlsSelect;
	@FindBy(xpath="//div[@class='nb-col-6 number-occupant-align-center']/div/div/div/span[4]") WebElement dropdownOccupancyCount;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[2]") WebElement btnYes1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block no nb-btn-outline']") WebElement btnNo1;
	@FindBy(xpath="(//button[@data-toggle='tooltip'])[2]") WebElement btnWhyWeAsk;
	@FindBy(xpath="(//span[@class='tooltip-label'])[20]") WebElement txtWhyWeAskInfo;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block go-next']") WebElement btnNext3;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline go-back'])[1]") WebElement btnGoBack1;
	@FindBy(xpath="//div[@class='move-in__step3 wp-spacing']/div/h4") WebElement txtYourBills;
	@FindBy(xpath="//div[@class='unmetered']/p") WebElement txtUnmeteredTeaser;
	@FindBy(xpath="//div[@class='sub-title dd-normal required']") WebElement txtsetupDirectDebitLabel;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[3]") WebElement btnDirectDebitYes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[2]") WebElement btnDirectDebitNo;
	@FindBy(xpath="//div[@class='form-row font-18 setup-direct-debit-title']") WebElement txtSetupDirectDebitTeaser1;
	@FindBy(xpath="//p[@class='mandatory-field-teaser']/i") WebElement txtSetupDirectDebitTeaser2;
	@FindBy(xpath="//div[@class='form-row setup-dd-question']/div[1]") WebElement txtAuthoriseAccountHolder;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[12]") WebElement btnAuthoriseAccountHolderInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[12]") WebElement txtAuthoriseAccountHolderInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[12]") WebElement btnAuthoriseAccountHolderInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[3]") WebElement btnAuthoriseAccountHolderYes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[3]") WebElement btnAuthoriseAccountHolderNo;
	@FindBy(xpath="(//div[@class='form-row'])[29]") WebElement txtAuthoriseAccountHolderNoTeaser1;
	@FindBy(xpath="//div[@class='form-row plink']/p[1]") WebElement txtAuthoriseAccountHolderNoTeaser2;
	@FindBy(xpath="//div[@class='form-row plink']/p[3]") WebElement txtAuthoriseAccountHolderNoTeaser3;
	@FindBy(xpath="//div[@class='form-row plink']/p[1]/a[1]") WebElement linkDownloadMeteredPropertyDDI;
	@FindBy(xpath="//div[@class='form-row plink']/p[1]/a[2]") WebElement linkDownloadUnmeteredPropertyDDI;
	@FindBy(xpath="//div[@class='form-row plink']/p[3]/a") WebElement linkDownloadAdobeAcrobat;
	@FindBy(xpath="//div[@class='form-row choose-frequency']/div[1]") WebElement txtPayByDirectDebitLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[13]") WebElement btnPayByDirectDebitInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[13]") WebElement txtPayByDirectDebitInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[13]") WebElement btnPayByDirectDebitInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select selected'])[3]") WebElement dropdownPayByDirectDebit;
	@FindBy(xpath="(//div[@class='form-select selected'])[3]/span[1]") WebElement txtMonthly;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[3]") WebElement btnAnnual;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[1]") WebElement btnMonthly;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[14]") WebElement btnPaymentDateInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[14]") WebElement txtPaymentDateInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[14]") WebElement btnPaymentDateInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select selected'])[4]") WebElement dropdownPaymentDate;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[1]") WebElement btn1st;
	@FindBy(xpath="(//div[@class='sub-title'])[17]") WebElement txtNameOfAccHolderLabel;
	@FindBy(xpath="//input[@class='form-control account-holder-name']") WebElement txtNameOfAccHolderTypeHere;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[15]") WebElement btnBranchSortCodeInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[15]") WebElement txtBranchSortCodeInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[15]") WebElement btnBranchSortCodeInfoIconClose;
	@FindBy(xpath="//input[@name='sort-code-box-1']") WebElement txtBranchSortCode;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[16]") WebElement btnYourBankInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[16]") WebElement txtYourBankInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[16]") WebElement btnYourBankInfoIconClose;
	@FindBy(xpath="//input[@class='form-control bank-account-number']") WebElement txtYourBankNumber;
	@FindBy(xpath="//strong[@class='bank-name']") WebElement txtBankName1;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[2]") WebElement linkReadDirectDebitGuarantee;
	@FindBy(xpath="//div[@class='grantee-teaser editorial__block editorial__block-none']/ul/li[1]") WebElement txtDirectDebitGuaranteeTeaser1;
	@FindBy(xpath="//div[@class='grantee-teaser editorial__block editorial__block-none']/ul/li[2]") WebElement txtDirectDebitGuaranteeTeaser2;
	@FindBy(xpath="//div[@class='grantee-teaser editorial__block editorial__block-none']/ul/li[3]") WebElement txtDirectDebitGuaranteeTeaser3;
	@FindBy(xpath="//div[@class='grantee-teaser editorial__block editorial__block-none']/ul/li[4]") WebElement txtDirectDebitGuaranteeTeaser4;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block  btn-next']") WebElement btnNext4;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack2;
	@FindBy(xpath="//div[@class='review-your-setup-dd']/div[1]/h4") WebElement txtYourNewDirectDebit;
	@FindBy(xpath="//div[@class='review-your-setup-dd']/div[1]/div/p") WebElement txtYourNewDirectDebitTeaser;
	@FindBy(xpath="(//p[@class='account-holder-name'])[2]") WebElement txtAccountName;
	@FindBy(xpath="(//p[@class='bank-account-number'])[2]") WebElement txtAccountNumber;
	@FindBy(xpath="(//p[@class='branch-sort-code'])[2]") WebElement txtSortCode;
	@FindBy(xpath="(//div[@class='bank-address'])[2]/p[1]") WebElement txtBankName2;
	@FindBy(xpath="//div[@class='row-bg row-reference']/p[3]") WebElement txtReferenceNoTeaser;
	@FindBy(xpath="(//div[@class='row-bg'])[16]/p[2]") WebElement txtBankTeaser1;
	@FindBy(xpath="(//p[@class='payment-day'])[2]") WebElement txtPaymentDate;
	@FindBy(xpath="(//p[@class='payment-frequency'])[2]") WebElement txtFrequency;
	@FindBy(xpath="(//div[@class='form-row editorial__block editorial__block-none'])[4]/p[2]/strong") WebElement txtBankTeaser2;
	@FindBy(xpath="(//div[@class='form-row editorial__block editorial__block-none'])[4]/strong/p[1]") WebElement txtBankTeaser3;
	@FindBy(xpath="(//div[@class='form-row editorial__block editorial__block-none'])[4]/strong/p[2]") WebElement txtBankTeaser4;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[5]") WebElement linkMoreInformationAboutDDG;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-next'])[1]") WebElement btnConfirm;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back'])[1]") WebElement btnGoBack3;
	@FindBy(xpath="//div[@class='move-in__step4 wp-spacing']/div[2]/div/h4") WebElement txtReady;
	@FindBy(xpath="(//div[@class='account-teaser']/div)[3]/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="(//p[@class='name'])[1]") WebElement txtFullName;
	@FindBy(xpath="(//p[@class='email'])[1]") WebElement txtEmailID;
	@FindBy(xpath="//p[@class='dob']") WebElement txtDOB;
	@FindBy(xpath="(//p[@class='phone'])[1]") WebElement txtMobile;
	@FindBy(xpath="(//p[@class='moveindate'])[1]") WebElement txtMIDate;
	@FindBy(xpath="(//p[@class='occupier'])[1]") WebElement txtOccupancy;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-next'])[2]") WebElement btnDone;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-review']") WebElement btnGoBack4;
	@FindBy(xpath="//div[@class='account-teaser']/h1") WebElement txtGreatYouAreDone;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtEmailYouInformation;
	@FindBy(xpath="//div[@class='sub-title no-margin']") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='account-page text-center']/div/p[1]") WebElement txtYouCanCheckAboutMove;
	@FindBy(xpath="//div[@class='account-page text-center']/div/p[3]") WebElement txtUpdateYourAccount;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[1]") WebElement txtConfirmationFinalBillTeaser;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[3]/strong") WebElement txtconfirmationFinalBillTeaser1;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[5]") WebElement txtconfirmationFinalBillTeaser2;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[7]") WebElement txtconfirmationFinalBillTeaser3;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[9]") WebElement txtconfirmationFinalBillTeaser4;
	@FindBy(xpath="(//div[@class='account__box bg__box'])[2]/p") WebElement txtSaveWaterTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block']") WebElement btnToptipsToSaveWater;
	@FindBy(xpath="(//div[@class='accordion__item'])[1]/h5/a") WebElement accordianShowMeDetails;
	@FindBy(xpath="(//div[@class='row-bg'])[1]/p[2]") WebElement txtFullName1;
	@FindBy(xpath="(//div[@class='row-bg'])[2]/p[2]") WebElement txtEmailID1;
	@FindBy(xpath="(//div[@class='row-bg'])[3]/p[2]") WebElement txtDOB1;
	@FindBy(xpath="(//div[@class='row-bg'])[4]/p[2]") WebElement txtMovingInDate;
	@FindBy(xpath="(//div[@class='row-bg'])[6]/p[2]") WebElement txtOccupancy1;
	@FindBy(xpath="//div[@class='accordion__item']/h5/a") WebElement accordianMarketingPreferences;
	@FindBy(xpath="//label[@class='form-toggle']") List<WebElement> toggles;
	@FindBy(xpath="(//div[@class='row-bg'])[7]") WebElement txtSuccessMsgTeaser4;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-outline']") WebElement btnGoToHelpCentre;
	@FindBy(xpath="(//i[@class='far fa-user-alt'])[3]") WebElement linkMyAccount;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[4]/li[1]/a") WebElement btnMyAccountDashboard;
	@FindBy(xpath="//li[@class='owl-dot active']") WebElement tabAccountDashboard;
	@FindBy(xpath="(//div[@class='account-form'])[1]/h4") WebElement txtaccountSummaryInprocessHeading;
	@FindBy(xpath="(//div[@class='account-form'])[1]/p[2]") WebElement txtaccountSummaryInprocessTeaser1;
	@FindBy(xpath="(//div[@class='account-form'])[1]/p[4]") WebElement txtaccountSummaryInprocessTeaser2;
	@FindBy(xpath="(//div[@class='account-form'])[1]/p[5]") WebElement txtaccountSummaryInprocessTeaser3;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
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
	@FindBy(xpath="//label[@oramdlabel='CM_MIMO_PAY_PREF_LBL']") WebElement txtCCBPaymentPreferences;
	@FindBy(xpath="(//a[@class='normal oraLink'])[6]") WebElement linkCCBAddress;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin '])[1]") WebElement txtCCBPremise;
	
	String email, name="Karthi A", dob="10/10/2000", mobile="09876543210", miDate_App, miDate_CCB, bankNumber, sortcode;
	String confirmationNumber;

	public NewCustomerMoveIntoUnmeasuredProperty_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//NewCustomerMoveIntoUnmeasuredProperty.properties");
	}
	
	public void navigateToCreateAnAccountTab() throws Exception {
		elementVisible(100, tabCreateAnAccount);
		tabCreateAnAccount.click();
		elementVisible(100, txtCreateAnAccount);
		Assert.assertEquals(true, txtCreateAnAccountTeaser.getText().contains(c.getData("createAnAccountTeaser")));
		Assert.assertEquals(true, txtFirstName.isDisplayed());
		Assert.assertEquals(true, txtSurName.isDisplayed());
		btnEmailInfoIcon.click();
		elementVisible(100, txtEmailInfoIcon);
		Assert.assertEquals(true, txtEmailInfoIcon.getText().contains(c.getData("emailInformationText")));
		Thread.sleep(500);
		btnEmailInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtEmail.isDisplayed());
		btnPasswordInfoIcon.click();
		elementVisible(100, txtPasswordInfoIcon);
		Assert.assertEquals(true, txtPasswordInfoIcon.getText().contains(c.getData("passwordInformationText")));
		Thread.sleep(500);
		btnPasswordInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword.isDisplayed());
		Assert.assertEquals(true, txtConfirmPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword1.isDisplayed());
		btnOurCustomerInfoIcon.click();
		elementVisible(100, txtOurCustomerInfoIcon);
		Assert.assertEquals(true, txtOurCustomerInfoIcon.getText().contains(c.getData("ourCustomerInformationText")));
		Thread.sleep(500);
		btnOurCustomerInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnCustomerYes.isDisplayed());
		Assert.assertEquals(true, btnCustomerNo.isDisplayed());
	}

	public void entersAccountDetails(String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCreateAnAccount);
		String[] fullName = name.split(" ");
		txtFirstName.sendKeys(fullName[0]);
		txtSurName.sendKeys(fullName[1]);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		LocalDateTime timeNow = LocalDateTime.now();  
		email = "nwl" + dtf.format(timeNow) + "@yopmail.com";
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(pwd);
		linkShowPassword.click();
		Thread.sleep(500);
		txtConfirmPassword.sendKeys(pwd);
		linkShowPassword.click();
		Thread.sleep(500);
		btnCustomerNo.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnCreateMyOnlineAccount.isDisplayed());
		Assert.assertEquals(true, linkYourPrivacy.isDisplayed());
		Assert.assertEquals(true, linkProtectYourAccount.isDisplayed());
		Assert.assertEquals(true, txtLandlordTeaser.getText().contains(c.getData("landlordTeaser")));
		Assert.assertEquals(true, linkLandlordMoreInformation.isDisplayed());
		Assert.assertEquals(true, txtBusinessAccountOnlineTeaser.getText().contains(c.getData("businessAccountOnlineTeaser")));
		Assert.assertEquals(true, linkBusinessAccountOnline.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCreateAnAccount);		
	}

	public void clicksOnCreateMyOnlineAccountButton() throws Exception {
		btnCreateMyOnlineAccount.click();
		elementVisible(100, txtSuccessMsgTeaser);
		String[] successMsgTeaser = txtSuccessMsgTeaser.getText().split("\n");
		Assert.assertEquals(true, successMsgTeaser[0].contains(c.getData("successMessageTeaser1")));
		Assert.assertEquals(true, successMsgTeaser[1].contains(c.getData("successMessageTeaser2")+" "+email));
		Assert.assertEquals(true, successMsgTeaser[2].contains(c.getData("successMessageTeaser3")));
		Assert.assertEquals(true, linkNotYourEmailAddress.isDisplayed());
		Assert.assertEquals(true, linkResendEmail.isDisplayed());
		Assert.assertEquals(true, linkGoToHomePage.isDisplayed());
	}

	public void clicksOnGoToHomePagelink() throws Exception {
		linkGoToHomePage.click();
		elementVisible(100, linkAccount);
		Thread.sleep(1000);
	}

	public void userOpensYopMailWebsite() throws Exception {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.open('https://yopmail.com/en/' ,'_blank');");
		Thread.sleep(1000);
		handleMultipleTabs(1);
		elementVisible(100, btnYopmailConsent);
		btnYopmailConsent.click();
		Thread.sleep(500);
		txtYopmailEmail.sendKeys(email);
		Thread.sleep(500);
	}
	
	public void userClicksOnTheActivationMail() throws Exception {
		elementVisible(100, btnYopmailEnter);
		btnYopmailEnter.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("ifinbox")));
		btnEmailHeading.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnVerifyAccount);
		Thread.sleep(500);
	}

	public void navigateToNWLWebsite() throws Exception {
		btnVerifyAccount.click();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, txtWelcomeTeaser);
		Assert.assertEquals(true, txtWelcomeTeaser.getText().contains(c.getData("welcomeTeaser")));
		Assert.assertEquals(true, btnNext1.isDisplayed());
	}

	public void navigateToTellUsAboutYourselfPage() throws Exception {
		btnNext1.click();
		elementVisible(100, titleTellUsAboutYourself);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleTellUsAboutYourself);
		Assert.assertEquals(true, txtLetsStartWithYourName.getText().contains(c.getData("tellUsAboutYourselfTeaser")));
		Assert.assertEquals(true, dropdownTitle.isDisplayed());
		Assert.assertEquals(true, txtFirstName1.isDisplayed());
		Assert.assertEquals(true, txtSurName1.isDisplayed());
		Assert.assertEquals(true, txtDOBDate.isDisplayed());
		Assert.assertEquals(true, txtDOBMonth.isDisplayed());
		Assert.assertEquals(true, txtDOBYear.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.isDisplayed());
		btnPhoneNoInfoIcon.click();
		elementVisible(100, txtPhoneNoInfoIcon);
		Assert.assertEquals(true, txtPhoneNoInfoIcon.getText().contains(c.getData("phoneNoInformationText")));
		Thread.sleep(1000);
		btnPhoneNoInfoIconClose.click();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleTellUsAboutYourself);
	}
	
	public void enterCustomerDetails() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownTitle);
		dropdownTitle.click();
		elementVisible(100, dropdownTitleMr);
		dropdownTitleMr.click();
		String[] fullName = name.split(" ");
		Assert.assertEquals(true, txtFirstName1.getText().contains(fullName[0]));
		Assert.assertEquals(true, txtSurName1.getText().contains(fullName[1]));
		String[] dob1 = dob.split("/");
		txtDOBDate.sendKeys(dob1[0]);
		txtDOBMonth.sendKeys(dob1[1]);
		txtDOBYear.sendKeys(dob1[2]);
		txtPhoneNo.sendKeys(mobile);
		Thread.sleep(500);
	}

	public void clicksAAH_No() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnAAHInfoIcon);
		btnAAHInfoIcon.click();
		elementVisible(100, txtAAHInfoIcon);
		Assert.assertEquals(true, txtAAHInfoIcon.getText().contains(c.getData("additionalAccountHolderInformationText")));
		Thread.sleep(1000);
		btnAAHInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtAdditionalAccountHolderTeaser1.getText().contains(c.getData("additionalAccountHolderTeaser1")));
		Assert.assertEquals(true, txtAdditionalAccountHolderTeaser2.getText().contains(c.getData("additionalAccountHolderTeaser2")));
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		btnNo.click();
		Thread.sleep(500);
	}

	public void clicksPSAndHWYB_No() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnPSInfoIcon);
		btnPSInfoIcon.click();
		elementVisible(100, txtPSInfoIcon);
		Assert.assertEquals(true, txtPSInfoIcon.getText().contains(c.getData("psInformationText")));
		Thread.sleep(1000);
		btnPSInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPSTeaser.getText().contains(c.getData("psTeaser")));
		Assert.assertEquals(true, checkPriorityServices.isDisplayed());
		btnHWYBInfoIcon.click();
		elementVisible(100, txtHWYBInfoIcon);
		Assert.assertEquals(true, txtHWYBInfoIcon.getText().contains(c.getData("helpWithYourBillsInformationText")));
		Thread.sleep(1000);
		btnHWYBInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtHelpWithYourBillsTeaser.getText().contains(c.getData("helpWithYourBillsTeaser")));
		Assert.assertEquals(true, checkHelpWithYourBills.isDisplayed());
		Assert.assertEquals(true, linkIAmCurrentlyACustomer.isDisplayed());
		Assert.assertEquals(true, btnNext2.isDisplayed());
	}

	public void navigateToYourNewHomePage(String moveInDate) throws Exception {
		btnNext2.click();
		elementVisible(100, txtYourNewHome);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourNewHome);
        Assert.assertEquals(true, txtWhenMovingIntoNewHome.getText().contains(c.getData("moveInDateLabel")));
        btnMoveInDate.click();
		Thread.sleep(1000);
		miDate_App = moveInDate;
		miDate_CCB = moveInDate.replaceAll("/", "-");
		txtMoveInDate.sendKeys(moveInDate);
		//txtWhenMovingIntoNewHome.click();
		txtFindMyAddress.click();
		Thread.sleep(1000);
	}

	public void enterUnmeasuredPremiseAddress(String miAddress) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
		btnFindMyAddressInfoIcon.click();
		elementVisible(100, txtFindMyAddressInfoIcon);
		Assert.assertEquals(true, txtFindMyAddressInfoIcon.getText().contains(c.getData("findMyAddressInformationText")));
		Thread.sleep(1000);
		btnFindMyAddressInfoIconClose.click();
		Thread.sleep(1000);
		txtFindMyAddress.sendKeys(miAddress);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		btnOccupancyInfoIcon.click();
		elementVisible(100, txtOccupancyInfoIcon);
		Assert.assertEquals(true, txtOccupancyInfoIcon.getText().contains(c.getData("occupancyInformationText")));
		Thread.sleep(1000);
		btnOccupancyInfoIconClose.click();
		Thread.sleep(1000);
		btnPlsSelect.click();
		Thread.sleep(1000);
		dropdownOccupancyCount.click();
		Assert.assertEquals(true, btnYes1.isDisplayed());
		Assert.assertEquals(true, btnNo1.isDisplayed());
		btnNo1.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnWhyWeAsk.isDisplayed());
		btnWhyWeAsk.click();
		elementVisible(100, txtWhyWeAskInfo);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtWhyWeAskInfo.getText().contains(c.getData("whyWeAskInformationText")));
		btnWhyWeAsk.click();
		Assert.assertEquals(true, btnNext3.isDisplayed());
		Assert.assertEquals(true, btnGoBack1.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);		
	}

	public void navigateToYourBillsPage() throws Exception {
		btnNext3.click();
		elementVisible(100, txtYourBills);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
        Assert.assertEquals(true, txtUnmeteredTeaser.getText().contains(c.getData("unmeteredTeaser")));
	}

	public void selectedSetupDirectDebitAsYes() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtsetupDirectDebitLabel);
		Assert.assertEquals(true, txtsetupDirectDebitLabel.getText().contains(c.getData("setupDirectDebitLabel")));
		Assert.assertEquals(true, btnDirectDebitYes.isDisplayed());
		Assert.assertEquals(true, btnDirectDebitNo.isDisplayed());
		Assert.assertEquals(true, txtSetupDirectDebitTeaser1.getText().contains(c.getData("setupDirectDebitTeaser1")));
		btnDirectDebitYes.click();
		elementVisible(100, txtSetupDirectDebitTeaser2);
		Assert.assertEquals(true, txtSetupDirectDebitTeaser2.getText().contains(c.getData("setupDirectDebitTeaser2")));
		Assert.assertEquals(true, txtAuthoriseAccountHolder.getText().contains(c.getData("authoriseAccountHolderLabel")));
		btnAuthoriseAccountHolderInfoIcon.click();
		elementVisible(100, txtAuthoriseAccountHolderInfoIcon);
		Assert.assertEquals(true, txtAuthoriseAccountHolderInfoIcon.getText().contains(c.getData("authoriseAccountHolderInformationText")));
		Thread.sleep(1000);
		btnAuthoriseAccountHolderInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnAuthoriseAccountHolderYes.isDisplayed());
		Assert.assertEquals(true, btnAuthoriseAccountHolderNo.isDisplayed());
	}

	public void selectedAuthoriseAccountHolderAsNo() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAuthoriseAccountHolder);
		btnAuthoriseAccountHolderNo.click();
		elementVisible(100, txtAuthoriseAccountHolderNoTeaser1);
		Assert.assertEquals(true, txtAuthoriseAccountHolderNoTeaser1.getText().contains(c.getData("authoriseAccountHolderNoTeaser1")));
		Assert.assertEquals(true, txtAuthoriseAccountHolderNoTeaser2.getText().contains(c.getData("authoriseAccountHolderNoTeaser2")));
		Assert.assertEquals(true, txtAuthoriseAccountHolderNoTeaser3.getText().contains(c.getData("authoriseAccountHolderNoTeaser3")));
		Assert.assertEquals(true, linkDownloadMeteredPropertyDDI.isDisplayed());
		Assert.assertEquals(true, linkDownloadUnmeteredPropertyDDI.isDisplayed());
		Assert.assertEquals(true, linkDownloadAdobeAcrobat.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAuthoriseAccountHolder);
	}

	public void verifiesDownloadMeteredPropertyDDILinkNavigation() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAuthoriseAccountHolderNoTeaser1);
		linkDownloadMeteredPropertyDDI.click();
		Thread.sleep(3000);
		handleMultipleTabs(3);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("meteredDDINavigationURL")));
		Thread.sleep(500);
	}

	public void verifiesDownloadUnmeteredPropertyDDILinkNavigation() throws Exception {
		driver.close();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, linkDownloadUnmeteredPropertyDDI);
		linkDownloadUnmeteredPropertyDDI.click();
		Thread.sleep(3000);
		handleMultipleTabs(3);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("unmeteredDDINavigationURL")));
		Thread.sleep(500);
	}

	public void verifiesDownloadAdobeAcrobatLinkNavigation() throws Exception {
		driver.close();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, linkDownloadAdobeAcrobat);
		linkDownloadAdobeAcrobat.click();
		Thread.sleep(3000);
		handleMultipleTabs(3);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("adobeAcrobatNavigationURL")));
		Thread.sleep(500);
	}

	public void userChangesAuthoriseAccountHolderFromNoToYes() throws Exception {
		driver.close();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, linkDownloadAdobeAcrobat);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAuthoriseAccountHolder);
		btnAuthoriseAccountHolderYes.click();
		elementVisible(100, txtPayByDirectDebitLabel);
		Assert.assertEquals(true, txtPayByDirectDebitLabel.getText().contains(c.getData("payByDirectDebitLabel")));
		btnPayByDirectDebitInfoIcon.click();
		elementVisible(100, txtPayByDirectDebitInfoIcon);
		Assert.assertEquals(true, txtPayByDirectDebitInfoIcon.getText().contains(c.getData("payByDirectDebitInformationText")));
		Thread.sleep(1000);
		btnPayByDirectDebitInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, dropdownPayByDirectDebit.isDisplayed());
		Assert.assertEquals(true, txtMonthly.getText().contains("Monthly"));
		Assert.assertEquals(true, dropdownPaymentDate.isDisplayed());
	}

	public void shouldPaymentDateFieldDisappears() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayByDirectDebitLabel);
		dropdownPayByDirectDebit.click();
		elementVisible(100, btnAnnual);
		btnAnnual.click();
		Thread.sleep(1000);
		Assert.assertEquals(false, dropdownPaymentDate.isDisplayed());
	}

	public void shouldPaymentDateFieldReappears() throws Exception {
		dropdownPayByDirectDebit.click();
		elementVisible(100, btnMonthly);
		btnMonthly.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, dropdownPaymentDate.isDisplayed());
		btnPaymentDateInfoIcon.click();
		elementVisible(100, txtPaymentDateInfoIcon);
		Assert.assertEquals(true, txtPaymentDateInfoIcon.getText().contains(c.getData("paymentDateInformationText")));
		Thread.sleep(1000);
		btnPaymentDateInfoIconClose.click();
		Thread.sleep(1000);
		dropdownPaymentDate.click();
		elementVisible(100, btn1st);
		btn1st.click();
		Thread.sleep(1000);
	}

	public void userEntersBankAccountDetails(String bankAccNo, String sortCode) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNameOfAccHolderLabel);
		Assert.assertEquals(true, txtNameOfAccHolderTypeHere.isDisplayed());
		txtNameOfAccHolderTypeHere.sendKeys("Karthi");
		btnBranchSortCodeInfoIcon.click();
		elementVisible(100, txtBranchSortCodeInfoIcon);
		Assert.assertEquals(true, txtBranchSortCodeInfoIcon.getText().contains(c.getData("branchSortCodeInformationText")));
		Thread.sleep(1000);
		btnBranchSortCodeInfoIconClose.click();
		Thread.sleep(1000);
		sortcode=sortCode;
		txtBranchSortCode.sendKeys(sortcode.replaceAll("-", ""));
		Thread.sleep(1000);
		btnYourBankInfoIcon.click();
		elementVisible(100, txtYourBankInfoIcon);
		Assert.assertEquals(true, txtYourBankInfoIcon.getText().contains(c.getData("yourBankInformationText")));
		Thread.sleep(1000);
		btnYourBankInfoIconClose.click();
		Thread.sleep(1000);
		bankNumber=bankAccNo;
		txtYourBankNumber.sendKeys(bankNumber);
		elementVisible(100, txtBankName1);
		Assert.assertEquals(true, txtBankName1.getText().contains(c.getData("bankName")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNameOfAccHolderTypeHere);
	}

	public void userVerifiesReadTheDirectDebitGuaranteeLink() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkReadDirectDebitGuarantee);
		Assert.assertEquals(true, linkReadDirectDebitGuarantee.isDisplayed());
		linkReadDirectDebitGuarantee.click();
		elementVisible(100, txtDirectDebitGuaranteeTeaser1);
		Assert.assertEquals(true, txtDirectDebitGuaranteeTeaser1.getText().contains(c.getData("directDebitGuaranteeTeaser1")));
		Assert.assertEquals(true, txtDirectDebitGuaranteeTeaser2.getText().contains(c.getData("directDebitGuaranteeTeaser2")));
		String[] directDebitGuaranteeTeaser3 = txtDirectDebitGuaranteeTeaser3.getText().split("\n");
		Assert.assertEquals(true, directDebitGuaranteeTeaser3[0].contains(c.getData("directDebitGuaranteeTeaser3")));
		Assert.assertEquals(true, directDebitGuaranteeTeaser3[1].contains(c.getData("directDebitGuaranteeTeaser3a")));
		Assert.assertEquals(true, txtDirectDebitGuaranteeTeaser4.getText().contains(c.getData("directDebitGuaranteeTeaser4")));
		Assert.assertEquals(true, btnNext4.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkReadDirectDebitGuarantee);
	}

	public void navigateYourNewDirectDebitScreen() throws Exception {
		linkReadDirectDebitGuarantee.click();
		Thread.sleep(2000);
		btnNext4.click();
		elementVisible(100, txtYourNewDirectDebit);
		Assert.assertEquals(true, txtYourNewDirectDebitTeaser.getText().contains(c.getData("yourNewDirectDebitTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAccountName);
		Assert.assertEquals(true, txtAccountName.getText().contains("Karthi"));
		Assert.assertEquals(true, txtAccountNumber.getText().contains(bankNumber));
		Assert.assertEquals(true, txtSortCode.getText().contains(sortcode));
		Assert.assertEquals(true, txtBankName2.getText().contains(c.getData("bankName")));
		Assert.assertEquals(true, txtReferenceNoTeaser.getText().contains(c.getData("referenceNoTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBankTeaser1);
		Assert.assertEquals(true, txtBankTeaser1.getText().contains(c.getData("bankTeaser1")));
		Assert.assertEquals(true, txtPaymentDate.getText().contains("1st"));
		Assert.assertEquals(true, txtFrequency.getText().contains("Monthly"));
		Assert.assertEquals(true, txtBankTeaser2.getText().contains(c.getData("bankTeaser2")));
		Assert.assertEquals(true, txtBankTeaser3.getText().contains(c.getData("bankTeaser3")));
		Assert.assertEquals(true, txtBankTeaser4.getText().contains(c.getData("bankTeaser4")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAccountName);
	}

	public void directDebitGuaranteeLinkNavigation() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkMoreInformationAboutDDG);
		Assert.assertEquals(true, linkMoreInformationAboutDDG.isDisplayed());
		linkMoreInformationAboutDDG.click();
		Thread.sleep(3000);
		handleMultipleTabs(3);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("directDebitGuaranteeLinkNavigation")));
		Thread.sleep(500);
	}

	public void navigateToReadyScreen() throws Exception {
		driver.close();
		Thread.sleep(2000);
		handleMultipleTabs(2);
		elementVisible(100, btnConfirm);
		Assert.assertEquals(true, btnConfirm.isDisplayed());
		Assert.assertEquals(true, btnGoBack3.isDisplayed());
		btnConfirm.click();
		elementVisible(100, txtReady);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtReady);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		Assert.assertEquals(true, txtFullName.getText().equalsIgnoreCase("Mr. "+name));
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(email));
		Assert.assertEquals(true, txtDOB.getText().equalsIgnoreCase(dob));
		Assert.assertEquals(true, txtMobile.getText().equalsIgnoreCase(mobile));
		Assert.assertEquals(true, txtMIDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy.getText().equalsIgnoreCase("4"));
		Assert.assertEquals(true, btnDone.isDisplayed());
		Assert.assertEquals(true, btnGoBack4.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFullName);
	}

	public void navigateToConfirmationScreen() throws Exception {
		btnDone.click();
		elementVisible(200, txtGreatYouAreDone);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);	
		Assert.assertEquals(true, txtEmailYouInformation.getText().contains(c.getData("successMsgTeaser1")+" "+email));
		confirmationNumber=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtYouCanCheckAboutMove.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtUpdateYourAccount.getText().contains(c.getData("successMsgTeaser3")));
		/*Assert.assertEquals(true, txtConfirmationFinalBillTeaser.getText().contains(c.getData("confirmationFinalBillTeaser")));
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser1.getText().contains(c.getData("confirmationFinalBillTeaser1")));
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser2.getText().contains(c.getData("confirmationFinalBillTeaser2")));
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser3.getText().contains(c.getData("confirmationFinalBillTeaser3")));
		Assert.assertEquals(true, txtconfirmationFinalBillTeaser4.getText().contains(c.getData("confirmationFinalBillTeaser4")));*/
		Assert.assertEquals(true, txtSaveWaterTeaser.getText().contains(c.getData("saveWaterTeaser")));
		Assert.assertEquals(true, btnToptipsToSaveWater.isDisplayed());
	}
	
	public void showMeTheDetailsSection() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordianShowMeDetails);
		Assert.assertEquals(true, accordianShowMeDetails.isDisplayed());
		accordianShowMeDetails.click();
		elementVisible(100, txtFullName1);
		Assert.assertEquals(true, txtFullName1.getText().equalsIgnoreCase("Mr. "+name));
		Assert.assertEquals(true, txtEmailID1.getText().equalsIgnoreCase(email));
		Assert.assertEquals(true, txtDOB1.getText().equalsIgnoreCase(dob));
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
			Assert.assertEquals(false, toggle.isSelected());
			Thread.sleep(300);
		}
	}
	
	public void helpCentreButtonNavigation() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSuccessMsgTeaser4);
		Assert.assertEquals(true, txtSuccessMsgTeaser4.getText().contains(c.getData("successMsgTeaser4")));
		Assert.assertEquals(true, btnGoToHelpCentre.isDisplayed());
		btnGoToHelpCentre.click();
		Thread.sleep(3000);
		elementVisible(100, linkMyAccount);
		Assert.assertEquals(true, driver.getCurrentUrl().contains(c.getData("helpCentreButtonNavigation")));
	}

	public void navigateToADTab() throws Exception {
		linkMyAccount.click();
		Thread.sleep(2000);
		elementVisible(100, btnMyAccountDashboard);
		btnMyAccountDashboard.click();
		Thread.sleep(5000);
		elementVisible(100, tabAccountDashboard);
		Assert.assertEquals(true, tabAccountDashboard.getText().contains(c.getData("tabName1")));
	}
	
	public void verifyPreAccountSetupMsg() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtaccountSummaryInprocessHeading);
    	Thread.sleep(1000);
    	Assert.assertEquals(true, txtaccountSummaryInprocessHeading.getText().contains(c.getData("accountSummaryInprocessHeading")));
    	Assert.assertEquals(true, txtaccountSummaryInprocessTeaser1.getText().contains(c.getData("accountSummaryInprocessTeaser1")));
    	Assert.assertEquals(true, txtaccountSummaryInprocessTeaser2.getText().contains(c.getData("accountSummaryInprocessTeaser2")));
    	Assert.assertEquals(true, txtaccountSummaryInprocessTeaser3.getText().contains(c.getData("accountSummaryInprocessTeaser3")));
	}

	public void verifyCCMainTabInCCB(String username, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(3);
		Thread.sleep(1000);
		btnCCBUserID.sendKeys(username);
		btnCCBPwd.sendKeys(pwd);
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
		Thread.sleep(10000);
		handleMultipleTabs(4);
		elementVisible(100, txtCCBCustomerContactID);
		txtCCBCustomerContactID.sendKeys(confirmationNumber);
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

	public void verifyAccountHolder_PersonsTabInCCB() throws Exception {
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

	public void verifyPaymentPreferencesSectionInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBPaymentPreferences);
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
