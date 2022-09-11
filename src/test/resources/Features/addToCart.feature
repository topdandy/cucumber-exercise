Feature: Add To cart



  Background:
    Given I am on the landing screen
    And I select the signin link


  Scenario: Add a Product to Cart

    Given I am on the logged in page
    And I click on the WOMEN link
    And I click on the Printed Dress without orange skirt
    When I click on Add To Cart
    Then I should see a successful message
    And I click on proceed to checkout