Feature: Financial Support Eligibility Checker functionality - Inorder to test Financial Support Eligibility Checker scenarios in MyAccount

  @FSEC @TC01 @Regression @44277
  Scenario Outline: Verify whether user is able to see eligible results screen while performing Financial Support Eligibility Checker Journey 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Ribbon Services > Extra Support > Financial Support and should redirected to Financial Support page
    And User clicks on Eligiblity Checker button and should redirected to Financial Support Eligibility Checker page
    Then User clicks on Check my eligibility button without selecting any option and should throws Yes & No button Boxes highlighted red
    When User selects I have three or more children living with you at the property & I have a water meter options for Your household field
    And User selects Pension Credit option for Benefits & financial support field
    And User selects Yes option for Are you £50 or more behind with your water bill payments? field
    Then User clicks on Check my eligibility button and should redirected to Eligible Results screen
    And User verifies Low income discount and WaterSure sections
    And User verifies Water Direct and Water saving tips sections
    When User clicks on Apply Online button for Low income discount and should redirected to Low income discount page in new tab
    Then User clicks on Find out more button for Water Sure and should redirected to Bill cap scheme - Water Sure page in new tab
    When User clicks on Find out more button for Water Direct and should redirected to Water Direct page in new tab
    Then User clicks on Read our water saving tips button and should redirected to Save water page in new tab
    And User clicks on Back to Financial support button and should redirected to Financial Support eligibility checker page
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest4@yopmail.com | Test1234 | 0014310200 |
    
    
  @FSEC @TC02 @Regression @44407
  Scenario Outline: Verify whether user is able to see may be eligible results screen while performing Financial Support Eligibility Checker Journey 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Ribbon Services > Extra Support > Financial Support and should redirected to Financial Support page
    And User clicks on Eligiblity Checker button and should redirected to Financial Support Eligibility Checker page
    Then User clicks on Check my eligibility button without selecting any option and should throws Yes & No button Boxes highlighted red
    When User selects My household income is not enough to pay my essential bills option for Your household field
    And User does not selects any option for Benefits & financial support field
    And User selects Yes option for Are you £50 or more behind with your water bill payments? field
    Then User clicks on Check my eligibility button and should redirected to May be Eligible Results screen
    And User verifies Reduced Bill section
    And User verifies Get a water meter section
    When User clicks on Find out more button for Reduced Bill and should redirected to Reduced Bill page in new tab
    Then User clicks on Check if you can save on a meter button for Get a water meter and should redirected to Apply for a water meter page in new tab
    And User clicks on Back to Financial support button and should redirected to Financial Support eligibility checker page
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest4@yopmail.com | Test1234 | 0014310200 |
    
    
  @FSEC @TC03 @Regression @44684
  Scenario Outline: Verify whether user is able to see not eligible results screen while performing Financial Support Eligibility Checker Journey 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Ribbon Services > Extra Support > Financial Support and should redirected to Financial Support page
    And User clicks on Eligiblity Checker button and should redirected to Financial Support Eligibility Checker page
    Then User clicks on Check my eligibility button without selecting any option and should throws Yes & No button Boxes highlighted red
    When User selects I have a water meter option for Your household field
    And User selects Income Based Jobseekers Allowance option for Benefits & financial support field
    And User selects No option for Are you £50 or more behind with your water bill payments? field
    Then User clicks on Check my eligibility button and should redirected to Not Eligible Results screen
    And User verifies Get More Time To Pay and Check What Benefits You Might Be Entitled To sections
    And User verifies Talk To Us and Water Saving Tips sections
    When User clicks on Request a payment break button for Get more time to pay and should redirected to Apply for a payment break page in new tab
    Then User clicks on Setup payment plan button for Get more time to pay and should redirected to Account Dashboard in new tab
    When User clicks on Try the calculator button for Check what benefits you might be entitled to and should redirected to Benefits calculator page in new tab
    #Then User clicks on Send us a message on Messenger link for Talk to us and should redirected to Messenger page in new tab
    When User clicks on Email us link for Talk to us and should redirected to Email Us page in new tab
    Then User clicks on Read our water saving tips button and should redirected to Save water page in new tab
    And User clicks on Back to Financial support button and should redirected to Financial Support eligibility checker page
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest4@yopmail.com | Test1234 | 0014310200 |