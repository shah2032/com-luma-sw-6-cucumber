Feature: MenPage Test
  As a user I should add product to shopping cart successfully
  @sanity @regression
  Scenario: User should add products to shopping cart successfully
    Given I am on homepage
    When I mouse hover on Men menu
    And I mouse hover on bottoms
    And I click on pants
    And I mouse hover on product name Cronus Yoga Pant and click on size 32
    And I click on black colour
    And I mouse hover on product name and click on add to cart button
    Then I verify You added Cronus Yoga Pant to your shopping cart
    And I click on Shopping Cart link
    And I verify shopping  cart text
    And I verify product name Cornus Yoga pant
    And I verify product size 32
    Then I verify product colour black