@Regression
Feature: As a user I should be able to enter text in the text field for the button name and save my changes.

  Scenario: Navigate to Input Text Page
    Given user navigates to home page to test now
    When user clicks on Text Input after page landing page loads
    Then user is on Text Input page


    Scenario: Enter Text into Input text field
      Given the user is on Text Input field page
      And user enters "Test Button" for new button name
      When user clicks new button to change name of button
      Then button name is changed to new button name