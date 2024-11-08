package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_BereavementForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_BereavementForm_NotLoggedIn extends BasePage {
	
	ContactUs_BereavementForm_NotLoggedIn_Loc bf;
	
	@Then("User clicks on Bereavement form button")
	public void user_clicks_on_bereavement_form_button() throws Exception {
	    bf=new ContactUs_BereavementForm_NotLoggedIn_Loc(driver);
	    bf.clicksOnBereavementFormButton();
	}
	
	@And("User fills customer information for Bereavements form {string}")
	public void user_fills_customer_information_for_bereavements_form(String address) throws Exception {
	    bf.fillsCustomerInformation(address);
	}
	
	@And("User selects Preferred contact method as ByEmail option for Bereavement form")
	public void user_selects_preferred_contact_method_as_by_email_option_for_bereavement_form() throws Exception {
		bf.selectsByEmailOption();
	}
	
	@And("User changes Preferred contact method from ByEmail to ByPhone option for Bereavement form")
	public void user_changes_preferred_contact_method_from_by_email_to_by_phone_option_for_bereavement_form() throws Exception {
		bf.changedToByPhoneOption();
	}
	
	@And("User selects No option for Is the deceased account number and address the same as yours? field")
	public void user_selects_no_option_for_is_the_deceased_account_number_and_address_the_same_as_yours_field() throws Exception {
	    bf.selectsNoOption();
	}
	
	@And("User changes from No to Yes option for Is the deceased account number and address the same as yours? field {string}")
	public void user_changes_from_no_to_yes_option_for_is_the_deceased_account_number_and_address_the_same_as_yours_field(String date) throws Exception {
		bf.changedToYesOption(date);
	}
	
	@And("User fills Additional information field {string}")
	public void user_fills_additional_information_field(String helpText) throws Exception {
		bf=new ContactUs_BereavementForm_NotLoggedIn_Loc(driver);
	    bf.fillsAdditionalInformationField(helpText);
	}
	
	@Then("User clicks on Submit button and should redirected to Bereavement form confirmation page")
	public void user_clicks_on_submit_button_and_should_redirected_to_bereavement_form_confirmation_page() throws Exception {
	    bf.redirectedToBereavementFormConfirmationPage();
	}

}
