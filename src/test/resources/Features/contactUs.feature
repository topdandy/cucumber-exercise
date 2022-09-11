Feature: Contact Us

  Background:
    Given I am on the landing screen

  Scenario: User should be able to make inquiries about products

    When I click on the Contact link
    And I select subject heading
    And I enter email address
    And I write a message
    When I click the send button
    Then I should get a success message
