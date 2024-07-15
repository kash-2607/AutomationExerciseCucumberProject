Feature: Testing place order functionality

  Scenario: Testing registered while checkout
    Given Navigate to app url
    Then Verify "home page" is visible
    When User hovers over 'first product' and click add to cart
    And User click on 'View Cart' button
    Then Verify "cart page" is visible
    When User click on "proceed to checkout button" button
    And User click on "register and login" button
    When User enter name and email address
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
    When User click on "cart" button
    When User click on "proceed to checkout button" button
    Then User review the Order
    And




