Feature: Register User
  Background:
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on "Signup Login" button
    Then Verify 'New User Signup!' is visible

  Scenario: Successful User Registration and Account Deletion

    When Enter name and email address
    And User click on 'Signup' button
    Then Verify 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title "Mr", Password "admin123@", Date of birth "10", "July", "1987"
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Fill details: First name "Admin", Last name "User", Company "Admin.ltd.", Address "House No. XX", Address2 "xx, random city", Country "India", State "U.P.", City "xyz city", Zipcode "123456", Mobile Number "1234567890"
    When User click on 'Create Account' button
    Then Verify 'ACCOUNT CREATED!' is visible
    When User click on 'Continue' button
    Then Verify 'Logged in as username' is visible
    When User click on 'Delete Account' button
    Then Verify 'ACCOUNT DELETED!' is visible

  Scenario: Register User with existing email

    When user enters name and already registered email address
    And User click on 'Signup' button
    Then verifies that the error "Email Address already exist!" is visible

