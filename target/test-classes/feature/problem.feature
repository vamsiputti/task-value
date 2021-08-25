
Feature: Automated  Tests
Description: The purpose of this feature is to test value.
 
Scenario: verify the page balance	
	Given user is on Home Page
	When verify the right count of values appear on the screen
	And verify the values on the screen are greater than 0
	And verify the values are formatted as currencies
	And verify the total balance matches the sum of the values
  Then  the mockup results would look like assuming all steps passed 

    


 