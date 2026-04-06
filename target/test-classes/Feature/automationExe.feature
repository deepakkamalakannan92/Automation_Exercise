Feature: User Registration

  Background:

  # Scenario: Register a new user successfully
  # Given user launches the browser
  # When user navigates to "http://automationexercise.com"
  # Then user verifies that home page is visible successfully
  # When user clicks on Signup / Login button
  # Then user verifies New User Signup! section is visible
  # When user enters name and email address
  # And user clicks on Signup button
  # Then user verifies ENTER ACCOUNT INFORMATION is visible
  # When user fills account details:
  # #And user fills address details:
  # And user clicks on Create Account button
  # Then user verifies ACCOUNT CREATED! is visible
  # When user clicks on Continue button
  # Then user verifies Logged in as username is visible
  # When user clicks on Delete Account button
  # Then user verifies ACCOUNT DELETED! is visible and Clicks continue button
  # Scenario: Register new user not successful
  # Given user launches the browser
  # When user navigates to "http://automationexercise.com"
  # Then user verifies that home page is visible successfully
  # When user clicks on Signup / Login button
  # And  user enters name should be in numeric and email address
  # Then user name should not be in numeric
  # Then user mail id should contain @ symbol
  # Then user mail id should not be in caps letters
  # Then user mail id should not be already exists
  Scenario Outline: Register a new user
    Given user launches the browser
    When user navigates to "http://automationexercise.com"
    Then user verifies that home page is visible successfully
    When user clicks on Signup / Login button
    Then user verifies New User Signup! section is visible
    When user enters name as "<name>" and email address as "<email>"
    And user clicks on Signup button
    Then signup should fail and get error

    Examples:
      | name     | email           |
      | 12345    |                 |
      | !@$%^7   | ASDFG@GMAIL.COM |
      |          | adcdgmail.com   |
      | DEEPAK56 | 123@gmail.com   |
