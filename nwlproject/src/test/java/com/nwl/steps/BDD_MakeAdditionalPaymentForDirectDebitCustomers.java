package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MakeAdditionalPaymentForDirectDebitCustomers_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MakeAdditionalPaymentForDirectDebitCustomers extends BasePage {
	
	MakeAdditionalPaymentForDirectDebitCustomers_Loc map;
	
	@And("User verifies Make additional payment link is displayed under Your bills and payments section")
	public void user_verifies_make_additional_payment_link_is_displayed_under_your_bills_and_payments_section() throws Exception {
	    map=new MakeAdditionalPaymentForDirectDebitCustomers_Loc(driver);
	    map.verifyMakeAdditionalPaymentLinkUnderAD();
	}
	
	@When("User clicks on Make additional payment link and should redirected to My Bills & Payments tab")
	public void user_clicks_on_make_additional_payment_link_and_should_redirected_to_my_bills_payments_tab() throws Exception {
	    map.redirectedMyBillsAndPaymentsTab();
	}
	
	@Then("User verifies account balance with CC&B {string},{string} & {string} and verify Make additional payment link is displayed")
	public void user_verifies_account_balance_with_cc_b_and_verify_make_additional_payment_link_is_displayed(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    map.verifyMakeAdditionalPaymentLink(accNo, ccbUsername, ccbPwd);
	}
	
	@When("User clicks Make additional payment link and should redirected to Pay your bill page")
	public void user_clicks_make_additional_payment_link_and_should_redirected_to_pay_your_bill_page() throws Exception {
	    map.redirectedToPayYourBillPage();
	}
	
	@And("User clicks on Proceed to card payment button without entering any amount and should throws error message")
	public void user_clicks_on_proceed_to_card_payment_button_without_entering_any_amount_and_should_throws_error_message() throws Exception {
	    map.clicksOnProceedToCardPaymentButtonWithoutEnteringAmount();
	}
	
	@And("User clicks on Proceed to card payment button after entering less than MinimumPaymentAmount and should throws error message")
	public void user_clicks_on_proceed_to_card_payment_button_after_entering_less_than_minimumpaymentamount() throws Exception {
	    map.entersLessThanMinimumPaymentAmount();
	}
	
	@And("User clicks on Proceed to card payment button after entering greater than MaximumPaymentAmount and should throws error message")
	public void user_clicks_on_proceed_to_card_payment_button_after_entering_greater_than_maximumpaymentamount() throws Exception {
	    map.entersGreaterThanMaximumPaymentAmount();
	}
	
	@And("user enters amount in between MinPA and MaxPA under Make additional payment section")
	public void user_enters_payment_amount_under_make_additional_payment_section() throws Exception {
	    map.entersPaymentAmount();
	}
	
	@When("User clicks on Proceed to card payment button and should be redirected to Pop your details in page")
	public void user_clicks_on_proceed_to_card_payment_button_and_should_be_redirected_to_pop_your_details_in_page() throws Exception {
	    map.navigateToPopYourdetailsInPage();
	}
	
	@Then("User enters card details in respective fields {string}, {string}, {string} and {string}")
	public void userEntersCardDetails(String cardNo, String expiryMonth, String expiryYear, String securityCode) throws Exception {
	    map.entersCardDetails(cardNo, expiryMonth, expiryYear, securityCode);
	}
	
	@When("User clicks on Pay now button and should be redirected to confirmation page")
	public void userClicksOnPayNowButtonAndShouldRedirectedToConfirmationPage() throws Exception {
	    map.navigateToConfirmationPage();
	}
	
	@Then("User clicks on Go back to My account button and should be redirected to Account dashboard page")
	public void user_clicks_on_go_back_to_my_account_button_and_should_be_redirected_to_account_dashboard_page() throws Exception {
		map.userRedirectedToAccountDashboard();
	}
	
	@When("User click on Logout button and should logged out")
	public void user_click_on_logout_button_and_should_logged_out() throws Exception {
		map.userClicksOnLogoutButton();
	}
	
	@Then("User opens Activity History section in CCB")
	public void user_opens_activity_history_section_in_ccb() throws Exception {
		map.userOpenActivityHistorySectionInCCB();
	}
	
	@And("User verifies Account financial history in CCB")
	public void user_verifies_account_financial_history_in_ccb() throws Exception {
		map.verifyAccountFinancialHistoryInCCB();
	}

}
