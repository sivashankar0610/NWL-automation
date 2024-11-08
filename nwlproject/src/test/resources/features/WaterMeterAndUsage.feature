Feature: Water Meter & Usage  - Inorder to test Water Meter & Usage functionality

  @WaterMeterAndUsage @SMR @TC01 @9967 @Regression
  Scenario Outline: Verify whether customer is able to submit meter reading
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Water meters & usage tab and should be redirected to Water meters & usage tab
    Then User clicks on Check my usage button and verify How much water have I used and Carrousel copy text
    When User clicks on Your usage in more detail button and should redirected to Your usage information screen
    And User clicks on Your meter readings button 
    Then User clicks on Go back button and should redirected to Water meters & Usage tab
    When User clicks on Give a meter reading button
    Then User selects I have card, letter radio button and should display meter reading alert popup
    When User clicks on Continue button and should redirected to Give a meter reading screen
    Then Verify My water meter details with CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    When User clicks on Submit Meter Reading button without provide reading then Box should highlight in Red
    Then User enters invalid meter reading and should throw error message
    When User enters valid meter reading
    Then User clicks on Submit meter reading button and it should display success message
    And User clicks on my usage in more detail button and should redirected to Water meters & usage tab
    When Verify Read History details in CC&B
    Then User verifies Activity History section in CC&B "<AccountNumber>"
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest17@yopmail.com | Test1234 | 3421959440 | allak | Monda16! |
    
    
  @WaterMeterAndUsage @TC02 @AFM @14498 @Regression
  Scenario Outline: Verify whether customer is able to complete apply for water meter journey
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Water meters & usage tab and should be redirected to Water meters & usage tab
    Then User clicks on Apply for a water meter button
    When User provides number of occupiers and clicks on Why do we ask this? button "<occupancy>"
    Then User selects no for Do you know where your external stop tap is?
    And User selects yes for Do you know where your external stop tap is?
    When User selects no for Do you live in a flat?
    Then User selects no for Do you rent your home?
    When User clicks on Terms and conditions link
    Then User clicks on submit my application button and should redirected to confirmation screen
    When User clicks on Go back to my account button and should redirected to account dashboard tab
    Then User verifies Your recent activity section under account dashboard tab
    When User verifies customer contact main tab in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Business process section in CC&B
    And User verifies Process activity history in CC&B
    And User verifies Activity History section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | occupancy | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | umka5@yopmail.com | Test1234 | 0684330200 | 4 | allak | Monda16! |
    
  @WaterMeterAndUsage @CYSMOAWM @TC03 @Regression @46454
  Scenario Outline: Verify whether user is able to update occupancy count via Water Meter & Usage tab
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Water meters & usage tab and should be redirected to Water meters & usage tab
    And User verifies Can you save money on a water meter page
    And User enters Occupancy count "<OccupancyCount>"
    Then User clicks on Update details button and should display success popup
    And User clicks Ok button and should redirected to Water meter and usage tab
    And User clicks on My Profile tab then verify occupancy count
    And User verifies Occupancy count in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    
    Examples:
    | browser | url | email | password | AccountNumber | OccupancyCount | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 1733680200 | 3 | allak | Monda16! |
    
    
  @WaterMeterAndUsage @CYSMOAWM @TC04 @Regression @46455
  Scenario Outline: Verify whether user is able to update occupancy count via Can I save money on a meter button from Account Dashboard
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies Can I save money on a meter button under My water meter section
    When User clicks on Can I save money on a meter button and should be redirected to Can you save money on a water meter page
    And User enters Occupancy count "<OccupancyCount>"
    Then User clicks on Update details button and should display success popup
    And User clicks Ok button and should redirected to Water meter and usage tab
    And User clicks on My Profile tab then verify occupancy count
    And User verifies Occupancy count in CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    
    Examples:
    | browser | url | email | password | AccountNumber | OccupancyCount | ccbUsername | ccbPwd |
    #| chrome | https://td-prep.nwl.co.uk/ | katest11@yopmail.com | Test1234 | 4262050200 | 5 | allak | Monda16! |
    | chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 1733680200 | 1 | allak | Monda16! |
    
  @WaterMeterAndUsage @CYSMOAWM @TC05 @Regression @46456
  Scenario Outline: Verify whether user is able complete Can you save money on a water meter Journey via Water Meter & Usage tab
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Water meters & usage tab and should be redirected to Water meters & usage tab
    And User verifies Can you save money on a water meter page
    And User enter Occupancy count "<OccupancyCount>"
    And User fills your household fields
    | Fields       		     | Value |
    | FlushTheToilet       | 1		 |
		| TakeABath            | 5		 |
		| HaveAShower          | 1     |
		| UseTheWashingMachine | 2     |
		| FillTheKitchenSink   | 1		 |
		| UseTheDishWasher     | 3		 |
		| UseAGardenHose       | 1     |
    Then User clicks on Estimate my bill button and should display Your estimated usage section
    And User clicks on Apply for a meter button and should redirected to Apply for a water meter page
    
    Examples:
    | browser | url | email | password | AccountNumber | OccupancyCount |
    | chrome | https://td-prep.nwl.co.uk/ | katest11@yopmail.com | Test1234 | 4262050200 | 3 |
    
    
  @WaterMeterAndUsage @CYSMOAWM @TC06 @Regression @46457
  Scenario Outline: Verify whether user is able to complete Can you save money on a water meter Journey via Can I save money on a meter button from Account Dashboard
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies Can I save money on a meter button under My water meter section
    When User clicks on Can I save money on a meter button and should be redirected to Can you save money on a water meter page
    And User enter Occupancy count "<OccupancyCount>"
    And User fills your household fields
    | Fields       		     | Value |
    | FlushTheToilet       | 1		 |
		| TakeABath            | 1		 |
		| HaveAShower          | 1     |
		| UseTheWashingMachine | 1     |
		| FillTheKitchenSink   | 1		 |
		| UseTheDishWasher     | 1		 |
		| UseAGardenHose       | 1     |
    Then User clicks on Estimate my bill button and should display Your estimated usage section
    And User clicks on How can I use less water link and should redirected to Saving water page
    
    Examples:
    | browser | url | email | password | AccountNumber | OccupancyCount |
    | chrome | https://td-prep.nwl.co.uk/ | katest11@yopmail.com | Test1234 | 4262050200 | 5 |
    