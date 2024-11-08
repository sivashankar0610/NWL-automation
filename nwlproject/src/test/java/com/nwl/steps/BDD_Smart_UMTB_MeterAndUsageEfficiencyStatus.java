package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Smart_UMTB_MeterAndUsageEfficiencyStatus_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Smart_UMTB_MeterAndUsageEfficiencyStatus extends BasePage {
	
	Smart_UMTB_MeterAndUsageEfficiencyStatus_Loc mus2;
	
	@And("Verify meter status and unmetered tariff bill copytext under Your Usage section {string}")
	public void verifyUnmeteredTariffBillCopytext(String accNo) throws Exception {
		mus2=new Smart_UMTB_MeterAndUsageEfficiencyStatus_Loc(driver);	
		mus2.verifyMeterStatusAndUnmeteredTariffBillText(accNo);
	}
	
	@When("User clicks on Unmetered tariff info icon then verify copy text for that")
	public void verifyUnmeteredTariffInfoIconCopytext() throws Exception {
		mus2.verifyUnmeteredTariffInfoText();
	}
	
	@Then("User clicks on View my usage button and should be redirected to My Usage tab for Smart-UMTB")
	public void navigateToMyUsageTab() throws Exception {
		mus2.ClicksOnViewMyUsage();
	}
	
	@And("Verify water usage efficiency status under My Usage tab for Smart-UMTB")
	public void verifyUsageEfficiencyCopytext() throws Exception {
		mus2.verifyWaterUsageStatus_MyUsage();
	}

}
