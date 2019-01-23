$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ramesh.biradar/eclipse-workspace/BDDautomation/src/test/resources/org/testingworld/testcase/FacebookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter valid User-name \"user1\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Enter valid password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on sing-in button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 6253654263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 23
    }
  ],
  "location": "steps.enter_valid_User_name(String)"
});
formatter.result({
  "duration": 100136534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 22
    }
  ],
  "location": "steps.enter_valid_password(String)"
});
formatter.result({
  "duration": 89874901,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_sing_in_button()"
});
formatter.result({
  "duration": 969402268,
  "status": "passed"
});
formatter.match({
  "location": "steps.login_should_be_successful()"
});
formatter.result({
  "duration": 69974,
  "status": "passed"
});
});