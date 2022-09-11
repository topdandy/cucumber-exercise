
Feature: Edit address

  Background:
    Given I am on the landing screen
    And I select the signin link


  Scenario: User should be able to add new address
    And I enter correct username
    And I enter correct password
    And I sign in
    When I click my addresses link
    And I click add a new address button
    And I fill the required fields
    When I click save button
    Then My new address should be updated successfully


  Scenario: User should be able to delete address
    And I input valid email
    And I input valid password
    And I press sign in
    When I click address link
    And I click delete button
    And I click ok on the pop-up
    Then Address is deleted successfully

