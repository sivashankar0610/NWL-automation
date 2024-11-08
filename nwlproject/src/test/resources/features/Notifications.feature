Feature: Notifications - Inorder to test notification functionality

  @Notifications @TC01 @Regression @52700
  Scenario Outline: Verify whether user is able to update occupancy count via Notifications tab 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Notifications tab and should be redirected to Notifications tab
    Then User verifies Update your Occupancy section
    And User clicks on Update button then occupancy text field should be highlighted in Red
    And User provides occupancy count "<occupancy>"
    And User clicks on Update button and should not display occupancy section
    And User clicks on My Profile tab then verify occupancy
    And User verifies Occupancy count in CC&B "<AccountNumber>","<ccbUsername>","<ccbPwd>" & "<occupancy>"
    
    Examples:
    | browser | url | email | password | AccountNumber | occupancy | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | 3 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test2021 | 0744330200 | 5 | allak | Monda16! |
    
  @Notifications @TC02 @Regression @52701
  Scenario Outline: Verify whether user is able to update telephone number via Notifications tab 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Notifications tab and should be redirected to Notifications tab
    Then User verifies we need your phone number section
    And User clicks on Update button and should throws error msg
    And User provides phone number "<phoneNo>"
    And User clicks on Update button and should not display phone number section
    And User clicks on My Profile tab then verify phone number
    And User verifies Phone number in CC&B "<AccountNumber>","<ccbUsername>","<ccbPwd>" & "<phoneNo>"
    
    Examples:
    | browser | url | email | password | AccountNumber | phoneNo | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | 07345657889 | allak | Monda16! |
    
  @Notifications @TC03 @Regression @52702
  Scenario Outline: Verify whether Are you sure popup is displaying after clicking on Account dashboard tab without updating Occupancy count from Notifications tab
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies View button is displaying under notification alert section
    When User clicks on View button and should be redirected to Notifications tab
    Then User verifies Update your Occupancy section
    And User clicks on Update button then occupancy text field should be highlighted in Red
    And User provides occupancy count "<occupancy>"
    When User clicks on Account dashboard tab and should display Are you sure? popup
    Then User clicks on Continue button and should redirected to Account dashboard tab
    When User clicks on View button and should be redirected to Notifications tab
    Then User verifies Update your Occupancy section
    And User provides occupancy count "<occupancy>"
    When User clicks on Account dashboard tab and should display Are you sure? popup
    Then User clicks on Go back button and should redirected to Notifications tab
    And User clicks on Update button and should not display occupancy section
    And User clicks on My Profile tab then verify occupancy
    And User verifies Occupancy count in CC&B "<AccountNumber>","<ccbUsername>","<ccbPwd>" & "<occupancy>"
    
    Examples:
    | browser | url | email | password | AccountNumber | occupancy | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test@1234 | 0361700200 | 4 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test2021 | 0744330200 | 5 | allak | Monda16! |
    
  @Notifications @TC04 @Regression @52703
  Scenario Outline: Verify whether Are you sure popup is displaying after clicking on Account dashboard tab without updating telephone number from Notifications tab
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies View button is displaying under notification alert section
    When User clicks on View button and should be redirected to Notifications tab
    Then User verifies we need your phone number section
    And User clicks on Update button and should throws error msg
    And User provides phone number "<phoneNo>"
    When User clicks on Account dashboard tab and should display Are you sure? popup
    Then User clicks on Continue button and should redirected to Account dashboard tab
    When User clicks on View button and should be redirected to Notifications tab
    Then User verifies we need your phone number section
    And User provides phone number "<phoneNo>"
    When User clicks on Account dashboard tab and should display Are you sure? popup
    Then User clicks on Go back button and should navigate to Notifications tab
    And User clicks on Update button and should not display phone number section
    And User clicks on My Profile tab then verify phone number
    And User verifies Phone number in CC&B "<AccountNumber>","<ccbUsername>","<ccbPwd>" & "<phoneNo>"
    
    Examples:
    | browser | url | email | password | AccountNumber | phoneNo | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | 01345213889 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test2021 | 0744330200 | 01345567885 | allak | Monda16! |