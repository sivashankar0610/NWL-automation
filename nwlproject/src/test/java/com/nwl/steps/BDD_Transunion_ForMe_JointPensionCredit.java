package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Transunion_ForMe_JointPensionCredit_Loc;
import io.cucumber.java.en.And;

public class BDD_Transunion_ForMe_JointPensionCredit extends BasePage {
	
	Transunion_ForMe_JointPensionCredit_Loc jpc;
	
	@And("User selects For me and Joint Pension Credit buttons")
	public void user_selects_for_me_and_joint_pension_credit_buttons() throws Exception {
		jpc=new Transunion_ForMe_JointPensionCredit_Loc(driver);
	    jpc.selectsForMeAndJointPensionCreditButtons();
	}
	
	@And("User enters Joint holder details")
	public void user_enters_joint_holder_details() throws Exception {
	    jpc.entersJointHolderDetails();
	}

}
