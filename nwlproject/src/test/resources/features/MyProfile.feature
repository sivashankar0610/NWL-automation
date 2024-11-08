Feature: My Profile  - Inorder to test my profile functionality

  @MyProfile @TC01 @Regression @45130
  Scenario Outline: Verify whether customer is able to change password from My profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User clicks on Change my password button and should redirected to Reset password screen
    When User clicks on Cancel button and should redirected to My Profile tab
    Then User clicks on Change my password button and should redirected to Reset password screen
    When User enters old password "<password>" and new password "<newPassword>"
    Then User clicks on Save changes button and should display successs message popup
    And User clicks on Ok button and should redirected to My Profile tab
    And User click on Logout button and should be logged out
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<newPassword>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    
    Examples:
    | browser | url | email | password | AccountNumber | newPassword |
    | chrome | https://td-prep.nwl.co.uk/ | katest10@yopmail.com | Test&2222 | 0743800200 | Test&3333 |
    
    
  @MyProfile @TC02 @Regression @45131
  Scenario Outline: Verify whether customer is able to update Telephone number and Occupancy count from My profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    Then User clicks on Go back button and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    Then User clicks on Cancel button and should navigate to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    And User enters Contact number "<Telephone>" and Occupancy "<OccupancyCount>"
    Then User clicks on Save changes button and should be display successs message popup
    And User clicks on Back to My Profile button and should redirected to My Profile tab
    And User verifies Account Information in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    
    Examples:
    | browser | url | email | password | AccountNumber | Telephone | OccupancyCount | ccbUsername | ccbPwd |
    #| chrome | https://td-prep.nwl.co.uk/ | katest17@yopmail.com | Test1234 | 3421959440 | 01354756754 | 2 | allak | Monda16! |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | 01352356676 | 2 | allak | Monda16! |
    #Use any registered and measured account details
    
    
  @MyProfile @TC03 @Regression @45132
  Scenario Outline: Verify whether customer is able to update Telephone number and Occupancy count from Account Dashboard
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies About Your Account section under Account dashboard "<AccountNumber>"
    And User clicks on Update my details button and should be display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    And User enters Contact number "<Telephone>" and Occupancy "<OccupancyCount>"
    Then User clicks on Save changes button and should be display successs message popup
    And User clicks on Back to My Profile button and should redirected to My Profile tab
    And User verifies Account Information in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    
    Examples:
    | browser | url | email | password | AccountNumber | Telephone | OccupancyCount | ccbUsername | ccbPwd |
    #| chrome | https://td-prep.nwl.co.uk/ | katest17@yopmail.com | Test1234 | 3421959440 | 01428967753 | 4 | allak | Monda16! |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | 01428967753 | 4 | allak | Monda16! |
    #Use any registered and measured account details
    
    
  @MyProfile @TC04 @Regression @45133
  Scenario Outline: Verify whether customer is able to update Marketing preferences from My Profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    Then User clicks on Update marketing preferences button and should redirected to Marketing & Communications preferences page
    When User clicks on Cancel button and should be redirected to My Profile tab
    Then User clicks on Update marketing preferences button and should redirected to Marketing & Communications preferences page
    When User sets all Marketing Preferences toggles to On
    Then User clicks on Save changes button and should be displayed successs message popup
    And User clicks on Back to My Profile button and should be redirected to My Profile tab
    And User verifies My Marketing Preferences section under My Profile
    And User verifies Marketing Preferences toggles are set to On in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    When User back to My Profile tab from CC&B Screen
    Then User clicks on Update marketing preferences button and should redirected to Marketing & Communications preferences page
    When User sets all Marketing Preferences toggles from On to Off
    Then User clicks on Save changes button and should be displayed successs message popup
    And User clicks on Back to My Profile button and should be redirected to My Profile tab
    And User verifies Marketing Preferences toggles are set to Off in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    
    
  @MyProfile @TC05 @Regression @65310
  Scenario Outline: Verify whether customer is able to Switch off e-billing from My profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    Then User clicks on Go back button and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    Then User clicks on Cancel button and should navigate to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    And User verifies eBilling toggle is set to On
    And User changes eBilling toggle from On to Off
    Then User clicks on Save changes button and should be display successs message popup
    When User clicks on Back to My Profile button and verify eBilling is Off
    Then User clicks on Account dashboard and should display Want to switch to ebilling section
    And User verifies Bill route is now HH-POST in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User verifies Activity History contains EBILL_DE-REGISTER message sent
    And User go back to Account dashboard and Toggle on eBilling
    When User clicks on Ok button and Switch to eBilling section is removed from Account dashboard
    Then User clicks My Profile tab and verify eBilling is On
    And User verifies Bill route is now Email in CC&B
    And User verifies Activity History contains UPDATE_ACCOUNT_DETAILS_EBILL message sent
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    
    
  @MyProfile @TC06 @Regression @65311
  Scenario Outline: Verify whether customer is able to update Postal/Correspondence address from My profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    Then User clicks on Go back button and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    Then User clicks on Cancel button and should navigate to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    And User verifies My Address section
    And User enters new address
    | Fields | Values |
    | My Postal Address | 47 |
		| Address | Deneside |
		| Town or City | Durham |
		| Postcode | DH7 0LZ |
    Then User clicks on Save changes button and should displayed successs message popup
    When User clicks on Back to My Profile button and verify changed address is displayed
    Then User verifies new address is displayed in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    #11 Witton Drive, Spennymoor, DL16 6LU
    #16 Easby Grove, Stockton on Tees, TS17 8BU
    #47 Deneside, Lanchester, Durham, DH7 0LZ
    
    
  @MyProfile @TC07 @Regression @65312
  Scenario Outline: Verify whether customer is able to update Email address from My profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    Then User clicks on Go back button and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    Then User clicks on Cancel button and should navigate to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    And User enters new email in email address field "<newEmail>"
    Then User clicks on Save Changes button without filling Re enter new email field
    When User enters a new email address in Re enter new email field which does not match "<inCorrectEmail>"
    And User enters the correct email address in Re-enter new email field
    Then User clicks on Save changes button and should displayed Confirmation message popup
    And User clicks on Back to My Profile button and verify changed Email address is displayed
    And User click on Logout button and should be logged out
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<newEmail>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies new address is displayed in CC&B "<AccountNumber>","<ccbUsername>","<ccbPwd>" & "<newEmail>"
    And User go to Yopmail website with new email address and No verify account email link is present
    
    Examples:
    | browser | url | email | password | AccountNumber | newEmail | inCorrectEmail | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | mp3@yopmail.com | Water2022 | 0602350200 | mp1@yopmail.com | pm1@yopmail.com | allak | Monda16! |
    
    
  @MyProfile @TC08 @Regression @65313
  Scenario Outline: Verify whether customer is able to update Name from My profile
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My Profile tab and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    Then User clicks on Go back button and should redirected to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    Then User clicks on Cancel button and should navigate to My Profile tab
    And User clicks on Update my details button and should display Alert popup
    When User clicks on Confirm button and should redirected to Editable My Profile page
    And User updates first name field
    And User remove the change
    And User updates surname field
    And User selects Spelling mistake option for Reason for name change field
    And User selects Marriage or divorce option for Reason for name change field
    And User selects Other e.g. Deed Poll option and fill Please enter details for Other reason field
    Then User clicks on Save changes button and should be displayed Confirmation message popup
    And User clicks on Back to My Profile button and should navigate to My Profile tab
    And User verifies Open Pass To process link under Activity History in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User clicks on Open Pass To process link and Name change & reason displayed in the Pass To Details - Work Instruction
    
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | mimo12@yopmail.com | Test1234 | 0684070200 | allak | Monda16! |