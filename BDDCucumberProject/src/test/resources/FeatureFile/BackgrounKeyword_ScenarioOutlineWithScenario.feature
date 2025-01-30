Feature: login feature with scenario Outline



Background:
Given User in at signup page


Scenario Outline: Login to application

When User enters name  "<name>" inside form
When User enters age as "age"
And User confirm gender as "<gender>"
Then User gets created

Examples:
| name | age | gender  |
|Rahul | 34  |  Male   |
|Priti | 29  |	Female |
|Mahesh| 43  |  Male   |
|AArti | 23  | Female  |

Scenario: URL verification

Then URL contains "Login"
