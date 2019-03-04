Feature: User account information


Scenario Outline: verify account info
	Given the user is on the login page
	And I login using username "<username>" and password "<password>"
	When the user clicks on my personal information button
	Then the system should display the user's account information
	
	#Using Map
	#|First Name|name    		  |
	#|Last Name |lastname		  |
	#|Email     |aziz-8454@mail.ru|
	
	#Using Custom Type
	#this datatable connects to Examples
	|First Name |Last Name |Email     |Password  | 
	|<firstname>|<lastname>|<username>|<password>|
	
	Examples:
	|firstname    |lastname |username                        |password|
	|name		  |lastname |aziz-8454@mail.ru               |password|
	|John		  |Smith    |nitoyey@dumoac.net              |password|
	|Geraldine    |Whitehead|lectus@sociisnatoquepenatibus.rg|password|
	|Inigo        |Montoya  |vel.quam@Dones.org              |password|
	
	