package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.SetupPaymentPlanToMonthlyPlan_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_SetupPaymentPlanToMonthlyPlan extends BasePage {

	SetupPaymentPlanToMonthlyPlan_Loc setup;

	@Then("User verifies the Do you want to change how you want to pay your bill Section")
	public void user_Verifies_The_Doyouwanttochangehowyouwanttopayyourbill_Section() throws Exception {
		setup = new SetupPaymentPlanToMonthlyPlan_Loc(driver);
		setup.verifyTheDoYouWantToChangeHowYouWantToPayYourBillSection();
	}

	@When("User clicks on Set up a payment plan button and should be redirected to Set up a payment plan page")
	public void user_clicks_On_Setup_A_Payment_Plan_Button() throws Exception {
		setup.userClicksOnSetupAPaymentPlanButton();
	}

	@Then("User selects the Payment date and number of people who live there {string} & {string}")
	public void User_Selects_A_Payment_Date(String paymentdate, String numberOfPeople) throws Exception {
		setup.UserSelectsAPaymentDateAndOccupancy(paymentdate, numberOfPeople);
	}

	@And("User clicks on Set up a payment plan button and makes note of the confirmation number in the confirmation screen")
	public void User_clicks_On_Set_Up_a_Paymentplan_Button_And_Makes_Note_Of_the_Confirmation_Number_In_The_ConfirmationScreen () throws Exception {
		setup.userClicksOnSetupPaymentPlanButtonAndMakesNoteOfConfirmationNumber();
	}

	@When("User closes the Confirmation Screen and should be redirected to Set up a payment plan page")
	public void User_closes_the_Confirmation_Screen_and_should_be_redirected_to_Setup_a_payment_plan_page() throws Exception {
		setup.userClosesTheConfirmationScreenAndShouldbeRedirectedtoSetupapaymentplanPage();
	}

	@Then("User clicks on the Account Dashboard tab and should be redirected to Account Dashboard")
	public void User_ClicksOn_TheAccountDashboardTab() throws Exception {
		setup.userClicksOnTheAccountDashboardTab();
	}

	@When("User Verifies the AccountCharacteristics in CC&B {string} & {string}")
	public void User_Verifies_The_AccountCharacteristics_In_CC_B(String username, String pwd) throws Exception {
		setup.userVerifiesAccountCharacteristicsInfoInCCNB(username, pwd);
	}

}
