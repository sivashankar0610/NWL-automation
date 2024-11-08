package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_IWantCopyOfMyBillForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_IWantCopyOfMyBillForm_LoggedIn extends BasePage {
	
	ContactUs_IWantCopyOfMyBillForm_LoggedIn_Loc iwcmb;
	
	@Then("User click on I want copy of my bill form button")
	public void user_click_on_i_want_copy_of_my_bill_form_button() throws Exception {
		iwcmb=new ContactUs_IWantCopyOfMyBillForm_LoggedIn_Loc(driver);
		iwcmb.clickOnIWantCopyOfMYBillForm();
	}
	
	@And("User clicks on Go to my account button and should navigate to Account dashboard page")
	public void user_clicks_on_go_to_my_account_button_and_should_navigate_to_account_dashboard_page() throws Exception {
	    iwcmb.navigateToAccountDashboardPage();
	}
	
	@And("User verifies customer information of IWCOMB form with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_information_of_iwcomb_form_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    iwcmb.verifiesCustomerInformationWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@And("User selects Post option for How would you like us to send your bill? field")
	public void user_selects_post_option_for_how_would_you_like_us_to_send_your_bill_field() throws Exception {
		iwcmb.selectsPostOption();
	}
	
	@And("User changes from Post to Email for How would you like us to send your bill? field")
	public void user_changes_from_post_to_email_for_how_would_you_like_us_to_send_your_bill_field() throws Exception {
		iwcmb.changedToEmailOption();
	}
	
	@Then("User clicks on Submit button and should navigate to IWCMB form confirmation page")
	public void user_clicks_on_submit_button_and_should_navigate_to_iwcmb_form_confirmation_page() throws Exception {
		iwcmb=new ContactUs_IWantCopyOfMyBillForm_LoggedIn_Loc(driver);
		iwcmb.navigateToIWCMBConfirmationPage();
	}

}
