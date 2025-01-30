Feature: Facebook login functionality

Scenario: Facebook login with valid credentials
Given User is on facebook login page
When Enter username
And  Enter password
And User click on loginbutton
Then User should be on facebook homepage


Scenario: Verify Title on Forget link page
Given User is on  facebook login page
When user click on forget password link
Then title of facebook application should display on forget password page

Scenario: Verify notification icon on facebook page
Given User should login with valid credentials
When User click homepage button
And User click on more button
And User should click on notification icon
Then Notification icon displayed on facebook page

