package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ForgotPassword_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ForgotPassword extends BasePage {
	
	ForgotPassword_Loc fp;
	
    @Then("User clicks on I've forgotten my email or password button on the login screen and should redirected to I Forgot my password page")
    public void User_clicks_on_I_forgotten_my_email_password_button_on_the_login_screen() throws Exception {
     	fp=new ForgotPassword_Loc(driver);
    	fp.forgotEmailPassword();
    }
    
    @When("User enters the corresponding email address {string} and User clicks on Set a new password button")
    public void User_clicks_on_Set_a_new_password_button(String email) {
    	fp.clickSetNewPassword(email);
    }
    
    @Then("Success screen should be displayed to reset password using the email sent")
    public void Success_screen_should_be_displayed() throws Exception {
    	fp.successScreen1();
    }
    
    @And("User clicks on OK button and user should be redirected to Login screen")
    public void User_clicks_on_OK_button_and_user_should_be_redirected_to_Login_screen() { 	
    	fp.redirectsToLogin();
    }
    
    @When("User opens {string} and enters the email address {string}")
    public void User_opens_yopmail_and_enters_the_email_address(String yopmailLink,String email) {
    	fp.opensYopMail(yopmailLink,email);
    }
    
    @And("User clicks on the password reset mail to reset the password")
    public void User_clicks_on_the_password_reset_mail_to_reset_the_password() throws Exception {
    	fp.resetPasswordLink();
    }
    
    @When("User enters a password which is less than 8 characters long {string}")
    public void User_enters_a_password_which_is_less_than_8_characters_long(String lessThan8) throws Exception {
    	fp.incorrectPasswordLessThanEight(lessThan8);
    }
    
    @Then("Red line and Red text should appear against the password fields")
    public void Red_line_and_Red_text_should_appear_against_the_password_fields() throws Exception {
    	fp.incorrectPasswordValidation();
    }
    
    @When("User enters a password which is complete lowercase {string}")
    public void User_enters_a_password_which_is_complete_lowercase(String lowerCase) {
    	fp.incorrectPasswordLowerCase(lowerCase);
    }
    
    @When("User enters a password which is complete uppercase {string}")
    public void User_enters_a_password_which_is_complete_uppercase(String upperCase) {
    	fp.incorrectPasswordUppercase(upperCase);
    }

    @When("User enters a password which is numbers only {string}")
    public void User_enters_a_password_which_is_numbers_only(String numbersOnly) {
    	fp.incorrectPasswordNumbersOnly(numbersOnly);
    }

    @When("User enters the old password {string}")
    public void User_enters_the_old_password(String oldPassword) {
    	fp.entersOldPassword(oldPassword);
    }

    @Then("System should display an invalid password popup")
    public void System_should_display_an_invalid_password_popup() throws Exception {
    	fp.invalidPasswordPopup();
    }
    
    @When("User enters a password which satisfies all criteria {string}")
    public void User_enters_a_password_which_satisfies_all_criteria(String newPassword) {
    	fp.entersCorrectpassword(newPassword);
    }
    
    @Then("System should display success screen popup")
    public void System_should_display_success_screen_popup() throws Exception {
    	fp.successScreen2();
    }
    
    @And("User clicks on OK button then user should be redirected to Login screen again")
    public void User_clicks_on_OK_button_then_user_should_be_redirected_to_Login_screen_again() {
    	fp.redirectsToLoginAgain();
    }
    
    @When("User enters the correct email address {string} and new password {string}")
    public void User_enters_the_correct_email_address_and_new_password(String email,String password) {
    	fp.loginUsingNewPassword(email,password);
    }
    
    @Then("System should get redirected to dashboard")
    public void System_should_get_redirected_to_dashboard() throws Exception {
    	fp.redirectsToDashboard();
    }
 
}
