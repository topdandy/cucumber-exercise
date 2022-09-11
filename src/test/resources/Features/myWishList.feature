Feature: Adding items to cart

  Background:
    Given I am on the landing screen
    And I select the signin link

  Scenario: User should to add items and make adjustments to selections

    And I insert valid email
    And I insert valid password
    And I click the sign-in link
    When I click on my account
    And I click on my wish list
    Then I should be able navigated to selection page
    And I should be able select, change size and quantity
    When I click the add to cart
    And I click on proceed to checkout
    Then I should be able to see total price


