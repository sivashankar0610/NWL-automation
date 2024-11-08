package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn extends BasePage {
	
	ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn_Loc coumppf;
	
	@Then("User clicks on Change or Update my payment plan form button")
	public void user_clicks_on_change_or_update_my_payment_plan_form_button() throws Exception {
	    coumppf=new ContactUs_ChangeOrUpdateMyPaymentPlanForm_NotLoggedIn_Loc(driver);
	    coumppf.clicksOnChangeOrUpdateMyPaymentPlanFormButton();
	}
	
	@And("User clicks on Create an online account button and should redirected to Create an account page")
	public void user_clicks_on_create_an_online_account_button_and_should_redirected_to_create_an_account_page() throws Exception {
		coumppf.redirectedToCreateAnAccountPage();
	}
	
	@And("User clicks on Find out more about the financial support available link and should redirected to Help paying my bill page")
	public void user_clicks_on_find_out_more_about_the_financial_support_available_link_and_should_redirected_to_help_paying_my_bill_page() throws Exception {
		coumppf.redirectedToHelpPayingMyBillPage();
	}
	
	@And("User clicks on Send us a Facebook Message link and should redirected to Messenger page")
	public void user_clicks_on_send_us_a_facebook_message_link_and_should_redirected_to_messenger_page() throws Exception {
		coumppf.redirectedToMessengerPage();
	}
	
	@And("User clicks on Send us a message on WhatsApp link and should redirected to WhatsApp page")
	public void user_clicks_on_send_us_a_message_on_whatsapp_link_and_should_redirected_to_whatsapp_page() throws Exception {
		coumppf.redirectedToWhatsAppPage();
	}
	
	@And("User fills customer information for PP form {string}")
	public void user_fills_customer_information_for_pp_form(String address) throws Exception {
		coumppf.fillsCustomerInformation(address);
	}
	
	@And("User selects Preferred contact method as ByEmail option for PP form")
	public void user_selects_preferred_contact_method_as_by_email_option_for_pp_form() throws Exception {
		coumppf.selectByEmailOption();
	}
	
	@And("User changes Preferred contact method from ByEmail to ByPhone option for PP form")
	public void user_changes_preferred_contact_method_from_by_email_to_by_phone_option_for_pp_form() throws Exception {
		coumppf.changeToByPhoneoption();
	}
	
	@When("User selects Monthly option for How often would you like to pay? field {string}")
	public void user_selects_monthly_option_for_how_often_would_you_like_to_pay_field(String paymentDate) throws Exception {
		coumppf.selectsMonthlyForLikeToPayField(paymentDate);
	}
	
	@Then("User clicks on Submit button and should be redirected to PP form confirmation page")
	public void userClicksOnSubmitButtonAndShouldBeRedirectedToPPFormConfirmationScreen() throws Exception {
		coumppf.redirectedToPaymentPlanFormConfirmationScreen();
	}
}
