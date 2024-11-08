package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Registration_AccountNumberUnknown_Loc extends BasePage{

	@FindBy(id = "NWLNo") WebElement txtAccountIDReg;
	@FindBy(id = "IDontKnowNWLAccountLink") WebElement linkIDontKnowAccountNumber;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block'])[3]") WebElement btnNextPayment;
	@FindBy(xpath = "(//div[@class='form-select'])[1]") WebElement drpPaymentSelectionBox;
	@FindBy(xpath = "(//span[@class='sel__box__options'])[8]") WebElement drpPaymentOption;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-outline nb-btn-sm nb-btn-whyaks'])[2]") WebElement btnWhyWeAsk;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-outline nb-btn-sm nb-btn-whyaks tooltip-active']") WebElement btnWhyWeAskActive;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[5]") WebElement toolTipWhyWeAsk;
	@FindBy(xpath = "(//div[@class='form-select'])[1]") WebElement drpMoveInMonth;
	@FindBy(xpath = "(//div[@class='form-select'])[1]") WebElement drpMoveInYear;
	@FindBy(xpath = "(//span[@class='sel__box__options'])[12]") WebElement drpMonthSelection;
	@FindBy(xpath = "(//span[@class='sel__box__options'])[25]") WebElement drpYearSelection;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block'])[4]") WebElement btnNextMoveIn;
	@FindBy(xpath = "(//span[@class='toggle'])[2]") WebElement btnNorthumbrianInfo;
	@FindBy(xpath = "(//span[@class='toggle'])[4]") WebElement btnKielderInfo;
	@FindBy(xpath = "(//label[@class='switch-text text-bold'])[1]") WebElement txtNWLProducts;
	@FindBy(xpath = "//label[text()='Yes, I want to receive information about products and services from Northumbrian Water']") WebElement txtNWLProducts2;
	@FindBy(xpath = "(//label[@class='switch-text text-bold'])[2]") WebElement txtNWLResearch;
	@FindBy(xpath = "//label[text()='Yes, I want to receive information about market research programmes from Northumbrian Water']") WebElement txtNWLResearch2;
	@FindBy(xpath = "(//label[@class='switch-text text-bold'])[3]") WebElement txtKWProducts;
	@FindBy(xpath = "//label[text()='                                    Yes, I want to receive information about products and services from Kielder Water & Forest Development Trust and its members*                                ']") WebElement txtKWProducts2;
	@FindBy(xpath = "//p[@class='small-text']") WebElement txtConditionsPreferences;
	@FindBy(xpath = "//label[text()='                               *You will receive information via email and you may still receive non-personalised marketing material through your letterbox.                          ]") WebElement txtConditionsPreferences2;
	
	@FindBy(xpath = "//div[@class='form-select actived']/div/div/span") List<WebElement> listMonth;
	
	String m,y;
	
	public Registration_AccountNumberUnknown_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//Registration_AccountNumberUnknown.properties");
	}
	
	public void clickOnAccountNumberUnknownLink()
	{
		elementVisible(100, linkIDontKnowAccountNumber);
		txtAccountIDReg.clear();
		linkIDontKnowAccountNumber.click();
		elementVisible(100, btnNextPayment);
	}
	
	public void billPaymentOption() throws Exception
	{
		drpPaymentSelectionBox.click();
		elementVisible(100, drpPaymentOption);
		drpPaymentOption.click();
		Thread.sleep(2000);
		Assert.assertEquals(true, btnWhyWeAsk.isDisplayed());
		btnWhyWeAsk.click();
		elementVisible(100, toolTipWhyWeAsk);
		Assert.assertEquals(true, toolTipWhyWeAsk.getText().contains(c.getData("whyWeAskToolTip")));
		Thread.sleep(2000);
		btnWhyWeAskActive.click();
		Thread.sleep(2000);
	}
	
	public void moveInDateOption() throws Exception 
	{
		btnNextPayment.click();	
		elementVisible(100, btnNextMoveIn);
		drpMoveInMonth.click();
		Thread.sleep(2000);
		m = "03";
		y = "2017";
		for (WebElement month : listMonth) {
			if(month.getText().equalsIgnoreCase(m))
			{
				month.click();
				break;
			}	
		}
		
		Thread.sleep(2000);
		drpMoveInYear.click();
		for (WebElement year : listMonth) {
			if(year.getText().equalsIgnoreCase(y))
			{
				year.click();
				break;
			}	
		}
	}
	
	public void updateMarketingPreferences() throws Exception {
		btnNextMoveIn.click();
		elementVisible(100, btnNorthumbrianInfo);
		Assert.assertEquals(txtNWLProducts.getText(),txtNWLProducts2.getText());
		Assert.assertEquals(txtNWLResearch.getText(),txtNWLResearch2.getText());
	}
}
