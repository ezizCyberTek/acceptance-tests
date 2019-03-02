Feature: Error mesages on the login page
	
	Scenario: Invalid email
		Given the user is on the login page
		When the user tries to register an invalid email
		Then the system should display error message "Invalid email address."
		
	Scenario: blank email
		Given the user is on the login page
		When the user tries to register a blank email
		Then the system should display error message "Invalid email address."
		
	Scenario: existing email
		Given the user is on the login page
		And there is an existing user
		When the user tries to register the same email
		Then the system should display error message "An account using this email address has already been registered. Please enter a valid password or request a new one."