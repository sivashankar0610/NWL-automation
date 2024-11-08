package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class BudgetEstimator_Loc extends BasePage {
	
	@FindBy(xpath="//nav[@id='loginedMenu']/ul/li[1]") WebElement linkServices;
	@FindBy(xpath="(//ul[@class='nav-sub__list'])[3]/li[6]") WebElement linkBuildingAndDeveloping;
	@FindBy(xpath="//div[@class='breadcrumb__block']/div/h1") WebElement txtBuildingAndDeveloping;
	@FindBy(xpath="(//div[@class='promo-content'])[1]/h5/a") WebElement linkWaterConnectionBudgetEstimator;
	@FindBy(xpath="//div[@class='account-page budget-estimator-container']/div/div/h4") WebElement txtWaterConnectionBudgetEstimator;
	@FindBy(xpath="//div[@class='water-estimator']/p[1]") WebElement txtWaterConnectionBudgetEstimatorTeaser1;
	@FindBy(xpath="//div[@class='water-estimator']/p[2]") WebElement txtWaterConnectionBudgetEstimatorTeaser2;
	@FindBy(xpath="//div[@class='water-estimator']/p[2]/span[1]/a") WebElement linkMakeAnOnlineApplication;
	@FindBy(xpath="//div[@class='water-estimator']/p[3]") WebElement txtWaterConnectionBudgetEstimatorTeaser3;
	@FindBy(xpath="//button[@class='nb-btn btnCalculateBudgetEstimation']") WebElement btnCalculate;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-outline back']") WebElement btnGoBack;
	@FindBy(xpath="(//div[@class='slds-grid slds-wrap'])[1]/div[2]/div/span/strong") WebElement txtDeveloperServicesPortal;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnFinalPremiseInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtFinalPremiseInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnFinalPremiseInfoIconClose;
	@FindBy(xpath="//input[@name='property-type']") List<WebElement> txtPropertyName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[2]") WebElement btnPropertiesConnectInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[2]") WebElement txtPropertiesConnectInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[2]") WebElement btnPropertiesConnectInfoIconClose;
	@FindBy(id="inputpropertycount") WebElement txtPropertiesConnect;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnWaterSupplyInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtWaterSupplyInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnWaterSupplyInfoIconClose;
	@FindBy(xpath="//div[@class='form-select selected']") WebElement dropdownWaterSupply;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> dropdownWaterSupplyOptions;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnDistanceFromConnectInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtDistanceFromConnectInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnDistanceFromConnectInfoIconClose;
	@FindBy(id="inputpropertydistance") WebElement txtDistanceFromConnect;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnMainSurfaceTypeInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtMainSurfaceTypeInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnMainSurfaceTypeInfoIconClose;
	@FindBy(xpath="//input[@name='surface-type']") List<WebElement> txtMainSurfaceType;
	@FindBy(xpath="//div[@class='budget-estimator-block']/div[1]") WebElement txtYourBudgetEstimationSummary;
	@FindBy(xpath="//div[@class='budget-cost water-connection']/p") WebElement txtWaterConnectionCharges;
	@FindBy(xpath="//div[@class='budget-cost application-admin']/p") WebElement txtApplicationAndAdminCharges;
	@FindBy(xpath="//div[@class='budget-cost temporary-building-supply']/p") WebElement txtTemporaryBuildingSupplyCharges;
	@FindBy(xpath="//div[@class='budget-cost water-infrastructure']/p") WebElement txtWaterInfrastructureCharges;
	@FindBy(xpath="//div[@class='budget-total-cost']/p") WebElement txtTotal;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-outline reset']") WebElement btnReset;
	@FindBy(xpath="//a[@class='nb-btn-link']") WebElement linkMoreInformationOnBudgetEstimation;
	@FindBy(xpath="//div[@class='disclaimer-title']/p") WebElement txtEstimateDisclaimer;
	@FindBy(xpath="//div[@class='disclaimer-description']/p/strong[2]") WebElement txtEstimateDisclaimerTeaser;
	@FindBy(xpath="//div[@class='post-disclaimer']/p[1]/span") WebElement txtPostDisclaimerTeaser1;
	@FindBy(xpath="//div[@class='post-disclaimer']/p[2]") WebElement txtPostDisclaimerTeaser2;
	@FindBy(xpath="//div[@class='post-disclaimer']/p[3]") WebElement txtPostDisclaimerTeaser3;
	@FindBy(xpath="//div[@class='post-disclaimer']/p[4]") WebElement txtPostDisclaimerTeaser4;
	@FindBy(xpath="//div[@class='estimate-disclaimer-app-btn']/a") WebElement btnMakeYourApplicationOnline;
	
	public BudgetEstimator_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//BudgetEstimator.properties");
	}
	
	public void navigateToBuildingAndDevelopingPage() throws Exception {
		elementVisible(100, linkServices);
		Thread.sleep(2000);
		linkServices.click();
		elementVisible(100, linkBuildingAndDeveloping);
		linkBuildingAndDeveloping.click();
		elementVisible(100, txtBuildingAndDeveloping);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkWaterConnectionBudgetEstimator);
	}

	public void navigateToWaterConnectionBudgetEstimatorPage() throws Exception {
		linkWaterConnectionBudgetEstimator.click();
		elementVisible(100, txtWaterConnectionBudgetEstimator);
		Assert.assertEquals(true, txtWaterConnectionBudgetEstimatorTeaser1.getText().contains(c.getData("waterConnectionBudgetEstimatorTeaser1")));
		Assert.assertEquals(true, txtWaterConnectionBudgetEstimatorTeaser2.getText().contains(c.getData("waterConnectionBudgetEstimatorTeaser2")));
		Assert.assertEquals(true, linkMakeAnOnlineApplication.isDisplayed());
		Assert.assertEquals(true, txtWaterConnectionBudgetEstimatorTeaser3.getText().contains(c.getData("waterConnectionBudgetEstimatorTeaser3")));
		Thread.sleep(500);
		Assert.assertEquals(true, btnCalculate.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterConnectionBudgetEstimator);
	}

	public void clicksOnGoBackButton() throws Exception {
		btnGoBack.click();
		elementVisible(100, linkWaterConnectionBudgetEstimator);
		Thread.sleep(500);
	}

	public void redirectedToDeveloperServicesPortalPage() throws Exception {
		linkMakeAnOnlineApplication.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtDeveloperServicesPortal);
		Thread.sleep(500);
	}

	public void selectsPropertyType(String propertyType) throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, txtWaterConnectionBudgetEstimator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterConnectionBudgetEstimator);
		btnFinalPremiseInfoIcon.click();
		elementVisible(100, txtFinalPremiseInfoIcon);
		Assert.assertEquals(true, txtFinalPremiseInfoIcon.getText().contains(c.getData("finalPremiseInformationText")));
		Thread.sleep(500);
		btnFinalPremiseInfoIconClose.click();
		Thread.sleep(500);
		for (WebElement propertyName : txtPropertyName) {
            if (propertyName.getAttribute("title").equalsIgnoreCase(propertyType)) {
				propertyName.findElement(By.xpath("following-sibling::span[1]")).click();
		        break;
            }
		}
	}

	public void howManyPropertiesToConnect(String propertiesCount) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnPropertiesConnectInfoIcon);
		btnPropertiesConnectInfoIcon.click();
		elementVisible(100, txtPropertiesConnectInfoIcon);
		Assert.assertEquals(true, txtPropertiesConnectInfoIcon.getText().contains(c.getData("propertiesConnectInformationText")));
		Thread.sleep(500);
		btnPropertiesConnectInfoIconClose.click();
		Thread.sleep(500);
		txtPropertiesConnect.clear();
		Thread.sleep(500);
		txtPropertiesConnect.sendKeys(propertiesCount);
	}

	public void selectsSupplyOfWater(String waterSupplyOption) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnWaterSupplyInfoIcon);
		btnWaterSupplyInfoIcon.click();
		elementVisible(100, txtWaterSupplyInfoIcon);
		Assert.assertEquals(true, txtWaterSupplyInfoIcon.getText().contains(c.getData("waterSupplyInformationText")));
		Thread.sleep(500);
		btnWaterSupplyInfoIconClose.click();
		Thread.sleep(500);
		dropdownWaterSupply.click();
		Thread.sleep(1500);
		dropdownWaterSupplyOptions.get(Integer.parseInt(waterSupplyOption)).click();
		Thread.sleep(500);
	}

	public void distanceFromConnect(String distance) throws Exception {
		btnDistanceFromConnectInfoIcon.click();
		elementVisible(100, txtDistanceFromConnectInfoIcon);
		Assert.assertEquals(true, txtDistanceFromConnectInfoIcon.getText().contains(c.getData("distanceFromConnectInformationText")));
		Thread.sleep(500);
		btnDistanceFromConnectInfoIconClose.click();
		Thread.sleep(500);
		txtDistanceFromConnect.clear();
		Thread.sleep(500);
		txtDistanceFromConnect.sendKeys(distance);
	}

	public void selectsMainSurfaceType(String surfaceType) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnDistanceFromConnectInfoIcon);
		btnMainSurfaceTypeInfoIcon.click();
		elementVisible(100, txtMainSurfaceTypeInfoIcon);
		Assert.assertEquals(true, txtMainSurfaceTypeInfoIcon.getText().contains(c.getData("mainSurfaceTypeInformationText")));
		Thread.sleep(500);
		btnMainSurfaceTypeInfoIconClose.click();
		Thread.sleep(500);
		for (WebElement mainSurfaceType : txtMainSurfaceType) {
            if (mainSurfaceType.getAttribute("title").contains(surfaceType)) {
            	mainSurfaceType.findElement(By.xpath("following-sibling::span[1]")).click();
		        break;
            }
		}
	}

	public void clicksOnCalculateButton() throws Exception {
		btnCalculate.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBudgetEstimationSummary);
		double wcc = Double.parseDouble(txtWaterConnectionCharges.getText());
		double aaac = Double.parseDouble(txtApplicationAndAdminCharges.getText());
		double tbsc = Double.parseDouble(txtTemporaryBuildingSupplyCharges.getText());
		double wic = Double.parseDouble(txtWaterInfrastructureCharges.getText());
		Assert.assertEquals(wcc+aaac+tbsc+wic, Double.parseDouble(txtTotal.getText()));
		Assert.assertEquals(true, btnReset.isDisplayed());
		Assert.assertEquals(true, linkMoreInformationOnBudgetEstimation.isDisplayed());
	}

	public void verifiesPreAndPostDisclaimerSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEstimateDisclaimer);
		Assert.assertEquals(true, txtEstimateDisclaimerTeaser.getText().contains(c.getData("estimateDisclaimerTeaser")));
		Assert.assertEquals(true, txtPostDisclaimerTeaser1.getText().contains(c.getData("postDisclaimerTeaser1")));
		Assert.assertEquals(true, txtPostDisclaimerTeaser2.getText().contains(c.getData("postDisclaimerTeaser2")));
		Assert.assertEquals(true, txtPostDisclaimerTeaser3.getText().contains(c.getData("postDisclaimerTeaser3")));
		Assert.assertEquals(true, txtPostDisclaimerTeaser4.getText().contains(c.getData("postDisclaimerTeaser4")));
		Assert.assertEquals(true, btnMakeYourApplicationOnline.isDisplayed());
	}

	public void navigateToDeveloperServicesPortalPage() throws Exception {
		btnMakeYourApplicationOnline.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		elementVisible(100, txtDeveloperServicesPortal);
		Thread.sleep(500);
	}

}
