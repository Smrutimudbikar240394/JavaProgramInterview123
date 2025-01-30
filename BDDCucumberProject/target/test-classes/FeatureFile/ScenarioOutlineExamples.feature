Feature: login feature with scenario Outline

Scenario Outline: Login to application
Given User in at signup page
When User enters name  "<name>" inside form
When User enters age as "age"
And User confirm gender as "<gender>"
Then User gets created

Examples:
| name | age | gender  |
|Rahul | 34  |  Male   |
|Priti | 29  |	Female |
|Mahesh| 43  |  Male   |
