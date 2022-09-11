Feature: Faded Short Sleeve T- Shirt


  Background:
    Given I am on the landing screen
    And I select the signin link



  Scenario: User should be able to add t-shirt and proceed to check-out successfully


   # Given I am on the homepage
   # And I click on the sign in link
    And I enter valid email
    And I enter a valid password
    When I select faded short sleeve T-shirt
    And I select all required criteria
    And I click on Add to Cart button
    And I click on proceed to checkout link
    Then A shirt should be added to my cart successfully




