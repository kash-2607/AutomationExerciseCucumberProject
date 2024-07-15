Feature: User Login
  Background:
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on "Signup Login" button
    Then Verify 'Login to your account' is visible


  Scenario: Login User with the correct email and password

    When User enter the correct email address and password
    And User click on 'login' button
    Then Verify 'Logged in as username' is visible
    When User click on 'logout' button

  Scenario: Login User with incorrect email and password

    When User enter the incorrect email address and password
    And User click on 'login' button
    Then Verify 'Your email or password is incorrect!' is visible

  Scenario: Logout User

    When User enter the correct email address and password
    And User click on 'login' button
    Then Verify 'Logged in as username' is visible
    When User click on 'logout' button
    Then Verify 'Login to your account' is visible
