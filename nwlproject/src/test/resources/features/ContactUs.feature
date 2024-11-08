Feature: Contact Us - Inorder to test Contact us functionality

  @ContactUs @GeneralQueryForm @TC01 @9919 @Regression
  Scenario Outline: Verify whether customer is able to submit General query contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on General Query button then enter customer details "<address>"
    And User selects Preferred contact method as ByPhone option
    And User changes Preferred contact method from ByPhone to ByEmail option
    When User clicks on submit button without filling How can we help text field
    And User fills How can we help text field "@Hello, Good morning@"
    Then User clicks on Submit button and should redirected to GQ form Confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD |
    #| chrome | https://td-dev.nwl.co.uk/ | 10, DH7 6SD |
    
    
  @ContactUs @GeneralQueryForm @TC02 @9920 @Regression @LoggedIn
  Scenario Outline: Verify whether customer is able to submit General query contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies Account dashboard details with CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    When User click on Help link from Ribbon
    Then User clicks on Contact Us button and should navigate to We are here to help page
    When User clicks on contact us form link and should navigate to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should navigate to Facebook Messenger page
    And User verify What can we help you with? section
    Then User clicks on General Query button then verify customer details "<email>"
    And User selects Preferred contact method as ByPhone option
    And User changes Preferred contact method from ByPhone to ByEmail option
    When User clicks on submit button without filling How can we help text field
    And User fills How can we help text field "@Hello, Good morning@"
    Then User clicks on Submit button and should navigate to GQ form Confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | katest17@yopmail.com | Test1234 | 3421959440 | allak | Monda16! |
    
    
  @ContactUs @MovingHomeForm @TC03 @Regression @46231-1
  Scenario Outline: Verify whether customer is able to submit Moving home contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on Moving home form button
    And User clicks on Tell us youre moving home button and should redirected to Moving home page
    And User clicks on Visit the landlord tap link and should redirected to Landlord tap page
    And User fills customer information "<address>"
    And User selects Preferred contact method as ByEmail option
    And User changes Preferred contact method from ByEmail to ByPhone option
    When User clicks on submit button without filling How can we help you? text field
    And User fills How can we help you? text field "@Hello, Good morning@"
    Then User clicks on Submit button and should redirected to MH form Confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD |
    
  @ContactUs @MovingHomeForm @TC04 @Regression @46231-2 @LoggedIn
  Scenario Outline: Verify whether customer is able to submit Moving home contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on Moving home form button
    And User click on Tell us youre moving home button and should redirected to Moving home page
    And User clicks on Visit the landlord tap link and should redirected to Landlord tap page
    And User verifies customer information with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User selects Preferred contact method as ByEmail option
    And User changes Preferred contact method from ByEmail to ByPhone option
    When User clicks on submit button without filling How can we help you? text field
    And User fills How can we help you? text field "@Hello, Good morning@"
    Then User clicks on Submit button and should navigate to MH form Confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    
  @ContactUs @ChangeOrUpdateMyPaymentPlanForm @TC05 @Regression @46231-3
  Scenario Outline: Verify whether customer is able to submit Change or Update my payment plan contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on Change or Update my payment plan form button
    And User clicks on Create an online account button and should redirected to Create an account page
    And User clicks on Find out more about the financial support available link and should redirected to Help paying my bill page
    #And User clicks on Send us a Facebook Message link and should redirected to Messenger page
    #And User clicks on Send us a message on WhatsApp link and should redirected to WhatsApp page
    And User fills customer information for PP form "<address>"
    And User selects Preferred contact method as ByEmail option for PP form
    And User changes Preferred contact method from ByEmail to ByPhone option for PP form
    When User selects Monthly option for How often would you like to pay? field "<paymentDate>"
    Then User clicks on Submit button and should be redirected to PP form confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address | paymentDate |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD | 2nd |
    
  @ContactUs @ChangeOrUpdateMyPaymentPlanForm @TC06 @Regression @46231-4 @LoggedIn
  Scenario Outline: Verify whether customer is able to submit Change or Update my payment plan contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User click on Change or Update my payment plan form button
    And User clicks on Find out more about the financial support available link and should navigate to Help paying my bill page
    #And User clicks on Send us a Facebook Message link and should navigate to Messenger page
    And User clicks on Go to my account button and should redirected to Account dasboard page
    And User verifies customer information of PP form with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User selects Preferred contact method as ByPhone option for PP form
    And User changes Preferred contact method from ByPhone to ByEmail option for PP form
    When User selects when I get my bill option for How often would you like to pay? field and add additional information "@Hello, Good morning@"
    Then User clicks on Submit button and should be navigate to PP form confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    
  @ContactUs @GiveAMeterReadingForm @TC07 @Regression @46231-5 
  Scenario Outline: Verify whether customer is able to submit Give a meter reading contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on Give a meter reading form button
    And User clicks on Download our free app button and should redirected to Download our app page
    And User clicks on Find out how to read your meter link and should redirected to How to read water meter page
    And User fills customer information for GMR form "<address>"
    And User selects Preferred contact method as ByPhone option for GMR form
    And User changes Preferred contact method from ByPhone to ByEmail option for GMR form
    When User provides other details "<yourMeterReading>", "<dateOfMeterReading>" & "<occupancy>"
    Then User clicks on Submit button and should redirected to GMR form confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address | yourMeterReading | dateOfMeterReading | occupancy |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD | 00123 | 26/01/2024 | 3 |
    
  @ContactUs @GiveAMeterReadingForm @TC08 @Regression @46231-6 @LoggedIn
  Scenario Outline: Verify whether customer is able to submit Give a meter reading contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User click on Give a meter reading form button
    And User clicks on Download our free app button and should navigate to Download our app page
    And User clicks on Find out how to read your meter link and should navigate to How to read water meter page
    And User verifies customer information of GMR form with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User selects Preferred contact method as ByEmail option for GMR form
    And User changes Preferred contact method from ByEmail to ByPhone option for GMR form
    When User provides other details "<yourMeterReading>", "<dateOfMeterReading>" & "<occupancy>"
    Then User clicks on Submit button and should navigate to GMR form confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | yourMeterReading | dateOfMeterReading | occupancy |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! | 00123 | 26/01/2024 | 3 |
    
  @ContactUs @IWantCopyOfMyBillForm @TC09 @Regression @46231-7
  Scenario Outline: Verify whether customer is able to submit I want copy of my bill contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on I want copy of my bill form button
    And User clicks on Create an online account button and should navigate to Create an account page
    And User fills customer information for IWCOMB form "<address>"
    And User selects Email option for How would you like us to send your bill? field
    And User changes from Email to Post for How would you like us to send your bill? field
    When User clicks on submit button without filling Which bills would you like us to send you? field
    And User fills Which bills would you like us to send you? field "the most recent bill"
    Then User clicks on Submit button and should redirected to IWCMB form confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD |
    
  @ContactUs @IWantCopyOfMyBillForm @TC10 @Regression @46231-8 @LoggedIn
  Scenario Outline: Verify whether customer is able to submit I want copy of my bill contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User click on I want copy of my bill form button
    And User clicks on Go to my account button and should navigate to Account dashboard page
    And User verifies customer information of IWCOMB form with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User selects Post option for How would you like us to send your bill? field
    And User changes from Post to Email for How would you like us to send your bill? field
    When User clicks on submit button without filling Which bills would you like us to send you? field
    And User fills Which bills would you like us to send you? field "the most recent bill"
    Then User clicks on Submit button and should navigate to IWCMB form confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    
  @ContactUs @UpdateMyNameForm @TC11 @Regression @46231-9
  Scenario Outline: Verify whether customer is able to submit Update my name contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on Update my name or contact details form button
    And User clicks on Create an online account button and should be navigate to Create an account page
    And User fills customer information for UMNOCD form "<address>"
    And User selects Preferred contact method as ByEmail option for UMNOCD form
    And User changes Preferred contact method from ByEmail to ByPhone option for UMNOCD form
    When User clicks on submit button without filling Please tell us about the changes field
    And User fills Please tell us about the changes field "@Hello, Good morning@"
    Then User clicks on Submit button and should redirected to UMNOCD form confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD |
    
  @ContactUs @UpdateMyNameForm @TC12 @Regression @46231-10 @LoggedIn
  Scenario Outline: Verify whether customer is able to submit Update my name contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User click on Update my name or contact details form button
    And User clicks on Go to my account button and should be redirected to Account dashboard page
    And User verifies customer information of UMNOCD form with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User selects Preferred contact method as ByPhone option for UMNOCD form
    And User changes Preferred contact method from ByPhone to ByEmail option for UMNOCD form
    When User clicks on submit button without filling Please tell us about the changes field
    And User fills Please tell us about the changes field "@Hello, Good morning@"
    Then User clicks on Submit button and should navigate to UMNOCD form confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! |
    #| chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 1733680200 | allak | Monda16! |
    
  @ContactUs @Bereavement @TC13 @Regression @46231-11
  Scenario Outline: Verify whether customer is able to submit Bereavement contact us form without login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User clicks on Bereavement form button
    And User fills customer information for Bereavements form "<address>"
    And User selects Preferred contact method as ByEmail option for Bereavement form
    And User changes Preferred contact method from ByEmail to ByPhone option for Bereavement form
    And User selects No option for Is the deceased account number and address the same as yours? field
    And User changes from No to Yes option for Is the deceased account number and address the same as yours? field "<PassedAwayDate>"
    And User fills Additional information field "@Hello, Good morning@"
    Then User clicks on Submit button and should redirected to Bereavement form confirmation page
    When User clicks on Create your online account here link and should redirected to Create an account page
    
    Examples:
    | browser | url | address | PassedAwayDate |
    | chrome | https://td-prep.nwl.co.uk/ | 10, DH7 6SD | 08/11/2023 |
    
  @ContactUs @Bereavement @TC14 @Regression @46231-12 @LoggedIn
  Scenario Outline: Verify whether customer is able to submit Bereavement contact us form after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on Help link from Ribbon
    Then User clicks on Contact Us button and should redirected to We are here to help page
    When User clicks on contact us form link and should redirected to Email us page
    #And User clicks on Get in touch on Facebook Messenger link and should redirected to Facebook Messenger page
    And User verifies What can we help you with? section
    Then User click on Bereavement form button
    And User verifies customer information of Bereavement form with CC&B "<email>","<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User selects Preferred contact method as ByPhone option for Bereavement form
    And User changes Preferred contact method from ByPhone to ByEmail option for Bereavement form
    And User selects Yes option for Is the deceased account number and address the same as yours? field
    And User changes from Yes to No option for Is the deceased account number and address the same as yours? field "<PassedAwayDate>"
    And User fills Additional information field "@Hello, Good morning@"
    Then User clicks on Submit button and should navigate to Bereavement form confirmation page
    When User clicks on Back to home page button and should navigate to NWL Home Page
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |  PassedAwayDate |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 | allak | Monda16! | 08/11/2023 |
    #| chrome | https://td-prep.nwl.co.uk/ | umka3@yopmail.com | Test1234 | 1733680200 | allak | Monda16! | 08/11/2023 |
    