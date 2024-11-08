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

import io.cucumber.datatable.DataTable;

public class Payment_DoNotHaveOnlineAccount_Loc extends BasePage{

	@FindBy(xpath = "(//a[@class='nb-btn nb-btn__arrow animation animated fadeInLeft'])[2]") WebElement btnPayment;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block nb-btn-outline btn-idont-account\"]") WebElement btnNoOnlineAccount;
	@FindBy(xpath = "//input[@class=\"form-control firstname\"]") WebElement txtFirstName;
	@FindBy(xpath = "//input[@class=\"form-control surname\"]") WebElement txtSurName;
	@FindBy(xpath = "//input[@class=\"form-control email\"]") WebElement txtEmail;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block btn-next\"]") WebElement btnNext1;
	@FindBy(id = "data8-address-Verifybilling") WebElement txtAddress;
	@FindBy(xpath = "//span[@tabindex='-1']") WebElement btnAddress;
	@FindBy(xpath = "//input[@class=\"form-control day\"]") WebElement txtDay;
	@FindBy(xpath = "//input[@class=\"form-control month\"]") WebElement txtMonth;
	@FindBy(xpath = "//input[@class=\"form-control year\"]") WebElement txtYear;
	@FindBy(xpath = "//input[@class=\"form-control nwlnumber\"]") WebElement txtAccountID;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block btn-next-verify\"]") WebElement btnNext2;
	@FindBy(xpath = "(//span[@class=\"radio\"])[2]") WebElement btnOtherAmount;
	@FindBy(xpath = "//input[@class=\"other-amount\"]") WebElement txtOtherAmount;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn-block btn-next select-amount-next-btn\"]") WebElement btnCardPayment;
	@FindBy(xpath="//div[@class='account-teaser no-margin']/h4") WebElement txtPopYourDetailsIn;
	@FindBy(xpath="//div[@class='account-teaser no-margin']/div") WebElement txtPlsGiveUsYourCardDetails;
	@FindBy(xpath="//strong[@class='customer-ref-number']") WebElement txtAccountNo;
	@FindBy(xpath="//span[@class='amount-to-pay']") WebElement txtAmountToPay;
	@FindBy(xpath="//h1[@class='rxp-title']/span") WebElement txtPaymentDetails;
	@FindBy(id = "iframeId") WebElement iFramePayment;
	@FindBy(id = "pas_ccnum") WebElement txtCardNumber;
	@FindBy(id = "pas_expiry") WebElement txtExpiry;
	@FindBy(id = "pas_cccvc") WebElement txtSecurityCode;
	@FindBy(id = "pas_ccname") WebElement txtCardHolderName;
	@FindBy(id = "rxp-primary-btn") WebElement btnPayNow;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/h5") WebElement txtThanksForYourPayment;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[2]/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[5]/h6") WebElement txtSetupDirectDebit;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[5]/div/p") WebElement txtSetupDirectDebitTeaser;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[5]/a") WebElement btnSetUpDirectDebit;
	@FindBy(xpath = "//a[@class='nb-btn nb-btn-block nb-btn-outline nb-btn-white btn-go-to-home']") WebElement btnBackToHomepage;
	@FindBy(id="CI_CONTEXTACCOUNT_subMenuItem0x6") WebElement btnCCBGoToAccountFinancialHistory;
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="(//td[@class='oraNormal oraTableData'])[1]/img") WebElement btnCCBAccountMenu;
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	@FindBy(id="ACCT_FT_HIST:0$CUR_AMT") WebElement txtCCBCurrentAmount;
	@FindBy(id="ACCT_FT_HIST:0$TOT_BAL") WebElement txtCCBPayOffBalance1;
	@FindBy(id = "tabPage") WebElement frame1;
	@FindBy(id = "srch_frame") WebElement frame2;
	@FindBy(xpath = "//iframe[@title='zoneMapFrame_1']") WebElement frame3;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnSearch;
	@FindBy(id = "dataframe") WebElement frameSearchResults;
	@FindBy(id = "SEARCH_RESULTS|0") WebElement linkSearchResult;
	@FindBy(id = "zoneMapFrame_2") WebElement frame4;
	@FindBy(id = "personId") WebElement txtName;
	@FindBy(xpath = "//td[@orafield='output/premise']") WebElement txtCCBAddress;
	@FindBy(id = "birthDate") WebElement txtBirthDate;

	String amount=null;
	String AccountID,firstName,lastName,email,address;
	String day,month,year;
			
	public Payment_DoNotHaveOnlineAccount_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Payment_DoNotHaveOnlineAccount.properties");
	}

	public void userClickMakeAPaymentButton() throws Exception {
		elementVisible(100, btnPayment);
		btnPayment.click();
		elementVisible(100, btnNoOnlineAccount);
		Thread.sleep(1000);
	}

	public void userClicksIDontHaveOnlineAccount() {
		btnNoOnlineAccount.click();
		elementVisible(100, txtEmail);
	}
	
	public void getCCBdetails(String AccID,String CCBEmail, String CCBPw) throws Exception {	
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(CCBEmail);
		btnCCBPwd.sendKeys(CCBPw);
		btnCCBLogin.click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame2);
		txtCCBAccountID.sendKeys(AccID);
		AccountID = AccID;
		btnSearch.click();
		Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
        if (driver.findElement(By.xpath("//td[@class='activeTab']")).getText().contains("Main")) {
            driver.switchTo().defaultContent();
            driver.switchTo().frame(0);
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
            elementVisible(100, btnCCBAccountName);
            btnCCBAccountName.click();
            Thread.sleep(2000);
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame3);
		Thread.sleep(2000);
		String name = txtName.getText();
		String[] splitName = name.split(" ");
		firstName = splitName[1];
		String last = splitName[0];
		lastName = last.substring(0,last.length()-1); 
		
		String bDay = txtBirthDate.getText();
		String[] splitBirthDay = bDay.split("-");
		day = splitBirthDay[0];
		month = splitBirthDay[1];
		year = splitBirthDay[2];
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(frame1); 
		driver.switchTo().frame(frame4);
		String add=txtCCBAddress.getText();
		String[] splitAddress = add.split(" ");
		System.out.println(add);
		int n = splitAddress.length;
		String houseNo = splitAddress[0];
		String post1 = splitAddress[n-2];
		String post2 = splitAddress[n-1];
		String postCode = post1 + " " + post2;
		address = houseNo + ", " + postCode;		
	}

	public void userDetails(String email) throws Exception {
		handleMultipleTabs(0);
		elementVisible(100, txtEmail);
		txtFirstName.sendKeys(firstName);
		txtSurName.sendKeys(lastName);
		txtEmail.sendKeys(email);
		Thread.sleep(5000);
	}
	
	public void redirectedToQuickSecurityQuestionsPage() throws Exception {
		btnNext1.click();
		elementVisible(100, txtAddress);
	}

	public void userPersonalDetails() throws Exception {
		txtAddress.sendKeys(address);
		Thread.sleep(2000);
		btnAddress.click();
		elementVisible(100, txtAccountID);
		txtDay.sendKeys(day);
		txtMonth.sendKeys(month);
		txtYear.sendKeys(year);
		txtAccountID.sendKeys(AccountID);
	}
	
	public void redirectedToPayYourBillPage() throws Exception {
		btnNext2.click();
		elementVisible(100, btnOtherAmount);
	}

	public void amountToBePaid(String amt) {
		btnOtherAmount.click();
		amount = amt;
		txtOtherAmount.sendKeys(amount);
	}
	
	public void redirectedToPopYourDetailsPage() throws Exception {
		elementVisible(100, btnCardPayment);
		btnCardPayment.click();
		elementVisible(100, txtPopYourDetailsIn);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPopYourDetailsIn);
		Assert.assertEquals(true, txtPlsGiveUsYourCardDetails.getText().contains(c.getData("payByCardTeaser")));
		Assert.assertEquals(true, txtAccountNo.getText().contains(AccountID));
		Assert.assertEquals(true, txtAmountToPay.getText().contains(amount));
		Thread.sleep(1000);
	}

	public void userEntersCardDetails(DataTable table) throws Exception {
		driver.switchTo().frame(iFramePayment);
		List<List<String>> data3 = table.cells();
		elementVisible(100, btnPayNow);
		Thread.sleep(1000);
		txtCardNumber.sendKeys(data3.get(1).get(1));
		txtExpiry.sendKeys(data3.get(2).get(1));
		txtSecurityCode.sendKeys(data3.get(3).get(1));
		txtCardHolderName.sendKeys(data3.get(4).get(1));
	}
	
	public void redirectedToConfirmationScreen() throws Exception {
		btnPayNow.click();
		driver.switchTo().defaultContent();
		elementVisible(200, txtThanksForYourPayment);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourPayment);
		String str=txtThanksForYourPayment.getText();
		String[] xyz = str.split("₤");
		String paymentAmount=xyz[1];
		//String paymentAmount = str.substring(str.length() - 4);
		Assert.assertEquals(true, paymentAmount.contains(amount));
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, txtSetupDirectDebit.getText().contains(c.getData("setupDirectDebitLabel")));
		Assert.assertEquals(true, txtSetupDirectDebitTeaser.getText().contains(c.getData("setupDirectDebitTeaser")));
		Assert.assertEquals(true, btnSetUpDirectDebit.isDisplayed());
		Assert.assertEquals(true, btnBackToHomepage.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourPayment);
	}

	public void redirectedToHomepage() throws Exception {
		btnBackToHomepage.click();
		Thread.sleep(2000);				
		elementVisible(100, btnPayment);
		Assert.assertEquals(true, btnPayment.isDisplayed());
		Thread.sleep(4000);
	}
	
	public void userOpensActivityHistorySectionInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(2);
		Thread.sleep(2000);	
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(AccountID);
		btnCCBSearch.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
        if (driver.findElement(By.xpath("//td[@class='activeTab']")).getText().contains("Main")) {
            driver.switchTo().defaultContent();
            driver.switchTo().frame(0);
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
            elementVisible(100, btnCCBAccountName);
            btnCCBAccountName.click();
            Thread.sleep(2000);
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAcivityHistory);
		btnCCBAcivityHistory.click();
		elementVisible(100, txtCCBSearchByContext);
		Thread.sleep(1000);
	}

	public void verifyAccountFinancialHistoryInCCB() throws Exception {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCCBAccountMenu);
		btnCCBAccountMenu.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBGoToAccountFinancialHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
	}

}
