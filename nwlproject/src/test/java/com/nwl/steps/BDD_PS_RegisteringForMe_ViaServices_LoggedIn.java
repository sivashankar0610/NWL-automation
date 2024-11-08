package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.PS_RegisteringForMe_ViaServices_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_PS_RegisteringForMe_ViaServices_LoggedIn extends BasePage {
	
	PS_RegisteringForMe_ViaServices_LoggedIn_Loc ps;
	
	@When("User clicks on Services>Extra Support>Priority Services and should navigate to Priority Services page")
	public void user_clicks_on_services_extra_support_priority_services_and_should_navigate_to_priority_services_page() throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
	    ps.redirectedToPriorityServicesPage();
	}
	
	@And("User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page")
	public void user_clicks_on_register_for_priority_services_button_and_should_redirected_to_sign_up_to_priority_services_page() throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.navigateToSignUpToPriorityServicesPage1();
	}
	
	@Then("User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page")
	public void userClicksOnIAmRegisteringForMyselfOrSomeoneWhoLivesWithMeButtonAndShouldNavigateToSignUpToPriorityServicesPage() throws Exception {
		ps.navigateToSignUpToPriorityServicesPage2();
	}
	
	@And("User selects for me button under Sign up to Priority Services page")
	public void userSelectsForMeButtonUnderSignUpToPriorityServicesPage() throws Exception {
	    ps.userSelectsForMeButton();
	}
	
	@When("User clicks on Next button and should redirected to Your Priority Services options page")
	public void userClicksOnNextButtonAndShouldNavigateToYourPriorityServicesOptionsPage() throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.navigateToYourPriorityServicesOptionsPage();
	}
	
	@And("User clicks on Goback button and should navigate to Sign up to Priority Services page")
	public void userClicksOnGoBackButtonAndShouldNavigateToSignUpToPriorityServicesPage() throws Exception {
		ps.userClicksOnGoBackButton();
	}
	
	@And("User selects Blind option for Registered person affected by any of the following?")
	public void userSelectsBlindOptionForRegisteredPersonAffectedByAnyOfTheFollowing() throws Exception {
	    ps.userSelectsBlindOptionForRegisteredPersonAffectedBy();
	}
	
	@And("User selects any option for Registered person affected by any of these circumstances? {string}")
	public void userSelectsAnyOptionForRegisteredPersonAffectedByAnyOfTheseCircumstances(String option) throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
	    ps.userSelectsAnyOptionForRegisteredPersonAffectedByCircumstances(option);
	}
	
	@And("User selects Yes option for Registered person with bottled water and verify support registered person section")
	public void userSelectsYesOptionForRegisteredPersonWithBottledWaterAndVerifySupportRegisteredPersonSection() throws Exception {
	    ps.userSelectsYesOptionForRegisteredPersonWithBottledWater();
	}
	
	@And("User sets password {string} and selects any option for How would you like your bill? {string}")
	public void userSetsPasswordAndSelectsAnyOptionForHowWouldYouLikeYourBill(String pwd, String option) throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.userSelectsAnyOptionForHowWouldYouLikeYourBill(pwd, option);
	}
	
	@And("User selects option for How did you hear about the priority services register? dropdown {string}")
	public void userSelectsOptionForHowDidYouHearAboutThePriorityServicesRegisterDropdown(String option) throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
	    ps.userSelectsOptionForHearAboutThePriorityServicesRegisterDropdown(option);
	}
	
	@Then("User clicks on Next button and should redirected to PSR confirmation screen")
	public void userClicksOnNextButtonAndShouldRedirectedToPSRConfirmationScreen() throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.navigateToPSRConfirmationScreen();
	}
	
	@And("User clicks on Back to priority services button and should redirected to priority services page")
	public void userClicksOnBackToPriorityServicesButtonAndShouldRedirectedToPriorityServicesPage() throws Exception {
		ps.navigateToPriorityServicesPage();
	}
	
	@And("User navigates to My Profile to verify Priority Services section having Change and Remove buttons")
	public void user_navigates_to_my_profile_to_verify_priority_services_section_having_change_and_remove_buttons() throws Exception {
		ps.verifyPriorityServicesSection();
	}
	
	@When("User verifies Customer contact characteristics in CC&B {string} & {string}")
	public void userVerifiesCustomerContactCharacteristicsInCCB(String username, String pwd) throws Exception {
		ps.userVerifiesCustomerContactCharacteristicsInCCB(username, pwd);
	}
	
	@Then("User verifies Activity History Section in CC&B")
	public void userVerifiesActivityHistorySectionInCCB() throws Exception {
	    ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.userVerifiesActivityHistorySectionInCCB();
	}
	
	@And("User verifies Person Main tab in CC&B")
	public void userVerifiesPersonMainTabInCCB() throws Exception {
		ps=new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.userVerifiesPersonMainTabInCCB();
	}
	
	@And("User verifies Person characteristics tab in CC&B")
	public void userVerifiesPersonCharacteristicsTabInCCB() throws Exception {
		ps.userVerifiesPersonCharacteristicsTabInCCB();
	}
	
	@And("User verifies Bill route under Person portal tab in CC&B")
	public void userVerifiesBillRouteUnderPersonPortalTabInCCB() throws Exception {
		ps.userVerifiesBillRouteUnderPersonPortalTabInCCB();
	}

}
