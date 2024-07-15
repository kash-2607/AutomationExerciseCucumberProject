Feature: Testing Add to Cart Functionality
  Background:
    Given Navigate to app url
    Then Verify "home page" is visible

  Scenario: User adds two products to the cart and verifies them
    When User click on 'Products' button
    When User hovers over 'first product' and click add to cart
    And User click on 'Continue Shopping' button
    And User hovers over 'second product' and click add to cart
    And User click on 'View Cart' button
    Then Verifies both products are added to Cart
    And Verifies their prices, quantity and total price

  Scenario: Verify product quantity in cart
    When user clicks on "View Product" of the first product
    Then Verify "product detail page" is visible
    When User increase quantity to "4"
    And User click on "Add to cart" button
    And User click on 'View Cart' button
    Then Verify that product is displayed in cart page with exact quantity
