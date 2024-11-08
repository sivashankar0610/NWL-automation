Feature: Transunion - Inorder to test the Transunion functionality

  @Transunion @TC01 @57146 @Regression
  Scenario Outline: Verify whether a Customer is able to see Green or Amber status when Peopleover age of 18 is 1
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as No
    And User fills Your income and housing costs fields "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should navigate to Your Finances page
    And User provides How many people are over age of eighteen "<people>"
    When User clicks on Submit button and should redirected to Eligible for a discount on your bill page
    Then User clicks on Submit my application button and should redirected to Green or Amber Status Confirmation screen
    And User clicks on Back To My Account button and should navigate to Account dashboard tab
    And User verifies Business process info in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency | people |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 5102 | 5000 | Monthly | 1 |
    #| chrome | https://td-int.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 4900 | 4800 | Monthly | 1 |
    
  @Transunion @TC02 @57147 @Regression
  Scenario Outline: Verify whether a Customer is able to see Green or Amber status when Peopleover age of 18 is 2
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as No
    And User fills Your income and housing costs fields "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should navigate to Your Finances page
    And User provides How many people are over age of eighteen "<people>"
    And User fills Second occupier details "<secondPersonIncome>"
    When User clicks on Submit button and should redirected to Eligible for a discount on your bill page
    Then User clicks on Submit my application button and should redirected to Green or Amber Status Confirmation screen
    And User clicks on Back To My Account button and should navigate to Account dashboard tab
    And User verifies Business process info in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency | people | secondPersonIncome |
    #| chrome | https://td-int.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 5102 | 9000 | Monthly | 2 | 3964 |
    #| chrome | https://td-int.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 4900 | 8900 | Monthly | 2 | 3860 |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 5102 | 9000 | Monthly | 2 | 3964 |
    
  @Transunion @TC03 @57148 @Regression
  Scenario Outline: Verify whether a Customer is able to see Red status
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as No
    And User fills Your income and housing costs fields "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should navigate to Your Finances page
    And User provides How many people are over age of eighteen "<people>"
    When User clicks on Submit button and should redirected to Eligible for a discount on your bill page
    Then User clicks on Submit my application button and should redirected to Red Status Confirmation screen
    And User clicks on Back To My Account button and should redirected to Account dashboard tab
    And User verify Business process info in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency | people |
    #| chrome | https://td-int.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 1000 | 500 | Annual | 1 |
    #| chrome | https://td-int.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 4900 | 8900 | 1 |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 1000 | 500 | Annual | 1 |
    
  @Transunion @TC04 @58216 @Regression
  Scenario Outline: Verify whether Customer is eligible for discount if we select for me and Single Pension Credit
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as Yes
    And User selects For me and Single Pension Credit buttons
    And User fills Your income and housing costs "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should redirected to May be eligible for a discount on your bill page
    And User clicks on Back to my account button and should redirected to Account dashboard
    And User verify Business process info section in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 1000 | 500 | Annual |
    
    
  @Transunion @TC05 @58217 @Regression
  Scenario Outline: Verify whether Customer is eligible for discount if we select for me and Joint Pension Credit
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as Yes
    And User selects For me and Joint Pension Credit buttons
    And User enters Joint holder details
    And User fills Your income and housing costs "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should redirected to May be eligible for a discount on your bill page
    And User clicks on Back to my account button and should redirected to Account dashboard
    And User verify Business process info section in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 1000 | 500 | Annual |
    
    
  @Transunion @TC06 @58218 @Regression
  Scenario Outline: Verify whether Customer is eligible for discount if we select for someone else and Single Pension Credit
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as Yes
    And User selects For someone else button and fills corresponding fields
    And User selects Single Pension Credit option
    And User fills Your income and housing costs "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should redirected to May be eligible for a discount on your bill page
    And User clicks on Back to my account button and should redirected to Account dashboard
    And User verify Business process info section in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 1000 | 500 | Annual |
    
    
  @Transunion @TC07 @58219 @Regression
  Scenario Outline: Verify whether Customer is eligible for discount if we select for someone else and Joint Pension Credit
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Try Our eligiblility checker button
    Then User clicks on Try Our eligiblility checker button and should redirected to Discount on your bill page
    And Verify user details with CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User enters Move In Current address details "<miMonth>" & "<miYear>"
    When User clicks on Next button and should redirected to Your Finances page
    And User selects Pension Credit as Yes
    And User selects For someone else button and fills corresponding fields
    And User selects Joint Pension Credit option and fills corresponding fields
    And User fills Your income and housing costs "<incomeCost>", "<housingCost>" & "<frequency>"
    Then User clicks on Next button and should redirected to May be eligible for a discount on your bill page
    And User clicks on Back to my account button and should redirected to Account dashboard
    And User verify Business process info section in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verifies Pass to details section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | miMonth | miYear | incomeCost | housingCost | frequency |
    | chrome | https://td-prep.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | allak | Monda16! | 05 | 2023 | 1000 | 500 | Annual |
    