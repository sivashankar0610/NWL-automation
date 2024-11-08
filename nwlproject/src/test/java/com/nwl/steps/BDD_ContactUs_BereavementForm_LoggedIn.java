package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_BereavementForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_BereavementForm_LoggedIn extends BasePage {
	
    ContactUs_BereavementForm_LoggedIn_Loc bf;
	
	@Then("User click on Bereavement form button")
	public void user_click_on_bereavement_form_button() throws Exception {
	    bf=new ContactUs_BereavementForm_LoggedIn_Loc(driver);
	    bf.clickOnBereavementFormButton();
	}
	
	@And("User verifies customer information of Bereavement form with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_information_of_umnocd_form_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    bf.verifiesCustomerInformationWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@And("User selects Preferred contact method as ByPhone option for Bereavement form")
	public void user_selects_preferred_contact_method_as_by_phone_option_for_bereavement_form() throws Exception {
		bf.selectsByPhoneOption();
	}
	
	@And("User changes Preferred contact method from ByPhone to ByEmail option for Bereavement form")
	public void user_changes_preferred_contact_method_from_by_phone_to_by_email_option_for_bereavement_form() throws Exception {
		bf.changedToByEmailOption();
	}
	
	@And("User selects Yes option for Is the deceased account number and address the same as yours? field")
	public void user_selects_yes_option_for_is_the_deceased_account_number_and_address_the_same_as_yours_field() throws Exception {
	    bf.selectsYesOption();
	}
	
	@And("User changes from Yes to No option for Is the deceased account number and address the same as yours? field {string}")
	public void user_changes_from_yes_to_no_option_for_is_the_deceased_account_number_and_address_the_same_as_yours_field(String date) throws Exception {
		bf.changedToNoOption(date);
	}
	
	@Then("User clicks on Submit button and should navigate to Bereavement form confirmation page")
	public void user_clicks_on_submit_button_and_should_navigate_to_bereavement_form_confirmation_page() throws Exception {
		bf=new ContactUs_BereavementForm_LoggedIn_Loc(driver);
	    bf.navigateToBereavementFormConfirmationPage();
	}

}
