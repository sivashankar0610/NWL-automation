package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.SetupDirectDebit_Loc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_SetupDirectDebit extends BasePage {
	
	SetupDirectDebit_Loc dd;

    @Then("User verifies Set up a Direct Debit section under My bills and payment tab")
    public void User_verifies_Set_up_a_Direct_Debit_section() throws Exception {
    	dd=new SetupDirectDebit_Loc(driver);
    	dd.userVerifiesSetupDirectDebitSection();
    }
    
    @When("User clicks on Setup Direct Debit button and should redirected to Setup Direct Debit page")
    public void User_should_be_redirected_to_Setup_Direct_Debit_page() throws Exception {
    	dd.redirectsToSetupDirectDebitPage();
    }
    
    @And("User selects on No button for Are you the account holder field")
    public void User_clicks_on_No_CTA_button() throws Exception {
    	dd.clicksOnNoBtn();
    }
    
    @Then("User clicks on Download a paper DDI for a metered property here link")
    public void ddiMeteredProperty() throws Exception {
    	dd.ddiMeteredProperty();
    }
    
    @And("User clicks on DDI PDF for an unmetered property link")
    public void ddiUnmeteredProperty() throws Exception {
    	dd.ddiUnmeteredProperty();
    }
    
    @And("User clicks on Adobe Acrobat Click here link")
    public void userClicksOnAdobeAcrobatLink() throws Exception {
    	dd.userClicksOnAdobeAcrobatLink();
    }
    
    @When("User selects on Yes button for Are you the account holder field")
    public void User_clicks_on_Yes_CTA_button() throws Exception {
    	dd.clicksOnYesBtn();
    }
    
    @Then("User enters bank details on the Setup Direct Debit screen")
    public void User_enters_bank_details_on_the_Setup_Direct_Debit_screen(DataTable table) throws Exception {
    	dd.userEntersBankDetails(table);
    }	
	
    @When("User clicks on SetupDD button and should redirected to Check your Direct Debit details page")
    public void redirected_to_Check_your_Direct_Debit_details_page() {
    	dd.redirectedToCheckYourDirectDebitdetailsPage();
    }
    
    @Then("User clicks on Read the DD Guarantee link")
    public void User_clicks_on_Read_the_DD_Guarantee_link() throws Exception {
    	dd.clicksOnReadTheDDGuaranteeLink();
    }
    
    @And("User clicks on Go Back button and should redirected to Setup Direct Debit page")
    public void User_clicks_on_Go_Back_button() throws Exception {
    	dd.clicksOnGoBackBtn();
    }
    
    @Then("User clicks on Confirm button and should redirected to confirmation page")
    public void User_clicks_on_Confirm_button() throws Exception {
    	dd.redirectedToConfirmationScreen();
    }
    
    @When("User clicks on Go Back to my account button and should redirected to account dashboard")
    public void User_clicks_on_Go_Back_to_my_account_button() throws Exception {
    	dd.clicksOnGoBackToMyAccountBtn();
    }
    
    @And("User Verifies the Autopay Active Section in CC&B")
    public void User_Verifies_the_Autopay_Active_Section_in_CCNB( ) throws Exception {
       	dd.userVerifiesAutopayTabInCCB( );
    }
    
}
