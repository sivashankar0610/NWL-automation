package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class DrainsAndCovers_Loc extends BasePage {
	
	@FindBy(id="idcover") WebElement btnDrainsAndCovers;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[1]/div/p") WebElement txtDrainsAndCoversLabel;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[2]/p") WebElement txtDrainsAndCoversTeaser;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[3]/div[1]/p[1]") WebElement txtHighwayGullyIssuesLabel;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[3]/div[1]/p[2]") WebElement txtHighwayGullyIssuesTeaser;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[3]/div[2]/a") WebElement btnCountyCouncilContacts;
	@FindBy(xpath="//div[@class='breadcrumb-base']/following-sibling::h1") WebElement txtCountyCouncilContacts;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[4]/div[1]/p[1]") WebElement txtOtherDrainCoverIssuesLabel;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[4]/div[1]/p[2]") WebElement txtOtherDrainCoverIssuesTeaser;
	@FindBy(xpath="//div[@data-id='idcover']/div[2]/div/div[4]/div[2]/a") WebElement btnTellUsAboutDrainOrCoverIssue;
	@FindBy(xpath="//div[@class='breadcrumb-base']/following-sibling::h1") WebElement txtBrokenPipesDrainsAndCovers;

	public DrainsAndCovers_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//DrainsAndCovers.properties");
	}

	public void clicksOnDrainsAndCoversButton() throws Exception {
		elementVisible(100, btnDrainsAndCovers);
		btnDrainsAndCovers.click();
		elementVisible(100, txtDrainsAndCoversLabel);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnDrainsAndCovers);
		Assert.assertEquals(true, txtDrainsAndCoversLabel.getText().contains(c.getData("drainsAndCoversLabel")));
	    String[] teaser_DAC = txtDrainsAndCoversTeaser.getText().split("\n");
	    Assert.assertEquals(true, teaser_DAC[0].contains(c.getData("drainsAndCoversTeaser1")));
	    Assert.assertEquals(true, teaser_DAC[2].contains(c.getData("drainsAndCoversTeaser2")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnDrainsAndCovers);
	}

	public void verifiesHighwayGullyIssuesSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHighwayGullyIssuesLabel);
		Assert.assertEquals(true, txtHighwayGullyIssuesLabel.getText().contains(c.getData("highwayGullyIssuesLabel")));
		Assert.assertEquals(true, txtHighwayGullyIssuesTeaser.getText().contains(c.getData("highwayGullyIssuesTeaser")));
		Assert.assertEquals(true, btnCountyCouncilContacts.isDisplayed());
	}

	public void redirectedToCountyCouncilContactsPage() throws Exception {
		btnCountyCouncilContacts.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtCountyCouncilContacts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCountyCouncilContacts);
	}

	public void verifiesOtherDrainCoverIssuesSection() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnCountyCouncilContacts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtOtherDrainCoverIssuesLabel);
		Assert.assertEquals(true, txtOtherDrainCoverIssuesLabel.getText().contains(c.getData("otherDrainCoverIssuesLabel")));
		Assert.assertEquals(true, txtOtherDrainCoverIssuesTeaser.getText().contains(c.getData("otherDrainCoverIssuesTeaser")));
		Assert.assertEquals(true, btnTellUsAboutDrainOrCoverIssue.isDisplayed());
		
	}

	public void redirectedToBrokenPipesDrainsAndCoversPage() throws Exception {
		btnTellUsAboutDrainOrCoverIssue.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtBrokenPipesDrainsAndCovers);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtBrokenPipesDrainsAndCovers);
	}

}
