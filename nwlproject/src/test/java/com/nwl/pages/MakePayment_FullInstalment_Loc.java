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

public class MakePayment_FullInstalment_Loc extends BasePage {
	
	@FindBy(xpath="(//a[@class='nb-btn nb-btn__arrow animation animated fadeInLeft'])[2]") WebElement btnMakeAPayment;
	@FindBy(xpath="//div[@class='account-teaser no-teaser']/h4") WebElement txtPayABill;
	@FindBy(xpath="//div[@class='no-padding']") WebElement txtPayABillTeaser;
	@FindBy(xpath="(//input[@class='form-control email'])[1]") WebElement txtEmail;
	@FindBy(xpath="//input[@class='form-control loginpassword']") WebElement txtPassword;
	@FindBy(xpath="(//a[@class='form-show'])[1]") WebElement linkShowPassword;
	@FindBy(id="recaptcha-demo-submit") WebElement btnLogin;
	@FindBy(xpath="//li[@rel='billspayments']") WebElement tabMyBillsAndPayments;
	@FindBy(xpath="//div[@rel='makePayment']/div[1]/div/div/h5") WebElement txtPayYourBill;
    @FindBy(xpath="//div[@rel='makePayment']/div[1]/div/div/p") WebElement txtPayYourBillTeaser;
    
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
	
