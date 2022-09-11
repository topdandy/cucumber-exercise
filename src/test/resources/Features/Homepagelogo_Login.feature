
Feature: Home page and Login

  Background:
    Given I am on the landing screen
    And I select the signin link

  Scenario: User should see logo on home page and be able to login

    When I see the application logo
    And I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged i successfully


