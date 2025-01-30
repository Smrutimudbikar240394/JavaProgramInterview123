Feature: Login Functionality

Scenario: Login with valid Credentials
Given User is on login page
When  User enter username like "ABC1"
And  User enter password like "XYZ"
And User enter pin like 1234
And  User click on Login button
Then User should be on Homepage