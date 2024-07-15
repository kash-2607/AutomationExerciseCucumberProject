Feature: Contact Us Form

  Scenario: Submit Contact Us Form
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    When user enters name, email, subject, and message
    And user uploads a file
    And User click on 'Submit' button
    And User click on 'accept alert' button
    Then Verify 'Success! Your details have been submitted successfully' is visible
    When User click on 'Home' button
    Then Verify "home page" is visible
