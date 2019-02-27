@login
Feature: login
	
	@smoke @temp
	Scenario: login link
		Given the user is on the home page
		When the user clicks on Sign in link
		Then username and password fields should be displayed
	@temp	
	Scenario: Verify user name and last name
		Given the user is on the login page
		When I login using username "aziz-8454@mail.ru" and password "passwords"
		Then user's full name "name" "lastname" should be displayed
	
	@amazon_check
	Scenario: verify it goes to different site first
		Given the user amazon
		And user gets prices for "Printed Chiffon Dress"
		When the user is on the home page 
		Then the price for "Printed Chiffon Dress" should be cheaper