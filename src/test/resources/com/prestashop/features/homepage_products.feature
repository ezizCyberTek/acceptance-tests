Feature: Verify products on the home page

@temp
Scenario: verify information
	Given the user is on the home page
	Then system should display the promoted items
	And the item details should be correct
	