Feature: WomenPage Test
  As a user i should verify product and price name filter
  @sanity @regression
  Scenario: Verify the sort by product name filter
    Given  I am on homepage
    When I mouse hover on women menu
    And I mouse hover on Tops
    And I click on jackets
    And I select sort by filter product name
    Then I verify products name display in alphabetical order

  @smoke @regression
  Scenario: Verify the sort by product price filter
    Given  I am on homepage
    When I mouse hover on women menu
    And I mouse hover on Tops
    And I click on jackets
    And I select sort by filter price
    Then I verify products price display in low to high