package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_UpdateMyDetails_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MyProfile_UpdateMyDetails extends BasePage {
	
	MyProfile_UpdateMyDetails_Loc mp;
	
	@And("User clicks on Update my details button and should display Alert popup")
	public void user_clicks_on_update_my_details_button_and_should_display_alert_popup() throws Exception {
	    mp=new MyProfile_UpdateMyDetails_Loc(driver);
	    mp.displayAlertPopup();
	}
	
	@Then("User clicks on Go back button and should redirected to My Profile tab")
	public void user_clicks_on_go_back_button_and_should_redirected_to_my_profile_tab() throws Exception {
	    mp.redirectedToMyProfileTab();
	}
	
	@When("User clicks on Confirm button and should redirected to Editable My Profile page")
	public void user_clicks_on_confirm_button_and_should_redirected_to_editable_my_profile_page() throws Exception {
		mp=new MyProfile_UpdateMyDetails_Loc(driver);
	    mp.redirectedToEditableMyProfilePage();
	}
	
	@Then("User clicks on Cancel button and should navigate to My Profile tab")
	public void user_clicks_on_cancel_button_and_should_navigate_to_my_profile_tab() throws Exception {
	    mp.navigateToMyProfileTab();
	}
	
	@And("User enters Contact number {string} and Occupancy {string}")
	public void user_enters_contact_number_and_occupancy(String contactNo, String occupancyCount) throws Exception {
	    mp.entersUserDetails(contactNo, occupancyCount);
	}
	
	@Then("User clicks on Save changes button and should be display successs message popup")
	public void user_clicks_on_save_changes_button_and_should_be_display_successs_message_popup() throws Exception {
		mp=new MyProfile_UpdateMyDetails_Loc(driver);
	    mp.clicksOnSaveChangesButton();
	}
	
	@And("User clicks on Back to My Profile button and should redirected to My Profile tab")
	public void user_clicks_on_back_to_my_profile_button_and_should_redirected_to_my_profile_tab() throws Exception {
	    mp.clicksOnBackToMyProfileTab();
	}
	
	@And("User verifies Account Information in CC&B {string},{string} & {string}")
	public void UserVerifiesAccountInformationInCCB(String accNo, String username, String pwd) throws Exception {
	    mp.verifyAccountInformationInCCB(accNo, username, pwd);
	}

}
