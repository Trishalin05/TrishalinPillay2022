@Regression
Feature: Landing Page Successfully Loaded

  Scenario: Navigate to Website Successfully
    Given user navigates to home page to test now
    Then url is open successfully launched again


  Scenario: Navigate to Input Text Page
    Given user navigates to home page to test now
    When user clicks on Text Input after page landing page loads
    Then user is on Text Input page
