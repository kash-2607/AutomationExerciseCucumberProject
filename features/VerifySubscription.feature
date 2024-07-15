Feature: Verify Subscription

  Background:
    Given Navigate to app url
    Then Verify "home page" is visible

  Scenario: Verify Subscription in home page

    When User scrolls down to the footer
    Then Verify 'SUBSCRIPTION' is visible
    When user enters email address in input and clicks the arrow button
    Then Verify 'You have been successfully subscribed!' is visible

    Scenario: Verify Subscription in Cart page

      When User click on 'cart' button
      And User scrolls down to the footer
      Then Verify 'SUBSCRIPTION' is visible
      When user enters email address in input and clicks the arrow button
      Then Verify 'You have been successfully subscribed!' is visible
