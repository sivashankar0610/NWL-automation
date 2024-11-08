package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_GeneralQueryForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_GeneralQueryForm_NotLoggedIn extends BasePage {
	
	ContactUs_GeneralQueryForm_NotLoggedIn_Loc cu;
	
	@When("User clicks on Help link from Ribbon")
	public void userClicksOnHelpLink() throws Exception {
		cu=new ContactUs_GeneralQueryForm_NotLoggedIn_Loc(driver);
		cu.navigateToHelpPage();
	}
	
	@Then("User clicks on Contact Us button and should redirected to We are here to help page")
	public void userClicksOnContactUsButtonAndShouldRedirectedToWeAreHereToHelpPage() throws Exception {
		cu.navigateToWeAreHereToHelpPage();
	}
	
	@When("User clicks on contact us form link and should redirected to Email us page")
	public void userClicksOnContactUsFormLinkAndShouldRedirectedToEmailUsPage() throws Exception {
		cu.navigateToEmailUsPage();
	}
	
	@And("User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page")
	public void userClicksOnGetInTouchOnFacebookMessenger() throws Exception {
		cu.navigateToFacebookMessenger();
	}
	
	@And("User verifies What can we help you with? section")
	public void userVerifiesWhatCanWeHelpYouWithSection() throws Exception {
		cu.verifiesWhatCanWeHelpYouWithSection();
	}
	
	@Then("User clicks on General Query button then enter customer details {string}")
	public void userClicksOnGeneralQueryButtonThenEnterCustomerDetails(String address) throws Exception {
		cu.enterCustomerDetailsAfterClickingOnGeneralQueryButton(address);
	}
	
	@And("User selects Preferred contact method as ByPhone option")
	public void userSelectsPreferredContactMethodAsByPhoneOption() throws Exception {
		cu=new ContactUs_GeneralQueryForm_NotLoggedIn_Loc(driver);
		cu.userSelectsPreferredContactMethodAsByPhoneOption();
	}
	
	@And("User changes Preferred contact method from ByPhone to ByEmail option")
	public void userChangesPreferredContactMethodFromByPhoneToByEmailOption() throws Exception {
		cu.userChangesPreferredContactMethodFromByPhoneToByEmailOption();
	}
	
	@When("User clicks on submit button without filling How can we help text field")
	public void userClicksOnSubmitButtonWithoutFillingHowCanWeHelpTextField() throws Exception {
	    cu.clicksOnSubmitButtonWithoutFillingHowCanWeHelpTextField();
	}
	
	@And("User fills How can we help text field {string}")
	public void userFillsHowCanWeHelpTextField(String helpText) throws Exception {
	    cu.userFillsHowCanWeHelpTextField(helpText);
	}
	
	@Then("User clicks on Submit button and should redirected to GQ form Confirmation page")
	public void userClicksOnSubmitButtonAndShouldRedirectedToGQFormConfirmationScreen() throws Exception {
		cu.navigateToConfirmationScreen();
	}
	
	@When("User clicks on Create your online account here link and should redirected to Create an account page")
	public void userClicksOnCreateYourOnlineAccountHereLinkAndShouldNavigateToCreateAnAccountPage() throws Exception {
		cu=new ContactUs_GeneralQueryForm_NotLoggedIn_Loc(driver);
		cu.navigateToCreateAnAccountPage();
	}

}
