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

public class SetupPaymentPlanToMonthlyPlan_Loc extends BasePage  {

	
	@FindBy(xpath = "(//div/h6[text()='Do you want to change how you pay your bill?'])[1]") WebElement txtDoYouWantToChangeHowYouWantToPayYourBillSection;
	@FindBy(xpath = "//div[@class='wp-usage-box bgblue-light text-center pay-bills-easy-way-box']/div/div/p") WebElement teaserDoYouWantToChangeHowYouWantToPayYourBillSection;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block nb-btn-white btn-set-up-payment-plan']") WebElement btnSetUpPaymentPlan;
	@FindBy(xpath = "(//button[text()='Pay by Direct Debit'])[1]") WebElement btnPayByDirectDebit;
	@FindBy(xpath = "(//div[text()[normalize-space()='How often do you want to pay?']])[2]") WebElement labelHowOftenDoYouWantToPay;
	@FindBy(xpath = "(//div[@class='account-form wp-spacing']//h5)[3]") WebElement labelSetupAPaymentPlan;
	@FindBy(xpath = "(//span[@class='radio-label'])[1]") WebElement radioBtnPayMonthly;
	@FindBy(xpath = "(//div[text()[normalize-space()='Pick a payment date']])[2]") WebElement labelPickAPaymentDate;
	@FindBy(xpath = "(//div[@class='form-select selected'])[6]") WebElement pleaseSelectPickPaymentDate;
	@FindBy(xpath = "//div[@class='form-select selected actived']/div/div/span") List<WebElement> dropdownPickPaymentDate;
	@FindBy(xpath = "//div[@class='form-select actived']/div/div/span") List<WebElement> dropdownHowManyPeopleLiveHere;
	@FindBy(xpath = "(//div[@class='nb-col-6 number-occupant-align-center mw-100']/div)[2]/div") WebElement pleaseSelectHowManyPeopleLiveHere ;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-setup-payment-plan']") WebElement btnSetUpMyPaymentPlan;
	@FindBy(xpath = "//h6[@class='sumbit-message-PM2']") WebElement labelThanksMsg;
	@FindBy(xpath = "//p[@class='txt-algn cmn-email-msg1']") WebElement teaserThanksMsg;
	@FindBy(xpath = "//p[@class='newDirectDebitDetailsContent']") WebElement teaserPleaseRememberThanksMsg;
	@FindBy(xpath = "//p[@class='newDirectDebitDetailsContent']/following-sibling::b") WebElement confirmationNum;
	@FindBy(xpath = "//p[@class='newDirectDebitDetailsContent  payment-frequency']/b") WebElement teaserYourPaymentDetails;
	@FindBy(xpath = "(//div[@class='form-link']/a)[5]") WebElement btnClose ;
	@FindBy(xpath = "//li[@rel='account']") WebElement tabAccountDashboard ;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_accountInfoButton']") WebElement btnCCBAccountInformation;
	@FindBy(xpath="//label[@oramdlabel='CM_MAIN_DTLS']") WebElement txtCCBMainDetails;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(xpath="(//td[text()='Description'])[1]") WebElement tableHeaderdescription;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBCharacteristics;
	@FindBy(xpath="(//span[@class='oraLabel uiMargin '])[1]/label") WebElement txtCCBCustomerContactInfo;
	@FindBy(xpath="//img[@id='IM_ACCT_ID_CTX_MENU']") WebElement linkAccountId;
	@FindBy(xpath="//li[@id='CI_CONTEXTACCOUNT_subMenuItem0x0']") WebElement optionGoToAccount;
	@FindBy(xpath="//td[@title='Characteristics']") WebElement tabCharacteristics;
	@FindBy(xpath="//select[@id='ACCT_CHAR:2$CHAR_TYPE_CD']") WebElement optionNBBCalendarPaymentPreference;

	String confirmationNo, date, frequency;
			
