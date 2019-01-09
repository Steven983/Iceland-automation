Feature: Application Login

Scenario: Home page default login

Given I am on iceland login page 
When title of login page is Iceland Groceries
Then Login details are populated
Then I am clicking on sign in
Then I am on shopping page 



