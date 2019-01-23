Feature:Create Facebook account
 Scenario:Create account
 	Given Account create page
 	When Enter user firstName
 	And Enter user LastName
 	And Enter Mobile Number
 	And Enter new password
 	And Select DOB
 	And Select gender
 	And Click on signUp
 	Then Account successfully created
 		