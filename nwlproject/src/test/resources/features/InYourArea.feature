Feature: In Your Area  - Inorder to test In Your Area functionality

  @IYA @9968 @TC01 @Regression
  Scenario Outline: Verify whether customer is able to validate In Your Area functionality
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Your Local Area link from Ribbon and should navigate to Check my area tab
    Then User enters required address and verify Water disruption section "<address>"
    And User verify Leaks section
    And User verify Road works section
    And User verify Water quality information
    When User clicks on Northumbrian Water link and should redirected to NWL home page
    
    Examples:
    | browser | url | address |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH3 3SD |
    #| chrome | https://td-dev.nwl.co.uk/ | 10, DH7 6SD |
    
  @IYA @14496 @TC02 @Regression
  Scenario Outline: Verify whether customer is able to report a leak (Logged In)
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on Leaks button
    Then User enters required address and verify No leaks found in this area message "<address>"
    When User clicks on Continue to report a leak button and should opens Where is the leak section
    Then User clicks on In the road, lane or footpath button
    And User selects Steady flow from How bad is the leak section
    When User verifies Contact details "<email>"
    Then User clicks on Finish reporting this leak button and should redirected to confirmation screen
    When User clicks on How we fix leaks button and should redirected to fixing leaks page
    Then User clicks on How long it takes to fix leaks button and should redirected to fixing leaks page
    When User verifies Customer contact characteristics tab in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verify Business process section in CC&B
    And User verify Process activity history in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | address | ccbUsername | ccbPwd |
    #| chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | 38, DH7 6BA | allak | Monda16! |
    | chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test@1234 | 0361700200 | 23, NE46 2BW | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | kt1@yopmail.com | Test@1234 | 0020400200 | 123, NE28 9UX | allak | Monda16! |
    
  @IYA @14497 @TC03 @Regression
  Scenario Outline: Verify whether customer is able to check a leak (Logged In)
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User enters required address "<address>"
    And User verifies Leaks section
    And User verifies Investigating reported leak icon information text
    When User clicks on reported leak link and should navigate to check your area tab
    Then User verifies More details and Useful information sections under check your area tab
    When User clicks on What happens when i report a leak button and should redirected to fixing leaks page
    Then User clicks on How long does it take to fix a leak button and should redirected to who fixes the leak in my home page
    
    Examples:
    | browser | url | email | password | AccountNumber | address |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | 38, DH7 6BA |
    #| chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test1234 | 0361700200 | 23, NE46 2BW |
    #| chrome | https://td-prep.nwl.co.uk/ | umka2@yopmail.com | Test@1234 | 0762130200 | 15, TS8 9ZD |
    
    
  @IYA @63005 @TC04 @Regression
  Scenario Outline: Verify whether customer is able to perform No Water Journey
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on No Water button
    And User clicks on Yes, there is a trickle of water button
    And User clicks on No, I have no water button
    Then User clicks on No button for Is this problem affecting your cold water supply? field
    And User clicks on Yes button for Is this problem affecting your cold water supply? field
    And User clicks on Yes button for Did this fix the problem? field
    And User clicks on No button for Did this fix the problem? field
        
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 |
    
  @IYA @63006 @TC05 @Regression
  Scenario Outline: Verify whether customer is able to perform Low Water Pressure Journey - Logged In
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on Water Pressure button
    And User clicks on Low Pressure button
    Then User clicks on No button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User clicks on Yes button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User click on Yes button for Did this fix the problem? field
    And User click on No button for Did this fix the problem? field
    And User selects Its intermittent radio button for when did the problem start? field
    And User selects Its only just started radio button for when did the problem start? field
    And User selects Today radio button for when did the problem start? field
    And User selects Yesterday radio button for when did the problem start? field
    And User selects A week ago radio button for when did the problem start? field
    And User selects More than a week ago radio button for when did the problem start? field
    When User verifies Your contact details with CC&B "<ccbUsername>", "<ccbPwd>", "<AccountNumber>" & "<email>"
    Then User clicks on Submit button and should redirected to WP Confirmation screen
    And User clicks on Close button and should redirected to Report a problem page
    And User verifies Main Process Details section in CC&B
    And User verifies Water Pressure Customer Journey section in CC&B
    And User verifies Activity History Section in CCB
       
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | allak | Monda16! |
    
  @IYA @63007 @TC06 @Regression
  Scenario Outline: Verify whether customer is able to perform High Water Pressure Journey - Logged In
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on Water Pressure button
    And User clicks on High Pressure button
    Then User click on No button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User click on Yes button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User selects an option for when the problem started "<PSName>"
    And User enters text in the describe the issue text box
    And User clicks on No button for Are your neighbours affected? field
    And User clicks on Yes button for Are your neighbours affected? field
    And User clicks on No button for Have you recently carried out any plumbing work in your home? field
    And User clicks on Yes button for Have you recently carried out any plumbing work in your home? field
    When User verifies Your contact details with CC&B "<ccbUsername>", "<ccbPwd>", "<AccountNumber>" & "<email>"
    Then User clicks on Submit button and should redirected to WP Confirmation screen
    And User clicks on Close button and should redirected to Report a problem page
    And User verifies Main Process Details section in CC&B
    And User verifies Water Pressure Customer Journey section in CC&B
    And User verifies Activity History Section in CCB
       
    Examples:
    | browser | url | email | password | AccountNumber | PSName | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | Yesterday | allak | Monda16! |
    
  @IYA @63008 @TC07 @Regression
  Scenario Outline: Verify whether customer is able to perform Water Quality Journey
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on Water Quality button
    And User selects The taste and smell of my water radio button for What seems to be the problem? field
    Then User clicks on No button for Is your cold water supply affected? field
    And User clicks on Yes button for Is your cold water supply affected? field
    And User selects Chlorine option for Can you describe the taste or smell of your water? field
    And User selects TCP or mouthwash option for Can you describe the taste or smell of your water? field
    And User selects Stale or musty option for Can you describe the taste or smell of your water? field
    And User selects Metal option for Can you describe the taste or smell of your water? field
    And User selects Egg or fish option for Can you describe the taste or smell of your water? field
    And User selects Diesel or petrol option for Can you describe the taste or smell of your water? field
    And User selects Woody tastes or smells option for Can you describe the taste or smell of your water? field
    When User clicks on Yes button for Has this information helped? field
    Then User clicks on No button for Has this information helped? field
    When User selects My water has a strange colour or bits radio button for What seems to be the problem? field
    Then User clicks on No button for Is your cold water supply affected? field
    And User click on Yes button for Is your cold water supply affected? field
    And User selects White and cloudy option for What colour is your water? field
    And User selects Black, orange or brown option for What colour is your water? field
    And User selects Pink, blue or green option for What colour is your water? field
    And User selects Biofilm and mould option for What colour is your water? field
    When User clicks on Yes button for Has this information helped? field
    Then User clicks on No button for Has this information helped? field
    And User selects I think I have hard water radio button for What seems to be the problem? field
    When User clicks on Yes button for Has this information helped? field
    Then User clicks on No button for Has this information helped? field
      
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 |
    
  @IYA @63009 @TC08 @Regression
  Scenario Outline: Verify whether customer is able to perform Sewerage Journey
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    And User clicks on Sewerage button
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 |
    
  @IYA @63010 @TC09 @Regression
  Scenario Outline: Verify whether customer is able to perform Pollution Journey
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    And User clicks on Pollution button
    And User verifies What we need to know about pollution incidents section
    And User verifies when we are responsible for pollution incidents section
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 |
    
  @IYA @63011 @TC10 @Regression
  Scenario Outline: Verify whether customer is able to perform Drains and Covers Journey
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    And User clicks on Drains and Covers button
    And User verifies Highway gully issues section
    And User clicks on County council contacts button and should redirected to County council contacts page in new tab
    And User verifies Other drain cover issues section
    And User clicks on Tell us about a drain or cover issue button and should redirected to Broken pipes, drains and covers page in new tab
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 |
    
  @IYA @64339 @TC11 @Regression
  Scenario Outline: Verify whether customer is able to perform Low Water Pressure Journey -  Not Logged In
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Your Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on Water Pressure button
    And User clicks on Low Pressure button
    Then User clicks on No button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User clicks on Yes button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User click on Yes button for Did this fix the problem? field
    And User click on No button for Did this fix the problem? field
    And User selects Its intermittent radio button for when did the problem start? field
    And User selects Its only just started radio button for when did the problem start? field
    And User selects Today radio button for when did the problem start? field
    And User selects Yesterday radio button for when did the problem start? field
    And User selects A week ago radio button for when did the problem start? field
    And User selects More than a week ago radio button for when did the problem start? field
    When User enters Your contact details as per CC&B "<ccbUsername>", "<ccbPwd>", "<AccountNumber>" & "<email>"
    Then User clicks on Submit button and should redirected to WP Confirmation screen
    And User clicks on Close button and should redirected to Report a problem page
    And User verifies Main Process Details section in CC&B
    And User verifies Water Pressure Customer Journey section in CC&B
    And User verifies Activity History Section in CCB
       
    Examples:
    | browser | url | email | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | 9263529968 | allak | Monda16! |
    
  @IYA @64340 @TC12 @Regression
  Scenario Outline: Verify whether customer is able to perform High Water Pressure Journey - Not Logged In
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Your Local Area link from Ribbon and should navigate to Check my area tab
    Then User clicks on Report a problem tab and should navigate to Report a problem tab
    When User clicks on Water Pressure button
    And User clicks on High Pressure button
    Then User click on No button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User click on Yes button for Is the pressure issue affecting the cold water supply at your kitchen tap? field
    And User selects an option for when the problem started "<PSName>"
    And User enters text in the describe the issue text box
    And User clicks on No button for Are your neighbours affected? field
    And User clicks on Yes button for Are your neighbours affected? field
    And User clicks on No button for Have you recently carried out any plumbing work in your home? field
    And User clicks on Yes button for Have you recently carried out any plumbing work in your home? field
    When User enters Your contact details as per CC&B "<ccbUsername>", "<ccbPwd>", "<AccountNumber>" & "<email>"
    Then User clicks on Submit button and should redirected to WP Confirmation screen
    And User clicks on Close button and should redirected to Report a problem page
    And User verifies Main Process Details section in CC&B
    And User verifies Water Pressure Customer Journey section in CC&B
    And User verifies Activity History Section in CCB
       
    Examples:
    | browser | url | email | AccountNumber | PSName | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | 9263529968 | Today | allak | Monda16! |
    
    