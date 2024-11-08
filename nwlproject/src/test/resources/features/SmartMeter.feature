Feature: Smart Meter - Inorder to test the Smart Meter functionality

  @SmartMeter @Meter&UsageStatus @TC01 @15360 @15361 @Regression
  Scenario Outline: Verify whether Smart Customer is able to see the meter status & Usage efficiency status
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify meter status of the property under Your Usage section "<AccountNumber>"
    When User clicks on Smart metered info icon then verify copy text for that
    Then Verify water usage efficiency status under Account Dashboard tab
    When User clicks on View my usage button and should be redirected to My Usage tab for Smart
    Then Verify water usage efficiency status under My Usage tab for Smart
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | mbscenario20@yopmail.com | Password1 | 0003250200 |
    #| chrome | https://td-int.nwl.co.uk/ | abscenario10@yopmail.com | Password1 | 4731278159 |
    
  @SmartMeter @Meter&UsageStatus @TC02 @15360 @15361 @Regression
  Scenario Outline: Verify whether Smart Customer but Ummetered Tariff Bill is able to see the meter status & Usage efficiency status
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify meter status and unmetered tariff bill copytext under Your Usage section "<AccountNumber>"
    When User clicks on Unmetered tariff info icon then verify copy text for that
    Then User clicks on View my usage button and should be redirected to My Usage tab for Smart-UMTB
    And Verify water usage efficiency status under My Usage tab for Smart-UMTB
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | ngscenario4@yopmail.com |  Password1| 4921010200 |
    #| chrome | https://td-int.nwl.co.uk/ | rascenario5@yopmail.com | Password1 | 0697910200 |
    #| chrome | https://td-int.eswater.co.uk/ | ba61@yopmail.com | Password1 | 3202900100 |
    
  @SmartMeter @AccountClosedMsg @TC03 @Regression @15363
  Scenario Outline: Verify whether Customer is able to see the account closed message under Account dashboard & My Usage tabs
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify account closed message under Account Dashboard tab
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then Verify account closed message under My Usage tab
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | gwenstefani1992@yopmail.com | Password1 | 0021970200 |
    #| chrome | https://td-int.nwl.co.uk/ | kate.bush1979@yopmail.com | Password1 | |
    
  @SmartMeter @DownloadApp @TC04 @Regression @15369
  Scenario Outline: Verify whether customer is able to navigate to Download Our App website 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then Verify Smart app download promo banner copy text
    And User clicks on Download the App button and should be navigate to Download Our App website
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | bdscenario3@yopmail.com | Password1 | 0053710200 |
    #| chrome | https://td-int.eswater.co.uk/ | janisjoplin2022@yopmail.com | Password1 | |
    
  @SmartMeter @Graph @TC05 @Regression @15362
  Scenario Outline: Verify whether customer is able to use the toggle functionality for all graphs (Daily, Weekly, Monthly & Yearly)
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then User should be in Daily Graph
    When User clicks on toggle button & Daily Graph format should be changed
    Then User clicks on Weekly button & should navigate to Weekly graph
    When User clicks on toggle button & Weekly Graph format should be changed
    Then User clicks on Monthly button & should navigate to Monthly graph
    When User clicks on toggle button & Monthly Graph format should be changed
    Then User clicks on Yearly button & should navigate to Yearly graph
    And User clicks on toggle button & Yearly Graph format should be changed 
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | mbscenario20@yopmail.com | Password1 | 0003250200 |
    #| chrome | https://td-int.nwl.co.uk/ | ngscenario4@yopmail.com | Password1 | 4921010200 |
    #| chrome | https://td-int.nwl.co.uk/ | abscenario10@yopmail.com | Password1 | 4731278159 |
    #| chrome | https://td-int.eswater.co.uk/ | ba61@yopmail.com | Password1 | 3202900100 |
    
  @SmartMeter @LandlordAccounts @TC06 @52208 @Regression
  Scenario Outline: Verify whether Daily consumption graph should be disabled as expected for Smart & Smart unmetered landlord customers (28640)-If Owner is Landlord (OwnerTypeField - 6)
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then User verifies Daily consumption graph should be disabled as expected
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | bdscenario3@yopmail.com | Password1 | 0053710200 |
    
  @SmartMeter @STAA @TC07 @Regression @15370 @abc
  Scenario Outline: Verify whether customer is able to switching into another property 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and select a property from account selection dropdown "<AccountNumber>"
    When User clicks on Continue button and is able to see the Switch to Another Account button
    Then Verify user account details under Account dashboard tab
    And User clicks on Switch to another account button and select another property from account selection dropdown
    When User clicks on Continue button and is able to see the Switch to Another Account button
    Then Verify user account details under Account dashboard tab
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-int.nwl.co.uk/ | multi1@yopmail.com | Test1234 | 0973170200 |
    
  @SmartMeter @STSM @TC08 @WAMSwitch @52485 @Regression
  Scenario Outline: Verify whether Smart Customer with unmetered tariff bill is able to complete switch to smart meter journey 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then User verifies Switch to metered bills section available or not
    When User clicks on Switch to metered bills button and should redirected to Switch to metered bills page
    Then User verifies customer personal details with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    When User clicks on Next button and should redirected to Switch to metered bills page
    Then User selects Yes option for give a meter reading field
    And User changes from Yes to No option for give a meter reading field "<occupancy>"
    And User clicks on Done button and should redirected to We have got your request to switch page
    And User verifies Whole area metering section in CC&B
    And User verifies Terms and Conditions section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | occupancy |
    | chrome | https://td-int.eswater.co.uk/ | jb70@yopmail.com | Password1 | 9323900100 | allak | Monda16! | 4 |
    #| chrome | https://td-int.eswater.co.uk/ | fh69@yopmail.com | Password1 | 2317700100 | allak | Monda16! | 4 |
    
  @SmartMeter @STSM @TC09 @WAMSwitch @52486 @Regression
  Scenario Outline: Verify whether Smart Customer with unmetered tariff bill is able to complete switch to smart meter journey 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then User verifies Switch to metered bills section available or not
    When User clicks on Switch to metered bills button and should redirected to Switch to metered bills page
    Then User verifies customer personal details with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    When User clicks on Next button and should redirected to Switch to metered bills page
    Then User selects No option for give a meter reading field
    And User changes from No to Yes option for give a meter reading field "<occupancy>"
    And User clicks on Done button and should redirected to We have got your request to switch page
    And User verifies Whole area metering section in CC&B
    And User verifies Terms and Conditions section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | occupancy |
    | chrome | https://td-int.eswater.co.uk/ | jb61@yopmail.com | Password1 | 6643640100 | allak | Monda16! | 4 |
    #| chrome | https://td-int.eswater.co.uk/ | fh69@yopmail.com | Password1 | 2317700100 | allak | Monda16! | 4 |
    
  @SmartMeter @WST @TC10 @Regression @15371
  Scenario Outline: Verify whether customer is able to see water saving tips
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Usage tab and should be redirected to My Usage tab
    Then verify user able to see the water saving tip link "<TypeOfCustomer>"
    And User clicks on Water saving tip link & it should navigate to Water saving tips website
    
    Examples:
    | browser | url | email | password | TypeOfCustomer | AccountNumber |
    #| chrome | https://td-int.nwl.co.uk/ | ngscenario4@yopmail.com | Password1 | Smart-UMTB | 4921010200 |
    | chrome | https://td-int.nwl.co.uk/ | mbscenario20@yopmail.com | Password1 | Smart| 0019290200 |
    #| chrome | https://td-int.nwl.co.uk/ | bdscenario20@yopmail.com | Water2021 | Smart | 0019290200 |
    #| chrome | https://td-int.nwl.co.uk/ | jbscenario19@yopmail.com | Water2021 | Smart | 0017460200 |
    #| chrome | https://td-int.nwl.co.uk/ | fmscenario12@yopmail.com | Water2021 | Smart | 0064160200 |
    #| chrome | https://td-int.nwl.co.uk/ | bdscenario3@yopmail.com | Water2021 | Smart | 0053710200 |
    #| chrome | https://td-int.eswater.co.uk/ | freddy.mercurry1967@yopmail.com | Password2 | Smart-UMTB | 2317700100 |
    #| chrome | https://td-int.nwl.co.uk/ | jeff.buckley1982@yopmail.com | Password1 | Smart-UMTB | 0697910200 |    
    