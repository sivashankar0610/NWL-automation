package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Smart_MeterAndUsageEfficiencyStatus_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Smart_MeterAndUsageEfficiencyStatus extends BasePage {
	
	Smart_MeterAndUsageEfficiencyStatus_Loc ms;
	
	@Given("User open the browser {string} and launch the url {string}")
	public void launchURL(String browser, String url) throws Exception {
	    browserLaunch(browser, url);
	}
	
	@When("User clicks on Login or Create an account from Ribbon Account and should redirected to login tab")
	public void userClicksOnLoginOrCreateAnAccountFromRibbonAccount() throws Exception {
		ms=new Smart_MeterAndUsageEfficiencyStatus_Loc(driver);
		ms.navigateToLoginTab();
	}
	
	@And("User enters correct Email {string} and Password {string}")
	public void enterEmailAndPassword(String email, String pwd) throws Exception {
		ms=new Smart_MeterAndUsageEfficiencyStatus_Loc(driver);
		ms.enterCredentials(email, pwd);   
	}

	@Then("User clicks on Login button and should navigate to Account dashboard tab {string}")
	public void navigateToAccountDashboardTab(String acc) throws Exception {
		ms.clickOnLoginButtonAndNavigateADTab(acc);
	}
	
	@And("Verify meter status of the property under Your Usage section {string}")
	public void verifyMeterStatusCopytext(String accNo) throws Exception {
		ms.verifyMeterStatus(accNo);
	}

	@When("User clicks on Smart metered info icon then verify copy text for that")
	public void verifySmartMeteredInfoIconCopytext() throws Exception {
		ms.verifySmartMeteredInfoText();   
	}
	
	@Then("Verify water usage efficiency status under Account Dashboard tab")
	public void verifyUsageEfficiencyCopytextUnderAD() throws Exception {
		ms.verifyWaterUsageStatus_AD();
	}	
	
	@When("User clicks on View my usage button and should be redirected to My Usage tab for Smart")
	public void navigateToMyUsageTab() throws Exception {
		ms.clicksOnViewMyUsageAndNavigateToMyUsageTab();
	}

	@Then("Verify water usage efficiency status under My Usage tab for Smart")
	public void verifyUsageEfficiencyCopytextUnderMyUsageTab() throws Exception {
		ms.verifyWaterUsageStatus_MyUsage();
	}

}
