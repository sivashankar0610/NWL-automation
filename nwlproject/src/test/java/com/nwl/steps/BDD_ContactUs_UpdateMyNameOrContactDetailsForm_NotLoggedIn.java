package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn extends BasePage {
	
	ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn_Loc umn;
	
	@Then("User clicks on Update my name or contact details form button")
	public void user_clicks_on_update_my_name_or_contact_details_form_button() throws Exception {
		umn=new ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn_Loc(driver);
		umn.clicksOnUpdateMyNameOrContactDetailsFormButton();
	}
	
	@And("User clicks on Create an online account button and should be navigate to Create an account page")
	public void user_clicks_on_create_an_online_account_button_and_should_be_navigate_to_create_an_account_page() throws Exception {
	    umn.navigateToCreateAnAccountPage();
	}
	
	@And("User fills customer information for UMNOCD form {string}")
	public void user_fills_customer_information_for_umnocd_form(String address) throws Exception {
	    umn.fillsCustomerInformation(address);
	}
	
	@And("User selects Preferred contact method as ByEmail option for UMNOCD form")
	public void user_selects_preferred_contact_method_as_by_email_option_for_umnocd_form() throws Exception {
	    umn.selectsByEmailOption();
	}
	
	@And("User changes Preferred contact method from ByEmail to ByPhone option for UMNOCD form")
	public void user_changes_preferred_contact_method_from_by_email_to_by_phone_option_for_umnocd_form() throws Exception {
	    umn.changedToByPhoneOption();
	}
	
	@When("User clicks on submit button without filling Please tell us about the changes field")
	public void user_clicks_on_submit_button_without_filling_please_tell_us_about_the_changes_field() throws Exception {
		umn=new ContactUs_UpdateMyNameOrContactDetailsForm_NotLoggedIn_Loc(driver);
		umn.clicksOnSubmitButton();
	}
	
	@And("User fills Please tell us about the changes field {string}")
	public void user_fills_please_tell_us_about_the_changes_field(String helptext) throws Exception {
	    umn.fillsPleaseTellUsAboutTheChangesField(helptext);
	}
	
	@Then("User clicks on Submit button and should redirected to UMNOCD form confirmation page")
	public void user_clicks_on_submit_button_and_should_redirected_to_umnocd_form_confirmation_page() throws Exception {
	    umn.redirectedToUMNOCDConfirmationPage();
	}

}
