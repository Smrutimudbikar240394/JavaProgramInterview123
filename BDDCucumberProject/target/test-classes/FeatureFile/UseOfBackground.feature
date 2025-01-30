Feature: Login Functionality


Background:
Given User is on login page
When  User enter username like "ABC1"
And  User enter password like "XYZ"
And User enter pin like 1234
And  User click on Login button


Scenario: Login with valid Credentials
Then User should be on Homepage


Scenario: Title Validation
Then get Title and verify


Scenario: Profile name validation
And User click on profile tab
Then get Profile name and validate


Scenario:Logout verification
Then logout from application
