Feature: Budget Estimator - Inorder to test the Budget Estimator functionality

  @BudgetEstimator @59343 @Regression
  Scenario Outline: Verify whether Customer is able to complete budget estimator journey
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Services > Building and developing and should navigate to Building and developing page
    Then User clicks on Water Connection budget estimator button and should navigate to Water connection budget estimator page
    When User clicks on Go back button and should display Water connection budget estimator link
    Then User clicks on Water Connection budget estimator button and should navigate to Water connection budget estimator page
    When User clicks on Make an online aplication link and should redirected to Developer Services Portal page in new tab
    Then User selects option for Will the final premise be a household or non-household property? "<propertyType>"
    And User provides value for How many properties do you want to connect? "<propertiesCount>"
    And User selects option for Will you require a temporary building supply for water? "<waterSupplyOption>"
    And User provides value for Distance in meters to the middle of the nearest road from which you would like to connect? "<distance>"
    And User selects option for What is the main surface type outside of the boundary of your property? "<surfaceType>"
    And User clicks on Calculate button and should display Your budget estimation summary with values
    And User verifies Pre and Post Disclaimer section
    And User clicks on Make your aplication online button and should redirected to Developer Services Portal page in new tab
    
    
    Examples:
    | browser | url | email | password | AccountNumber | propertyType | propertiesCount | waterSupplyOption | distance | surfaceType |
    | chrome | https://td-int.nwl.co.uk/ | tus1@yopmail.com | Test1234 | 2185210100 | Household | 5 | 1 | 8 | Soil |
    
    # Property Type - Household (or) Non-Household
    # Main Surface Type - Soil/verge (or) Footpath/road