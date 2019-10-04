$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 5,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Initialize resources in the beginning of each scenario for Login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "neeraj4agarwal@gmail.com",
        "Neeraj4@"
      ],
      "line": 14,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Initialize resources in the beginning of each scenario for Login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters \"neeraj4agarwal@gmail.com\" and \"Neeraj4@\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.Initialize_Resources()"
});
formatter.result({
  "duration": 38142941402,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "neeraj4agarwal@gmail.com",
      "offset": 13
    },
    {
      "val": "Neeraj4@",
      "offset": 44
    }
  ],
  "location": "LoginSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 67854535,
  "error_message": "java.lang.NullPointerException\n\tat Stepdefinitions.LoginSteps.user_enters_username_and_password(LoginSteps.java:44)\n\tat ✽.Then user enters \"neeraj4agarwal@gmail.com\" and \"Neeraj4@\"(/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/src/test/java/features/login.feature:8)\n",
  "status": "failed"
});
});