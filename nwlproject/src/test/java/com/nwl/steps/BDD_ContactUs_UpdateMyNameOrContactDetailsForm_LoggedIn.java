package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn extends BasePage {
	
	ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn_Loc umn;
	
	@Then("User click on Update my name or contact details form button")
	public void user_click_on_update_my_name_or_contact_details_form_button() throws Exception {
	    umn=new ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn_Loc(driver);
	    umn.clickOnUpdateMyNameOrContactDetailsFormButton();
	}
	
	@And("User clicks on Go to my account button and should be redirected to Account dashboard page")
	public void user_clicks_on_go_to_my_account_button_and_should_be_redirected_to_account_dashboard_page() throws Exception {
	    umn.redirectedToAccountDashboardPage();
	}
	
	@And("User verifies customer information of UMNOCD form with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_information_of_umnocd_form_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    umn.verifiesCustomerInformationWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@And("User selects Preferred contact method as ByPhone option for UMNOCD form")
	public void user_selects_preferred_contact_method_as_by_phone_option_for_umnocd_form() throws Exception {
	    umn.selectsByPhoneOption();
	}
	
	@And("User changes Preferred contact method from ByPhone to ByEmail option for UMNOCD form")
	public void user_changes_preferred_contact_method_from_by_phone_to_by_email_option_for_umnocd_form() throws Exception {
	    umn.changedToByEmailOption();
	}
	
	@Then("User clicks on Submit button and should navigate to UMNOCD form confirmation page")
	public void user_clicks_on_submit_button_and_should_navigate_to_umnocd_form_confirmation_page() throws Exception {
		umn=new ContactUs_UpdateMyNameOrContactDetailsForm_LoggedIn_Loc(driver);
		umn.navigateToUMNOCDFormConfirmationPage();
	}

}
