package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_UpdatePostalOrCorrespondenceAddress_Loc;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MyProfile_UpdatePostalOrCorrespondenceAddress extends BasePage {
	
	MyProfile_UpdatePostalOrCorrespondenceAddress_Loc pca;
	
	@And("User verifies My Address section")
	public void user_verifies_my_address_section() throws Exception {
	    pca=new MyProfile_UpdatePostalOrCorrespondenceAddress_Loc(driver);
	    pca.verifyMyAddressSection();
	}
	
	@And("User enters new address")
	public void user_enters_new_address(DataTable table) throws Exception {
	    pca.entersNewAddress(table);
	}
	
	@Then("User clicks on Save changes button and should displayed successs message popup")
	public void user_clicks_on_save_changes_button_and_should_displayed_successs_message_popup() throws Exception {
	    pca.clicksOnSaveChangesButton();
	}
	
	@When("User clicks on Back to My Profile button and verify changed address is displayed")
	public void user_clicks_on_back_to_my_profile_button_and_verify_changed_address_is_displayed() throws Exception {
	    pca.clicksOnBackToMyProfileButton();
	}
	
	@Then("User verifies new address is displayed in CC&B {string},{string} & {string}")
	public void user_verifies_new_address_is_displayed_in_cc_b(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    pca.verifyNewAddressInCCB(accNo, ccbUsername, ccbPwd);
	}

}
