Feature: Send campaign functionality

Scenario: Create campaign
Given user is at campaigns page
When user click on create campaign button
And user click on save button
Then campaign should get created
