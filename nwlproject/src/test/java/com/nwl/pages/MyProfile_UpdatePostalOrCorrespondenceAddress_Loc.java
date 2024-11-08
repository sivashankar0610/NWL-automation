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

public class MyProfile_UpdatePostalOrCorrespondenceAddress_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='row-address box-hidden']/div[1]/h6") WebElement txtMyAddressLabel;
	@FindBy(xpath="//div[@class='row-address box-hidden']/div[1]/div/label") WebElement txtMyPostalAddressLabel;
	@FindBy(id="profile-edit-address") WebElement txtMyPostalAdress;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[42]") WebElement btnMyPostalAdressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[40]") WebElement txtMyPostalAdressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[42]") WebElement btnMyPostalAdressInfoIconClose;
	@FindBy(id="profile-edit-address1") WebElement txtAddress1;
	@FindBy(id="profile-edit-address2") WebElement txtAddress2;
	@FindBy(id="profile-edit-address3") WebElement txtTownOrCity;
	@FindBy(id="profile-edit-postcode") WebElement txtPostcode;
	@FindBy(xpath="(//div[@class='form-select selected'])[3]/span[2]") WebElement txtCountry;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[3]") WebElement btnSaveChanges;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[3]") WebElement btnCancel;
	@FindBy(xpath="//div[@class='profile-success-label']/h6") WebElement txtThankYouForTheUpdate;
	@FindBy(xpath="//div[@class='alert__content profile_name_update_content']/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToMyProfile;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changedetail-btn model']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[2]/h6") WebElement txtMyAddressLabel_MP;
	@FindBy(xpath="(//div[@class='profile-box box-hidden'])[2]/div") WebElement txtMyPostalAddressLabel_MP;
	@FindBy(xpath="//span[@class='lbl-address1']") WebElement txtAddress1_MP;
	@FindBy(xpath="//span[@class='lbl-address2']") WebElement txtAddress2_MP;
	@FindBy(xpath="//span[@class='lbl-address4']") WebElement txtAddress4_MP;
	@FindBy(xpath="//span[@class='lbl-postcode']") WebElement txtpostcode_MP;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="(//td[@class='oraLabel oraTableLabel'])[1]") WebElement txtCCBAccount_ID;
	@FindBy(xpath="(//td[@class='oraNormal oraTableData oraDefault'])[6]") WebElement txtCCBOverrideAddress;
	
	String address1, address2, address4, postcode;
	
	public MyProfile_UpdatePostalOrCorrespondenceAddress_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//MyProfile_UpdatePostalOrCorrespondenceAddress.properties");
	}
	
	public void verifyMyAddressSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyAddressLabel);
		Assert.assertEquals(true, txtMyPostalAddressLabel.getText().contains(c.getData("myPostalAddressLabel")));
		btnMyPostalAdressInfoIcon.click();
		elementVisible(100, txtMyPostalAdressInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtMyPostalAdressInfoIcon.getText().contains(c.getData("myPostalAdressInformationText")));
		btnMyPostalAdressInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, !btnSaveChanges.isEnabled());
		Assert.assertEquals(true, btnCancel.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyAddressLabel);
	}
	
	public void entersNewAddress(DataTable table) throws Exception {
		List<List<String>> data = table.cells();
		address1=data.get(1).get(1);
		address2=data.get(2).get(1);
		address4=data.get(3).get(1);
		postcode=data.get(4).get(1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyAddressLabel);
		txtMyPostalAdress.clear();
		Thread.sleep(500);
		txtMyPostalAdress.sendKeys(address1);
		txtAddress1.clear();
		Thread.sleep(500);
		txtAddress1.sendKeys(address2);
		Assert.assertEquals(true, txtAddress2.isDisplayed());
		txtTownOrCity.clear();
		Thread.sleep(500);
		txtTownOrCity.sendKeys(address4);
		txtPostcode.clear();
		Thread.sleep(500);
		txtPostcode.sendKeys(postcode);
		Assert.assertEquals(true, txtCountry.getText().contains("United Kingdom"));
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyAddressLabel);
	}
	
	public void clicksOnSaveChangesButton() throws Exception {
		btnSaveChanges.click();
		elementVisible(100, txtThankYouForTheUpdate);
		Thread.sleep(2000);
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnBackToMyProfile.isDisplayed());
	}

	public void clicksOnBackToMyProfileButton() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyAddressLabel_MP);
		Assert.assertEquals(true, txtMyPostalAddressLabel_MP.getText().contains(c.getData("myPostalAddressLabel")));
		Assert.assertEquals(true, txtAddress1_MP.getText().contains(address1));
		Assert.assertEquals(true, txtAddress2_MP.getText().contains(address2));
		Assert.assertEquals(true, txtAddress4_MP.getText().contains(address4));
		Assert.assertEquals(true, txtpostcode_MP.getText().contains(postcode));
		Thread.sleep(500);
	}

	public void verifyNewAddressInCCB(String accNo, String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(accNo);
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
		elementVisible(100, txtCCBAccount_ID);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBAccount_ID);
		Assert.assertEquals(true, txtCCBOverrideAddress.getText().contains(address1+","+address2+",,"+address4+","+postcode));
		Thread.sleep(500);
	}

}
