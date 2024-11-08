Feature: My Bills & Payments - Inorder to test the My Bills & Payments functionality

  @MyBillsAndPayments @MakePayment @TC01 @8675 @Regression
  Scenario Outline: Verify whether a Customer is able to make a payment using choose amount option after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    Then User verifies account balance with CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    When User clicks on Pay now button and should redirected to Pay your bill page
    Then User selects choose amount radio button and provided amount to pay "<amount>"
    When User clicks on Proceed to card payment button and should redirected to Pop your details in page
    Then User enters card details "<cardNo>", "<expiry>" and "<securityCode>"
    When User clicks on Pay now button and should redirected to confirmation page
    Then User clicks on Go back to My account button and should redirected to Account dashboard page
    When User clicks on Logout button and should be logged out
    Then User opens Activity History section in CC&B
    And User verifies Account financial history in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | amount | cardNo | expiry | securityCode |
    #| chrome | https://td-prep.nwl.co.uk/ | katest6@yopmail.com | Test1234 | 0201000200 | allak | Monda16! | 1.00 | 4263970000005262 | 12/24 | 123 |
    | chrome | https://td-prep.nwl.co.uk/ | katest6@yopmail.com | Test1234 | 0201000200 | allak | Monda16! | 1.00 | 5425230000004415 | 12/24 | 123 |
    
  @MyBillsAndPayments @MakePayment @TC02 @8720 @Regression
  Scenario Outline: Verify whether Customer is able to make a payment as full instalment - login via make a payment button
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    Then User verify account balance with CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>"
    And User clicks on Pay now button and should navigate to Pay your bill page
    When User clicks on Proceed to card payment button and should navigate to Pop your details in page
    Then User enter card details "<cardNo>", "<expiry>" and "<securityCode>"
    When User clicks on Pay now button and should navigate to confirmation page
    Then User clicks on Go back to My account button and should navigate to Account dashboard page
    When User clicks on Logout button and user should be logged out
    Then User open Activity History section in CC&B
    And User verify Account financial history in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | cardNo | expiry | securityCode |
    #| chrome | https://td-prep.nwl.co.uk/ | katest3@yopmail.com | Test1234 | 1716310200 | allak | Monda16! | 4263970000005262 | 12/24 | 123 |
    #| chrome | https://td-prep.nwl.co.uk/ | katest6@yopmail.com | Test1234 | 0201000200 | allak | Monda16! | 4263970000005262 | 12/24 | 123 |
    | chrome | https://td-prep.nwl.co.uk/ | katest6@yopmail.com | Test1234 | 0201000200 | allak | Monda16! | 5425230000004415 | 12/24 | 123 |
    
    @MyBillsAndPayments @MakePayment @TC03 @8721 @Regression
 		Scenario Outline: To verify whether user is able to make a payment on website without logging in
    Given User open the browser "<browser>" and launch the url "<url>"
    When User click on Make a Payment button and should redirected to Pay a bill page
    And User click on I dont have an online account button and should redirected to Make a payment page
    Then System gets the required information from CC&B for the account of "<AccNo>" using "<CCBEmail>" and "<CCBPwd>"
    When User enters valid user details and email "<email>"
    Then User clicks on Next button and should redirected to Quick security questions page	
		When User enters valid personal details
		Then User clicks on Next button and should redirected to Pay your bill page
		When User enters the amount to be paid as £"1.10"
		Then User click on Proceed to card payment button and should redirected to Pop your details page
		And User enters card details on the Pop your details in page
		| Fields          | Values           |
		| Card Number     | 5425230000004415 |
		| Expiry          | 12/24            |
		| Security Code   | 100              |
		| Cardholder Name | Tester           |
		When User click on pay now button and should redirected to confirmation screen
		Then User clicks on Back to HomePage button then it should be redirected to homepage
		And User opens the Activity History section in CC&B
    And User verifies the Account financial history in CC&B
		
		Examples:
    | browser | url | AccNo | CCBEmail | CCBPwd | email |
    | chrome | https://td-prep.nwl.co.uk/ | 6743440200 | allak | Monda16! | nwlautomation@yopmail.com |
    #Use unregistered account details with debit balance
    
  @MyBillsAndPayments @MakePayment @TC04 @61217 @Regression @Smoke
  Scenario Outline: Verify whether user is able to make payment via additional payment link for Direct Debit Customers after login
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User verifies Make additional payment link is displayed under Your bills and payments section
    When User clicks on Make additional payment link and should redirected to My Bills & Payments tab
    Then User verifies account balance with CC&B "<AccountNumber>","<ccbUsername>" & "<ccbPwd>" and verify Make additional payment link is displayed
    When User clicks Make additional payment link and should redirected to Pay your bill page
    And User clicks on Proceed to card payment button without entering any amount and should throws error message
    And User clicks on Proceed to card payment button after entering less than MinimumPaymentAmount and should throws error message
    And User clicks on Proceed to card payment button after entering greater than MaximumPaymentAmount and should throws error message
    And user enters amount in between MinPA and MaxPA under Make additional payment section
    When User clicks on Proceed to card payment button and should be redirected to Pop your details in page
    Then User enters card details in respective fields "<cardNo>", "<expiryMonth>", "<expiryYear>" and "<securityCode>"
    When User clicks on Pay now button and should be redirected to confirmation page
    Then User clicks on Go back to My account button and should be redirected to Account dashboard page
    When User click on Logout button and should logged out
    Then User opens Activity History section in CCB
    And User verifies Account financial history in CCB
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | amount | cardNo | expiryMonth | expiryYear | securityCode |
    | chrome | https://td-prep.nwl.co.uk/ | katest21@yopmail.com | Test@1234 | 0361700200 | allak | Monda16! | 1.00 | 5425230000004415 | 10 | 24 | 123 |
    
    
  @MyBillsAndPayments @PaymentPlan @SetupDD @TC05 @8722 @Regression
  Scenario Outline: To verify whether user is able to Set up a Direct Debit
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on View my bills and payments button and should redirected to My bills and payments page
    Then User verifies Set up a Direct Debit section under My bills and payment tab
    When User clicks on Setup Direct Debit button and should redirected to Setup Direct Debit page
    And User selects on No button for Are you the account holder field
    Then User clicks on Download a paper DDI for a metered property here link
    And User clicks on DDI PDF for an unmetered property link
    And User clicks on Adobe Acrobat Click here link
    When User selects on Yes button for Are you the account holder field
    Then User enters bank details on the Setup Direct Debit screen
    | Fields       	 | Values   |
    | Frequency      | Monthly  |
		| Name           | Tester   |
		| Sort Code      | 20 00 00 |
		| Account Id     | 55779911 |
		| paymentdate    | 1st |
    | numberOfPeople | 2 |
    When User clicks on SetupDD button and should redirected to Check your Direct Debit details page
    Then User clicks on Read the DD Guarantee link
		And User clicks on Go Back button and should redirected to Setup Direct Debit page
		When User clicks on SetupDD button and should redirected to Check your Direct Debit details page
    Then User clicks on Confirm button and should redirected to confirmation page
    When User clicks on Go Back to my account button and should redirected to account dashboard
    Then User verify Activity History section in CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User Verifies the Autopay Active Section in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd | Name |
    | chrome | https://td-prep.nwl.co.uk/ | email12@yopmail.com | Test1234 | 0327330200 | allak | Monda16! | Tester |
    #Use registered accounts with no existing payment plan
    
    
  @MyBillsAndPayments @PaymentPlan @TC06 @22505 @Regression
  Scenario Outline: Verify whether customer is able Set up a Payment Plan to Monthly payment plan
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    Then User verifies the Do you want to change how you want to pay your bill Section 
    When User clicks on Set up a payment plan button and should be redirected to Set up a payment plan page
    Then User selects the Payment date and number of people who live there "<paymentDate>" & "<numberOfPeople>"
    And User clicks on Set up a payment plan button and makes note of the confirmation number in the confirmation screen
    When User closes the Confirmation Screen and should be redirected to Set up a payment plan page
    Then User clicks on the Account Dashboard tab and should be redirected to Account Dashboard 
    When User Verifies the AccountCharacteristics in CC&B "<ccbUsername>" & "<ccbPwd>"
    Then User verifies Activity History Section in CC&B
               
    Examples:
    | browser | url | email | password | AccountNumber | paymentDate | numberOfPeople | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | kt1@yopmail.com | Test@1234 | 0257250200 | 2nd | 3 | allak | Monda16! |
    
        
  @MyBillsAndPayments @PaymentPlan @TC07 @8724 @Regression
  Scenario Outline: Verify whether instalment customer is able to change the payment plan date
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User selects payment date under next payment section "<paymentDate>"
    Then User clicks on continue button and should redirected to confirmation screen
    When User clicks on close link and should redirected to My bills and payments page
    Then User clicks on account dashboard tab and should redirected to account dashboard page
    Then User verify Activity History section in CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User verifies Account characterstics tab in CC&B
    
    Examples:
    | browser | url | email | password | AccountNumber | paymentDate | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | dd2@yopmail.com | Test1234 | 0013460200 | 31st | allak | Monda16! |
        
    
  @MyBillsAndPayments @PaymentPlan @TC08 @22859 @Regression
  Scenario Outline: Verify whether customer is able View the Bill
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    Then User Verifies Your Bills and Payment History Section 
    And User Clicks on View Bill button and Bill PDF should be opened in a new tab
               
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | net1@yopmail.com | Test@1234 | 5238560200 |
    
  @MyBillsAndPayments @RPPC @TC09 @40221 @Regression
  Scenario Outline: Verify whether user is able to request paypoint card
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies PayPoint section under My Bills and Payments tab "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    Then User clicks on Get a plastic PayPoint card button and should display Success alert popup
    And User clicks on close link and verify Get a plastic PayPoint card button should be greyed out
    And User verifies customer account characteristics in CC&B    
    
    Examples:
    | browser | url | email | password | AccountNumber | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | katest17@yopmail.com | Test1234 | 3421959440 | allak | Monda16! |
    #Use any registered customer and does not have DD
    
  @MyBillsAndPayments @TC10 @67460 @Regression @PaymentPlan
  Scenario Outline: Verify whether user is able to Change the day my Direct Debit is taken
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    And User verifies Change your direct debit section
    And User clicks on Change the day my Direct Debit is taken button and should redirected to Change the day my Direct Debit is taken page
    And User selects payment date "<paymentDate>"
    Then User clicks on Confirm button and should redirected to You have update your Direct Debit Payment date page
    And User clicks on Back to My Bills and Payments button
    And User verifies Activity history Section in CC&B "<AccountNumber>", "<ccbUsername>" & "<ccbPwd>"
    And User verifies NBB Calendar Payment Preference under Account Characteristics tab
    
    Examples:
    | browser | url | email | password | AccountNumber | paymentDate | ccbUsername | ccbPwd |
    | chrome | https://td-prep.nwl.co.uk/ | net57@yopmail.com | Test@1234 | 0412860200 | 5th | allak | Monda16! |
    
    
  @MyBillsAndPayments @TC11 @67461 @Regression @PaymentPlan
  Scenario Outline: Verify whether user is able to see Cancelled bill under My Bill & Payments tab
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    Then User scroll to Your Bills and Payment History section and clicks on Show More button
    And User verifies Cancelled text with date is displaying or not
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest17@yopmail.com | Test1234 | 3421959440 |
    
  @Netcall @TC05 @9965
  Scenario Outline: Verify whether customer is able to change the Netcall(Payment Amount)
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on My bills and payments tab and should redirected to My bills and payments page
    Then User verifies change my monthly payment amount section
    When User clicks on change my monthly payment amount button and should redirected to netcall page "<AccountNumber>"
    Then User moves the slider to change the payment amount "<email>"
    When User clicks on Done button and should redirected to confirmation screen
    Then User clicks on Back to my account button and should redirected to account dashboard tab
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | net57@yopmail.com | Test@1234 | 0412860200 |