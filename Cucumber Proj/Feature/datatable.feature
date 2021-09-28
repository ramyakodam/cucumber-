Feature: datatable demo
Scenario: Successful login with valid entries
Given user is on demowebshoptricentis login page
When user signs in with email and password
|kodamshanku66@gmail.com|shanku|
Then user should view logout
