$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HP.feature");
formatter.feature({
  "line": 2,
  "name": "Landing Page Successfully Loaded",
  "description": "",
  "id": "landing-page-successfully-loaded",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 8264015667,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to Website Successfully",
  "description": "",
  "id": "landing-page-successfully-loaded;navigate-to-website-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigates to home page to test now",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "url is open successfully launched again",
  "keyword": "Then "
});
formatter.match({
  "location": "AppTesting.userNavigatesToHomePageToTestNow()"
});
formatter.result({
  "duration": 50723333,
  "status": "passed"
});
formatter.match({
  "location": "AppTesting.urlIsOpenSuccessfullyLaunchedAgain()"
});
formatter.result({
  "duration": 137586291,
  "status": "passed"
});
formatter.after({
  "duration": 76366667,
  "status": "passed"
});
formatter.before({
  "duration": 6110914458,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Navigate to Input Text Page",
  "description": "",
  "id": "landing-page-successfully-loaded;navigate-to-input-text-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user navigates to home page to test now",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Text Input after page landing page loads",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user is on Text Input page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppTesting.userNavigatesToHomePageToTestNow()"
});
formatter.result({
  "duration": 160166,
  "status": "passed"
});
formatter.match({
  "location": "AppTesting.userClicksOnTextInputAfterPageLandingPageLoads()"
});
formatter.result({
  "duration": 1210997625,
  "status": "passed"
});
formatter.match({
  "location": "AppTesting.userIsOnTextInputPage()"
});
formatter.result({
  "duration": 61501708,
  "status": "passed"
});
formatter.after({
  "duration": 73977959,
  "status": "passed"
});
formatter.uri("SampleApp.feature");
formatter.feature({
  "line": 2,
  "name": "User logs into Sample Application",
  "description": "",
  "id": "user-logs-into-sample-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Log into the Sample App Successfully",
  "description": "",
  "id": "user-logs-into-sample-application;log-into-the-sample-app-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user is on Sample App field page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cUserName\u003e\" for username and \"\u003cPassword\u003e\" for password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is logged into Sample App",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-logs-into-sample-application;log-into-the-sample-app-successfully;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 11,
      "id": "user-logs-into-sample-application;log-into-the-sample-app-successfully;;1"
    },
    {
      "cells": [
        "Trishalin",
        "pwd"
      ],
      "line": 12,
      "id": "user-logs-into-sample-application;log-into-the-sample-app-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4660614083,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Log into the Sample App Successfully",
  "description": "",
  "id": "user-logs-into-sample-application;log-into-the-sample-app-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on Sample App field page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"Trishalin\" for username and \"pwd\" for password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is logged into Sample App",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleAppPageSteps.theUserIsOnSampleAppFieldPage()"
});
formatter.result({
  "duration": 1119345542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Trishalin",
      "offset": 13
    },
    {
      "val": "pwd",
      "offset": 42
    }
  ],
  "location": "SampleAppPageSteps.userEntersForUsernameAndForPassword(String,String)"
});
formatter.result({
  "duration": 333781083,
  "status": "passed"
});
formatter.match({
  "location": "SampleAppPageSteps.userClicksLoginButton()"
});
formatter.result({
  "duration": 150211875,
  "status": "passed"
});
formatter.match({
  "location": "SampleAppPageSteps.userIsLoggedIntoSampleApp()"
});
formatter.result({
  "duration": 20816917,
  "status": "passed"
});
formatter.after({
  "duration": 75490542,
  "status": "passed"
});
formatter.uri("TextInput.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I should be able to enter text in the text field for the button name and save my changes.",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-enter-text-in-the-text-field-for-the-button-name-and-save-my-changes.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 4542251625,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to Input Text Page",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-enter-text-in-the-text-field-for-the-button-name-and-save-my-changes.;navigate-to-input-text-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigates to home page to test now",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Text Input after page landing page loads",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on Text Input page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppTesting.userNavigatesToHomePageToTestNow()"
});
formatter.result({
  "duration": 96500,
  "status": "passed"
});
formatter.match({
  "location": "AppTesting.userClicksOnTextInputAfterPageLandingPageLoads()"
});
formatter.result({
  "duration": 1515360792,
  "status": "passed"
});
formatter.match({
  "location": "AppTesting.userIsOnTextInputPage()"
});
formatter.result({
  "duration": 37305000,
  "status": "passed"
});
formatter.after({
  "duration": 73841708,
  "status": "passed"
});
formatter.before({
  "duration": 6456063000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Enter Text into Input text field",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-enter-text-in-the-text-field-for-the-button-name-and-save-my-changes.;enter-text-into-input-text-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the user is on Text Input field page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters \"Test Button\" for new button name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks new button to change name of button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "button name is changed to new button name",
  "keyword": "Then "
});
formatter.match({
  "location": "TextInputPageSteps.theUserIsOnTextInputFieldPage()"
});
formatter.result({
  "duration": 1337583542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Button",
      "offset": 13
    }
  ],
  "location": "TextInputPageSteps.userEntersForNewButtonName(String)"
});
formatter.result({
  "duration": 247027959,
  "status": "passed"
});
formatter.match({
  "location": "TextInputPageSteps.userClicksNewButtonToChangeNameOfButton()"
});
formatter.result({
  "duration": 163642833,
  "status": "passed"
});
formatter.match({
  "location": "TextInputPageSteps.buttonNameIsChangedToNewButtonName()"
});
formatter.result({
  "duration": 19962416,
  "status": "passed"
});
formatter.after({
  "duration": 74474875,
  "status": "passed"
});
});