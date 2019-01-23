Feature:Login functionality
 Scenario:Login with valid credentials
	Given user is on the login page
	When Enter valid User-name "user1"
	And Enter valid password "password"
	And Click on sing-in button
	Then login should be successful
