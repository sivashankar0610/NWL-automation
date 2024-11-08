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

public class MyProfile_UpdateMyDetails_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changedetail-btn model']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="(//div[@class='alert__content'])[1]/p[1]") WebElement txtAlertMsgTeaser1;
	@FindBy(xpath="(//div[@class='alert__content'])[1]/p[2]") WebElement txtAlertMsgTeaser2;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block confirm-btn'])[1]") WebElement btnConfirm;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block back-btn'])[1]") WebElement btnGoBack;
	@FindBy(id="profile-edit-telephone") WebElement txtMyContactNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[40]") WebElement btnMyContactNumberInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[38]") WebElement txtMyContactNumberInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[40]") WebElement btnMyContactNumberInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select'])[2]") WebElement btnHowManyPeopleLiveHere1;
	@FindBy(xpath="(//div[@class='form-row box-hidden'])[2]/div/div[1]") WebElement btnHowManyPeopleLiveHere2;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[41]") WebElement btnHowManyPeopleLiveHereInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[39]") WebElement txtHowManyPeopleLiveHereInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[41]") WebElement btnHowManyPeopleLiveHereInfoIconClose;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[3]") WebElement btnSaveChanges;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[3]") WebElement btnCancel;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span") List<WebElement> dropdownOccupancyOptions1;
	@FindBy(xpath="//div[@class='form-select selected active completed actived']/div/div/span") List<WebElement> dropdownOccupancyOptions2;
	@FindBy(xpath="//div[@class='profile-success-label']/h6") WebElement txtThankYouForTheUpdate;
	@FindBy(xpath="//div[@class='alert__content profile_name_update_content']/p") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block'])[7]") WebElement btnBackToMyProfile;
	@FindBy(xpath="//label[@class='lbl-tel']") WebElement txtMyContactNumber2;
	@FindBy(xpath="//label[@class='lbl-occupiers']") WebElement txtOccupancyCount;
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//td[@orafield='output/numberOfOccupiers']") WebElement txtCCBOccupancyCount;
	@FindBy(xpath="//td[@orafield='contactDetailPrimary']") List<WebElement> txtCCBPrimaryList;
	@FindBy(xpath="//td[@oralabel='output/numberOfOccupiers']") WebElement txtCCBNoOfOccupiers;
	
	String contactNumber, occupancy;
	
	public MyProfile_UpdateMyDetails_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MyProfile_UpdateMyDetails.properties");
	}

	public void displayAlertPopup() throws Exception {
		btnUpdateMyDetails.click();
		elementVisible(100, txtAlertMsgTeaser1);
		Assert.assertEquals(true, txtAlertMsgTeaser1.getText().contains(c.getData("alertMsgTeaser1")));
		Assert.assertEquals(true, txtAlertMsgTeaser2.getText().contains(c.getData("alertMsgTeaser2")));
		Assert.assertEquals(true, btnConfirm.isDisplayed());
		Assert.assertEquals(true, btnGoBack.isDisplayed());
	}

	public void redirectedToMyProfileTab() throws Exception {
		btnGoBack.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(1000);
	}

	public void redirectedToEditableMyProfilePage() throws Exception {
		btnConfirm.click();
		elementVisible(100, txtMyContactNumber);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSaveChanges);
		Assert.assertEquals(true, txtMyContactNumber.isDisplayed());
		Assert.assertEquals(true, !btnSaveChanges.isEnabled());
		Assert.assertEquals(true, btnCancel.isDisplayed());
	}

	public void navigateToMyProfileTab() throws Exception {
		btnCancel.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(1000);
	}

	public void entersUserDetails(String contactNo, String occupancyCount) throws Exception {
		btnMyContactNumberInfoIcon.click();
		elementVisible(100, txtMyContactNumberInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtMyContactNumberInfoIcon.getText().contains(c.getData("myContactNumberInformationText")));
		btnMyContactNumberInfoIconClose.click();
		Thread.sleep(500);
		contactNumber=contactNo;
		txtMyContactNumber.clear();
		Thread.sleep(500);
		txtMyContactNumber.sendKeys(contactNumber);
		btnHowManyPeopleLiveHereInfoIcon.click();
		elementVisible(100, txtHowManyPeopleLiveHereInfoIcon);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtHowManyPeopleLiveHereInfoIcon.getText().contains(c.getData("howManyPeopleLiveHereInformationText")));
		btnHowManyPeopleLiveHereInfoIconClose.click();
		Thread.sleep(500);
		occupancy=occupancyCount;
		if (btnHowManyPeopleLiveHere2.getAttribute("class").contains("selected")) {
			btnHowManyPeopleLiveHere2.click();
			Thread.sleep(1000);
			for (WebElement occupancyOption2 : dropdownOccupancyOptions2) {
				if (occupancyOption2.getText().equalsIgnoreCase(occupancy)) {
					occupancyOption2.click();
					Thread.sleep(500);
				}
			}
		}
		else {
			btnHowManyPeopleLiveHere1.click();
			Thread.sleep(1000);
			for (WebElement occupancyOption1 : dropdownOccupancyOptions1) {
				if (occupancyOption1.getText().equalsIgnoreCase(occupancy)) {
					occupancyOption1.click();
					Thread.sleep(500);
				}
			}
		}
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSaveChanges);
	}

	public void clicksOnSaveChangesButton() throws Exception {
		btnSaveChanges.click();
		elementVisible(100, txtThankYouForTheUpdate);
		Thread.sleep(2000);
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnBackToMyProfile.isDisplayed());
	}

	public void clicksOnBackToMyProfileTab() throws Exception {
		btnBackToMyProfile.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(5000);
		Assert.assertEquals(true, txtMyContactNumber2.getText().contains(contactNumber));
		Assert.assertEquals(true, txtOccupancyCount.getText().contains(occupancy));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyProfile);
	}

	public void verifyAccountInformationInCCB(String accountNo, String ccbUserName, String ccbPwd) throws Exception {
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		Thread.sleep(2000);
		if (Integer.parseInt(occupancy)>=5) {
			Assert.assertEquals(true, txtCCBOccupancyCount.getText().contains("5+"));
		}
		else {
			Assert.assertEquals(true, txtCCBOccupancyCount.getText().contains(occupancy));
		}
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBNoOfOccupiers);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));		
		for (WebElement primaryOption : txtCCBPrimaryList) {
            if (primaryOption.getText().equalsIgnoreCase("Yes")) {
				String txtCCBContactNo=null;
				if(primaryOption.findElement(By.xpath("preceding-sibling::td[3]")).getText().contains("Phone")){
					txtCCBContactNo = primaryOption.findElement(By.xpath("preceding-sibling::td[2]")).getText();
					Assert.assertEquals(true, txtCCBContactNo.equalsIgnoreCase(contactNumber));
		            break;
				}
            }
		}
	}

}
