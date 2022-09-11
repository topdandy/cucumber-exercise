Feature: Chiffon Dress and Checkout

  Background:
    Given  I am on the landing screen
    And I select the signin link

   Scenario: User should be able to add Chiffon Dress to cart

    And  I  type in  email
    And I type valid password
    And I click sign in
    And I click on Dresses link
    When  I select on the Chiffon Dress
    And I select all necessary  criteria
    And  I click on the Add to Cart button
    And I click Proceed to Checkout
    Then A Chiffon dress in added successfully