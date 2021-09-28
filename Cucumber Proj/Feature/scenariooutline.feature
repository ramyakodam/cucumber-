Feature: check login with multiple data

Scenario Outline: Successful signin with valid data
Given  I am on demowebshop login page
When  I login with <email> and <password>
Then  I should see thelogout link

Examples:
 |email                                        |password|
 |kodamshanku66@gmail.com                      |shanku|
 |rekhabr1@gmail.com                           |rekhab|