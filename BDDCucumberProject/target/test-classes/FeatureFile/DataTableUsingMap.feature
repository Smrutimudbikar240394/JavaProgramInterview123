Feature: Open bank account
Scenario: Opening with nominee information using map
Given User should be at account opening page using map
When User enters following data using map

|   FN     |    LN     |    mailID      |  Mob Num    |
|   abc1   |    XYZ1   | abc1@gmail.com |  9999999999 |
|   abc2   |    XYZ2   | abc2@gmail.com |  8888888888 |
|   abc3   |    XYZ3   | abc3@gmail.com |  5555555555 |

