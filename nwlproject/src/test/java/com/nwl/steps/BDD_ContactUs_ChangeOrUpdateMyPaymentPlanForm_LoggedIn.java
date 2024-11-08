package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn extends BasePage {
	
	ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn_Loc coumppf;
	
	@Then("User click on Change or Update my payment plan form button")
	public void user_click_on_change_or_update_my_payment_plan_form_button() throws Exception {
	    coumppf=new ContactUs_ChangeOrUpdateMyPaymentPlanForm_LoggedIn_Loc(driver);
	    coumppf.clickOnChangeOrUpdateMyPaymentPlanFormButton();
	}
	
	@And("User clicks on Find out more about the financial support available link and should navigate to Help paying my bill page")
	public void user_clicks_on_find_out_more_about_the_financial_support_available_link_and_should_navigate_to_help_paying_my_bill_page() throws Exception {
		coumppf.redirectedToHelpPayingMyBillPage();
	}
	
	@And("User clicks on Send us a Facebook Message link and should navigate to Messenger page")
	public void user_clicks_on_send_us_a_facebook_message_link_and_should_navigate_to_messenger_page() throws Exception {
		coumppf.redirectedToMessengerPage();
	}
	
	@And("User clicks on Go to my account button and should redirected to Account dasboard page")
	public void user_clicks_on_Go_to_my_account_button_and_should_redirected_to_account_dashboard_page() throws Exception {
		coumppf.redirectedToAccountDashboardPage();
	}
	
	@And("User verifies customer information of PP form with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_information_of_pp_form_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
		coumppf.verifiesCustomerInformationWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@And("User selects Preferred contact method as ByPhone option for PP form")
	public void user_selects_preferred_contact_method_as_by_phone_option_for_pp_form() throws Exception {
		coumppf.selectByPhoneOption();
	}
	
	@And("User changes Preferred contact method from ByPhone to ByEmail option for PP form")
	public void user_changes_preferred_contact_method_from_by_phone_to_by_email_option_for_pp_form() throws Exception {
		coumppf.changeToByEmailoption();
	}
	
	@When("User selects when I get my bill option for How often would you like to pay? field and add additional information {string}")
	public void user_selects_when_i_get_my_bill_option_for_how_often_would_you_like_to_pay_field_and_add_additional_information(String additionalText) throws Exception {
		coumppf.selectsWhenIGetMyBillForLikeToPayField(additionalText);
	}
	
	@Then("User clicks on Submit button and should be navigate to PP form confirmation page")
	public void userClicksOnSubmitButtonAndShouldBeRedirectedToPPFormConfirmationScreen() throws Exception {
		coumppf.navigateToPaymentPlanFormConfirmationScreen();
	}

}
