$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featureFile/logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout Test",
  "description": "\r\nAs a user I want to logout from orangeHRMLive",
  "id": "logout-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3678566600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on dash board page with user name \"Admin\" and password \"admin123\"",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on dash board page with user name \"Admin\" and password \"admin123\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 40
    },
    {
      "val": "admin123",
      "offset": 61
    }
  ],
  "location": "LogOutStepdefs.iAmOnDashBoardPageWithUserNameAndPassword(String,String)"
});
formatter.result({
  "duration": 2100136800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should logged out successfully",
  "description": "",
  "id": "logout-test;user-should-logged-out-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Given I am on dash board page with user name \"Admin\" and password \"admin123\""
    }
  ],
  "line": 11,
  "name": "I click on welcome admin link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on logout button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should logged out successfully and navigate to main page with text\"LOGIN Panel\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LogOutStepdefs.iClickOnWelcomeAdminLink()"
});
formatter.result({
  "duration": 1188079100,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStepdefs.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 715356300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOGIN Panel",
      "offset": 69
    }
  ],
  "location": "LogOutStepdefs.iShouldLoggedOutSuccessfullyAndNavigateToMainPageWithText(String)"
});
formatter.result({
  "duration": 82983200,
  "status": "passed"
});
formatter.after({
  "duration": 1076151700,
  "status": "passed"
});
});