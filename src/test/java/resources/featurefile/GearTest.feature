Feature: Gear  page Test
  As a user i should add products to shopping cart successfully
  @sanity @regression
  Scenario: User should add products to shopping cart successfully
    Given I am on homepage
    When I mouse hover on Gear Menu
    And I click on Bags
    And I click on product name Overnight Duffle
    And I change quantity to 3
    And I click on Add to cart button
    Then I verify text You added overnight duffle to you shopping cart
    And I click on Shopping cart link
    And I verify the product name Overnight Duffle text
    And I verify Qty is 3 text
    And I change the quantity to 5
    And I click on update shopping cart button
    Then I verify the product price