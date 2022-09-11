Feature: Create Account

  Background:
    Given I am on the landing screen
    And I select the signin link

  Scenario: User should to create an account
    #Given I am on the home page
    #When I click on the sign in link
    And I enter email address for new account
    And I Click the create account button
    And I enter all required details
    When I click on the register button
    Then My new account should be created successfully