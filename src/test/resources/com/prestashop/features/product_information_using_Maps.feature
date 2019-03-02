Feature: Complete Product information

Scenario: Product details with map
	Given the user is on the home page
	When the user selects "Printed Summer Dress"
	Then the system should display the product information:
		|name		|Printed Summer Dress|
		|count		|1					 |
		|condition	|New				 |
		|size		|S					 |
		|price		|$28.98				 |
	
Scenario: Product details with map2
	Given the user is on the home page
	When the user selects "Printed Dress"
	Then the system should display the product information:
		|name		|Printed Dress|
		|count		|1			  |
		|condition	|New		  |
		|size		|S			  |
		|price		|$26.00		  |