	@FindBy(xpath="(//label[@class='form-checkbox'])[3]/span[1]") WebElement radioAmountDueOrInstalment;
    @FindBy(xpath="(//label[@class='form-checkbox'])[3]/span") List<WebElement> txtAmountDueOrInstalment;
    @FindBy(xpath="//h2[@class='amount-need-to-pay']") WebElement txtAmountDueOrInstalment_Amount;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[27]") WebElement btnAmountDueOrInstalmentInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[27]") WebElement txtAmountDueOrInstalmentInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[27]") WebElement btnAmountDueOrInstalmentInfoIconClose;
	@FindBy(xpath="(//label[@class='form-checkbox'])[4]/span[1]") WebElement radioChooseAmount;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-next']") WebElement btnProceedToCardPayment;
	@FindBy(xpath="//div[@rel='makePayment']/div[4]/div/h6") WebElement labelChangeHowYouPayYourBill;
	@FindBy(xpath="//div[@class='form-row dd-only-teaser']/p") WebElement txtSwitchToDirectDebit;
	@FindBy(xpath="//div[@rel='makePayment']/div[4]/div/button[1]") WebElement btnPayByDirectDebit;
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
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[2]/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[4]/h6") WebElement txtPayYourBillEasyWay;
	@FindBy(xpath="//div[@class='payment-func pay-success']/div/div/div[4]/div/p") WebElement txtPayYourBillEasyWayTeaser;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block'])[4]") WebElement btnSetUpDirectDebit;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-outline nb-btn-white btn-back-to-my-account']") WebElement btnGoBackToMyAccount;
	@FindBy(xpath="//li[@class='owl-dot active']") WebElement tabAccountDashboard;
	@FindBy(xpath="//li[@class='mega__has-sub nav-account logined']") WebElement btnMyAccount;
	@FindBy(xpath="//a[@class='account-logout']") WebElement btnLogout;
	@FindBy(xpath="(//i[@class='far fa-user-alt'])[2]") WebElement linkAccount;
	
	@FindBy(xpath="//img[@id='expand_5']") WebElement btnCCBAcivityHistory;
	@FindBy(xpath="//label[@for='contextField5']") WebElement txtCCBSearchByContext;
	
	@FindBy(xpath="//div[@class='wp-usage-box wp-next-bill text-center']/div/div") List<WebElement> paymentDetails;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-pay-your-bill']") WebElement btnPayNow1;
	@FindBy(xpath="//div[@class='title-tooltip account-balance']/h6") WebElement txtAccountBalance;
	
	String ccbUserName, ccbPwd, accountNo, scheduledPayment_CCB, payOffBal_CCB, CurrentBal_CCB, AmountDueOrInstalment;

	public MakePayment_FullInstalment_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MakePayment_FullInstalment.properties");
	}

	public void navigateToPayABillPage() throws Exception {
		btnMakeAPayment.click();
		elementVisible(100, txtPayABill);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayABill);
		Assert.assertEquals(true, txtPayABillTeaser.getText().contains(c.getData("payABillTeaser")));
		Assert.assertEquals(true, txtEmail.isDisplayed());
		Assert.assertEquals(true, txtPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword.isDisplayed());
		Assert.assertEquals(true, btnLogin.isDisplayed());
	}

	public void navigateToPayYourBillPage(String accNo, String username, String pwd) throws Exception {
		btnLogin.click();
		Thread.sleep(10000);
		elementVisible(100, tabMyBillsAndPayments);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayYourBill);
		Assert.assertEquals(true, txtPayYourBillTeaser.getText().contains(c.getData("payYourBillTeaser")));
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		ccbUserName=username;
		btnCCBUserID.sendKeys(ccbUserName);
		ccbPwd=pwd;
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
		Assert.assertEquals(true, radioAmountDueOrInstalment.isDisplayed());
		AmountDueOrInstalment=txtAmountDueOrInstalment_Amount.getText();
		for (WebElement element : txtAmountDueOrInstalment) {
			if (element.getAttribute("class").contains("label") && !element.getAttribute("class").contains("hidden")) {
				if (element.getAttribute("class").contains("nextinstalment")) {
					Assert.assertEquals(true, AmountDueOrInstalment.contains(scheduledPayment_CCB));
				}
				else {
					Assert.assertEquals(true, AmountDueOrInstalment.contains(CurrentBal_CCB));
					Assert.assertEquals(true, labelChangeHowYouPayYourBill.getText().contains(c.getData("changeHowYouPayYourBillLabel")));
					Assert.assertEquals(true, txtSwitchToDirectDebit.getText().contains(c.getData("changeHowYouPayYourBillTeaser")));
					Assert.assertEquals(true, btnPayByDirectDebit.isDisplayed());
				}
			}
		}
		btnAmountDueOrInstalmentInfoIcon.click();
		elementVisible(100, txtAmountDueOrInstalmentInfoIcon);
		Assert.assertEquals(true, txtAmountDueOrInstalmentInfoIcon.getText().contains(c.getData("amountDueOrInstalmentInformationText")));
		Thread.sleep(500);
		btnAmountDueOrInstalmentInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, radioChooseAmount.isDisplayed());
		Assert.assertEquals(true, btnProceedToCardPayment.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioAmountDueOrInstalment);
	}

	public void navigateToPopYourDetailsInPage() throws Exception {
		btnProceedToCardPayment.click();
		elementVisible(100, txtPopYourDetailsIn);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPopYourDetailsIn);
		Assert.assertEquals(true, txtPlsGiveUsYourCardDetails.getText().contains(c.getData("payByCardTeaser")));
		Assert.assertEquals(true, txtAccountNo.getText().contains(accountNo));
		Assert.assertEquals(true, txtAmountToPay.getText().contains(AmountDueOrInstalment.substring(1)));
		Thread.sleep(1000);
	}

	public void enterCardDetails(String cardNo, String expiry, String securityCode) throws Exception {
		driver.switchTo().frame(driver.findElement(By.id("iframeId")));
		elementVisible(100, txtPaymentDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPaymentDetails);
		txtCardNumber.sendKeys(cardNo);
		txtExpiry.sendKeys(expiry);
		Thread.sleep(1000);
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
		String[] xyz = str.split("₤");
		String paymentAmount=xyz[1];
		//String paymentAmount = str.substring(str.length() - 4);
		Assert.assertEquals(true, paymentAmount.contains(AmountDueOrInstalment.substring(1)));
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, txtPayYourBillEasyWay.getText().contains(c.getData("payYourBillEasyWayLabel")));
		Assert.assertEquals(true, txtPayYourBillEasyWayTeaser.getText().contains(c.getData("payYourBillEasyWayTeaser")));
		Assert.assertEquals(true, btnSetUpDirectDebit.isDisplayed());
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
			double abc = Double.parseDouble(CurrentBal_CCB.substring(2))+Double.parseDouble(AmountDueOrInstalment.substring(1));
			CurrentBalance="£‑"+String.valueOf(abc);
		}
		else if (!CurrentBal_CCB.contains("‑")) {
			double abc = Double.parseDouble(CurrentBal_CCB.substring(1))-Double.parseDouble(AmountDueOrInstalment.substring(1));
			CurrentBalance="£"+abc;
		}
			
		if (payOffBal_CCB.contains("‑")) {
			double xyz = Double.parseDouble(payOffBal_CCB.substring(2))+Double.parseDouble(AmountDueOrInstalment.substring(1));
			payOffBalance="£‑"+String.valueOf(xyz);
		}
		else if (!payOffBal_CCB.contains("‑")) {
			double xyz = Double.parseDouble(payOffBal_CCB.substring(1))-Double.parseDouble(AmountDueOrInstalment.substring(1));
			payOffBalance="£"+xyz;
		}
		Assert.assertEquals(true, txtCCBCurrentBalance1.getText().contains(CurrentBalance));
		Assert.assertEquals(true, txtCCBPayOffBalance1.getText().contains(payOffBalance));
	}
	
	public void verifyAccountBalanceWithCCB(String accNo, String username, String pwd) throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyBillsAndPayments);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		ccbUserName=username;
		btnCCBUserID.sendKeys(ccbUserName);
		ccbPwd=pwd;
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
		Assert.assertEquals(true, btnPayNow1.isDisplayed());
		Assert.assertEquals(true, txtAccountBalance.getText().contains(accBalance_CCB));
	}

	public void navigateToPayYourBillPage() throws Exception {
		btnPayNow1.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayYourBill);
		Assert.assertEquals(true, txtPayYourBillTeaser.getText().contains(c.getData("payYourBillTeaser")));
		Assert.assertEquals(true, radioAmountDueOrInstalment.isDisplayed());
		AmountDueOrInstalment=txtAmountDueOrInstalment_Amount.getText();
		for (WebElement element : txtAmountDueOrInstalment) {
			if (element.getAttribute("class").contains("label") && !element.getAttribute("class").contains("hidden")) {
				if (element.getAttribute("class").contains("nextinstalment")) {
					Assert.assertEquals(true, AmountDueOrInstalment.contains(scheduledPayment_CCB));
				}
				else {
					Assert.assertEquals(true, AmountDueOrInstalment.contains(CurrentBal_CCB));
					Assert.assertEquals(true, labelChangeHowYouPayYourBill.getText().contains(c.getData("changeHowYouPayYourBillLabel")));
					Assert.assertEquals(true, txtSwitchToDirectDebit.getText().contains(c.getData("changeHowYouPayYourBillTeaser")));
					Assert.assertEquals(true, btnPayByDirectDebit.isDisplayed());
				}
			}
		}
		btnAmountDueOrInstalmentInfoIcon.click();
		elementVisible(100, txtAmountDueOrInstalmentInfoIcon);
		Assert.assertEquals(true, txtAmountDueOrInstalmentInfoIcon.getText().contains(c.getData("amountDueOrInstalmentInformationText")));
		Thread.sleep(500);
		btnAmountDueOrInstalmentInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, radioChooseAmount.isDisplayed());
		Assert.assertEquals(true, btnProceedToCardPayment.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPayYourBill);
	}

}
