package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;

public class ViewBills_Loc extends BasePage {

	@FindBy(xpath = "(//div[@class='accordion__item'])[2]/h5/a[text()='Your bills and payment history']") WebElement txtYourBillsAndPaymentHistory;
	@FindBy(xpath = "(//a[text()='View bill '])[2]") WebElement btnViewBill;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block nb-btn-bills']") WebElement btnYourBills;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block nb-btn-payments nb-btn-outline']") WebElement btnYourPayments;
	@FindBy(xpath = "//embed[@type='application/pdf']") WebElement billPdf;
	@FindBy(tagName = "body") WebElement txtPdfbody;

	public ViewBills_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public void userVerifiesYourBillsAndPaymentHistorySection() {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBillsAndPaymentHistory);
		Assert.assertEquals(true, btnYourBills.isEnabled());
		Assert.assertEquals(true, btnYourPayments.isEnabled());
		elementVisible(100, btnViewBill);
	}

    public void userShouldbeRedirectedToBillPage() throws Exception {
		btnViewBill.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
		Thread.sleep(10000);
		if(txtPdfbody.getText().equalsIgnoreCase("File not found")){
    	}
        else {	
        	elementVisible(100, billPdf);
	    }
	}
	
}
