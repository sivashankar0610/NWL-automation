package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Login_UnmeasuredAccountViaHomepage_Loc extends BasePage {
	
	@FindBy(xpath = "//i[@class='btn-fa fal fa-user']") WebElement btnLoginCTA;
	@FindBy(linkText="Log in") WebElement tabLogin;
	@FindBy(xpath="//h1[@class='small-h1']") WebElement txtLogin;
	@FindBy(xpath="//div[@class='wp-usage-box text-center accountSummary__accountDetails']/div/h4") WebElement txtAboutYourAccount;
	@FindBy(xpath="(//i[@class='copy-icon far fa-copy'])[2]") WebElement btnCopyAccountNumber;
	@FindBy(xpath="(//span[@class='copy-text'])[2]") WebElement txtCopied;
//	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block nb-btn-white view-bill-payments'])[2]") WebElement btnViewBillsPayments;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block nb-btn-white view-bill-payments']") List<WebElement> btnViewBillsPayments;
	@FindBy(xpath = "//div[@class='wp-col payment-status']") WebElement columnBills;
	@FindBy(xpath = "//li[@class=\"owl-dot active\"]") WebElement tabBillsPayments;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-pay-your-bill']") WebElement btnPayNow;
	@FindBy(xpath = "(//li[@class='owl-dot'])[1]") WebElement tabAccountDashboard;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-am-i-better-meter']") WebElement btnSaveMoneyOnMeter;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-am-i-better-off']") WebElement btnCanYouSaveMoneyOnMeter;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-request-a-water-meter nb-btn-outline']") WebElement btnApplyForMeter;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-change-detail']") WebElement btnUpdateMyDetails;
	@FindBy(xpath = "//div[@class='wp-usage-box text-center accountSummary__accountDetails']") WebElement columnAbountAccount;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block confirm-btn'])[1]") WebElement btnConfirm;
	@FindBy(xpath = "(//input[@class='form-control firstname'])[5]") WebElement txtFirstName;
	@FindBy(xpath = "(//input[@class='form-control surname'])[5]") WebElement txtSurName;
	@FindBy(xpath = "//input[@class='form-control email']") WebElement txtEmail;
	@FindBy(xpath = "//input[@class='form-control profile-address address']") WebElement txtAddress1;
	@FindBy(xpath = "(//input[@class='form-control address1'])[2]") WebElement txtAddress2;
	@FindBy(xpath = "(//input[@class='form-control address2'])[2]") WebElement txtAddress3;
	@FindBy(xpath = "//input[@class='form-control address3']") WebElement txtAddress4;
	@FindBy(xpath = "(//input[@class='form-control postcode'])[2]") WebElement txtPostCode;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block save-btn'])[3]") WebElement btnSave;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[3]") WebElement btnCancel;
	@FindBy(xpath = "//div[@class='wp-usage-box bgblue-light summary-func text-center']") WebElement columnDownloadApp;
	@FindBy(xpath = "//div[@class='wp-usage-box bgblue-light summary-func text-center']/div/h6") WebElement titleDownloadApp;
	@FindBy(xpath = "//div[@class='wp-usage-box bgblue-light summary-func text-center']/div/p[2]") WebElement txtDownloadApp;
	@FindBy(xpath = "(//a[@class='nb-btn nb-btn-block nb-btn-white'])[2]") WebElement btnFindOutMore;
	@FindBy(xpath="(//div[@class='breadcrumb__block'])/div/h1") WebElement txtDownloadOurApp;
	@FindBy(xpath = "//div[@class='editorial__block']/div/h6") WebElement txtAppPageDescription;
	@FindBy(xpath = "(//a[@rel='noopener'])[6]") WebElement linkAppStore;
	@FindBy(xpath = "(//a[@rel='noopener'])[7]") WebElement linkPlayStore;
	
	
	public Login_UnmeasuredAccountViaHomepage_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Login_UnmeasuredAccountViaHomepage.properties");
	}

	public void clicksHomePageCTAButton() {
		elementVisible(100, btnLoginCTA);
		btnLoginCTA.click();
		elementVisible(100, tabLogin);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLogin);
	}
	
	public void copyAccounNumber() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYourAccount);
		btnCopyAccountNumber.click();
		elementVisible(100, txtCopied);
		Assert.assertEquals(true, txtCopied.getText().contains("Copied!"));
	}
	
	public void clicksViewBillsAndPaymentsButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", columnBills);
		for(WebElement e : btnViewBillsPayments){
			if(e.isDisplayed()) {
				e.click();
				break;
			}
		}
		elementVisible(100, btnPayNow);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabBillsPayments);
		Assert.assertTrue(btnPayNow.isDisplayed());	
		Thread.sleep(3000);
	}
	
	public void returnsToTheAccountDashboardTab() throws Exception {
		tabAccountDashboard.click();
		Thread.sleep(3000);
	}
	
	public void redirectsToWaterMetersAndUsage() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSaveMoneyOnMeter);
		btnSaveMoneyOnMeter.click();
		Thread.sleep(3000);
		elementVisible(100, btnCanYouSaveMoneyOnMeter);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabBillsPayments);
		Assert.assertTrue(btnCanYouSaveMoneyOnMeter.isDisplayed());	
		elementVisible(100, btnApplyForMeter);
		Assert.assertTrue(btnApplyForMeter.isDisplayed());	
	}
	
	public void clicksUpdateMyDetailsButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", columnAbountAccount);	
		Assert.assertTrue(btnUpdateMyDetails.isDisplayed());	
		btnUpdateMyDetails.click();
		elementVisible(100, btnConfirm);
	}
	
	public void redirectsToMyProfile() throws Exception {
		btnConfirm.click();
		elementVisible(100, txtFirstName);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabBillsPayments);
		Assert.assertTrue(txtFirstName.isDisplayed());	
		Assert.assertTrue(txtSurName.isDisplayed());	
		Assert.assertTrue(txtEmail.isDisplayed());	
		Assert.assertTrue(txtAddress1.isDisplayed());	
		Assert.assertTrue(txtAddress2.isDisplayed());	
		Assert.assertTrue(txtAddress3.isDisplayed());	
		Assert.assertTrue(txtAddress4.isDisplayed());	
		Assert.assertTrue(txtPostCode.isDisplayed());	
		Assert.assertTrue(btnSave.isDisplayed());	
		Assert.assertTrue(btnCancel.isDisplayed());	
		Thread.sleep(2000);
	}
	
	public void redirectsToDownloadApp() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", columnDownloadApp);	
		Assert.assertEquals(true, titleDownloadApp.getText().contains(c.getData("titleDownloadApp")));
		Assert.assertEquals(true, txtDownloadApp.getText().contains(c.getData("descDownloadApp")));
		btnFindOutMore.click();
		elementVisible(100, txtDownloadOurApp);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDownloadOurApp);
		//Assert.assertEquals(true, txtAppPageDescription.getText().contains(c.getData("descDownloadPage")));
		Assert.assertTrue(linkAppStore.isDisplayed());
		Assert.assertTrue(linkPlayStore.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDownloadOurApp);
	}

}
