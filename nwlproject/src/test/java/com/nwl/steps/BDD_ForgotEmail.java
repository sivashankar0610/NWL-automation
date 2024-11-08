package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ForgotEmail_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ForgotEmail extends BasePage{

	ForgotEmail_Loc fe;
	
	@And("Forgot Email tab should be selected from the Forgot Something page")
	public void Forgot_Email_tab_should_be_selected_from_the_Forgot_Something_page() throws Exception {
		fe=new ForgotEmail_Loc(driver);
		fe.forgotEmail();
	}
	
    @When("User clicks on Back to login link and should redirected to login tab")
	public void User_clicks_on_How_can_I_find_my_account_number_link() throws Exception {
		fe.userClicksOnBackToLoginLink();
    }
	
    @When("User clicks on I dont have this information button and system should display an error message popup")
	public void User_clicks_on_I_dont_have_this_information_button() throws Exception {
		fe.iDontHaveThisInformationButton();
	}
    
    @Then("User clicks on OK button from the popup then System should redirect to Help Centre page")
	public void System_should_redirect_to_Help_Centre_page() throws Exception {
		fe.helpCentrePage();
	}
    
    @And("System gets the required informations from the CC&B for the account {string} using {string} and {string}")
    public void System_gets_the_required_informations_from_the_CCB(String AccountID, String CCBEmail, String CCBPw) throws Exception {
    	fe.getCCBdetails(AccountID,CCBEmail,CCBPw);
    }
	
    @When("User enters incorrect details in all fields")
	public void User_enters_incorrect_details_in_all_fields_and_click_Find_my_email_address() {
		fe.incorrectDetailsInAllFields();
	}
	
    @Then("User clicks on Find my email address button and system should display Email not found error message")
	public void System_should_display_Email_not_found_error_message() throws Exception {
		fe.emailNotFoundMessage();
	}
	
    @And("User clicks on OK button and user should be redirected to Forgot Email screen")
	public void User_clicks_on_OK_button_and_user_should_be_redirected_to_Forgot_Email_screen() {
    	fe.redirectsToForgotEmail();	
	}
	
    @When("User leaves all the fields Null")
	public void User_leaves_all_the_fields_Null() {
		fe.allFieldsNull();
	}
	
    @Then("User clicks on Find my email address button and red line & red error message should appear below all the fields")
	public void Red_line_and_Red_error_message_should_appear_below_all_the_fields() throws Exception {
		fe.redTextErrorMessage();
	}
	
    @When("User enters correct details but leave account number NULL")
	public void User_enters_correct_details_but_leave_account_number_NULL() {
		fe.accountNumberNull();
	}
	
    @When("User enter correct details but leave First Name NULL")
	public void User_enter_correct_details_but_leave_First_Name_NULL() {
		fe.firstNameNull();
	}
	
    @Then("User clicks on Find my email address button and red line & red text should appear below the First Name field")
	public void Red_line_and_Red_text_should_appear_below_the_First_Name_field() throws Exception {
		fe.errorFirstName();
	}
	
    @When("User enter correct details but leave Surname NULL")
	public void User_enter_correct_details_but_leave_Surname_NULL() {
		fe.surNameNull();
	}
	
    @Then("User clicks on Find my email address button and red line & red text should appear below the Surname field")
	public void Red_line_and_Red_text_should_appear_below_the_Surname_field() throws Exception {
		fe.errorSurName();
	}
	
    @When("User enter correct details but leave Postcode NULL")
	public void User_enter_correct_details_but_leave_Postcode_NULL() {
		fe.postCodeNull();
	}
	
    @Then("User clicks on Find my email address button and red line & red text should appear below the Postcode field")
	public void Red_line_and_Red_text_should_appear_below_the_Postcode_field() throws Exception {
		fe.errorPostCode();
	}
	
    @When("User enter correct details but leave Date of Birth NULL")
	public void User_enter_correct_details_but_leave_Date_of_Birth_NULL() {
		fe.dateOfBirthNull();
	}
	
    @Then("User clicks on Find my email address button and red line & red text should appear below the Date of Birth field")
	public void Red_line_and_Red_text_should_appear_below_the_Date_of_Birth_field() throws Exception {
		fe.errorDateOfBirth();
	}
	
    @When("User enter correct details except for First Name")
	public void User_enter_correct_details_except_for_First_Name() {
		fe.incorrectFirstName();
	}
	
    
    @When("User enter correct details except for Surname")
	public void User_enter_correct_details_except_for_Surname() {
		fe.incorrectSurName();
	}
	
   
    @When("User enter correct details except for Postcode")
	public void User_enter_correct_details_except_for_Postcode() {
		fe.incorrectPostCode();
	}
	
    
    @When("User enter correct details except for Date of Birth")
	public void User_enter_correct_details_except_for_Date_of_Birth() {
		fe.incorrectDateOfBirth();
	}
	
    
    @When("User enter correct details except for Account number")
	public void User_enter_correct_details_except_for_Account_number() {
		fe.incorrectAccountNumber();
	}
	
    
    @When("User enter all correct details")
	public void User_enter_all_correct_details() {
		fe.allCorrectDetails();
	}
	
    @Then("User clicks on Find my email address button and system should display success screen with registered email address")
	public void System_should_display_success_screen_with_registered_email_address() throws Exception {
		fe.successScreenWithEmail();
	}
	
    @When("User clicks on Login button then System should redirect to Login screen")
	public void User_clicks_on_Login_button_then_System_should_redirect_to_Login_screen() {
		fe.clicksLoginButton();
	}
    
    @And("User enters the displayed email address and password {string}")
    public void User_enters_the_displayed_email_address_and_password(String password) {
    	fe.enterCredentials(password);
    }
}