Feature: In Your Area  - Inorder to test Register Priority Services functionality

  @PSR @16797 @TC01 @Regression
  Scenario Outline: Verify whether customer is able to registering priority services for me (Logged In)
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Services>Extra Support>Priority Services and should navigate to Priority Services page
    And User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page
    Then User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page
    And User selects for me button under Sign up to Priority Services page
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User clicks on Goback button and should navigate to Sign up to Priority Services page
    Then User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User selects Blind option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User selects Yes option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>" and selects any option for How would you like your bill? "<billOption>"
    And User selects option for How did you hear about the priority services register? dropdown "<hearAboutPSROption>"
    Then User clicks on Next button and should redirected to PSR confirmation screen
    And User clicks on Back to priority services button and should redirected to priority services page
    And User navigates to My Profile to verify Priority Services section having Change and Remove buttons
    When User verifies Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies Person Main tab in CC&B
    And User verifies Person characteristics tab in CC&B
    And User verifies Bill route under Person portal tab in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | circumstanceOption | pwd | billOption | hearAboutPSROption | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | 1 | Water2022 | 1 | 1 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest19@yopmail.com | Test1234 | 9182277827 | 1 | Water2022 | 1 | 1 | allak | Monda16! |
    
  @PSR @21116 @TC02 @Regression
  Scenario Outline: Verify whether customer is able to registering priority services for who lives with you (Logged In)
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Services>Extra Support>Priority Services and should navigate to Priority Services page
    And User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page
    Then User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page
    And User selects for someone else button under Sign up to Priority Services page
    And User enters personal details for who lives with you "<firstName>" & "<surname>"
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User selects Blind option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User selects Yes option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>"
    And User selects option for How did you hear about the priority services register? dropdown "<hearAboutPSROption>"
    Then User clicks on Next button and should redirected to PSR confirmation screen
    And User clicks on Back to priority services button and should redirected to priority services page
    And User navigates to My Profile to verify Priority Services section having Register button
    When User verifies Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies PSR person Premise characteristics tab in CC&B
    And User verifies PSR person Main tab in CC&B
    And User verifies PSR person characteristics tab in CC&B
    And User verifies PSR person Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | firstName | surname | circumstanceOption | pwd | hearAboutPSROption | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 7260340200 | user | test | 1 | Water2022 | 1 | allak | Monda16! |
    
  @PSR @21117 @TC03 @Regression
  Scenario Outline: Verify whether customer is able to registering priority services for who does not lives with me (Logged In)
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Services>Extra Support>Priority Services and should navigate to Priority Services page
    And User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page
    Then User clicks on I am registering for someone who does not live with me button and should navigate to Sign up to Priority Services page "<email>"
    When User fills Who are you registering on behalf of? section details "<AccountNumber2>", "<ccbUsername>" & "<ccbPwd>"
    Then User clicks on Yes button for Does the person you are registering pay a Northumbrian Water bill? section
    When User clicks on Yes button for Would you like to be a nominated contact for this account? section
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User selects Blind option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User selects Yes option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>" and selects any option for How would you like your bill? "<billOption>"
    And User selects any option for How did you hear about the priority services register? dropdown "<hearAboutPSROption>"
    Then User clicks on Next button and should redirected to PSR confirmation screen
    And User clicks on Back to priority services button and should redirected to priority services page
    And User navigates to My Profile to verify Priority Services section having Register button
    When User verifies Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies PSR Person Main tab in CC&B "<AccountNumber2>"
    And User verifies PSR Person characteristics tab in CC&B
    And User verifies PSR Person Bill route under Person portal tab in CC&B
    And User verifies PSR person Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | AccountNumber2 | circumstanceOption | pwd | billOption | hearAboutPSROption |
    #| chrome | https://td-prep.nwl.co.uk/ | katest11@yopmail.com | Test1234 | 4262050200 | allak | Monda16! | 1597940200 | 1 | Water2022 | 1 | 1 |
    | chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 7260340200 | allak | Monda16! | 4262050200 | 1 | Water2022 | 1 | 1 |
    
    
  @PSR @55149 @TC04 @Regression
  Scenario Outline: Verify whether customer is able to registering priority services for me (Logged In) from My Profile
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User verifies Priority Services section having Register button under My Profile tab
    When User clicks on Register for Priority Services button and should navigate to Priority Services page
    And User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page
    Then User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page
    And User selects for me button under Sign up to Priority Services page
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User clicks on Goback button and should navigate to Sign up to Priority Services page
    Then User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User selects Blind option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User selects Yes option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>" and selects any option for How would you like your bill? "<billOption>"
    And User selects option for How did you hear about the priority services register? dropdown "<hearAboutPSROption>"
    Then User clicks on Next button and should redirected to PSR confirmation screen
    And User clicks on Back to priority services button and should redirected to priority services page
    And User navigates to My Profile to verify Priority Services section having Change and Remove buttons
    When User verifies Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies Person Main tab in CC&B
    And User verifies Person characteristics tab in CC&B
    And User verifies Bill route under Person portal tab in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | circumstanceOption | pwd | billOption | hearAboutPSROption | ccbUsername | ccbPwd |
    #| chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | 1 | Water2022 | 1 | 1 | allak | Monda16! |
    | chrome | https://td-prep.nwl.co.uk/ | katest4@yopmail.com | Test1234 | 0014310200 | 1 | Water2022 | 1 | 1 | allak | Monda16! |
    
  @PSR @55150 @TC05 @Regression
  Scenario Outline: Verify whether customer is able to registering priority services for who lives with you (Logged In) from My Profile
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User verifies Priority Services section having Register button under My Profile tab
    When User clicks on Register for Priority Services button and should navigate to Priority Services page
    And User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page
    Then User clicks on I am registering for myself or someone who lives with me button and should navigate to Sign up to Priority Services page
    And User selects for someone else button under Sign up to Priority Services page
    And User enters personal details for who lives with you "<firstName>" & "<surname>"
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User selects Blind option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User selects Yes option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>"
    And User selects option for How did you hear about the priority services register? dropdown "<hearAboutPSROption>"
    Then User clicks on Next button and should redirected to PSR confirmation screen
    And User clicks on Back to priority services button and should redirected to priority services page
    And User navigates to My Profile to verify Priority Services section having Register button
    When User verifies Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies PSR person Premise characteristics tab in CC&B
    And User verifies PSR person Main tab in CC&B
    And User verifies PSR person characteristics tab in CC&B
    And User verifies PSR person Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | firstName | surname | circumstanceOption | pwd | hearAboutPSROption | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | user | test | 1 | Water2022 | 1 | allak | Monda16! |
    
  @PSR @55151 @TC06 @Regression
  Scenario Outline: Verify whether customer is able to registering priority services for who does not lives with me (Logged In) from My Profile
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User verifies Priority Services section having Register button under My Profile tab
    When User clicks on Register for Priority Services button and should navigate to Priority Services page
    And User clicks on Register for Priority Services button and should redirected to Sign up to Priority Services page
    Then User clicks on I am registering for someone who does not live with me button and should navigate to Sign up to Priority Services page "<email>"
    When User fills Who are you registering on behalf of? section details "<AccountNumber2>", "<ccbUsername>" & "<ccbPwd>"
    Then User clicks on Yes button for Does the person you are registering pay a Northumbrian Water bill? section
    When User clicks on Yes button for Would you like to be a nominated contact for this account? section
    When User clicks on Next button and should redirected to Your Priority Services options page
    And User selects Blind option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User selects Yes option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>" and selects any option for How would you like your bill? "<billOption>"
    And User selects any option for How did you hear about the priority services register? dropdown "<hearAboutPSROption>"
    Then User clicks on Next button and should redirected to PSR confirmation screen
    And User clicks on Back to priority services button and should redirected to priority services page
    And User navigates to My Profile to verify Priority Services section having Register button
    When User verifies Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies PSR Person Main tab in CC&B "<AccountNumber2>"
    And User verifies PSR Person characteristics tab in CC&B
    And User verifies PSR Person Bill route under Person portal tab in CC&B
    And User verifies PSR person Activity History Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | AccountNumber2 | circumstanceOption | pwd | billOption | hearAboutPSROption |
    #| chrome | https://td-prep.nwl.co.uk/ | katest11@yopmail.com | Test1234 | 4262050200 | allak | Monda16! | 1597940200 | 1 | Water2022 | 1 | 1 |
    | chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 7260340200 | allak | Monda16! | 0361700200 | 1 | Water2022 | 1 | 1 |
    
  @PSR @55152 @TC07 @Regression
  Scenario Outline: Verify whether customer is able to change priority services options for me (Logged In) from My Profile
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User verifies Priority Services section having Change and Remove buttons under My Profile tab
    When User clicks on Change Priority Services options button and should navigate to Your Priority Services options page
    And User unselects Blind option and selects Deaf option for Registered person affected by any of the following?
    And User selects any option for Registered person affected by any of these circumstances? "<circumstanceOption>"
    And User changes from Yes to No option for Registered person with bottled water and verify support registered person section
    And User sets password "<pwd>" and selects any option for How would you like your bill? "<billOption>"
    And User selects I consent for NWG check box
    Then User clicks on Next button and should redirected to PSR update confirmation screen
    And User clicks on Back to My Profile button and should redirected to My Profile page
    And User verifies Priority Services section having Change and Remove buttons
    When User verify Customer contact characteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
    And User verifies Person Main tab in CC&B
    And User verifies Person characteristics tab in CC&B
    And User verifies Bill route under Person portal tab in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | circumstanceOption | pwd | billOption | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | 3 | Test2022 | 3 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest19@yopmail.com | Test1234 | 9182277827 | 3 | Test2022 | 3 | allak | Monda16! |
    
  @PSR @55153 @TC08 @Regression
  Scenario Outline: Verify whether customer is able to remove priority services for me (Logged In) from My Profile
    Given User open the browser "<browser>" and launch the url "<url>" 
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User verifies Priority Services section having Change and Remove buttons under My Profile tab
    When User clicks on Remove Priority Services options button and should display Are you sure? popup
    Then User clicks on Go back button and should display Priority Services section under My Profile
    When User clicks on Remove Priority Services options button and should display Are you sure? popup
    Then User clicks on Confirm button and should display Removal confirmed popup
    When User clicks on Back to My Profile button and should display Priority Services section having Register button under My Profile
    Then User verifies Account information in CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User verifies Person Main tab in CC&B
    And User verifies Person characteristics tab in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest20@yopmail.com | Test1234 | 9263529968 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest19@yopmail.com | Test1234 | 9182277827 | allak | Monda16! |
    