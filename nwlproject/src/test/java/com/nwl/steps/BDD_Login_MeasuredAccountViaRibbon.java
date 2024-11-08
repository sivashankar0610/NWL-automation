package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Login_MeasuredAccountViaRibbon_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Login_MeasuredAccountViaRibbon extends BasePage {
	
	Login_MeasuredAccountViaRibbon_Loc login;
	
	@When("User clicks on the copy button against Serial number")
	public void userClicksOnTheCopyButtonAgainstSerialNumber() throws Exception	{
		login = new Login_MeasuredAccountViaRibbon_Loc(driver);
		login.copySerialNumber();
	}
	
	@Then("User clicks on Check my usage button under My Water meter section and should redirected to Water meters and usage tab")
	public void userNavigateTotoWaterMetersAndUsageTab() throws Exception	{
		login.navigateTotoWaterMetersAndUsageTab();
	}

	@And("User click on Logout button and should be logged out")
	public void User_click_on_Logout_button() throws Exception	{
		login = new Login_MeasuredAccountViaRibbon_Loc(driver);
		login.logoutAccount();
	}

}
