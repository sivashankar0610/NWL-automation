package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_IWantCopyOfMyBillForm_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ContactUs_IWantCopyOfMyBillForm_NotLoggedIn extends BasePage {
	
	ContactUs_IWantCopyOfMyBillForm_NotLoggedIn_Loc iwcomb;
	
	@Then("User clicks on I want copy of my bill form button")
	public void user_clicks_on_i_want_copy_of_my_bill_form_button() throws Exception {
		iwcomb=new ContactUs_IWantCopyOfMyBillForm_NotLoggedIn_Loc(driver);
		iwcomb.clicksOnIWantCopyOfMyBillFormButton();
	}
	
	@And("User clicks on Create an online account button and should navigate to Create an account page")
	public void user_clicks_on_create_an_online_account_button_and_should_navigate_to_create_an_account_page() throws Exception {
		iwcomb.navigateToCreateAnAccountPage();
	}
	
	@And("User fills customer information for IWCOMB form {string}")
	public void user_fills_customer_information_for_iwcomb_form(String address) throws Exception {
	    iwcomb.fillsCustomerInformation(address);
	}
	
	@And("User selects Email option for How would you like us to send your bill? field")
	public void user_selects_email_option_for_how_would_you_like_us_to_send_your_bill_field() throws Exception {
	    iwcomb.selectsEmailOption();
	}
	
	@And("User changes from Email to Post for How would you like us to send your bill? field")
	public void user_changes_from_email_to_post_for_how_would_you_like_us_to_send_your_bill_field() throws Exception {
	    iwcomb.changedToPostOption();
	}
	
	@When("User clicks on submit button without filling Which bills would you like us to send you? field")
	public void user_clicks_on_submit_button_without_filling_which_bills_would_you_like_us_to_send_you_field() throws Exception {
		iwcomb=new ContactUs_IWantCopyOfMyBillForm_NotLoggedIn_Loc(driver);
		iwcomb.clicksOnSubmitButton();
	}
	
	@And("User fills Which bills would you like us to send you? field {string}")
	public void user_fills_which_bills_would_you_like_us_to_send_you_field(String billName) throws Exception {
	    iwcomb.fillsWhichBillsWouldYouLikeUsToSendYouField(billName);
	}
	
	@Then("User clicks on Submit button and should redirected to IWCMB form confirmation page")
	public void user_clicks_on_submit_button_and_should_redirected_to_iwcmb_form_confirmation_page() throws Exception {
	    iwcomb.redirectedToIWCMBConfirmationPage();
	}

}
