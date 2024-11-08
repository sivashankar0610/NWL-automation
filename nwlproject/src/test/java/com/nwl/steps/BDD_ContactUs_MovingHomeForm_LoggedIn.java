package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ContactUs_MovingHomeForm_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ContactUs_MovingHomeForm_LoggedIn extends BasePage {
	
	ContactUs_MovingHomeForm_LoggedIn_Loc mhf;
	
	@And("User click on Tell us youre moving home button and should redirected to Moving home page")
	public void user_clicks_on_tell_us_youre_moving_home_button_and_should_redirected_to_moving_home_page() throws Exception {
		mhf=new ContactUs_MovingHomeForm_LoggedIn_Loc(driver);
		mhf.redirectedToMovingHomePage();
	}
	
	@And("User verifies customer information with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_information_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
		mhf=new ContactUs_MovingHomeForm_LoggedIn_Loc(driver);
	    mhf.verifiesCustomerInformationWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@Then("User clicks on Submit button and should navigate to MH form Confirmation page")
	public void userClicksOnSubmitButtonAndShouldBenavigateToMHFormConfirmationScreen() throws Exception {
		mhf=new ContactUs_MovingHomeForm_LoggedIn_Loc(driver);
		mhf.navigateToConfirmationScreen();
	}

}
