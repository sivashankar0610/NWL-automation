package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Registration_AlreadyExistingAccount_Loc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Registration_AlreadyExistingAccount extends BasePage{
	
	Registration_AlreadyExistingAccount_Loc rac;
	
	@When("User enters the account details that already exists in login radius and Click Create account button")
	public void User_enters_the_account_details_that_already_exists_in_login_radius(DataTable table) throws Exception {
		rac=new Registration_AlreadyExistingAccount_Loc(driver);
		rac.enterAccountDetails(table);
	}
	
	@Then("System should display the error message popup")
	public void System_should_display_the_error_message_popup() throws Exception {
		rac.errorMessagePopup();
	}
	
	@When("User clicks on Login button then system should redirect to Login Screen")
	public void User_clicks_on_Login_button_then_system_should_redirect_to_Login_Screen() throws Exception {
		rac.redirectToLogin();
	}

	
	
	

}
