package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.BudgetEstimator_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_BudgetEstimator extends BasePage {
	
	BudgetEstimator_Loc be;
	
	@When("User clicks on Services > Building and developing and should navigate to Building and developing page")
	public void user_clicks_on_services_building_and_developing_and_should_navigate_to_building_and_developing_page() throws Exception {
	    be=new BudgetEstimator_Loc(driver);
	    be.navigateToBuildingAndDevelopingPage();
	}
	
	@Then("User clicks on Water Connection budget estimator button and should navigate to Water connection budget estimator page")
	public void user_clicks_on_water_connection_budget_estimator_button_and_should_navigate_to_water_connection_budget_estimator_page() throws Exception {
		be.navigateToWaterConnectionBudgetEstimatorPage();
	}
	
	@When("User clicks on Go back button and should display Water connection budget estimator link")
	public void user_clicks_on_go_back_button_and_should_display_water_connection_budget_estimator_link() throws Exception {
	    be.clicksOnGoBackButton();
	}
	
	@When("User clicks on Make an online aplication link and should redirected to Developer Services Portal page in new tab")
	public void user_clicks_on_make_an_online_aplication_link_and_should_redirected_to_developer_services_portal_page_in_new_tab() throws Exception {
	    be.redirectedToDeveloperServicesPortalPage();
	}
	
	@Then("User selects option for Will the final premise be a household or non-household property? {string}")
	public void user_selects_option_for_will_the_final_premise_be_a_household_or_non_household_property(String propertyType) throws Exception {
	    be.selectsPropertyType(propertyType);
	}
	
	@And("User provides value for How many properties do you want to connect? {string}")
	public void user_provides_value_for_how_many_properties_do_you_want_to_connect(String propertiesCount) throws Exception {
	    be.howManyPropertiesToConnect(propertiesCount);
	}
	
	@And("User selects option for Will you require a temporary building supply for water? {string}")
	public void user_selects_option_for_will_you_require_a_temporary_building_supply_for_water(String waterSupply) throws Exception {
	    be.selectsSupplyOfWater(waterSupply);
	}
	
	@And("User provides value for Distance in meters to the middle of the nearest road from which you would like to connect? {string}")
	public void user_provides_value_for_distance_in_meters_to_the_middle_of_the_nearest_road_from_which_you_would_like_to_connect(String distance) throws Exception {
	    be.distanceFromConnect(distance);
	}
	
	@And("User selects option for What is the main surface type outside of the boundary of your property? {string}")
	public void user_selects_option_for_what_is_the_main_surface_type_outside_of_the_boundary_of_your_property(String surfaceType) throws Exception {
	    be.selectsMainSurfaceType(surfaceType);
	}
	
	@And("User clicks on Calculate button and should display Your budget estimation summary with values")
	public void user_clicks_on_calculate_button_and_should_display_your_budget_estimation_summary_with_values() throws Exception {
	    be.clicksOnCalculateButton();
	}
	
	@And("User verifies Pre and Post Disclaimer section")
	public void user_verifies_pre_and_post_disclaimer_section() throws Exception {
	    be.verifiesPreAndPostDisclaimerSection();
	}
	
	@And("User clicks on Make your aplication online button and should redirected to Developer Services Portal page in new tab")
	public void user_clicks_on_make_your_aplication_online_button_and_should_redirected_to_developer_services_portal_page_in_new_tab() throws Exception {
		be.navigateToDeveloperServicesPortalPage();
	}

}
