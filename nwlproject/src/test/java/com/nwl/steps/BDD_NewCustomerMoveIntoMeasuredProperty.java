package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.NewCustomerMoveIntoMeasuredProperty_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_NewCustomerMoveIntoMeasuredProperty extends BasePage {
	
	NewCustomerMoveIntoMeasuredProperty_Loc nc;
	
	@Then("Verify Our supply area button navigation")
	public void verifyOurSupplyAreaButtonNavigation() throws Exception {
	    nc=new NewCustomerMoveIntoMeasuredProperty_Loc(driver);
	    nc.ourSupplyAreaButtonNavigation();
	}

	@And("Verify Are you landlord button navigation")
	public void verifyAreYouLandlordButtonNavigation() throws Exception {
		nc.landlordButtonNavigation();
	}
	
	@When("User clicks on I am a new customer & bill payer button and should redirected to Tell us about yourself page")
	public void navigateToTellUsAboutYourselfPage() throws Exception {
	    nc.navigateToTellUsAboutYourselfPage();
	}
		
	@Then("User enters customer details")
	public void userEntersCustomerDetails() throws Exception {
	    nc.enterCustomerDetails();
	}
	
	@And("User selected Additional account holder as yes")
	public void userSelectedAdditionalAccountHolderAsYes() throws Exception {
	    nc.clicksAAH_Yes();
	}
	
	@And("User selected Priority services as yes")
	public void userSelectedPriorityServicesAsYes() throws Exception {
		nc.clicksPS_Yes();
	}
	
	@And("User selected Help with your bills as yes")
	public void userSelectedHelpWithYourBillsAsYes() throws Exception {
		nc.clicksHWYB_Yes();
	}
	
	@When("User clicks on Next button and should redirected to Your new home screen {string}")
	public void navigateToYourNewHomePage(String moveInDate) throws Exception {
	    nc.navigateToYourNewHomePage(moveInDate);
	}

	@And("User enter measured premise address {string}")
	public void userEnterMeasuredPremiseAddress(String miAddress) throws Exception {
	    nc.enterMeasuredPremiseAddress(miAddress);
	}
	
	@Then("User clicks on Next button and should redirected to Your bills page {string},{string} & {string}")
	public void userNavigateToYourBillsPage(String miAccNo, String username, String pwd) throws Exception {
	    nc.navigateToYourBillsPage(miAccNo, username, pwd);
	}
	
	@When("User selected setup direct debit as no {string}")
	public void userSelectedSetupDirectDebitAsNo(String paymentPlan) throws Exception {
		nc.selectedSetupDirectDebitAsNo(paymentPlan);
	}
	
	@Then("Verify Download from Google Play Store link navigation")
	public void googlePlayStoreNavigation() throws Exception {
		nc.googlePlayStoreNavigation();
	}
	
	@And("Verify App Store link navigation")
	public void appStoreNavigation() throws Exception {
		nc.appStoreNavigation();
	}
	
	@When("User clicks on Next button and should be navigate to Ready page")
	public void navigateToReadyPage() throws Exception {
	    nc.navigateToReadyPage();
	}
	
	@Then("User clicks on Done button and should be navigate to Confirmation page")
	public void navigateToConfirmationPage() throws Exception {
	    nc.navigateToConfirmationPage();
	}
	
	@When("Verify lots of tips to save water link navigation")
	public void saveWaterLinkNavigation() throws Exception {
	    nc.saveWaterLinkNavigation();
	}
	
	@Then("Verify switching to eBilling on your profile link navigation")
	public void eBillingLinkNavigation() throws Exception {
	    nc.eBillingLinkNavigation();
	}
	
	@And("Verify details under Show me details accordian")
	public void showMeTheDetailsSection() throws Exception {
	    nc.showMeTheDetailsSection();
	}
	
	@When("User changes all toggles to On under Marketing preferences section")
	public void marketingPreferencesSection() throws Exception {
	    nc.marketingPreferencesSection();
	}
	
	@Then("Verify Go to help centre button navigation")
	public void helpCentreButtonNavigation() throws Exception {
	    nc.helpCentreButtonNavigation();
	}
	
	@When("User opens yopmail website and enters the email address")
	public void userOpensYopMailWebsite() throws Exception {
	    nc.userOpensYopMailWebsite();
	}
	
	@And("User clicks on the set password mail")
	public void userClicksOnTheSetPwdMail() throws Exception{
	    nc.userClicksOnTheSetPwdMail();
	}
	
	@Then("User clicks on the set password button and should redirected to create new password page {string}")
	public void navigateToCreateNewPwdScreen(String pwd) throws Exception{
	    nc.navigateToCreateNewPwdScreen(pwd);
	}
	
	@When("User clicks on Save and Continue button and should display success message popup")
	public void userClicksOnSaveAndContinuebutton() throws Exception{
	    nc.userClicksOnSaveAndContinuebutton();
	}
	
	@Then("User clicks on Ok button and should redirected to login page")
	public void userClicksOnOkbutton() throws Exception{
	    nc.userClicksOnOkbutton();
	}
	
	@And("User enters correct email and password")
	public void enterEmailAndPassword() throws Exception {
		nc.enterCredentials();   
	}
	
	@When("User clicks on Login button and should navigate to Account dashboard tab")
	public void navigateToAccountDashboardTab() throws Exception {
		nc.clickOnLoginButtonAndNavigateADTab();
	}
	
	@Then("User verifies pre account setup message")
	public void verifyPreAccountSetupMsg() throws Exception {
		nc.verifyPreAccountSetupMsg();
	}
	
	@And("User verifies customer contact main tab in CC&B")
	public void userVerifiesCCMainTabInCCB() throws Exception {
	    nc.verifyCCMainTabInCCB();
	}

	@And("User verifies customer contact characterstics tab in CC&B")
	public void userVerifiesCCCharactersticsTabInCCB() throws Exception {
	    nc.verifyCCCharactersticsTabInCCB();
	}
	
	@And("User verifies account tree tab in CC&B")
	public void userVerifiesAccountTreeTabInCCB() throws Exception {
	    nc.verifyAccountTreeTabInCCB();
	}
	
	@And("User verifies main details section in CC&B")
	public void userVerifiesMainDetailsSectionInCCB() throws Exception {
	    nc.verifyMainDetailsSectionInCCB();
	}
	
	@And("User verifies activity history section in CC&B")
	public void userVerifiesActivityHistorySectionInCCB() throws Exception {
	    nc.verifyActivityHistorySectionInCCB();
	}
	
	@And("User verifies person characterstics tab in CC&B")
	public void userVerifiesPersonCharactersticsTabInCCB() throws Exception {
	    nc.verifyPersonCharactersticsTabInCCB();
	}
	
	@And("User verifies first account holder persons tab in CC&B")
	public void userVerifiesAccountPerson1_PersonsTabInCCB() throws Exception {
	    nc.verifyAccountPerson1_PersonsTabInCCB();
	}
	
	@And("User verifies second account holder persons tab in CC&B")
	public void userVerifiesAccountPerson2_PersonsTabInCCB() throws Exception {
	    nc.verifyAccountPerson2_PersonsTabInCCB();
	}
	
	@And("User verifies account portal tab in CC&B")
	public void userVerifiesAccountPortalTabInCCB() throws Exception {
	    nc.verifyAccountPortalTabInCCB();
	}
	
	@And("User verifies MIMO process main section in CC&B")
	public void userVerifiesMIMOProcessMainSectionInCCB() throws Exception {
	    nc.verifyMIMOProcessInCCB();
	}
	
	@And("User verifies available start meter reads section in CC&B")
	public void userVerifiesASMRSectionInCCB() throws Exception {
	    nc.verifyASMRInCCB();
	}
	
	@And("User verifies Premise main tab in CC&B")
	public void userVerifiesPremiseMainTabInCCB() throws Exception {
	    nc.verifyPremiseMainTabInCCB();
	}

}
