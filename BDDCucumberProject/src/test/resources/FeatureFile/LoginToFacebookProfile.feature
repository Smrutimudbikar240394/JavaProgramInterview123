
Feature: Facebook Profile Functionality

Scenario: Verify profile page on facebook page
Given User should login with valid credentials
When User click homepage button
And User click on more button
And User should click on profile icon
Then profile icon displayed on facebook page