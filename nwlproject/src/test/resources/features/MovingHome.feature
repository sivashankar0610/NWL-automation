Feature: Moving Home  - Inorder to test Moving Home functionality

  @MovingHome @MoveOut @TC01 @9150 @Regression
  Scenario Outline: Verify whether customer is able to move out from measured property - Logged In
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on No button and should redirected to Your current address screen
    When User enters Move out date "<MoveOutDate>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    Then User clicks on Next button and should redirected to Your last bill from us page "<email>"
    And User enters outside of supply area address in Enter address field "<outsideSupplyAreaAddress>"
    When User clicks on Next button and should redirected to Ready page
    Then User clicks on Done button and should redirected to Confirmation page
    And Verify details under Show me the details section
    When User verifies Move in Move Out process exists in CC&B
    Then User verifies Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | MoveOutDate | ccbUsername | ccbPwd | outsideSupplyAreaAddress |
    | chrome | https://td-prep.nwl.co.uk/ | katest15@yopmail.com | Test1234 | 0007420200 | 10/06/2024 | allak | Monda16! | Manchester |
    # Pre-Condition: Customer should be Measured & ebilling should be true
    
  @MovingHome @MoveOut @TC02 @9149 @Regression
  Scenario Outline: Verify whether customer is able to move out from unmeasured property - Not Logged In
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on No button and should redirected to Your current address screen
    #When User clicks on Moving home link and should redirected to Moving home landing page
    #And User clicks on I am currently a customer button
    #Then User clicks on No button and should redirected to Let's find your account page
    #When User clicks on Login button and should redirected to Moving home login page
    #And User enters correct Email "<email>" and Password "<password>"
    #Then User clicks on Login button and should redirected to Your current address page
    When User enters Move out date "<MoveOutDate>"
    Then User clicks on Next button and should navigate to Your last bill from us page
    And User enter outside of supply area address in Enter address field "<outsideSupplyAreaAddress>"
    When User clicks on Next button and should be navigated to Ready page "<email>"
    Then User clicks on Done button and should navigate to Success screen
    And Verify details under Show me the details accordian "<AccountNumber>"
    When User verify Move in Move Out process exists in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | MoveOutDate | ccbUsername | ccbPwd | outsideSupplyAreaAddress |
    | chrome | https://td-prep.nwl.co.uk/ | mimo19@yopmail.com | Test1234 | 0492340200 | 10/06/2024 | allak | Monda16! | Manchester |
    # Pre-Condition: Customer should be Unmeter & ebilling should be false
    
  @MovingHome @MoveIn @TC03 @10004 @Regression
  Scenario Outline: Verify whether new customer is able to move into measured property
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Moving home link and should redirected to Moving home landing page
    Then Verify Our supply area button navigation
    And Verify Are you landlord button navigation
    When User clicks on I am a new customer & bill payer button and should redirected to Tell us about yourself page
    Then User enters customer details
    And User selected Additional account holder as yes
    And User selected Priority services as yes
    And User selected Help with your bills as yes
    When User clicks on Next button and should redirected to Your new home screen "<MoveInDate>"
    And User enter measured premise address "<MIAddress>"
    Then User clicks on Next button and should redirected to Your bills page "<MIAccNo>","<ccbUsername>" & "<ccbPwd>"
    When User selected setup direct debit as no "<PaymentPlan>"
    Then Verify Download from Google Play Store link navigation
    And Verify App Store link navigation
    When User clicks on Next button and should be navigate to Ready page
    Then User clicks on Done button and should be navigate to Confirmation page
    When Verify lots of tips to save water link navigation
    Then Verify switching to eBilling on your profile link navigation
    And Verify details under Show me details accordian
    When User changes all toggles to On under Marketing preferences section
    Then Verify Go to help centre button navigation
    When User opens yopmail website and enters the email address
    And User clicks on the set password mail
    Then User clicks on the set password button and should redirected to create new password page "<pwd>"
    When User clicks on Save and Continue button and should display success message popup
    Then User clicks on Ok button and should redirected to login page
    And User enters correct email and password
    When User clicks on Login button and should navigate to Account dashboard tab
    Then User verifies pre account setup message
    And User verifies customer contact main tab in CC&B
    And User verifies customer contact characterstics tab in CC&B
    And User verifies account tree tab in CC&B
    And User verifies main details section in CC&B
    And User verifies activity history section in CC&B
    And User verifies person characterstics tab in CC&B
    And User verifies first account holder persons tab in CC&B
    And User verifies second account holder persons tab in CC&B
    And User verifies account portal tab in CC&B
    And User verifies MIMO process main section in CC&B
    And User verifies available start meter reads section in CC&B
    And User verifies Premise main tab in CC&B
    
    Examples:
    | browser | url | MoveInDate | MIAddress | MIAccNo | PaymentPlan | pwd | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | 10/06/2024 | 36, TS14 8DP | 0494720200 | Monthly | Test@1234 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | 06/05/2022 | 1, TS17 8BU | 9263529968 | Monthly | Water2022 |
    #| chrome | https://td-prep.nwl.co.uk/ | 06/05/2022 | 6, TS17 8BU | 9511770200 | Monthly | Water2022 |
    
  
  @MovingHome @MoveIn @TC04 @9148 @Regression
  Scenario Outline: Verify whether new customer is able to move into unmeasured property
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    And User enters the account details under Create an account tab "<pwd>"
    Then User clicks on Create my online account button and should display success message popup  
    And User clicks on go to home page link and should redirected to home page screen
    When User opens yopmail website and enter the email address
    And User clicks on the activation mail
    Then User clicks on the verify my account button and should redirected to NWL website
    When User clicks on Next button and should redirected to Tell us about yourself page
    Then User entered customer details
    And User selected Additional account holder as no
    And User selected Priority services and Help with your bills are no
    When User clicks on Next button and should navigate to Your new home screen "<MoveInDate>"
    And User enter unmeasured premise address "<MIAddress>"
    Then User clicks on Next button and should navigate to Your bills page
    When User selected setup direct debit as Yes
    And User selected Authorise account holder as No
    Then User verifies Download the Metered Property DDI link navigation
    And User verifies Download the Unmetered Property DDI link navigation
    And User verifies Download Adobe Acrobat link navigation
    When User changes Authorise account holder from No to Yes
    And User changes Pay by direct debit from monthly to annual then Payment date field should disappears
    And User changes Pay by direct debit from annual to monthly then Payment date field should reappears
    And User enters Bank account details "<BankAccNo>" and "<SortCode>"
    And User verifies Read the direct debit guarantee link
    Then User clicks on Next button and should navigate to Your new direct debit screen
    And User verifies More information about Direct Debit Guarantee link navigation
    When User clicks on Confirm button and should navigate to Ready screen
    Then User clicks on Done button and should be redirected to Confirmation page
    And User verifies details under Show me the details accordian
    When User verifies all toggles set to Off under Marketing preferences section
    Then User verifies Go to help centre button navigation
    When User clicks on My Account link and should navigate to Account dashboard tab
    Then User verifies pre account setup message under AD tab
    And User verify customer contact main tab in CC&B "<ccbUsername>" & "<ccbPwd>"
    And User verify customer contact characterstics tab in CC&B
    And User verify account tree tab in CC&B
    And User verify main details section in CC&B
    And User verify activity history section in CC&B
    And User verify person characterstics tab in CC&B
    And User verify account holder persons tab in CC&B
    And User verify account portal tab in CC&B
    And User verify MIMO process main section in CC&B
    And User verify Payment preferences section in CC&B
    And User verify Premise main tab in CC&B
    
    Examples:
    | browser | url | pwd | MoveInDate | MIAddress | BankAccNo | SortCode | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | Test@1234 | 10/06/2024 | 45, TS14 6HT | 55779911 | 20-00-00 | allak | Monda16! | 
    
  @MovingHome @MoveWithIn @TC05 @9154 @Regression
  Scenario Outline: Verify whether customer is able to move out from measured property & move in to unmeasured property - Logged In
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And Verify moving home section under Account dashboard
    When User should redirected to Moving Home page after clicking on Moving Home section under AD tab
    Then User clicks on Yes button and should redirected to Your current address screen
    When User enter Move out date "<MoveOutDate>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    Then User clicks on Next button and should redirected to Your new home page "<MoveInDate>"
    And User enters unmeasured premise address "<MIAddress>"
    When User clicks on Next button and should redirected to Your bills page
    And User clicks on Next button and should navigate to Ready page "<email>"
    Then User clicks on Done button and should navigate to Confirmation page
    And Verify details under Show me details section
    When User opens MO process exists in CC&B
    And User opens MI process exists in CC&B
    Then User verifies Activity History section in CC&B "<AccountNumber>"
    
    Examples:
    | browser | url | email | password | AccountNumber | MoveOutDate | MoveInDate | MIAddress | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | kurtcobain29@yopmail.com | Test1234 | 0323550200 | 06/06/2024 | 06/06/2024 | 48, SR3 2UH | allak | Monda16! |
    
    
  @MovingHome @MoveWithIn @TC06 @9153 @Regression
  Scenario Outline: Verify whether customer is able to move out from unmeasured property & move in to measured property - Not Logged In
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
    Then User clicks on Yes button and should redirected to Your current address screen
 
    When User enter Move out date "<MoveOutDate>"
    Then User clicks on Next button and should navigate to Your new home page "<MoveInDate>"
    And User enters measured premise address "<MIAddress>"
    When User clicks on Next button and should navigate to Your bills page "<MIAccNo>","<ccbUsername>" & "<ccbPwd>"
    And User clicks on Next button and should redirected to Ready page "<email>"
    Then User clicks on Done button and should redirected to Success screen
    And Verify details under Show me the details accordian
    When User open MO process exists in CC&B
    And User open MI process exists in CC&B
    Then User verifies Activity History section in CC&B "<AccountNumber>"
    
    Examples:
    | browser | url | email | password | AccountNumber | MoveOutDate | MIAccNo | MoveInDate | MIAddress | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest9@yopmail.com | Test1234 | 0322800200 | 06/06/2024 | 0338160200 | 06/06/2024 | 12, NE3 3QY | allak | Monda16! | 
    #| chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 1733680200 | 10/01/2024 | 0064740200 | 10/01/2024 | 93, NE25 0JA | allak | Monda16! |
 
