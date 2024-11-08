package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Login_UnmeasuredAccountViaHomepage_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Login_UnmeasuredAccountViaHomepage extends BasePage {
	
	Login_UnmeasuredAccountViaHomepage_Loc l;

    @When("User click on homepage CTA button Log into your online account and should redirected to login tab")
    public void User_click_on_homepage_CTA_button_Log_into_your_online_account() throws Exception {
    	l = new Login_UnmeasuredAccountViaHomepage_Loc(driver);
    	l.clicksHomePageCTAButton();
    }
    
    @And("User clicks on the copy button against account number")
    public void UserClicksOnTheCopyButtonAgainstAccountNumber() throws Exception {
    	l = new Login_UnmeasuredAccountViaHomepage_Loc(driver);
    	l.copyAccounNumber();
    }
    
    @When("User clicks on View my bills and payments button and should redirected to My bills and payments page")
    public void User_clicks_on_View_my_bills_and_payments_button() throws Exception {
    	l = new Login_UnmeasuredAccountViaHomepage_Loc(driver);
    	l.clicksViewBillsAndPaymentsButton();
    }
    
    @Then("User returns to the Account Dashboard tab")
    public void userReturnsToTheAccountDashboardTab() throws Exception {
    	l.returnsToTheAccountDashboardTab();
    }
    
    @When("User clicks on Can I save money on a meter? button and should be redirected to Water meters and usage page")
    public void User_clicks_on_Can_I_save_money_on_a_meter_button() throws Exception {
    	l.redirectsToWaterMetersAndUsage();
    }
    
    @When("User clicks on Update my details? button")
    public void User_clicks_on_Update_my_details_button() {
    	l.clicksUpdateMyDetailsButton();
    }
    
    @And("User clicks on Confirm button and should be redirected to My profile page")
    public void User_should_be_redirected_to_My_profile_page() throws Exception {
    	l.redirectsToMyProfile();
    }
    
    @When("User clicks on Find Out More button and should redirected to Download our app page")
    public void User_clicks_on_Find_Out_More_button() throws Exception {
    	l.redirectsToDownloadApp();
    }

}
