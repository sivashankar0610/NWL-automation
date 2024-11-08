package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class AccountDashboard_UpdateOccupancyFromNotifications_Loc extends BasePage {

    @FindBy(xpath="//li[@rel='account']") WebElement tabAccountDashboard;	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-outline btn-action-alert nb-btn-white']") WebElement btnView;
	@FindBy(xpath="//li[@rel='notification']") WebElement tabNotifications;
	@FindBy(xpath="//div[@class='tab_actions_title']/h5") WebElement txtNotifications;
	@FindBy(xpath="(//div[@class='alert__content']/h6)[3]") WebElement txtAreYouSure;
	@FindBy(xpath="(//div[@class='alert__content']/p)[5]") WebElement txtAreYouSureTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block confirm-btn'])[4]") WebElement btnContinue;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block back-btn'])[3]") WebElement btnGoBack;
	@FindBy(xpath="//div[@id='update-occupancy']/div/div[1]/a") WebElement btnUpdateYourOccupancyInfoIcon;

	public AccountDashboard_UpdateOccupancyFromNotifications_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//AccountDashboard_UpdateOccupancyFromNotifications.properties");
	}

	public void verifyViewBtnUnderNAS() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabAccountDashboard);
		Assert.assertEquals(true, btnView.isDisplayed());
	}

	public void redirectedToNotificationsTab() throws Exception {
		btnView.click();
		Thread.sleep(1000);
		elementVisible(100, txtNotifications);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabNotifications);
	}

	public void shouldDisplayAreYouSurePopup() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabNotifications);
		tabAccountDashboard.click();
		elementVisible(100, txtAreYouSure);
		Thread.sleep(500);
		Assert.assertEquals(true, txtAreYouSureTeaser.getText().contains(c.getData("areYouSureTeaser")));
		Assert.assertEquals(true, btnContinue.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
	}

	public void redirectedToAccountDashboardTab() throws Exception {
		btnContinue.click();
		elementVisible(100, btnView);
		Thread.sleep(500);
	}

	public void navigateToNotificationsTab() throws Exception {
		btnGoBack.click();
		elementVisible(100, tabNotifications);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnUpdateYourOccupancyInfoIcon);
	}

	public void navigateToNotificationTab() throws Exception {
		btnGoBack.click();
		elementVisible(100, tabNotifications);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabNotifications);
	}

}
