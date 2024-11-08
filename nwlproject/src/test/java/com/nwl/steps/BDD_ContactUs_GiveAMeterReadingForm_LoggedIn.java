package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_GiveAMeterReadingForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_GiveAMeterReadingForm_LoggedIn extends BasePage {
	
	ContactUs_GiveAMeterReadingForm_LoggedIn_Loc gamrf;
	
	@Then("User click on Give a meter reading form button")
	public void user_click_on_give_a_meter_reading_form_button() throws Exception {
		gamrf=new ContactUs_GiveAMeterReadingForm_LoggedIn_Loc(driver);
		gamrf.clickOnGiveMeterReadingFormButton();
	}
	
	@Then("User clicks on Download our free app button and should navigate to Download our app page")
	public void user_clicks_on_download_our_free_app_button_and_should_navigate_to_download_our_app_page() throws Exception {
	    gamrf.navigateToDownloadOurAppPage();
	}
	
	@Then("User clicks on Find out how to read your meter link and should navigate to How to read water meter page")
	public void user_clicks_on_find_out_how_to_read_your_meter_link_and_should_navigate_to_how_to_read_water_meter_page() throws Exception {
	    gamrf.navigateToHowToReadWaterMeterPage();
	}
	
	@Then("User verifies customer information of GMR form with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_information_of_gmr_form_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    gamrf.verifiesCustomerInformationOfGMRFormWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@And("User selects Preferred contact method as ByEmail option for GMR form")
	public void user_selects_preferred_contact_method_as_by_email_option_for_gmr_form() throws Exception {
		gamrf.selectByEmailOption();
	}
	
	@And("User changes Preferred contact method from ByEmail to ByPhone option for GMR form")
	public void user_changes_preferred_contact_method_from_by_email_to_by_phone_option_for_gmr_form() throws Exception {
		gamrf.changeToByPhoneOption();
	}
	
	@Then("User clicks on Submit button and should navigate to GMR form confirmation page")
	public void user_clicks_on_submit_button_and_should_navigate_to_gmr_form_confirmation_page() throws Exception {
		gamrf.navigateToGMRFormConfirmationPage();
	}

}
