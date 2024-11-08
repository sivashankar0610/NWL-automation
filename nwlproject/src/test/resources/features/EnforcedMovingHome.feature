Feature: Enforced Moving Home  - Inorder to test Enforced Moving Home functionality

  @EnforcedMovingHome @EnforcedMoveOut @TC01 @59790 @Regression
  Scenario Outline: Verify whether customer is able to enhanced move out from unmeasured property - NotLogged In
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on No button and should navigate to Your current address screen
    #When User clicks on Moving home link and should redirected to Moving home landing page
    #And User clicks on I am currently a customer button
    #Then User clicks on No button and should redirected to Let's find your account page
    #When User clicks on Login button and should redirected to Moving home login page
    #And User enters correct Email "<email>" and Password "<password>"
    #Then User clicks on Login button and should redirected to Your current address page
    When User fills The Date you moved out field "<moveOutDate>"
    Then User clicks on Next button and should redirected to Your last bill from us page
    When User verifies Move in Move Out process exists in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | moveOutDate | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | gsscenario10@yopmail.com | Test@1234 | 0163820200 | 10/06/2024 | allak | Monda16! |

  @EnforcedMovingHome @EnforcedMoveOut @TC02 @59793 @Regression
  Scenario Outline: Verify whether customer is able to enhanced move out from measured property - Logged In
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on No button and should navigate to Your current address screen
    When User fills The Date you moved out field "<moveOutDate>"
    Then User clicks on Next button and should redirected to Your last bill from us page
    When User verifies Move in Move Out process exists in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | moveOutDate | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest18@yopmail.com | Test1234 | 9032280200 | 12/06/2024 | allak | Monda16! |
    
  @EnforcedMovingHome @EnforcedMoveWithIn @TC03 @59795 @Regression
  Scenario Outline: Verify whether customer is able to enforced move out from unmeasured property & move in to measured property - Not Logged In
    Given User open the browser "<browser>" and launch the url "<url>"
    #When User clicks on Moving home link and should redirected to Moving home landing page
    #And User clicks on I am currently a customer button
    #Then User clicks on Yes button and should redirected to Let's find your account page
    #When User clicks on Login button and should redirected to Moving home login page
    #And User enters correct Email "<email>" and Password "<password>"
    #Then User clicks on Login button and should navigate to Your current address page
    
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on Yes button and should navigate to Your new home page "<moveInDate>"
    And User fills Your new address and remaining fields "<miAddress>"
    When User clicks on Next button and should navigate to Your bills screen "<MIAccNo>","<ccbUsername>" & "<ccbPwd>"
    And User click on Next button and should redirected to Ready page "<email>"
    Then User click on Done button and should redirected to Success screen
    And User verify details under Show me the details accordian
    When User open MI process exists section in CCB "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History section in CC&B "<AccountNumber>"
    
    Examples:
    | browser | url | email | password | AccountNumber | MIAccNo | moveInDate | miAddress | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | 9303940200@yopmail.com | Water2022 | 9303940200 | 2399260200 | 15/06/2024 | 37, DH7 6QL | allak | Monda16! | 
    
  @EnforcedMovingHome @EnforcedMoveWithIn @TC04 @59796 @Regression
  Scenario Outline: Verify whether customer is able to enforced move out from measured property & move in to unmeasured property - Logged In
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on Yes button and should navigate to Your new home page "<moveInDate>"
    And User fills Your new address and remaining fields "<miAddress>"
    When User clicks on Next button and should redirected to Your bills screen
    And User click on Next button and should navigate to Ready page "<email>" & "<moveInDate>"
    Then User click on Done button and should navigate to Confirmation page
    And User verify details under Show me details section
    And User opens MOMI process exists section in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History section in CC&B "<AccountNumber>"
    
    Examples:
    | browser | url | email | password | AccountNumber | moveInDate | miAddress | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | mimo21@yopmail.com | Test1234 | 1225409740 | 18/06/2024 | 48, SR3 2UH | allak | Monda16! |
    