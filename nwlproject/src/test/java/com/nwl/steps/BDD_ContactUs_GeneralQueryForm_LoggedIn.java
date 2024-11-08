package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_GeneralQueryForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_GeneralQueryForm_LoggedIn extends BasePage {
	
	ContactUs_GeneralQueryForm_LoggedIn_Loc cu;
	
	@And("User verifies Account dashboard details with CC&B {string},{string} & {string}")
	public void userVerifiesAccountDashboardDetailsWithCCB(String accNo, String username, String pwd) throws Exception {
	    cu=new ContactUs_GeneralQueryForm_LoggedIn_Loc(driver);
	    cu.verifyADDetailsWithCCB(accNo, username, pwd);
	}
	
	@When("User click on Help link from Ribbon")
	public void userClickOnHelpLink() throws Exception {
		cu.navigateToHelpPage();
	}
	
	@Then("User clicks on Contact Us button and should navigate to We are here to help page")
	public void userClicksOnContactUsButtonAndShouldNavigateToWeAreHereToHelpPage() throws Exception {
		cu.navigateToWeAreHereToHelpPage();
	}
	
	@When("User clicks on contact us form link and should navigate to Email us page")
	public void userClicksOnContactUsFormLinkAndShouldNavigateToEmailUsPage() throws Exception {
		cu.navigateToEmailUsPage();
	}
	
	@And("User clicks on Get in touch on Facebook Messenger link and should navigate to Facebook Messenger page")
	public void userClicksOnGetInTouchOnFacebookMessenger() throws Exception {
		cu.navigateToFacebookMessenger();
	}
	
	@And("User verify What can we help you with? section")
	public void userVerifiesWhatCanWeHelpYouWithSection() throws Exception {
		cu.verifyWhatCanWeHelpYouWithSection();
	}
	
	@Then("User clicks on General Query button then verify customer details {string}")
	public void userClicksOnGeneralQueryButtonThenverifyCustomerDetails(String email) throws Exception {
		cu.verifiesCustomerDetailsAfterClickingOnGeneralQueryButton(email);
	}
	
	@Then("User clicks on Submit button and should navigate to GQ form Confirmation page")
	public void userClicksOnSubmitButtonAndShouldNavigateToGQFormConfirmationScreen() throws Exception {
		cu=new ContactUs_GeneralQueryForm_LoggedIn_Loc(driver);
		cu.navigateToConfirmationScreen();
	}
	
	@When("User clicks on Back to home page button and should navigate to NWL Home Page")
	public void userClicksOnBackToHomePageButtonAndShouldNavigateToNWLHomePage() throws Exception {
		cu=new ContactUs_GeneralQueryForm_LoggedIn_Loc(driver);
		cu.navigateToNWLHomePage();
	}

}