	public SetupPaymentPlanToMonthlyPlan_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c = new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//SetupPaymentPlanToMonthlyPlan.properties");
	}

	public void verifyTheDoYouWantToChangeHowYouWantToPayYourBillSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDoYouWantToChangeHowYouWantToPayYourBillSection);
		Assert.assertEquals(true, txtDoYouWantToChangeHowYouWantToPayYourBillSection.getText().contains(c.getData("label_doYouWanttoChangeHowYouWantToPayYourBill")));
		Assert.assertEquals(true, teaserDoYouWantToChangeHowYouWantToPayYourBillSection.getText().contains(c.getData("teaser_doYouWanttoChangeHowYouWantToPayYourBill")));				btnPayByDirectDebit.isDisplayed();
		btnSetUpPaymentPlan.isDisplayed();
	}

	public void userClicksOnSetupAPaymentPlanButton() throws Exception {
		btnSetUpPaymentPlan.click();
		elementVisible(100, labelSetupAPaymentPlan);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelSetupAPaymentPlan);
		frequency = radioBtnPayMonthly.getText().substring(4);
	}

	public void UserSelectsAPaymentDateAndOccupancy(String paymentdate, String noOfPeople) throws Exception {
		Assert.assertEquals(true, labelHowOftenDoYouWantToPay.getText().contains(c.getData("label_howOftenDoYouWantToPay")));
		date = paymentdate;
		radioBtnPayMonthly.isDisplayed();
		pleaseSelectPickPaymentDate.click();
		Thread.sleep(1000);
		for (WebElement Paydate : dropdownPickPaymentDate) {
			if(Paydate.getText().equalsIgnoreCase(paymentdate)) {
				Paydate.click();
				break;
			}
		}
		if(!pleaseSelectHowManyPeopleLiveHere.getAttribute("class").contains("selected")){
		   pleaseSelectHowManyPeopleLiveHere.click();
		   Thread.sleep(1000);
		   for (WebElement people : dropdownHowManyPeopleLiveHere) {
		      if(people.getText().equalsIgnoreCase(noOfPeople)) {
				people.click();
				break;
			  }
		   }
		}
	}

	public void userClicksOnSetupPaymentPlanButtonAndMakesNoteOfConfirmationNumber() throws Exception {
		btnSetUpMyPaymentPlan.click();
		elementVisible(200, labelThanksMsg);
		Thread.sleep(3000);
		Assert.assertEquals(true, teaserThanksMsg.getText().contains(c.getData("teaser_ThanksMessageInConfirmationScreen")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmationNum);
		//Assert.assertEquals(true, teaserPleaseRememberThanksMsg.getText().equalsIgnoreCase(c.getData("teaser_PleaseRememberInConfirmationScreen")));
		confirmationNo = confirmationNum.getText();
		String teaserTxtYourPaymentDetails= teaserYourPaymentDetails.getText();
		String yourPaymentDetails[] = teaserTxtYourPaymentDetails.split("\n");
		Assert.assertEquals(true, yourPaymentDetails[0].equalsIgnoreCase(frequency));
		Assert.assertEquals(true, yourPaymentDetails[1].contains(date));
	}

	public void userClosesTheConfirmationScreenAndShouldbeRedirectedtoSetupapaymentplanPage() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnClose);
		btnClose.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelSetupAPaymentPlan);
		Thread.sleep(1000);
	}

	public void userClicksOnTheAccountDashboardTab() throws Exception {
		tabAccountDashboard.click();
		Thread.sleep(2000);
	}

	public void userVerifiesAccountCharacteristicsInfoInCCNB(String username, String pwd) throws Exception {
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
		txtCCBCustomerContactID.sendKeys(confirmationNo);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		elementVisible(100, linkAccountId);
		linkAccountId.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, optionGoToAccount);
		optionGoToAccount.click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCharacteristics);
		tabCharacteristics.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CharGrid_character")));
		elementVisible(100, optionNBBCalendarPaymentPreference);
	}

}
