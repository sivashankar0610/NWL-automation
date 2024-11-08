package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.NewCustomerMoveIntoUnmeasuredProperty_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_NewCustomerMoveIntoUnmeasuredProperty extends BasePage {
	
	NewCustomerMoveIntoUnmeasuredProperty_Loc nc;
	
	@And("User clicks Create an account tab and should redirected to Create an account tab")
	public void userClicksOnCreateAnAccountTabAndShouldRedirectedToCreateAnAccountTab() throws Exception {
	    nc=new NewCustomerMoveIntoUnmeasuredProperty_Loc(driver);
	    nc.navigateToCreateAnAccountTab();
	}
	
	@And("User enters the account details under Create an account tab {string}")
	public void userEntersAccountDetailsUnderCreateAnAccountTab(String pwd) throws Exception {
	    nc.entersAccountDetails(pwd);
	}

	@Then("User clicks on Create my online account button and should display success message popup")
	public void userClicksOnCreateMyOnlineAccountButtonAndShouldDisplaySuccessMessagePopup() throws Exception {
	    nc.clicksOnCreateMyOnlineAccountButton();
	}
	
	@And("User clicks on go to home page link and should redirected to home page screen")
	public void userClicksOnGoToHomePagelinkAndShouldRedirectedToHomePageScreen() throws Exception {
	    nc.clicksOnGoToHomePagelink();
	}
	
	@When("User opens yopmail website and enter the email address")
	public void userOpensYopMailWebsite() throws Exception {
	    nc.userOpensYopMailWebsite();
	}
	
	@And("User clicks on the activation mail")
	public void userClicksOnTheActivationMail() throws Exception{
	    nc.userClicksOnTheActivationMail();
	}
	
	@Then("User clicks on the verify my account button and should redirected to NWL website")
	public void userClicksOnTheVerifyMyAccountButtonAndShouldRedirectedToNWLWebsite() throws Exception{
	    nc.navigateToNWLWebsite();
	}
	
	@When("User clicks on Next button and should redirected to Tell us about yourself page")
	public void userClicksOnTheNextButtonAndShouldRedirectedToTellUsAboutYourselfPage() throws Exception{
	    nc.navigateToTellUsAboutYourselfPage();
	}
	
	@Then("User entered customer details")
	public void userEnteredCustomerDetails() throws Exception {
	    nc.enterCustomerDetails();
	}
	
	@And("User selected Additional account holder as no")
	public void userSelectedAdditionalAccountHolderAsNo() throws Exception {
	    nc.clicksAAH_No();
	}
	
	@And("User selected Priority services and Help with your bills are no")
	public void userSelectedPriorityServicesAndHelpWithYourBillsAreNo() throws Exception {
		nc.clicksPSAndHWYB_No();
	}
	
	@When("User clicks on Next button and should navigate to Your new home screen {string}")
	public void navigateToYourNewHomePage(String moveInDate) throws Exception {
	    nc.navigateToYourNewHomePage(moveInDate);
	}

	@And("User enter unmeasured premise address {string}")
	public void userEnterUnmeasuredPremiseAddress(String miAddress) throws Exception {
	    nc.enterUnmeasuredPremiseAddress(miAddress);
	}
	
	@Then("User clicks on Next button and should navigate to Your bills page")
	public void userNavigateToYourBillsPage() throws Exception {
	    nc.navigateToYourBillsPage();
	}
	
	@When("User selected setup direct debit as Yes")
	public void userSelectedSetupDirectDebitAsYes() throws Exception {
	    nc.selectedSetupDirectDebitAsYes();
	}
	
	@And("User selected Authorise account holder as No")
	public void userSelectedAuthoriseAccountHolderAsNo() throws Exception {
	    nc.selectedAuthoriseAccountHolderAsNo();
	}
	
	@Then("User verifies Download the Metered Property DDI link navigation")
	public void userVerifiesDownloadMeteredPropertyDDILinkNavigation() throws Exception {
	    nc.verifiesDownloadMeteredPropertyDDILinkNavigation();
	}
	
	@And("User verifies Download the Unmetered Property DDI link navigation")
	public void userVerifiesDownloadUnmeteredPropertyDDILinkNavigation() throws Exception {
	    nc.verifiesDownloadUnmeteredPropertyDDILinkNavigation();
	}
	
	@And("User verifies Download Adobe Acrobat link navigation")
	public void userVerifiesDownloadAdobeAcrobatLinkNavigation() throws Exception {
	    nc.verifiesDownloadAdobeAcrobatLinkNavigation();
	}
	
	@When("User changes Authorise account holder from No to Yes")
	public void userChangesAuthoriseAccountHolderFromNoToYes() throws Exception {
	    nc.userChangesAuthoriseAccountHolderFromNoToYes();
	}
	
	@And("User changes Pay by direct debit from monthly to annual then Payment date field should disappears")
	public void userChangesPayByDirectDebitFromMonthlyToAnnual() throws Exception {
	    nc.shouldPaymentDateFieldDisappears();
	}
	
	@And("User changes Pay by direct debit from annual to monthly then Payment date field should reappears")
	public void userChangesPayByDirectDebitFromAnnualToMonthly() throws Exception {
	    nc.shouldPaymentDateFieldReappears();
	}
	
	@And("User enters Bank account details {string} and {string}")
	public void userEntersBankAccountDetails(String bankAccNo, String sortCode) throws Exception {
	    nc.userEntersBankAccountDetails(bankAccNo, sortCode);
	}
	
	@And("User verifies Read the direct debit guarantee link")
	public void userVerifiesReadTheDirectDebitGuaranteeLink() throws Exception {
	    nc.userVerifiesReadTheDirectDebitGuaranteeLink();
	}
	
	@Then("User clicks on Next button and should navigate to Your new direct debit screen")
	public void userClicksOnNextButtonAndShouldNavigateToYourNewDirectDebitScreen() throws Exception {
	    nc.navigateYourNewDirectDebitScreen();
	}
	
	@And("User verifies More information about Direct Debit Guarantee link navigation")
	public void userVerifiesDirectDebitGuaranteeLinkNavigation() throws Exception {
	    nc.directDebitGuaranteeLinkNavigation();
	}
	
	@When("User clicks on Confirm button and should navigate to Ready screen")
	public void userClicksOnConfirmButtonAndShouldNavigateToReadyScreen() throws Exception {
	    nc.navigateToReadyScreen();
	}
	
	@Then("User clicks on Done button and should be redirected to Confirmation page")
	public void userClicksOnDoneButtonAndShouldNavigateToConfirmationScreen() throws Exception {
	    nc.navigateToConfirmationScreen();
	}
	
	@And("User verifies details under Show me the details accordian")
	public void showMeTheDetailsSection() throws Exception {
	    nc.showMeTheDetailsSection();
	}
	
	@When("User verifies all toggles set to Off under Marketing preferences section")
	public void marketingPreferencesSection() throws Exception {
	    nc.marketingPreferencesSection();
	}
	
	@Then("User verifies Go to help centre button navigation")
	public void helpCentreButtonNavigation() throws Exception {
	    nc.helpCentreButtonNavigation();
	}
	
	@When("User clicks on My Account link and should navigate to Account dashboard tab")
	public void userClicksOnMyAccountLinkAndShouldNavigateToADTab() throws Exception {
	    nc.navigateToADTab();
	}
	
	@Then("User verifies pre account setup message under AD tab")
	public void verifyPreAccountSetupMsg() throws Exception {
		nc.verifyPreAccountSetupMsg();
	}
	
	@And("User verify customer contact main tab in CC&B {string} & {string}")
	public void userVerifyCCMainTabInCCB(String username, String pwd) throws Exception {
	    nc.verifyCCMainTabInCCB(username, pwd);
	}
	
	@And("User verify customer contact characterstics tab in CC&B")
	public void userVerifiesCCCharactersticsTabInCCB() throws Exception {
	    nc.verifyCCCharactersticsTabInCCB();
	}
	
	@And("User verify account tree tab in CC&B")
	public void userVerifiesAccountTreeTabInCCB() throws Exception {
	    nc.verifyAccountTreeTabInCCB();
	}
	
	@And("User verify main details section in CC&B")
	public void userVerifiesMainDetailsSectionInCCB() throws Exception {
	    nc.verifyMainDetailsSectionInCCB();
	}
	
	@And("User verify activity history section in CC&B")
	public void userVerifiesActivityHistorySectionInCCB() throws Exception {
	    nc.verifyActivityHistorySectionInCCB();
	}
	
	@And("User verify person characterstics tab in CC&B")
	public void userVerifiesPersonCharactersticsTabInCCB() throws Exception {
	    nc.verifyPersonCharactersticsTabInCCB();
	}
	
	@And("User verify account holder persons tab in CC&B")
	public void userVerifiesAccountHolder_PersonsTabInCCB() throws Exception {
	    nc.verifyAccountHolder_PersonsTabInCCB();
	}
	
	@And("User verify account portal tab in CC&B")
	public void userVerifiesAccountPortalTabInCCB() throws Exception {
	    nc.verifyAccountPortalTabInCCB();
	}
	
	@And("User verify MIMO process main section in CC&B")
	public void userVerifiesMIMOProcessMainSectionInCCB() throws Exception {
	    nc.verifyMIMOProcessInCCB();
	}	
	
	@And("User verify Payment preferences section in CC&B")
	public void userVerifiesPaymentPreferencesSectionInCCB() throws Exception {
	    nc.verifyPaymentPreferencesSectionInCCB();
	}
	
	@And("User verify Premise main tab in CC&B")
	public void userVerifiesPremiseMainTabInCCB() throws Exception {
	    nc.verifyPremiseMainTabInCCB();
	}

}
