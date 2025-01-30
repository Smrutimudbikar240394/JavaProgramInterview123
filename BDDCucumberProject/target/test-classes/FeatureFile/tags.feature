@positive
Feature: Login Functionality

	@smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be redirected to the dashboard

  @Functionality
  Scenario: Login fails with invalid credentials
    Given the user is on the login page
    When the user enters invalid username or password
    Then an error message should be displayed

 @regression
  Scenario: Login button is disabled when fields are empty
    Given the user is on the login page
    When the username and password fields are empty
    Then the login button should be disabled