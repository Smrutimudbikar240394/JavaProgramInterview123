Feature: Login Functionality

Scenario: Login with valid Credentials
Given User is on login page
When  User enter username
And  User enter password
And  User click on Login button
Then User should be on Homepage



Scenario: Verify Title of application
Given User is on login page
Then Title of application should be visible

