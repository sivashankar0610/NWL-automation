package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.WaterQuality_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_WaterQuality extends BasePage {
	
	WaterQuality_Loc wq;
	
	@When("User clicks on Water Quality button")
	public void user_clicks_on_water_quality_button() throws Exception {
	    wq=new WaterQuality_Loc(driver);
	    wq.clicksOnWaterQualityButton();
	}
	
	@When("User selects The taste and smell of my water radio button for What seems to be the problem? field")
	public void user_selects_the_taste_and_smell_of_my_water_radio_button_for_what_seems_to_be_the_problem_field() throws Exception {
	    wq.selectsTheTasteAndSmellOfMyWaterRadioButton();
	}
	
	@Then("User clicks on No button for Is your cold water supply affected? field")
	public void user_click_on_no_button_for_is_your_cold_water_supply_affected_field() throws Exception {
	    wq.clicksOnNoButton_CWSA();
	}
	
	@And("User clicks on Yes button for Is your cold water supply affected? field")
	public void user_clicks_on_yes_button_for_is_your_cold_water_supply_affected_field() throws Exception {
		wq.clicksOnYesButton_CWSA();
	}
	
	@And("User selects Chlorine option for Can you describe the taste or smell of your water? field")
	public void user_selects_chlorine_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsChlorineOption();
	}
	
	@And("User selects TCP or mouthwash option for Can you describe the taste or smell of your water? field")
	public void user_selects_tcp_or_mouthwash_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsTCPOrMouthWashOption();
	}
	
	@And("User selects Stale or musty option for Can you describe the taste or smell of your water? field")
	public void user_selects_stale_or_musty_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsStaleOrMustyOption();
	}
	
	@And("User selects Metal option for Can you describe the taste or smell of your water? field")
	public void user_selects_metal_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsMetalOption();
	}
	
	@And("User selects Egg or fish option for Can you describe the taste or smell of your water? field")
	public void user_selects_egg_or_fish_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsEggOrFishOption();
	}
	
	@And("User selects Diesel or petrol option for Can you describe the taste or smell of your water? field")
	public void user_selects_diesel_or_petrol_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsDieselOrPetrolOption();
	}
	
	@And("User selects Woody tastes or smells option for Can you describe the taste or smell of your water? field")
	public void user_selects_woody_tastes_or_smells_option_for_can_you_describe_the_taste_or_smell_of_your_water_field() throws Exception {
		wq.selectsWoodyTastesOrSmellsOption();
	}
	
	@When("User clicks on Yes button for Has this information helped? field")
	public void user_clicks_on_yes_button_for_has_this_information_helped_field() throws Exception {
		wq.clicksOnYesButton_InformationHelped();
	}
	
	@Then("User clicks on No button for Has this information helped? field")
	public void user_clicks_on_no_button_for_has_this_information_helped_field() throws Exception {
		wq.clicksOnNoButton_InformationHelped();
	}
	
	@When("User selects My water has a strange colour or bits radio button for What seems to be the problem? field")
	public void user_selects_my_water_has_a_strange_colour_or_bits_radio_button_for_what_seems_to_be_the_problem_field() throws Exception {
		wq.selectsMyWaterHasStrangeColourOrBitsOption();
	}
	
	@And("User click on Yes button for Is your cold water supply affected? field")
	public void user_click_on_yes_button_for_is_your_cold_water_supply_affected_field() throws Exception {
		wq.clickOnYesButton_CWSA();
	}
	
	@And("User selects White and cloudy option for What colour is your water? field")
	public void user_selects_white_and_cloudy_option_for_what_colour_is_the_your_water_field() throws Exception {
		wq.selectsWhiteAndCloudyOption();
	}
	
	@And("User selects Black, orange or brown option for What colour is your water? field")
	public void user_selects_black_orange_or_brown_option_for_what_colour_is_the_your_water_field() throws Exception {
		wq.selectsBlackOrangeOrBrownOption();
	}
	
	@And("User selects Pink, blue or green option for What colour is your water? field")
	public void user_selects_pink_blue_or_green_option_for_what_colour_is_the_your_water_field() throws Exception {
		wq.selectsPinkBlueOrGreenOption();
	}
	
	@And("User selects Biofilm and mould option for What colour is your water? field")
	public void user_selects_biofilm_and_mould_option_for_what_colour_is_the_your_water_field() throws Exception {
		wq.selectsBiofilmAndMouldOption();
	}
	
	@And("User selects I think I have hard water radio button for What seems to be the problem? field")
	public void user_selects_i_think_i_have_hard_water_radio_button_for_what_seems_to_be_the_problem_field() throws Exception {
	    wq.selectsIHaveHardWaterOption();
	}

}
