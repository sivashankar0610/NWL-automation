package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.FinancialSupportEligibilityChecker_NotEligibleResult_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_FinancialSupportEligibilityChecker_NotEligibleResult extends BasePage {
	
	FinancialSupportEligibilityChecker_NotEligibleResult_Loc ner;
	
	@When("User selects I have a water meter option for Your household field")
	public void user_selects_i_have_a_water_meter_option_for_your_household_field() throws Exception {
	    ner=new FinancialSupportEligibilityChecker_NotEligibleResult_Loc(driver);
	    ner.selectsOptionsForYourHouseholdField();
	}
	
	@And("User selects Income Based Jobseekers Allowance option for Benefits & financial support field")
	public void user_selects_income_based_jobseekers_allowance_option_for_benefits_financial_support_field() throws Exception {
	    ner.selectsOptionsForBenefitsFinancialSupportField();
	}
	
	@And("User selects No option for Are you £50 or more behind with your water bill payments? field")
	public void user_selects_no_option_for_are_you_£_or_more_behind_with_your_water_bill_payments_field() throws Exception {
	    ner.selectsOptionsForWaterBillPaymentsField();
	}
	
	@Then("User clicks on Check my eligibility button and should redirected to Not Eligible Results screen")
	public void user_clicks_on_check_my_eligibility_button_and_should_redirected_to_not_eligible_results_screen() throws Exception {
	    ner.redirectedToNotEligibleResultsScreen();
	}
	
	@And("User verifies Get More Time To Pay and Check What Benefits You Might Be Entitled To sections")
	public void user_verifies_get_more_time_to_pay_and_check_what_benefits_you_might_be_entitled_to_sections() throws Exception {
	    ner.verifyGetMoreTimeToPayAndCheckWhatBenefitsYouMightBeEntitledToSections();
	}
	
	@And("User verifies Talk To Us and Water Saving Tips sections")
	public void user_verifies_talk_to_us_and_water_saving_tips_sections() throws Exception {
	    ner.verifyTalkToUsAndWaterSavingTipsSections();
	}
	
	@When("User clicks on Request a payment break button for Get more time to pay and should redirected to Apply for a payment break page in new tab")
	public void user_clicks_on_request_a_payment_break_button_for_get_more_time_to_pay_and_should_redirected_to_apply_for_a_payment_break_page_in_new_tab() throws Exception {
	    ner.redirectedToApplyForAPaymentBreakPage();
	}
	
	@Then("User clicks on Setup payment plan button for Get more time to pay and should redirected to Account Dashboard in new tab")
	public void user_clicks_on_setup_payment_plan_button_for_get_more_time_to_pay_and_should_redirected_to_account_dashboard_in_new_tab() throws Exception {
	    ner.redirectedToAccountDashboard();
	}
	
	@When("User clicks on Try the calculator button for Check what benefits you might be entitled to and should redirected to Benefits calculator page in new tab")
	public void user_clicks_on_try_the_calculator_button_for_check_what_benefits_you_might_be_entitled_to_and_should_redirected_to_benefits_calculator_page_in_new_tab() throws Exception {
	    ner.redirectedToBenefitsCalculatorPage();
	}
	
	@Then("User clicks on Send us a message on Messenger link for Talk to us and should redirected to Messenger page in new tab")
	public void user_clicks_on_send_us_a_message_on_messenger_link_for_talk_to_us_and_should_redirected_to_messenger_page_in_new_tab() throws Exception {
	    ner.redirectedToMessengerPage();
	}
	
	@When("User clicks on Email us link for Talk to us and should redirected to Email Us page in new tab")
	public void user_clicks_on_email_us_link_for_talk_to_us_and_should_redirected_to_email_us_page_in_new_tab() throws Exception {
	    ner.redirectedToEmailUsPage();
	}

}
