@Regression
Feature: User logs into Sample Application

  Scenario Outline: Log into the Sample App Successfully
    Given the user is on Sample App field page
    And user enters "<UserName>" for username and "<Password>" for password
    When user clicks login button
    Then user is logged into Sample App

    Examples:
    |UserName | Password |
    |Trishalin| pwd      |

