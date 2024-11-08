package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_MovingHomeForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_MovingHomeForm_NotLoggedIn extends BasePage {
	
	ContactUs_MovingHomeForm_NotLoggedIn_Loc mhf;
	
	@Then("User clicks on Moving home form button")
	public void user_clicks_on_moving_home_form_button() throws Exception {
	    mhf=new ContactUs_MovingHomeForm_NotLoggedIn_Loc(driver);
	    mhf.clicksOnMovingHomeFormButton();
	}
	
	@And("User clicks on Tell us youre moving home button and should redirected to Moving home page")
	public void user_clicks_on_tell_us_youre_moving_home_button_and_should_redirected_to_moving_home_page() throws Exception {
		mhf.redirectedToMovingHomePage();
	}
	
	@And("User clicks on Visit the landlord tap link and should redirected to Landlord tap page")
	public void user_clicks_on_visit_the_landlord_tap_link_and_should_redirected_to_landlord_tap_page() throws Exception {
		mhf=new ContactUs_MovingHomeForm_NotLoggedIn_Loc(driver);
		mhf.redirectedToLandlordTapPage();
	}
	
	@And("User fills customer information {string}")
	public void user_fills_customer_information(String address) throws Exception {
	    mhf.fillsCustomerInformation(address);
	}
	
	@And("User selects Preferred contact method as ByEmail option")
	public void user_selects_preferred_contact_method_as_by_email_option() throws Exception {
		mhf=new ContactUs_MovingHomeForm_NotLoggedIn_Loc(driver);
		mhf.selectByEmailOption();
	}
	
	@And("User changes Preferred contact method from ByEmail to ByPhone option")
	public void user_changes_preferred_contact_method_from_by_email_to_by_phone_option() throws Exception {
	    mhf.changeToByPhoneoption();
	}
	
	@And("User clicks on submit button without filling How can we help you? text field")
	public void user_fills_how_can_we_help_you_text_field() throws Exception {
	    mhf.clicksOnSubmitButtonWithoutFillingHowCanWeHelpYouTextField();
	}
	
	@And("User fills How can we help you? text field {string}")
	public void user_fills_how_can_we_help_you_text_field(String helpText) throws Exception {
	    mhf.fillsHowCanWeHelpYouTextField(helpText);
	}
	
	@Then("User clicks on Submit button and should redirected to MH form Confirmation page")
	public void userClicksOnSubmitButtonAndShouldBeRedirectedToMHFormConfirmationScreen() throws Exception {
		mhf.navigateToConfirmationScreen();
	}

}
