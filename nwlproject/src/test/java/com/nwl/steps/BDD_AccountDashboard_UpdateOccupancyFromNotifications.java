package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.AccountDashboard_UpdateOccupancyFromNotifications_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_AccountDashboard_UpdateOccupancyFromNotifications extends BasePage {
	
	AccountDashboard_UpdateOccupancyFromNotifications_Loc uo;
	
	@And("User verifies View button is displaying under notification alert section")
	public void user_verifies_view_button_is_displaying_under_notification_alert_section() throws Exception {
	    uo=new AccountDashboard_UpdateOccupancyFromNotifications_Loc(driver);
	    uo.verifyViewBtnUnderNAS();
	}
	
	@When("User clicks on View button and should be redirected to Notifications tab")
	public void user_clicks_on_view_button_and_should_be_redirected_to_notifications_tab() throws Exception {
	    uo.redirectedToNotificationsTab();
	}
	
	@When("User clicks on Account dashboard tab and should display Are you sure? popup")
	public void user_clicks_on_account_dashboard_tab_and_should_display_are_you_sure_popup() throws Exception {
		uo=new AccountDashboard_UpdateOccupancyFromNotifications_Loc(driver);
	    uo.shouldDisplayAreYouSurePopup();
	}
	
	@Then("User clicks on Continue button and should redirected to Account dashboard tab")
	public void user_clicks_on_continue_button_and_should_redirected_to_account_dashboard_tab() throws Exception {
	    uo.redirectedToAccountDashboardTab();
	}
	
	@Then("User clicks on Go back button and should redirected to Notifications tab")
	public void user_clicks_on_go_back_button_and_should_redirected_to_notifications_tab() throws Exception {
	    uo.navigateToNotificationsTab();
	}
	
	@Then("User clicks on Go back button and should navigate to Notifications tab")
	public void user_clicks_on_go_back_button_and_should_navigate_to_notifications_tab() throws Exception {
	    uo.navigateToNotificationTab();
	}

}
