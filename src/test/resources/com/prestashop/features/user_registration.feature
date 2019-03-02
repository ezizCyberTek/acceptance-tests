Feature: User should be able to register

Scenario: User registration
	Given the user is on the login page
	And the user enters a random email
	And the user enters personal information
	|First Name| whatever |
	|Last Name | whatev   |
	|Address   | 123 m st |
	|City	   | town     |
	|Company   | CT       |
	
Scenario: Custom user registration
	Given the user is on the login page
	And the user enters a random email
	And the user enters personal info
	|First Name | Last Name | Address | City | Company |
	| whatever  | whatev    | 12 m st | town | CT      |
	
