Feature: Verify Products and product detail

  Scenario: Verify All Products and product detail page
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on 'Products' button
    Then Verify 'ALL PRODUCTS' is visible
    And Verify 'products list' is visible
    When user clicks on 'View Product' of the first product
    Then Verify 'product detail page' is visible
    And user verifies that product details are visible: product name, category, price, availability, condition, brand

  Scenario: Search Product
    Given Navigate to app url
    Then Verify "home page" is visible
    When User click on 'Products' button
    Then Verify 'ALL PRODUCTS' is visible
    When user enters product name "tshirt" in search input and clicks the search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    And Verify 'All the products related to search' is visible