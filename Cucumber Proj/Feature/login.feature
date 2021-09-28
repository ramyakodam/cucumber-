Feature: Verify Login

@smoke
Scenario: Successful login with valid credentials
Given User is on login page
When  User enters email and password and clicks login button
Then User should see logout link

@regression
Scenario: Un Successful login
Given we are on demowebshop login page
When user enters invalid credentials
Then user should see error message