package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.FinancialSupportEligibilityChecker_MayBeEligibleResult_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_FinancialSupportEligibilityChecker_MayBeEligibleResult extends BasePage {
	
	FinancialSupportEligibilityChecker_MayBeEligibleResult_Loc mbe;
	
	@When("User selects My household income is not enough to pay my essential bills option for Your household field")
	public void user_selects_my_household_income_is_not_enough_to_pay_my_essential_bills_option_for_your_household_field() throws Exception {
	    mbe=new FinancialSupportEligibilityChecker_MayBeEligibleResult_Loc(driver);
	    mbe.selectOptionsForYourHouseholdField();
	}
	
	@And("User does not selects any option for Benefits & financial support field")
	public void user_does_not_selects_any_option_for_benefits_financial_support_field() throws Exception {
	    mbe.doesNotSelectsAnyOptionForBenefitsFinancialSupportField();
	}
	
	@Then("User clicks on Check my eligibility button and should redirected to May be Eligible Results screen")
	public void user_clicks_on_check_my_eligibility_button_and_should_redirected_to_may_be_eligible_results_screen() throws Exception {
		mbe=new FinancialSupportEligibilityChecker_MayBeEligibleResult_Loc(driver);
		mbe.redirectedToMayBeEligibleResultsScreen();
	}
	
	@And("User verifies Reduced Bill section")
	public void user_verifies_reduced_bill_section() throws Exception {
	    mbe.verifyWeRecommendSpeakingToADebtAdviceOrganisationSection();
	}
	
	@And("User verifies Get a water meter section")
	public void user_verifies_get_a_water_meter_section() throws Exception {
	    mbe.verifyGetAWaterMeterSection();
	}
	
	@When("User clicks on Find out more button for Reduced Bill and should redirected to Reduced Bill page in new tab")
	public void user_clicks_on_find_out_more_button_for_reduced_bill_and_should_redirected_to_reduced_bill_page_in_new_tab() throws Exception {
	    mbe.redirectedToDebtAdviceAndSupportOrganisationsPage();
	}
	
	@Then("User clicks on Check if you can save on a meter button for Get a water meter and should redirected to Apply for a water meter page in new tab")
	public void user_clicks_on_check_if_you_can_save_on_a_meter_button_for_get_a_water_meter_and_should_redirected_to_apply_for_a_water_meter_page_in_new_tab() throws Exception {
	    mbe.redirectedToApplyForAWaterMeterPage();
	}

}