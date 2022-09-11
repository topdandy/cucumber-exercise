#Search for printed dress, blouse and t shirts and
#assert that your searches returns the correct products

Feature: Search Product

  Background:
#    Given I am on the home page screen
#    And I Select Sign in
    Given I am on the landing screen
    And I select the signin link

  Scenario Outline: User should be able to search for products

    Given I enter search term "<query>"
    And I click a search button
    Then the search should return the correct products "<confirmation>"

  Examples:
    | query         | confirmation               |
    | printed dress | 5 results have been found. |
    | blouse        | 1 result has been found.   |
    | t shirts      | 1 result has been found.   |