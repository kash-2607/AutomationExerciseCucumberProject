Feature: Verify Test Cases Page

  Scenario: Verify user is navigated to test cases page successfully
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on 'Test Cases' button
    Then Verify 'test cases page' is visible
