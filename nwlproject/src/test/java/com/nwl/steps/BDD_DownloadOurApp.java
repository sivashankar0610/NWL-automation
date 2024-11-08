package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.DownloadOurApp_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_DownloadOurApp extends BasePage {
	
	DownloadOurApp_Loc doa;
	
	@When("User clicks on My Usage tab and should be redirected to My Usage tab")
	public void navigateToMyUsage() throws Exception {
	    doa = new DownloadOurApp_Loc(driver);
	    doa.clicksOnMyUsageTabAndNavigateMyUsageTab();
	}

	@Then("Verify Smart app download promo banner copy text")
	public void verifySmartAppDownload_promoBannerCopytext() throws Exception {
	    doa.verifyDownloadAppBannerCopyText();
	}

	@And("User clicks on Download the App button and should be navigate to Download Our App website")
	public void navigateToDownloadOurAppWebsite() throws Exception {
	    doa.clicksOnDownloadTheAppButtonAndNavigateDownloadOurAppWebsite();
	}

}
