package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class NetCallChange_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='withDDwithPlan']/h2") WebElement txtNextPaymentAmount;
	@FindBy(xpath="//div[@class='title-tooltip account-balance']/h6") WebElement txtAccountBalance1;
	@FindBy(xpath="//div[@class='payment-func main-content']/div[8]/div/h6") WebElement txtChangeMyMonthlyPaymentAmount;
	@FindBy(xpath="//div[@class='payment-func main-content']/div[8]/div/div/p") WebElement txtChangeMyMonthlyPaymentAmountTeaser;
	@FindBy(xpath="//div[@class='payment-func main-content']/div[8]/div/button") WebElement btnChangeMyMonthlyPaymentAmount;
	@FindBy(xpath="(//div[@class='fragment_presenter_template_show'])[4]") WebElement txtChangeMyPaymentAmountTeaser;
	@FindBy(xpath="(//span[@class='value-as-text'])[1]") WebElement txtAccNo;
	@FindBy(xpath="(//span[@class='value-as-text'])[3]") WebElement txtAccountBalance2;
	@FindBy(xpath="(//span[@class='value-as-text'])[5]") WebElement txtCurrentPaymentAmount;
	@FindBy(xpath="//h3[@class='h3 mb-4']") WebElement txtPayPerMonthLabel;
	@FindBy(xpath="//span[@class='ui-slider-handle ui-corner-all ui-state-default']") WebElement btnSlider;
	@FindBy(xpath="(//div[@class='fragment_presenter_template_edit']/input)[2]") WebElement txtEmailAddress;
	@FindBy(xpath="(//div[@class='fragment_presenter_template_edit']/input)[3]") WebElement txtMobileNumber;
	@FindBy(xpath="(//input[@type='submit'])[2]") WebElement btnDone;
	@FindBy(xpath="(//span[@class='value-as-text'])[2]") WebElement txtCurrentMonthlyPayment;
	@FindBy(xpath="(//span[@class='value-as-text'])[3]") WebElement txtCurrentAccountBalance;
	@FindBy(xpath="//div[@class='fragment_presenter_template_show']/h5") WebElement txtSuccessMsg;
	@FindBy(xpath="(//input[@type='submit'])[1]") WebElement btnBackToMyAccount;
	
	String paymentAmount, accBalance;
	
	public NetCallChange_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//NetCallChange.properties");
	}

	public void verifyChangeMyMonthlyPaymentAmountSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNextPaymentAmount);
		paymentAmount=txtNextPaymentAmount.getText();
		String[] bal = txtAccountBalance1.getText().split(" ");
		accBalance=bal[0];
		System.out.println(paymentAmount);
		System.out.println(accBalance);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeMyMonthlyPaymentAmount);
		Assert.assertEquals(true, txtChangeMyMonthlyPaymentAmountTeaser.getText().contains(c.getData("changeMyMonthlyPaymentAmountTeaser")));
		Assert.assertEquals(true, btnChangeMyMonthlyPaymentAmount.isDisplayed());
		Thread.sleep(1000);
	}

	public void navigateToNetcallPage(String accNo) throws Exception {
		btnChangeMyMonthlyPaymentAmount.click();
		elementVisible(200, txtChangeMyPaymentAmountTeaser);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtChangeMyPaymentAmountTeaser);
		Assert.assertEquals(true, txtAccNo.getText().contains(accNo));
		Assert.assertEquals(true, txtAccountBalance2.getText().contains(accBalance));
		Assert.assertEquals(true, txtCurrentPaymentAmount.getText().contains(paymentAmount));
	}

	public void userChangesPaymentAmountViaSlider(String email) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayPerMonthLabel);
		Actions a=new Actions(driver);
		a.dragAndDropBy(btnSlider, 20, 0).perform();
		Assert.assertEquals(true, txtEmailAddress.getAttribute("value").contains(email));
		txtMobileNumber.sendKeys("09876543210");
		Assert.assertEquals(true, btnDone.isDisplayed());
	}

	public void navigateToConfirmationScreen() throws Exception {
		btnDone.click();
		elementVisible(200, txtCurrentMonthlyPayment);
		Thread.sleep(3000);
		Assert.assertEquals(true, txtCurrentMonthlyPayment.getText().contains(paymentAmount));
		Assert.assertEquals(true, txtCurrentAccountBalance.getText().contains(accBalance));
		Assert.assertEquals(true, txtSuccessMsg.getText().contains(c.getData("successMsg")));
		Assert.assertEquals(true, btnBackToMyAccount.isDisplayed());
	}
	
	

}
