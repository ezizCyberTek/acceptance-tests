Feature: Verify product information

Background:
	Given the user is on the home page

Scenario Outline: Verify item name
	When the user selects "<product>"
	Then product page title should contain "<product>"
	And product name should be "<product>"
	And the price should be "<price>"
	
	Examples:
	|product				| price  |
	|Printed Summer Dress	| $28.98 |
	|Printed Chiffon Dress	| $16.40 |
	|Printed Dress			| $26.00 |


Scenario Outline: Verify usernames
	Given the user is on the login page
	When I login using username "<username>" and password "<password>"
	Then user's full name "<firstname>" "<lastname>" should be displayed
	
	Examples:
	|username         		| password | firstname | lastname |
	|aziz-8454@mail.ru		| password | name	   | lastname |
	|aziz346@yahoo.com		| ascccc   | John      | Smith    |
	|dczc@yahoo.com			| abc123   | John      | Smith    |
	|sdfdc@yahoo.com        | John     | Smith     | cxxZxZ   |
	|asfdaz346@yahoo.com	| abc123   | John      | Smith    |
	|aziasxcszc6@yahoo.com	| abc123   | John      | Smith    |
	


Scenario Outline: Product details with map and outline
	Given the user is on the home page
	When the user selects "<product>"
	Then the system should display the product information:
		|name		|<product>    |
		|count		|1       	  |
		|condition	|New          |
		|size		|S   		  |
		|price		|<price>	  |
	
	Examples:
	|product				| price  |
	|Printed Summer Dress	| $28.98 |
	|Printed Chiffon Dress	| $16.40 |
	|Printed Dress			| $26.00 |
	
			
Scenario Outline: Verify <page> title
	When the user is on the <page> 
	Then the title and URL should be:
		|Title|<title>|
		|Url  |<url>  |
	
	Examples:
		|page      |title			|url																			   |
		|home page |My Store   	    |http://automationpractice.com/index.php										   |
		|login page|Login - My Store|http://automationpractice.com/index.php?controller=authentication&back=my-account |
	
		
		
		
		
		
		
		
		
		
		