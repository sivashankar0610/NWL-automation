package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ChangeTheDayMyDirectDebitIsTaken_Loc;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ChangeTheDayMyDirectDebitIsTaken extends BasePage {
	
	ChangeTheDayMyDirectDebitIsTaken_Loc dateChange;
	
	@And("User verifies Change your direct debit section")
	public void user_verifies_change_your_direct_debit_section() throws Exception {
	    dateChange=new ChangeTheDayMyDirectDebitIsTaken_Loc(driver);
	    dateChange.verifiesChangeYourDirectDebitSection();
	}
	
	@And("User clicks on Change the day my Direct Debit is taken button and should redirected to Change the day my Direct Debit is taken page")
	public void user_clicks_on_change_the_day_my_direct_debit_is_taken_button_and_should_redirected_to_change_the_day_my_direct_debit_is_taken_page() throws Exception {
	    dateChange.clicksOnChangeTheDayMyDirectDebitIsTakenButton();
	}
	
	@And("User selects payment date {string}")
	public void user_selects_payment_date(String date) throws Exception {
	    dateChange.selectsPaymentDate(date);
	}
	
	@Then("User clicks on Confirm button and should redirected to You have update your Direct Debit Payment date page")
	public void user_clicks_on_confirm_button_and_should_redirected_to_you_have_update_your_direct_debit_payment_date_page() throws Exception {
	    dateChange.clicksOnConfirmButton();
	}
	
	@And("User clicks on Back to My Bills and Payments button")
	public void user_clicks_on_back_to_my_bills_and_payments_button() throws Exception {
	    dateChange.clicksOnBackToMyBillsAndPaymentsButton();
	}
	
	@And("User verifies Activity history Section in CC&B {string}, {string} & {string}")
	public void user_verifies_activity_history_section_in_cc_b(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    dateChange.verifiesActivityHistorySectionInCCB(accNo, ccbUsername, ccbPwd);
	}
	
	@And("User verifies NBB Calendar Payment Preference under Account Characteristics tab")
	public void user_verifies_nbb_calendar_payment_preference_under_account_characteristics_tab() throws Exception {
	    dateChange.userVerifiesAccountCharactersticsTabInCCB();
	}

}
