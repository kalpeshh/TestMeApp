$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "login-functionality;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "password456"
      ],
      "line": 11,
      "id": "login-functionality;login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Lalitha",
        "password123"
      ],
      "line": 12,
      "id": "login-functionality;login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"Admin\" and \"password456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFeatureStepdefinition.navigateToHomePage()"
});
formatter.result({
  "duration": 10060413000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "password456",
      "offset": 25
    }
  ],
  "location": "LoginFeatureStepdefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 2057311700,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepdefinition.userLoggedInSuccessfully()"
});
formatter.result({
  "duration": 763685600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"Lalitha\" and \"password123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFeatureStepdefinition.navigateToHomePage()"
});
formatter.result({
  "duration": 5983691500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lalitha",
      "offset": 13
    },
    {
      "val": "password123",
      "offset": 27
    }
  ],
  "location": "LoginFeatureStepdefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 990820500,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepdefinition.userLoggedInSuccessfully()"
});
formatter.result({
  "duration": 11342600,
  "error_message": "java.lang.AssertionError: expected [Admin Home] but found [Home]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\r\n\tat org.testng.Assert.assertEquals(Assert.java:125)\r\n\tat org.testng.Assert.assertEquals(Assert.java:178)\r\n\tat org.testng.Assert.assertEquals(Assert.java:188)\r\n\tat Cucumber.LoginFeatureStepdefinition.userLoggedInSuccessfully(LoginFeatureStepdefinition.java:54)\r\n\tat ✽.Then user logged in successfully(LoginFeature.feature:7)\r\n",
  "status": "failed"
});
});