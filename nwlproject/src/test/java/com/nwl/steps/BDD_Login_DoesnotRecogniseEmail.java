package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Login_DoesnotRecogniseEmail_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Login_DoesnotRecogniseEmail extends BasePage {

	Login_DoesnotRecogniseEmail_Loc l;
    
    @When("User enters an incorrect email as {string} and correct password as {string}")
    public void User_enters_an_incorrect_email_and_correct_password(String incorrectEmail,String incorrectPW) throws Exception {
    	l = new Login_DoesnotRecogniseEmail_Loc(driver);
    	l.enterIncorrectCredentials(incorrectEmail, incorrectPW);
    }
    
    @Then("User clicks on login button and system should display incorrect email address error message")
    public void System_should_display_incorrect_email_address_error_message() throws Exception {
    	l.errorMessageDisplayed();
    }
    
    @When("User click on OK button then User should be redirected back to Login Screen")
    public void User_click_on_OK_button() throws Exception {
    	l = new Login_DoesnotRecogniseEmail_Loc(driver);
    	l.redirectsBackToLogin();
    }
    
}
