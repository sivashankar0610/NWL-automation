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

public class CancelledBill_Loc extends BasePage {
	
	@FindBy(xpath = "(//div[@class='accordion__item'])[2]/h5/a[text()='Your bills and payment history']") WebElement txtYourBillsAndPaymentHistory;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block center-container mt-0 btn-show-more-bills']") WebElement btnShowMore;
	@FindBy(xpath="//ul[@class='slideInUp']/li[4]") List<WebElement> txtCancelledWithDates;
	
	public CancelledBill_Loc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicksOnShowMoreButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBillsAndPaymentHistory);
		Assert.assertEquals(true, btnShowMore.isDisplayed());
		btnShowMore.click();
		Thread.sleep(1500);
	}

	public void verifiesCancelledBillTextWithDate() {
		for (WebElement txtCancelledWithDate : txtCancelledWithDates) {
			String txtWSB_BillCancelled=null;
			if (txtCancelledWithDate.getText().contains("Cancelled")) {
				Assert.assertEquals(true, txtCancelledWithDate.isDisplayed());
				txtWSB_BillCancelled = txtCancelledWithDate.findElement(By.xpath("preceding-sibling::li[2]")).getText();
				Assert.assertEquals(true, txtWSB_BillCancelled.equalsIgnoreCase("Water services bill (Bill cancelled)"));
				System.out.println(txtCancelledWithDate.getText());
				break;
			}
		}
		
	}

}
