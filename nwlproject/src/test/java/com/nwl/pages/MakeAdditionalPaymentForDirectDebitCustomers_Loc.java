package com.nwl.pages;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class MakeAdditionalPaymentForDirectDebitCustomers_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-col payment-status']/div[1]/div/h5") WebElement txtMyBillsAndPayments;
	@FindBy(xpath="(//p[@class='payment-method-label'])[1]/b") WebElement txtPaymentMethod_DD1;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-white view-bill-payments'])[1]") WebElement btnMyBillsAndPayments;
	@FindBy(xpath="(//a[@class='nb-btn-link make-additional-payment-btn-link'])[1]") WebElement linkMakeAdditionalPayment1;
	@FindBy(xpath="//li[@rel='billspayments']") WebElement tabMyBillsAndPayments;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="(//td[@class='oraNormal oraTableData'])[1]/img") WebElement btnCCBAccountMenu;
	@FindBy(xpath="//li[@id='CI_CONTEXTACCOUNT_subMenuItem1x30']") WebElement btnCCBGoToNonBilledBudget;
	@FindBy(xpath="//li[@class='menuItem activeMenuItem']") WebElement btnCCBSearch1;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement linkCCBName;
	@FindBy(xpath="//input[@id='NB_SCHED_PAY:0$NB_SCHED_PAY_AMT']") WebElement txtCCBScheduledPayment;
	@FindBy(id="IM_nbbSAMain_acctCntxt") WebElement btnCCBAccountIDMenu;
	@FindBy(id="CI_CONTEXTACCOUNT_subMenuItem0x6") WebElement btnCCBGoToAccountFinancialHistory;
	@FindBy(id="ACCT_FT_HIST:0$TOT_BAL") WebElement txtCCBPayOffBalance1;
	@FindBy(id="ACCT_FT_HIST:0$CUR_BAL") WebElement txtCCBCurrentBalance1;
	@FindBy(xpath="//span[@id='youAreLoggedInAsSpan']") WebElement btnCCBCredentialsName;
	@FindBy(xpath="//li[@id='Logout']") WebElement btnCCBLogout;
	
	@FindBy(xpath="//p[@class='payment-method-label']/following-sibling::p[1]/b") WebElement txtPaymentMethod_DD2;
	@FindBy(xpath="//div[@class='wp-usage-box wp-next-bill text-center']/div/div") List<WebElement> paymentDetails;
	@FindBy(xpath="(//a[@class='nb-btn-link make-additional-payment-btn-link'])[2]") WebElement linkMakeAdditionalPayment2;
	@FindBy(xpath="//div[@class='title-tooltip account-balance']/h6") WebElement txtAccountBalance;
	@FindBy(xpath="//div[@rel='makePayment']/div[1]/div/div/h5") WebElement txtPayYourBill;
    @FindBy(xpath="//div[@rel='makePayment']/div[1]/div/div/p") WebElement txtPayYourBillTeaser;
    @FindBy(xpath="//div[@class='wp-need-pay wp-make-additional-payment']/div[1]/h5") WebElement txtMakeAdditionalPayment;
    @FindBy(xpath="//div[@class='additional-payment-details mt-30']/p[1]") WebElement txtMakeAdditionalPaymentTeaser1;
    @FindBy(xpath="//div[@class='additional-payment-details mt-30']/p[2]") WebElement txtMakeAdditionalPaymentTeaser2;
    @FindBy(xpath="//div[@class='additional-payment-details mt-30']/p[3]") WebElement txtMakeAdditionalPaymentTeaser3;
    @FindBy(xpath="//div[@class='additional-payment-details mt-30']/p[4]") WebElement txtMakeAdditionalPaymentTeaser4;
    @FindBy(id="additional-payment-loggedin") WebElement txtPaymentAmount;
    @FindBy(xpath="//span[@class='form-error validate-no-amount']") WebElement txtNoAmountFieldErrorMsg;
    @FindBy(xpath="//span[@class='form-error validate-minimum-amount']") WebElement txtLessThanMinPBAmountFieldErrorMsg;
    @FindBy(xpath="//span[@class='form-error validate-maximum-amount']") WebElement txtGreaterThanMaxPBAmountFieldErrorMsg;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-proceed-to-card-payment']") WebElement btnProceedToCardPayment;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-outline nb-btn-block btn-cancel-payment']") WebElement btnCancelPayment;
    @FindBy(xpath="//div[@class='account-teaser no-margin']/h4") WebElement txtPopYourDetailsIn;
	@FindBy(xpath="//div[@class='account-teaser no-margin']/div") WebElement txtPlsGiveUsYourCardDetails;
	@FindBy(xpath="//strong[@class='customer-ref-number']") WebElement txtAccountNo;
	@FindBy(xpath="//span[@class='amount-to-pay']") WebElement txtAmountToPay;
	@FindBy(xpath="//h1[@class='rxp-title']/span") WebElement txtPaymentDetails;
	@FindBy(id="pas_ccnum") WebElement txtCardNumber;
	@FindBy(id="pas_expiry") WebElement txtExpiry;
	@FindBy(id="pas_cccvc") WebElement txtSecurityCode;
	@FindBy(id="pas_ccname") WebElement txtCardholdername;
	@FindBy(xpath="//button[@id='rxp-primary-btn']") WebElement btnPayNow2;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/h5") WebElement txtThanksForYourPayment;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[3]/p[1]") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-outline nb-btn-white btn-back-to-my-account']") WebElement btnGoBackToMyAccount;
	@FindBy(xpath="//li[@class='owl-dot active']") WebElement tabAccountDashboard;
	@FindBy(xpath="//li[@class='mega__has-sub nav-account logined']") WebElement btnMyAccount;
	@FindBy(xpath="//a[@class='account-logout']") WebElement btnLogout;
	@FindBy(xpath="(//i[@class='far fa-user-alt'])[2]") WebElement linkAccount;
	
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	
	String ccbUserName, ccbPwd, accountNo, scheduledPayment_CCB, payOffBal_CCB, CurrentBal_CCB, paymentAmount=null, minPB, maxPB;

	public MakeAdditionalPaymentForDirectDebitCustomers_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MakeAdditionalPaymentForDirectDebitCustomers.properties");
	}

	public void verifyMakeAdditionalPaymentLinkUnderAD() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyBillsAndPayments);
		Thread.sleep(4000);
		Assert.assertEquals(true, txtPaymentMethod_DD1.getText().contains("Direct Debit"));
		Assert.assertEquals(true, btnMyBillsAndPayments.isDisplayed());
		Assert.assertEquals(true, linkMakeAdditionalPayment1.isDisplayed());
	}
	
	public void redirectedMyBillsAndPaymentsTab() throws Exception {
		linkMakeAdditionalPayment1.click();
		elementVisible(100, tabMyBillsAndPayments);
		Thread.sleep(2000);
	}

	public void verifyMakeAdditionalPaymentLink(String accNo, String ccbUsername, String ccbPassword) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPaymentMethod_DD2);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		ccbUserName=ccbUsername;
		btnCCBUserID.sendKeys(ccbUserName);
		ccbPwd=ccbPassword;
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		accountNo=accNo;
		txtCCBAccountID.sendKeys(accountNo);
		btnCCBSearch.click();
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Thread.sleep(2000);
		btnCCBAccountMenu.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBGoToNonBilledBudget.click();
		elementVisible(100, btnCCBSearch1);
		btnCCBSearch1.click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		if (windows.size()==3) {
			handleMultipleTabs(2);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
			linkCCBName.click();
			Thread.sleep(2000);
			handleMultipleTabs(1);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe1']")));
		scheduledPayment_CCB=txtCCBScheduledPayment.getAttribute("value");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		btnCCBAccountIDMenu.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		btnCCBGoToAccountFinancialHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
		elementVisible(100, txtCCBPayOffBalance1);
		payOffBal_CCB=txtCCBPayOffBalance1.getText();
		String accBalance_CCB=null;
		if (payOffBal_CCB.contains("‑")) {
			int position=1;
			accBalance_CCB=payOffBal_CCB.substring(0,position)+payOffBal_CCB.substring(position+1)+" in credit";
		}
		else if (!payOffBal_CCB.contains("‑")) {
			accBalance_CCB=payOffBal_CCB+" in debit";
		}
		CurrentBal_CCB = txtCCBCurrentBalance1.getText();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBCredentialsName);
		btnCCBCredentialsName.click();
		elementVisible(100, btnCCBLogout);
		btnCCBLogout.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		elementVisible(100, btnCCBUserID);
		driver.close();
		handleMultipleTabs(0);
		Thread.sleep(2000);
		Assert.assertEquals(true, txtPaymentMethod_DD2.getText().contains("Direct Debit"));
		for (WebElement a : paymentDetails) {
			if (!a.getAttribute("class").contains("hidden") && a.getAttribute("class").contains("withoutDDwithPlan withoutDDwithPlan")) {
				WebElement paymentLabel = a.findElement(By.xpath("./p"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", paymentLabel);
				if (a.getAttribute("class").contains("amountDue")) {
					System.out.println(a.findElement(By.xpath("./h2")).getText());
					Assert.assertEquals(true, a.findElement(By.xpath("./h2")).getText().contains(CurrentBal_CCB));
				}
				else if (a.getAttribute("class").contains("nextPayment")) {
					System.out.println(a.findElement(By.xpath("./h2")).getText());
					Assert.assertEquals(true, a.findElement(By.xpath("./h2")).getText().contains(scheduledPayment_CCB));
				}
			}
		}
		Assert.assertEquals(true, linkMakeAdditionalPayment2.isDisplayed());
		Assert.assertEquals(true, txtAccountBalance.getText().contains(accBalance_CCB));
	}

	public void redirectedToPayYourBillPage() throws Exception {
		linkMakeAdditionalPayment2.click();
		elementVisible(100, txtPayYourBill);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtPayYourBillTeaser.getText().contains(c.getData("payYourBillTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayYourBill);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String localStorage= (String) jsExecutor.executeScript(String.format("return window.localStorage.getItem('%s');", "accountDetailInfo"));
		String[] localStorageValues = localStorage.split(",");
		String x = null, y = null;
		for (String localStorageValue : localStorageValues) {
			if (localStorageValue.contains("MinimumPaymentAmount")) {
				x = localStorageValue;
				break;
			}
		}
		for (String localStorageValue : localStorageValues) {
			if (localStorageValue.contains("MaximumPaymentAmount")) {
				y = localStorageValue;
				break;
			}
		}
		minPB=x.substring(23);
		System.out.println(minPB);
		maxPB=y.substring(23);
		System.out.println(maxPB);
	}
	
	public void clicksOnProceedToCardPaymentButtonWithoutEnteringAmount() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMakeAdditionalPayment);
		Assert.assertEquals(true, txtMakeAdditionalPaymentTeaser1.getText().contains(c.getData("makeAdditionalPaymentTeaser1")));
		Assert.assertEquals(true, txtMakeAdditionalPaymentTeaser2.getText().contains(c.getData("makeAdditionalPaymentTeaser2")));
		Assert.assertEquals(true, txtMakeAdditionalPaymentTeaser3.getText().contains(c.getData("makeAdditionalPaymentTeaser3")));
		Assert.assertEquals(true, txtMakeAdditionalPaymentTeaser4.getText().contains(c.getData("makeAdditionalPaymentTeaser4")));
		Assert.assertEquals(true, txtPaymentAmount.isDisplayed());
		Assert.assertEquals(true, btnProceedToCardPayment.isDisplayed());
		Assert.assertEquals(true, btnCancelPayment.isDisplayed());
		btnProceedToCardPayment.click();
		elementVisible(100, txtNoAmountFieldErrorMsg);
		Assert.assertEquals(true, txtNoAmountFieldErrorMsg.getText().contains(c.getData("noAmountErrorMsg")));
		Thread.sleep(500);
	}
	
	public void entersLessThanMinimumPaymentAmount() throws Exception {
		int min = Integer.parseInt(minPB)-1;
		txtPaymentAmount.sendKeys(Integer.toString(min));
		Thread.sleep(500);
		btnProceedToCardPayment.click();
		elementVisible(100, txtLessThanMinPBAmountFieldErrorMsg);
		Assert.assertEquals(true, txtLessThanMinPBAmountFieldErrorMsg.getText().contains(c.getData("lessThanMinPAErrorMsg")));
		Thread.sleep(500);
	}
	
	public void entersGreaterThanMaximumPaymentAmount() throws Exception {
		txtPaymentAmount.clear();
		Thread.sleep(200);
		double max = Double.parseDouble(maxPB)+1.00;
		txtPaymentAmount.sendKeys(Double.toString(max));
		Thread.sleep(500);
		btnProceedToCardPayment.click();
		elementVisible(100, txtGreaterThanMaxPBAmountFieldErrorMsg);
		Assert.assertEquals(true, txtGreaterThanMaxPBAmountFieldErrorMsg.getText().contains(c.getData("greaterThanMaxPAErrorMsg")));
		Thread.sleep(500);
	}

	public void entersPaymentAmount() throws Exception {
		double amount = Double.parseDouble(maxPB)-(Double.parseDouble(maxPB)-1.00);
		paymentAmount=Double.toString(amount);
		txtPaymentAmount.clear();
		Thread.sleep(200);
		txtPaymentAmount.sendKeys(paymentAmount);
		txtMakeAdditionalPaymentTeaser1.click();
		Thread.sleep(500);
	}

	public void navigateToPopYourdetailsInPage() throws Exception {
		btnProceedToCardPayment.click();
		elementVisible(100, txtPopYourDetailsIn);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPopYourDetailsIn);
		Assert.assertEquals(true, txtPlsGiveUsYourCardDetails.getText().contains(c.getData("payByCardTeaser")));
		Assert.assertEquals(true, txtAccountNo.getText().contains(accountNo));
		Assert.assertEquals(true, txtAmountToPay.getText().contains(paymentAmount));
		Thread.sleep(1000);
	}

	public void entersCardDetails(String cardNo, String expiryMonth, String expiryYear, String securityCode) throws Exception {
		driver.switchTo().frame(driver.findElement(By.id("iframeId")));
		elementVisible(100, txtPaymentDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPaymentDetails);
		txtCardNumber.sendKeys(cardNo);
		txtExpiry.sendKeys(expiryMonth+expiryYear);
		Thread.sleep(1000);
		txtExpiry.sendKeys(expiryYear);
		txtSecurityCode.sendKeys(securityCode);
		txtCardholdername.sendKeys("Karthi");
		Assert.assertEquals(true, btnPayNow2.isDisplayed());
	}

	public void navigateToConfirmationPage() throws Exception {
		btnPayNow2.click();
		driver.switchTo().defaultContent();
		elementVisible(200, txtThanksForYourPayment);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourPayment);
		String str=txtThanksForYourPayment.getText();
		String amount = str.substring(str.length() - 4);
		Assert.assertEquals(true, amount.contains(paymentAmount));
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnGoBackToMyAccount.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtThanksForYourPayment);
	}

	public void userRedirectedToAccountDashboard() throws Exception {
		btnGoBackToMyAccount.click();
		elementVisible(100, tabAccountDashboard);
		Thread.sleep(1000);
	}

	public void userClicksOnLogoutButton() throws Exception {
		elementVisible(100, btnMyAccount);
		btnMyAccount.click();
		elementVisible(100, btnLogout);
		btnLogout.click();
		Thread.sleep(3000);
		elementVisible(100, linkAccount);
		Thread.sleep(1000);
	}

	public void userOpenActivityHistorySectionInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUserName);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(accountNo);
		btnCCBSearch.click();
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
		String payOffBalance=null, CurrentBalance=null;
		if (CurrentBal_CCB.contains("‑")) {
			double abc = Double.parseDouble(CurrentBal_CCB.substring(2))+Double.parseDouble(paymentAmount);
			CurrentBalance="£‑"+String.valueOf(abc);
		}
		else if (!CurrentBal_CCB.contains("‑")) {
			double abc = Double.parseDouble(CurrentBal_CCB.substring(1))-Double.parseDouble(paymentAmount);
			CurrentBalance="£"+abc;
		}
			
		if (payOffBal_CCB.contains("‑")) {
			double xyz = Double.parseDouble(payOffBal_CCB.substring(2))+Double.parseDouble(paymentAmount);
			payOffBalance="£‑"+String.valueOf(xyz);
		}
		else if (!payOffBal_CCB.contains("‑")) {
			double xyz = Double.parseDouble(payOffBal_CCB.substring(1))-Double.parseDouble(paymentAmount);
			payOffBalance="£"+xyz;
		}
		Assert.assertEquals(true, txtCCBCurrentBalance1.getText().contains(CurrentBalance));
		Assert.assertEquals(true, txtCCBPayOffBalance1.getText().contains(payOffBalance));
	}
	
}
