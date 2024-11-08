package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.PS_RegisteringForMe_ViaServices_LoggedIn_Loc;
import com.nwl.pages.PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn extends BasePage {
	
	PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc psr2;
	PS_RegisteringForMe_ViaServices_LoggedIn_Loc ps;
	
	@Then("User clicks on I am registering for someone who does not live with me button and should navigate to Sign up to Priority Services page {string}")
	public void userClicksOnIAmRegisteringForSomeoneWhoDoesNotLiveWithMeButtonAndShouldNavigateToSignUpToPriorityServicesPage(String email) throws Exception {
		psr2=new PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc(driver);
		psr2.navigateToSignUpToPriorityServicesPage(email);
	}
	
	@When("User fills Who are you registering on behalf of? section details {string}, {string} & {string}")
	public void userFillsWhoAreYouRegisteringOnBehalfOfSectionDetails(String accNo, String ccbUsername, String ccbPwd) throws Exception {
		psr2.userFillsWhoAreYouRegisteringOnBehalfOfSectionDetails(accNo, ccbUsername, ccbPwd);
	}
	
	@Then("User clicks on Yes button for Does the person you are registering pay a Northumbrian Water bill? section")
	public void userClicksOnYesButtonForDoesThePersonYouAreRegisteringPayNWBillSection() throws Exception {
		psr2.userClicksOnYesButtonForDoesThePersonYouAreRegisteringPayNWBillSection();
	}
	
	@When("User clicks on Yes button for Would you like to be a nominated contact for this account? section")
	public void userClicksOnYesButtonForWouldYouLikeToBeNominatedContactForThisAccountSection() throws Exception {
		psr2.userClicksOnYesButtonForWouldYouLikeToBeNominatedContactForThisAccountSection();
	}
	
	@And("User selects any option for How did you hear about the priority services register? dropdown {string}")
	public void userSelectsAnyOptionForHowDidYouHearAboutThePriorityServicesRegisterDropdown(String option) throws Exception {
		psr2=new PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc(driver);
	    psr2.userSelectsAnyOptionForHearAboutThePriorityServicesRegisterDropdown(option);
	}
	
	@And("User verifies PSR Person Main tab in CC&B {string}")
	public void userVerifiesPSR_PersonMainTabInCCB(String accNo) throws Exception {
		psr2=new PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc(driver);
		psr2.userVerifiesPSR_PersonMainTabInCCB(accNo);
	}
	
	@And("User verifies PSR Person characteristics tab in CC&B")
	public void userVerifiesPSR_PersonCharacteristicsTabInCCB() throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.userVerifiesPersonCharacteristicsTabInCCB();
	}
	
	@And("User verifies PSR Person Bill route under Person portal tab in CC&B")
	public void userVerifiesPSR_PersonBillRouteUnderPersonPortalTabInCCB() throws Exception {
		ps.userVerifiesBillRouteUnderPersonPortalTabInCCB();
	}

}
