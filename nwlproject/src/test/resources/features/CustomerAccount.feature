Feature: Customer Account functionality - Inorder to test Customer Account scenarios in MyAccount

  @CustomerAccount @Login @TC1 @9132 @Regression
  Scenario Outline: To verify whether user is able to login into an measured account via Ribbon 
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    When User clicks on the copy button against Serial number
    Then User clicks on Check my usage button under My Water meter section and should redirected to Water meters and usage tab
    And User click on Logout button and should be logged out
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | katest4@yopmail.com | Test1234 | 0014310200 |
    #Use any registered and measured account details


  @CustomerAccount @Login @TC2 @8890 @Regression
  Scenario Outline: To verify whether user is able to login to an unmeasured account via homepage
    Given User open the browser "<browser>" and launch the url "<url>"
    When User click on homepage CTA button Log into your online account and should redirected to login tab
    And User enters correct Email "<email>" and Password "<password>"
    Then User clicks on Login button and should navigate to Account dashboard tab "<AccountNumber>"
    And User clicks on the copy button against account number
    When User clicks on View my bills and payments button and should redirected to My bills and payments page
    Then User returns to the Account Dashboard tab
    When User clicks on Can I save money on a meter? button and should be redirected to Water meters and usage page
    Then User returns to the Account Dashboard tab
    When User clicks on Update my details? button
    And User clicks on Confirm button and should be redirected to My profile page
    Then User returns to the Account Dashboard tab
    When User clicks on Find Out More button and should redirected to Download our app page
    Then User click on Logout button and should be logged out
    
    Examples:
    | browser | url | email | password | AccountNumber |
    | chrome | https://td-prep.nwl.co.uk/ | dd1@yopmail.com | Test1234 | 0000130200 |
    #Use any registered and unmeasured account details
    
  @CustomerAccount @Login @TC3 @8891 @Regression
  Scenario Outline: To verify whether system is displaying error message on typing incorrect email address
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    When User enters an incorrect email as "<incorrectEmail>" and correct password as "<correctPW>"
    Then User clicks on login button and system should display incorrect email address error message
    When User click on OK button then User should be redirected back to Login Screen
    
    Examples:
    | browser | url | incorrectEmail | correctPW |
    | chrome | https://td-prep.nwl.co.uk/ | faisalabcd@gmail.com | Water2020 |
    #Use any unregistered email address
    
  @CustomerAccount @Login @TC4 @9135 @Regression
  Scenario Outline: To verify whether user is able to login an ESW account on NWL website
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User enters correct Email "<ESWEmail>" and Password "<password>"
   	Then User clicks on login button and system should display the ESW website error message popup
		When User click on OK button then User should be redirected back to Login Screen
    
    Examples:
    | browser | url | ESWEmail | password |
    | chrome | https://td-prep.nwl.co.uk/ | jeff.buckley2017@yopmail.com | Password1 |
    #Use ESW Login credentials on NWL website or vice versa
    
  @CustomerAccount @Registration @TC5 @9131 @Regression
  Scenario Outline: To verify whether user is able to register a new online account for a measured property via ribbon (Address is not listed Account Number unknown / Payment Method Known ebilling option = No Marketing Preferences = Yes)
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    Then System gets the required information from CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters the account details on the Create an account screen "<password>"
		Then User clicks on  Create account button and System should display the success screen popup to verify the user account
		When User opens "<yopmailURL>" and enters the email address
		And User clicks on the activation mail to activate the account
		Then User should be redirected to NWL Website to enter personal details
		And User enters his personal details and click on Next button
		And User updates his market preferences and click on Next button
		When User is redirected to Dashboard then account should be activated
		Then Verify the email in CC&B
		And Verify the Web Self Service Registration in CC&B
				
		Examples:
    | browser | url | AccNo | yopmailURL | CCBEmail | CCBPw | password |
    | edge | https://td-prep.nwl.co.uk/ | 0020400200 | https://yopmail.com/en/ | allak | Monda16! | Test@1234 |
    #Use unregistered and measured account details 
    
    
  @CustomerAccount @Registration @TC6 @8889 @Regression @Smoke
  Scenario Outline: To verify whether user is able to register a new online account for an Unmeasured property via homepage 
    Given User open the browser "<browser>" and launch the url "<url>"
    And User click on Log into your online Account CTA button in the homepage
    And User clicks Create an account tab and should redirected to Create an account tab
    Then System gets the required information from CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters the account details on the Create an account screen "<password>"		
		Then User clicks on  Create account button and System should display the success screen popup to verify the user account
		When User opens "<yopmailURL>" and enters the email address
		And User clicks on the activation mail to activate the account
		Then User should be redirected to NWL Website to enter personal details
		And User enters his personal details and click on Next button
		And User updates his market preferences and click on Next button
		When User is redirected to Dashboard then account should be activated
		Then Verify the email in CC&B
		And Verify the Web Self Service Registration in CC&B
		
		Examples:
    | browser | url | AccNo | yopmailURL | CCBEmail | CCBPw | password |
    | chrome | https://td-prep.nwl.co.uk/ | 6743440200 | https://yopmail.com/en/ | allak | Monda16! | Test@1234 |
    #Use unregistered and unmeasured account details 
    
  @CustomerAccount @Registration @TC7 @9146 @Regression 
  Scenario Outline: To verify whether user is able to register a new online account via Ribbon (Account Number unknown / Payment Method unknown)
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    Then System gets the required information from CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters the account details on the Create an account screen "<password>"		
		Then User clicks on  Create account button and System should display the success screen popup to verify the user account
		When User opens "<yopmailURL>" and enters the email address
		And User clicks on the activation mail to activate the account
		Then User should be redirected to NWL Website to enter personal details
		And User enters his personal details and click on Next button
		When User clicks on I dont know my account number link
		Then User selects the bill payment option and click on Next button
		And User selects the Move in date and click on Next Button
		And User updates his market preferences and click on the Next button
		When User is redirected to Dashboard then account should be activated
		Then Verify the email in CC&B
		And Verify the Web Self Service Registration in CC&B
		
		Examples:
    | browser | url | AccNo | yopmailURL | CCBEmail | CCBPw | password |
    | chrome | https://td-prep.nwl.co.uk/ | 0013210200 | https://yopmail.com/en/ | allak | Monda16! | Test@1234 |
    #Use unregistered and measured account details
		
  @CustomerAccount @Registration @TC8 @9137 @Regression
  Scenario Outline: To verify whether user is not able to register an existing online account in website
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    When User enters the account details that already exists in login radius and Click Create account button
    | Fields       		 | Values            			 |
    | First Name       | Jeff			        	 		 |
		| Surname          | Buckley							   |
		| Email Address    | 8545750200@yopmail.com  |
		| Password         | Test@1234        	 		 |
		| Confirm Password | Test@1234  						 |	
		Then System should display the error message popup
		When User clicks on Login button then system should redirect to Login Screen
		
		Examples:
    | browser | url |
    | chrome | https://td-prep.nwl.co.uk/ |
    #Use already registered credentials to register
		
  @CustomerAccount @Registration @TC9 @9145 @Regression
  Scenario Outline: To verify whether user is able to register a new online account in website via Not your email address? button
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    Then System gets the required information from CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters the account details on the Create an account screen "<password>"	
		Then User clicks on  Create account button and System should display the success screen popup to verify the user account
		When User clicks on Not your email address? button
		Then User should change the email address and Click Create account button
		Then System should display the success screen popup with new email address
		When User opens "<yopmailURL>" and enters email address
		And User clicks on the activation mail to activate the account
		Then User should be redirected to NWL Website to enter personal details
		And User enters his personal details and click on Next button
		And User updates his market preferences and click on Next button
		When User is redirected to Dashboard then account should be activated
		Then User verify the email in CC&B
		And Verify the Web Self Service Registration in CC&B
		
		Examples:
    | browser | url | AccNo | yopmailURL | CCBEmail | CCBPw | password |
    | chrome | https://td-prep.nwl.co.uk/ | 0012400200 | https://yopmail.com/en/ | allak | Monda16! | Test@1234 |
    #Use unregistered account details
    
    
  @CustomerAccount @Registration @TC10 @9136 @Regression
  Scenario Outline: To verify whether user is able to register a new ESW account in NWL website
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    Then System gets the required information from CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters the account details on the Create an account screen "<password>"		
		Then User clicks on  Create account button and System should display the success screen popup to verify the user account
		When User opens "<yopmailURL>" and enters the email address
		And User clicks on the activation mail to activate the account
		Then User should be redirected to NWL Website to enter personal details
		And User enters his personal details and click on Next button
		Then System should display the website error message popup
		When User clicks on OK button then user should be redirected to Help Centre page
		
		Examples:
    | browser | url | AccNo | yopmailURL | CCBEmail | CCBPw | password |
    | chrome | https://td-prep.nwl.co.uk/ | 5881110100 | https://yopmail.com/en/ | allak | Monda16! | Test@1234 |
    #Use unregistered ESW Account details on NWL website or vice versa
    
    
  @CustomerAccount @ForgotEmail @TC11 @Regression @9134 @Smoke
  Scenario Outline: To verify whether user is able to use the forgot email journey to find their login email
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    Then User clicks on I've forgotten my email or password button on the login screen and should redirected to I Forgot my password page
    And Forgot Email tab should be selected from the Forgot Something page
    When User clicks on Back to login link and should redirected to login tab
    Then User clicks on I've forgotten my email or password button on the login screen and should redirected to I Forgot my password page
    And Forgot Email tab should be selected from the Forgot Something page
    When User clicks on I dont have this information button and system should display an error message popup
    Then User clicks on OK button from the popup then System should redirect to Help Centre page
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    Then User clicks on I've forgotten my email or password button on the login screen and should redirected to I Forgot my password page
    And Forgot Email tab should be selected from the Forgot Something page
    And System gets the required informations from the CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters incorrect details in all fields
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User leaves all the fields Null
    Then User clicks on Find my email address button and red line & red error message should appear below all the fields
    When User enters correct details but leave account number NULL
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User enter correct details but leave First Name NULL
    Then User clicks on Find my email address button and red line & red text should appear below the First Name field
    When User enter correct details but leave Surname NULL
    Then User clicks on Find my email address button and red line & red text should appear below the Surname field
    When User enter correct details but leave Postcode NULL
    Then User clicks on Find my email address button and red line & red text should appear below the Postcode field
    When User enter correct details but leave Date of Birth NULL
    Then User clicks on Find my email address button and red line & red text should appear below the Date of Birth field
    When User enter correct details except for First Name
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User enter correct details except for Surname
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User enter correct details except for Postcode
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User enter correct details except for Date of Birth
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User enter correct details except for Account number
    Then User clicks on Find my email address button and system should display Email not found error message
    And User clicks on OK button and user should be redirected to Forgot Email screen
    When User enter all correct details
    Then User clicks on Find my email address button and system should display success screen with registered email address
    When User clicks on Login button then System should redirect to Login screen
    And User enters the displayed email address and password "<password>"
		Then System should get redirected to dashboard
		
		Examples:
    | browser | url | AccNo | password | CCBEmail | CCBPw |
    | chrome | https://td-prep.nwl.co.uk/ | 8545750200 | Water2022 | allak | Monda16! |
    #Use any registered account number and password 
    
  @CustomerAccount @ForgotPassword @TC12 @Regression @8892
  Scenario Outline: To verify whether user is able to use the forgot password journey to reset their password via email
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    Then User clicks on I've forgotten my email or password button on the login screen and should redirected to I Forgot my password page
    When User enters the corresponding email address "<Email>" and User clicks on Set a new password button
    Then Success screen should be displayed to reset password using the email sent
    And User clicks on OK button and user should be redirected to Login screen
    When User opens "https://yopmail.com/en/" and enters the email address "<Email>"
		And User clicks on the password reset mail to reset the password  
		When User enters a password which is less than 8 characters long "<LessThan8>"
   	Then Red line and Red text should appear against the password fields
		When User enters a password which is complete lowercase "<Lower>"
		Then Red line and Red text should appear against the password fields
		When User enters a password which is complete uppercase "<Upper>"
		Then Red line and Red text should appear against the password fields
		When User enters a password which is numbers only "<Number>"
		Then Red line and Red text should appear against the password fields
		When User enters the old password "<Old>"
		Then System should display an invalid password popup
		When User enters a password which satisfies all criteria "<CorrectPW>"
		Then System should display success screen popup
		And User clicks on OK button then user should be redirected to Login screen again
		When User enters the correct email address "<Email>" and new password "<CorrectPW>"
		Then System should get redirected to dashboard
		
		Examples:
    | browser | url | Email | LessThan8 | Lower | Upper | Number | Old | CorrectPW |
    | chrome | https://td-prep.nwl.co.uk/ | net1@yopmail.com | Wat@21 | roger@2021 | RANGE@2021 | 1234567890 | Test#9876 | Test#4567 |
    #Use any registered account details
    
  @CustomerAccount @ResendVerificationMail @TC13 @9138 @Regression @Registration
  Scenario Outline: To verify whether user is able to register a new online account using resend verification mail in website
		Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    And User clicks Create an account tab and should redirected to Create an account tab
    Then System gets the required information from CC&B for the account "<AccNo>" using "<CCBEmail>" and "<CCBPw>"
    When User enters the account details on the Create an account screen "<password>"
		Then User clicks on  Create account button and System should display the success screen popup to verify the user account
		When User clicks on Resend mail option from the popup
		Then System should display mail sent success screen popup
		When User opens "<yopmailURL>" and enters the email address
		And User clicks on the activation mail to activate the account
		Then User should be redirected to NWL Website to enter personal details
		And User enters his personal details and click on Next button
		And User updates his market preferences and click on Next button
		When User is redirected to Dashboard then account should be activated
		Then Verify the email in CC&B
		And Verify the Web Self Service Registration in CC&B
		
		Examples:
    | browser | url | AccNo | yopmailURL | CCBEmail | CCBPw | password |
    | chrome | https://td-prep.nwl.co.uk/ | 0014340200 | https://yopmail.com/en/ | allak | Monda16! | Test@1234 |
    #Use unregistered and measured account details
    
    
  @TC14 @21934
  Scenario Outline: To verify One Time Login Click
    Given User open the browser "<browser>" and launch the url "<url>"
    When User clicks on Login or Create an account from Ribbon Account and should redirected to login tab
    Then User clicks on Email me a link to log in
    And User enters an Email "<email>"
    Then User clicks on Send button
    And User clicks on Ok button
    When User opens yopmail website and enter required email address
    And User clicks on one time login mail
    Then User clicks on One click sign-in button and should redirect to Account Dashboard
 
    Examples: 
    | browser | url                       | email           |
    | chrome  |https://td-prep.nwl.co.uk/ | fdd@yopmail.com |