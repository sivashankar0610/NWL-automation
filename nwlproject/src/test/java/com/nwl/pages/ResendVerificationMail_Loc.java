package com.nwl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class ResendVerificationMail_Loc extends BasePage{

	@FindBy(xpath = "//a[@class=\"nb-btn-link resendEmail\"]") WebElement linkResendMail;
	@FindBy(xpath = "(//div[@class=\"alert__content\"])[3]/p") WebElement txtSuccessResendMail;
	@FindBy(xpath = "//a[@class=\"nb-btn nb-btn__cta nb-btn-inline\"]") WebElement btnOK;
	
	public ResendVerificationMail_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Registration_UnmeasuredAccountViaHomePage.properties");
	}
	
	public void clicksResendMail() throws Exception {
		elementVisible(100, linkResendMail);
		linkResendMail.click();
		Thread.sleep(2000);
	}
	
	public void displaySuccessScreen() throws Exception {
		elementVisible(100, btnOK);
		Assert.assertEquals(true, txtSuccessResendMail.getText().contains(c.getData("successResendMail")));
	}
}
