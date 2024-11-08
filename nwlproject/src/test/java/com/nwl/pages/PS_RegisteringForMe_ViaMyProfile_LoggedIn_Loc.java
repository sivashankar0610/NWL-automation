package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class PS_RegisteringForMe_ViaMyProfile_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='small-title pb-20']") WebElement txtPriorityServices_MP;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[45]") WebElement btnPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[43]") WebElement txtPriorityServices_MPInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[45]") WebElement btnPriorityServices_MPInfoIconClose;
	@FindBy(xpath="(//div[@class='pb-20'])[3]") WebElement txtPriorityServices_MPTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block register-psr-back']") WebElement btnRegForPriorityServices1;
	@FindBy(xpath="//h2[@class='pb-40']") WebElement txtPriorityServices;
	@FindBy(xpath="//div[@class='single-block-main-container text-center']/div/div/div[1]/p") WebElement txtPriorityServicesTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn__arrow animation animated fadeInLeft']") WebElement btnRegForPriorityServices2;
	
	
	public PS_RegisteringForMe_ViaMyProfile_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//PS_RegisteringForMe_ViaMyProfile_LoggedIn.properties");
	}

	public void verifyPriorityServicesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPriorityServices_MP);
		btnPriorityServices_MPInfoIcon.click();
		elementVisible(100, txtPriorityServices_MPInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtPriorityServices_MPInfoIcon.getText().contains(c.getData("priorityServices_MPInformationText")));
		btnPriorityServices_MPInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPriorityServices_MPTeaser.getText().contains(c.getData("priorityServices_MPTeaser")));
		Assert.assertEquals(true, btnRegForPriorityServices1.isDisplayed());		
	}
	
	public void navigateToPriorityServicesPage() throws Exception {
		btnRegForPriorityServices1.click();
		elementVisible(100, txtPriorityServices);
		Assert.assertEquals(true, txtPriorityServicesTeaser.getText().contains(c.getData("priorityServicesTeaser")));
		Assert.assertEquals(true, btnRegForPriorityServices2.isDisplayed());
	}

}
