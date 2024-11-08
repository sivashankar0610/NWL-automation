package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Transunion_HouseholdRagStatus_GreenOrAmber_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Transunion_HouseholdRagStatus_GreenOrAmber extends BasePage {
	
	Transunion_HouseholdRagStatus_GreenOrAmber_Loc green;
	
	@And("User verifies Try Our eligiblility checker button")
	public void user_verifies_try_our_eligiblility_checker_button() throws Exception {
	    green=new Transunion_HouseholdRagStatus_GreenOrAmber_Loc(driver); 
	    green.verifyTryOurEligiblilityCheckerButton();
	}
	
	@Then("User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page")
	public void user_clicks_on_try_our_eligiblility_checker_button_and_should_redirected_to_discount_on_your_bill_page() throws Exception {
	    green.navigateToDiscountOnYourBillPage();
	}
	
	@And("Verify user details with CC&B {string}, {string} & {string}")
	public void verify_user_details_with_cc_b(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    green.verifyUserDetailsWithCCB(accNo, ccbUsername, ccbPwd);
	}
	
	@And("User enters Move In Current address details {string} & {string}")
	public void user_enters_move_in_current_address_details(String miMonth, String miYear) {
	    green.entersMoveInCurrentAddressDetails(miMonth, miYear);
	}
	
	@When("User clicks on Next button and should redirected to Your Finances page")
	public void user_clicks_on_next_button_and_should_redirected_to_your_finances_page() throws Exception {
	    green.redirectedToYourFinancesPage();
	}
	
	@And("User selects Pension Credit as No")
	public void user_selects_pension_credit_as_no() throws Exception {
	    green.selectsPensionCreditAsNo();
	}
	
	@And("User fills Your income and housing costs fields {string}, {string} & {string}")
	public void user_fills_your_income_and_housing_costs_fields(String income, String rent, String frequency) throws Exception {
	    green.fillsYourIncomeAndHousingCostsFields(income, rent, frequency);
	}
	
	@Then("User clicks on Next button and should navigate to Your Finances page")
	public void user_clicks_on_next_button_and_should_navigate_to_your_finances_page() throws Exception {
	    green.navigateToYourFinancesPage();
	}
	
	@And("User provides How many people are over age of eighteen {string}")
	public void user_provides_how_many_people_are_over_age_of(String people) throws Exception {
	    green.providesHowManyPeopleAreOverAgeOfEighteen(people);
	}
	
	@And("User fills Second occupier details {string}")
	public void user_fills_second_occupier_details(String secondPersonIncome) throws Exception {
	    green.fillsSecondOccupierDetails(secondPersonIncome);
	}
	
	@When("User clicks on Submit button and should redirected to Eligible for a discount on your bill page")
	public void user_clicks_on_submit_button_and_should_redirected_to_eligible_for_a_discount_on_your_bill_page() throws Exception {
	    green.navigateToEligibleForADiscountOnYourBillPage();
	}
	
	@Then("User clicks on Submit my application button and should redirected to Green or Amber Status Confirmation screen")
	public void user_clicks_on_submit_my_application_button_and_should_redirected_to_confirmation_screen() throws Exception {
	    green.navigateToConfirmationScreen();
	}
	
	@And("User clicks on Back To My Account button and should navigate to Account dashboard tab")
	public void user_clicks_on_back_to_my_account_button_and_should_navigate_to_account_dashboard_tab() throws Exception {
	    green.navigateToAccountDashboardTab();
	}
	
	@And("User verifies Business process info in CC&B {string} & {string}")
	public void user_verifies_business_process_info_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    green.verifyBusinessProcessInfoInCCB(ccbUsername, ccbPwd);
	}
	
	@And("User verifies Pass to details section in CC&B")
	public void user_verifies_pass_to_details_section_in_cc_b() throws Exception {
		green=new Transunion_HouseholdRagStatus_GreenOrAmber_Loc(driver);
	    green.verifyPassToDetailsSectionInCCB();
	}

}
