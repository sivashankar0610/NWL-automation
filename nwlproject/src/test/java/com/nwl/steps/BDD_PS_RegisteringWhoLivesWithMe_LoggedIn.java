package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.PS_RegisteringForMe_ViaServices_LoggedIn_Loc;
import com.nwl.pages.PS_RegisteringWhoLivesWithMe_LoggedIn_Loc;
import io.cucumber.java.en.And;

public class BDD_PS_RegisteringWhoLivesWithMe_LoggedIn extends BasePage {
	
	PS_RegisteringWhoLivesWithMe_LoggedIn_Loc psr;
	
	@And("User selects for someone else button under Sign up to Priority Services page")
	public void userSelectsForSomeoneElseButtonUnderSignUpToPriorityServicesPage() throws Exception {
		psr=new PS_RegisteringWhoLivesWithMe_LoggedIn_Loc(driver);
	    psr.userSelectsForSomeoneElseButton();
	}
	
	@And("User enters personal details for who lives with you {string} & {string}")
	public void userEntersPersonalDetailsForWhoLivesWithYou(String firstName, String surname) throws Exception {
	    psr.entersPersonalDetailsForWhoLivesWithYou(firstName, surname);
	}
	
	@And("User sets password {string}")
	public void userSetsPasswordAndSelectsAnyOptionForHowWouldYouLikeYourBill(String pwd) throws Exception {
		psr=new PS_RegisteringWhoLivesWithMe_LoggedIn_Loc(driver);
	    psr.userSetsPassword(pwd);
	}
	
	@And("User navigates to My Profile to verify Priority Services section having Register button")
	public void user_navigates_to_my_profile_to_verify_priority_services_section_having_register_button() throws Exception {
		psr=new PS_RegisteringWhoLivesWithMe_LoggedIn_Loc(driver);
		psr.verifyPriorityServicesSection();
	}
	
	@And("User verifies PSR person Premise characteristics tab in CC&B")
	public void userVerifiesPSR_PersonPremiseCharacteristicsTabInCCB() throws Exception {
		psr=new PS_RegisteringWhoLivesWithMe_LoggedIn_Loc(driver);
		psr.userVerifiesPSR_PersonPremiseCharacteristicsTabInCCB();
	}
	
	@And("User verifies PSR person Main tab in CC&B")
	public void userVerifiesPSR_PersonMainTabInCCB() throws Exception {
		psr.userVerifiesPSR_PersonMainTabInCCB();
	}
	
	@And("User verifies PSR person characteristics tab in CC&B")
	public void userVerifiesPSR_PersonCharacteristicsTabInCCB() throws Exception {
		psr.userVerifiesPSR_PersonCharacteristicsTabInCCB();
	}
	
	@And("User verifies PSR person Activity History Section in CC&B")
	public void userVerifiesPSR_PersonActivityHistorySectionInCCB() throws Exception {
		PS_RegisteringForMe_ViaServices_LoggedIn_Loc ps = new PS_RegisteringForMe_ViaServices_LoggedIn_Loc(driver);
		ps.userVerifiesActivityHistorySectionInCCB();
	}

}
