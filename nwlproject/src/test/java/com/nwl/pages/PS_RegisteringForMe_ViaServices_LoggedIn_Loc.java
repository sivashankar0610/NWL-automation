package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class PS_RegisteringForMe_ViaServices_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//nav[@id='loginedMenu']/ul/li[1]/a") WebElement linkServices;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[3]/li[3]") WebElement linkExtraSupport;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[3]/li[3]/ul/li[1]/a") WebElement linkSignUpForPriorityServices;
	@FindBy(xpath="//h2[@class='pb-40']") WebElement txtPriorityServices;
	@FindBy(xpath="//div[@class='single-block-main-container text-center']/div/div/div[1]/p") WebElement txtPriorityServicesTeaser;
	@FindBy(xpath="//h5[text()='Sign up to Priority Services']") WebElement btnRegForPriorityServices;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h2") WebElement txtSignUpToPriorityServices1;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/p") WebElement txtSignUpToPriorityServicesTeaser1;
	@FindBy(xpath="(//div[@class='sub-title'])[1]/p") WebElement txtSignUpToPriorityServicesTeaser2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-psregisterme']") WebElement btnPSRegisterWhoLivesWithMe;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-psregisterother']") WebElement btnPSRegisterWhoDoesNotLivesWithMe;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]/h2") WebElement txtSignUpToPriorityServices2;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]/p") WebElement txtSignUpToPriorityServicesTeaser3;
	@FindBy(xpath="(//div[@class='nb-col-6'])[2]") WebElement btnForMe;
	@FindBy(xpath="(//div[@class='nb-col-6'])[3]") WebElement btnForSomeoneElse;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-next-who']") WebElement btnNext1;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]/h2") WebElement txtYourPriorityServicesOptions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack;
	@FindBy(xpath="(//div[@class='sub-title'])[10]") WebElement txtRegPersonAffectedBy;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[17]") WebElement btnRegPersonAffectedByInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[17]") WebElement txtRegPersonAffectedByInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[17]") WebElement btnRegPersonAffectedByInfoIconClose;
	@FindBy(xpath="//div[@class='ps-form-affected-by']/div/label") List<WebElement> btnRegPersonAffectedByOptions;
	@FindBy(xpath="(//div[@class='sub-title'])[11]") WebElement txtRegPersonAffectedByCircumstances;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[18]") WebElement btnRegPersonAffectedByCircumstancesInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[18]") WebElement txtRegPersonAffectedByCircumstancesInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[18]") WebElement btnRegPersonAffectedByCircumstancesInfoIconClose;
	@FindBy(xpath="//div[@class='form-row ps-form-affected-circumstances']/div/label") List<WebElement> radioRegPersonAffectedByCircumstancesOptions;
	@FindBy(xpath="(//div[@class='sub-title'])[12]") WebElement txtRegPersonWithBottledWater;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[19]") WebElement btnRegPersonWithBottledWaterInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[19]") WebElement txtRegPersonWithBottledWaterInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[19]") WebElement btnRegPersonWithBottledWaterInfoIconClose;
	@FindBy(xpath="(//label[@class='chk-button'])[18]") WebElement btnRegPersonWithBottledWater_Yes;
	@FindBy(xpath="(//label[@class='chk-button'])[19]") WebElement btnRegPersonWithBottledWater_No;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[20]") WebElement btnSupportRegPersonInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[20]") WebElement txtSupportRegPersonInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[20]") WebElement btnSupportRegPersonInfoIconClose;
	@FindBy(xpath="//p[@class='normal']") WebElement txtSupportRegPersonTeaser;
	@FindBy(xpath="//textarea[@name='contactus-additional-details']") WebElement txtSupportRegPerson;
	@FindBy(xpath="(//div[@class='sub-title'])[10]") WebElement txSetPwdToProveIdentity;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[21]") WebElement btnSetPwdToProveIdentityInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[21]") WebElement txtSetPwdToProveIdentityInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[21]") WebElement btnSetPwdToProveIdentityInfoIconClose;
	@FindBy(xpath="//input[@class='form-control bogusCallerPassword']") WebElement txtPassword;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[22]") WebElement btnHowWouldYouLikeYourBillInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[22]") WebElement txtHowWouldYouLikeYourBillInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[22]") WebElement btnHowWouldYouLikeYourBillInfoIconClose;
	@FindBy(xpath="//div[@class='form-row wp-list-check']/div/label") List<WebElement> radioHowWouldYouLikeYourBillOptions;
	@FindBy(xpath="(//div[@class='sub-title'])[12]") WebElement txtHearAboutThePriorityServicesRegister;
	@FindBy(xpath="//div[@class='form-select selected']") WebElement dropdownHearAboutThePriorityServicesRegister;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> dropdownHearAboutThePSROptions;
	@FindBy(xpath="//label[@class='form-checkbox consent']/span[1]") WebElement checkBoxConsent;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit']") WebElement btnNext2;
	@FindBy(xpath="//a[@class='breadcrumb-home']") WebElement txtHome;
	@FindBy(xpath="(//div[@class='account-teaser'])[6]/h2") WebElement txtRegistrationComplete;
	//@FindBy(xpath="//span[@class='psr-completion-teaser']") WebElement txtSuccessMsgTeaser;
	@FindBy(id="lblCompleteContactId") WebElement txtConfirmationNo;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block nb-btn-outline'])[1]") WebElement btnBackToPriorityServices;
	/*@FindBy(xpath="//h4[@class='pb-40']") WebElement txtPriorityServices;
	@FindBy(xpath="//h4[@class='pb-40']//following-sibling::div/div/p") WebElement txtPriorityServicesTeaser;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn__arrow animation animated fadeInLeft'])[1]") WebElement btnRegForProrityServices;*/
	@FindBy(xpath="//a[@title='My account']") WebElement btnMyAccount;
	@FindBy(xpath="//a[@aria-label='My account']/following-sibling::div/div/ul/li[1]") WebElement btnMyAccountDashboard;
	@FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	@FindBy(xpath="//div[@class='small-title pb-20']") WebElement txtPriorityServices_MP;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[45]") WebElement btnPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[43]") WebElement txtPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[45]") WebElement btnPriorityServices_MPInfoIconClose;
	@FindBy(xpath="(//div[@class='pb-20'])[2]") WebElement txtPriorityServices_MPTeaser;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block change-psr-options']") WebElement btnChangePriorityServicesOptions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block remove-psr']") WebElement btnRemovePriorityServices;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBCharacteristics;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin '])[1]/label") WebElement txtCCBCustomerContactInfo;
	@FindBy(xpath="//span[@id='IM_accountInfoButton']") WebElement btnCCBAccountInformation;
	@FindBy(xpath="//label[@oramdlabel='CM_MAIN_DTLS']") WebElement txtCCBMainDetails;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(xpath="//span[@id='personId']/a") WebElement linkCCBPersonName;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin ']/label)[1]") WebElement txtCCBPersonInformation;
	@FindBy(xpath="(//td[@class='inactiveTab'])[4]") WebElement tabCCBPersonPortal;
	@FindBy(id="title_heading_1") WebElement txtCCBGeneralInformation;
	
	String confirmationNumber;
	
	public PS_RegisteringForMe_ViaServices_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//PS_RegisteringForMe_ViaServices_LoggedIn.properties");
	}
	
	public void redirectedToPriorityServicesPage() throws Exception {
		elementVisible(100, linkServices);
		Thread.sleep(2000);
		linkServices.click();
		elementVisible(100, linkExtraSupport);
		linkExtraSupport.click();
		elementVisible(100, linkSignUpForPriorityServices);
		linkSignUpForPriorityServices.click();
		//elementVisible(100, txtPriorityServices);
		//Assert.assertEquals(true, txtPriorityServicesTeaser.getText().contains(c.getData("priorityServicesTeaser")));
		Assert.assertEquals(true, btnRegForPriorityServices.isDisplayed());	
	}

	public void navigateToSignUpToPriorityServicesPage1() throws Exception {
		btnRegForPriorityServices.click();
		elementVisible(100, txtSignUpToPriorityServices1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSignUpToPriorityServices1);
		Assert.assertEquals(true, txtSignUpToPriorityServicesTeaser1.getText().contains(c.getData("signUpToPriorityServicesTeaser1")));
		Assert.assertEquals(true, txtSignUpToPriorityServicesTeaser2.getText().contains(c.getData("signUpToPriorityServicesTeaser2")));
		Assert.assertEquals(true, btnPSRegisterWhoLivesWithMe.isDisplayed());
		Assert.assertEquals(true, btnPSRegisterWhoDoesNotLivesWithMe.isDisplayed());
	}

	public void navigateToSignUpToPriorityServicesPage2() throws Exception {
		btnPSRegisterWhoLivesWithMe.click();
		elementVisible(100, txtSignUpToPriorityServices2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSignUpToPriorityServices2);
		Assert.assertEquals(true, txtSignUpToPriorityServicesTeaser3.getText().contains(c.getData("signUpToPriorityServicesTeaser3")));
		Assert.assertEquals(true, btnForMe.isDisplayed());
		Assert.assertEquals(true, btnForSomeoneElse.isDisplayed());
		Assert.assertEquals(true, btnNext1.isDisplayed());
	}

	public void userSelectsForMeButton() throws Exception {
		btnForMe.click();
		Thread.sleep(500);
	}

	public void navigateToYourPriorityServicesOptionsPage() {
		btnNext1.click();
		elementVisible(100, txtYourPriorityServicesOptions);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourPriorityServicesOptions);
	}

	public void userClicksOnGoBackButton() throws Exception {
		btnGoBack.click();
		elementVisible(100, txtSignUpToPriorityServices1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSignUpToPriorityServices1);
		Assert.assertEquals(true, txtSignUpToPriorityServicesTeaser1.getText().contains(c.getData("signUpToPriorityServicesTeaser1")));
		Assert.assertEquals(true, txtSignUpToPriorityServicesTeaser2.getText().contains(c.getData("signUpToPriorityServicesTeaser2")));
		Assert.assertEquals(true, btnPSRegisterWhoLivesWithMe.isDisplayed());
		Assert.assertEquals(true, btnPSRegisterWhoDoesNotLivesWithMe.isDisplayed());
	}

	public void userSelectsBlindOptionForRegisteredPersonAffectedBy() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonAffectedBy);
		btnRegPersonAffectedByInfoIcon.click();
		elementVisible(100, txtRegPersonAffectedByInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRegPersonAffectedByInfoIcon.getText().contains(c.getData("regPersonAffectedByInformationText")));
		btnRegPersonAffectedByInfoIconClose.click();
		Thread.sleep(1000);
		for (int i = 0; i < btnRegPersonAffectedByOptions.size()-12; i++) {
			btnRegPersonAffectedByOptions.get(i).click();
				Thread.sleep(500);
		}
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonAffectedBy);
	}

	public void userSelectsAnyOptionForRegisteredPersonAffectedByCircumstances(String option) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonAffectedByCircumstances);
		btnRegPersonAffectedByCircumstancesInfoIcon.click();
		elementVisible(100, txtRegPersonAffectedByCircumstancesInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRegPersonAffectedByCircumstancesInfoIcon.getText().contains(c.getData("regPersonAffectedByCircumstancesInformationText")));
		btnRegPersonAffectedByCircumstancesInfoIconClose.click();
		Thread.sleep(1000);
		for (int i = 1; i <= radioRegPersonAffectedByCircumstancesOptions.size(); i++) {
			if (option.equalsIgnoreCase(Integer.toString(i))) {
				radioRegPersonAffectedByCircumstancesOptions.get(i-1).click();
				Thread.sleep(500);
				break;
			}
		}
	}

	public void userSelectsYesOptionForRegisteredPersonWithBottledWater() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonWithBottledWater);
		btnRegPersonWithBottledWaterInfoIcon.click();
		elementVisible(100, txtRegPersonWithBottledWaterInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRegPersonWithBottledWaterInfoIcon.getText().contains(c.getData("regPersonWithBottledWaterInformationText")));
		btnRegPersonWithBottledWaterInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnRegPersonWithBottledWater_Yes.isDisplayed());
		Assert.assertEquals(true, btnRegPersonWithBottledWater_No.isDisplayed());
		btnRegPersonWithBottledWater_Yes.click();
		Thread.sleep(500);
		btnSupportRegPersonInfoIcon.click();
		elementVisible(100, txtSupportRegPersonInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtSupportRegPersonInfoIcon.getText().contains(c.getData("supportRegPersonInformationText")));
		btnSupportRegPersonInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtSupportRegPersonTeaser.getText().contains(c.getData("supportRegPersonTeaser")));
		txtSupportRegPerson.sendKeys("Hello, Good Morning...");
		Thread.sleep(500);
	}

	public void userSelectsAnyOptionForHowWouldYouLikeYourBill(String pwd, String option) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txSetPwdToProveIdentity);
		btnSetPwdToProveIdentityInfoIcon.click();
		elementVisible(100, txtSetPwdToProveIdentityInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtSetPwdToProveIdentityInfoIcon.getText().contains(c.getData("setPwdToProveIdentityInformationText")));
		btnSetPwdToProveIdentityInfoIconClose.click();
		Thread.sleep(1000);
		txtPassword.clear();
		Thread.sleep(500);
		txtPassword.sendKeys(pwd);
		Thread.sleep(500);
		txSetPwdToProveIdentity.click();
		Thread.sleep(1000);
		btnHowWouldYouLikeYourBillInfoIcon.click();
		elementVisible(100, txtHowWouldYouLikeYourBillInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtHowWouldYouLikeYourBillInfoIcon.getText().contains(c.getData("howWouldYouLikeYourBillInformationText")));
		btnHowWouldYouLikeYourBillInfoIconClose.click();
		Thread.sleep(1000);
		for (int i = 1; i <= radioHowWouldYouLikeYourBillOptions.size(); i++) {
			if (option.equalsIgnoreCase(Integer.toString(i))) {
				radioHowWouldYouLikeYourBillOptions.get(i-1).click();
				Thread.sleep(500);
				break;
			}
		}
	}

	public void userSelectsOptionForHearAboutThePriorityServicesRegisterDropdown(String option) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHearAboutThePriorityServicesRegister);
		dropdownHearAboutThePriorityServicesRegister.click();
		Thread.sleep(1000);
		for (int i = 1; i <= dropdownHearAboutThePSROptions.size(); i++) {
			if (option.equalsIgnoreCase(Integer.toString(i))) {
				dropdownHearAboutThePSROptions.get(i-1).click();
				Thread.sleep(500);
				break;
			}
		}
		checkBoxConsent.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnNext2.isDisplayed());
	}

	public void navigateToPSRConfirmationScreen() throws Exception {
		btnNext2.click();
		elementVisible(100, txtRegistrationComplete);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHome);
		//Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		confirmationNumber=txtConfirmationNo.getText();
		System.out.println(confirmationNumber);
		Assert.assertEquals(true, btnBackToPriorityServices.isDisplayed());
	}

	public void navigateToPriorityServicesPage() throws Exception {
		btnBackToPriorityServices.click();
		//elementVisible(100, txtPriorityServices);
		//Thread.sleep(2000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPriorityServices);
		//Assert.assertEquals(true, txtPriorityServicesTeaser.getText().contains(c.getData("priorityServicesTeaser")));
		//Assert.assertEquals(true, btnRegForPriorityServices.isDisplayed());
	}
	
	public void verifyPriorityServicesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnMyAccount);
		btnMyAccount.click();
		Thread.sleep(2000);
		elementVisible(100, btnMyAccountDashboard);
		btnMyAccountDashboard.click();
		elementVisible(100, tabAccountDashboard);
		tabMyProfile.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPriorityServices_MP);
		btnPriorityServices_MPInfoIcon.click();
		elementVisible(100, txtPriorityServices_MPInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPriorityServices_MPInfoIcon.getText().contains(c.getData("priorityServices_MPInformationText")));
		btnPriorityServices_MPInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPriorityServices_MPTeaser.getText().contains(c.getData("priorityServices_MPTeaser")));
		Assert.assertEquals(true, btnChangePriorityServicesOptions.isDisplayed());
		Assert.assertEquals(true, btnRemovePriorityServices.isDisplayed());
	}

	public void userVerifiesCustomerContactCharacteristicsInCCB(String username, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
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
		handleMultipleTabs(2);
		elementVisible(100, txtCCBCustomerContactID);
		txtCCBCustomerContactID.sendKeys(confirmationNumber);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCCBCharacteristics);
		tabCCBCharacteristics.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		//driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		elementVisible(100, txtCCBCustomerContactInfo);
		Thread.sleep(500);
	}
	
	public void userVerifiesActivityHistorySectionInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBAccountInformation.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		elementVisible(100, txtCCBMainDetails);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAcivityHistory);
		btnCCBAcivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(1000);
	}

	public void userVerifiesPersonMainTabInCCB() throws Exception {
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
		Thread.sleep(1000);
	}

	public void userVerifiesPersonCharacteristicsTabInCCB() throws Exception {
		tabCCBCharacteristics.click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBPersonInformation);
	}

	public void userVerifiesBillRouteUnderPersonPortalTabInCCB() throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBPersonPortal);
		tabCCBPersonPortal.click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(100, txtCCBGeneralInformation);
	}

}
