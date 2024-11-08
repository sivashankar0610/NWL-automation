package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_GiveAMeterReadingForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_GiveAMeterReadingForm_NotLoggedIn extends BasePage {
	
	ContactUs_GiveAMeterReadingForm_NotLoggedIn_Loc gamrf;
	
	@Then("User clicks on Give a meter reading form button")
	public void user_clicks_on_give_a_meter_reading_form_button() throws Exception {
	    gamrf=new ContactUs_GiveAMeterReadingForm_NotLoggedIn_Loc(driver);
	    gamrf.clickOnGiveAMeterReadingFormButton();
	}
	
	@And("User clicks on Download our free app button and should redirected to Download our app page")
	public void user_clicks_on_download_our_free_app_button_and_should_redirected_to_download_our_app_page() throws Exception {
		gamrf.redirectedToDownloadOurAppPage();
	}
	
	@And("User clicks on Find out how to read your meter link and should redirected to How to read water meter page")
	public void user_clicks_on_find_out_how_to_read_your_meter_link_and_should_redirected_to_how_to_read_water_meter_page() throws Exception {
		gamrf.redirectedToHowToReadWaterMeterPage();
	}
	
	@And("User fills customer information for GMR form {string}")
	public void user_fills_customer_information_for_gmr_form(String address) throws Exception {
	    gamrf.fillsCustomerInformationForGMRForm(address);
	}
	
	@And("User selects Preferred contact method as ByPhone option for GMR form")
	public void user_selects_preferred_contact_method_as_by_phone_option_for_gmr_form() throws Exception {
		gamrf.selectByPhoneOption();
	}
	
	@And("User changes Preferred contact method from ByPhone to ByEmail option for GMR form")
	public void user_changes_preferred_contact_method_from_by_phone_to_by_email_option_for_gmr_form() throws Exception {
		gamrf.changeToByEmailOption();
	}
	
	@When("User provides other details {string}, {string} & {string}")
	public void user_provides_other_details(String meterReading, String meterReadingDate, String occupancy) throws Exception {
		gamrf=new ContactUs_GiveAMeterReadingForm_NotLoggedIn_Loc(driver);
		gamrf.providesOtherDetails(meterReading, meterReadingDate, occupancy);
	}
	
	@Then("User clicks on Submit button and should redirected to GMR form confirmation page")
	public void user_clicks_on_submit_button_and_should_redirected_to_gmr_form_confirmation_page() throws Exception {
		gamrf.redirectedToGMRFormConfirmationPage();
	}

}
