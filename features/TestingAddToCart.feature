Feature: Testing Add to Cart Functionality

  Scenario: User adds two products to the cart and verifies them
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on 'Products' button
    When User hovers over 'first product' and click add to cart
    And User click on 'Continue Shopping' button
    And User hovers over 'second product' and click add to cart
    And User click on 'View Cart' button
    Then Verifies both products are added to Cart
    And Verifies their prices, quantity and total price