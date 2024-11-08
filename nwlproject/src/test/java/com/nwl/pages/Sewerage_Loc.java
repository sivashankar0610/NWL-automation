package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Sewerage_Loc extends BasePage {
	
	@FindBy(id="idsewerege") WebElement btnSewerage;
	@FindBy(xpath="//div[@data-id='idsewerege']/div[2]/div/div[1]") WebElement txtSewerageTeaser;
	@FindBy(xpath="//div[@data-id='idsewerege']/div[2]/div/div[2]") WebElement txtCallOurTeamLabel;
	@FindBy(xpath="//div[@data-id='idsewerege']/div[2]/div/div[3]/a") WebElement btnArrowPhoneNo;
	@FindBy(xpath="//div[@data-id='idsewerege']/div[2]/div/div[3]/a/span[1]") WebElement txtPhoneNo;
	
	public Sewerage_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Sewerage.properties");
	}
	
	public void clicksOnSewerageButton() throws Exception {
		elementVisible(100, btnSewerage);
		btnSewerage.click();
		elementVisible(100, txtSewerageTeaser);
		Thread.sleep(1500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSewerage);
		Assert.assertEquals(true, txtSewerageTeaser.getText().contains(c.getData("sewerageTeaser")));
		Assert.assertEquals(true, txtCallOurTeamLabel.getText().contains(c.getData("callOurTeamLabel")));
		Assert.assertEquals(true, btnArrowPhoneNo.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.getText().contains(c.getData("phoneNumber")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSewerage);
	}
	
	

}
