Feature:  HRM Logout Test Case

Scenario: Verify user is able to login and logout with valid user id and password
	Given browser is open and application is in login page
	When user enters user name and password
	Then home page is displayed
	Then user logout
	