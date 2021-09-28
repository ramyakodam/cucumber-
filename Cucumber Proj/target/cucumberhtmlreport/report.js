$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("background.feature");
formatter.feature({
  "line": 1,
  "name": "Check title",
  "description": "",
  "id": "check-title",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "driver installed",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page of demowebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDemo.i_am_on_the_home_page_of_demowebshop()"
});
formatter.result({
  "duration": 5021032700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify title of demowebshop",
  "description": "",
  "id": "check-title;verify-title-of-demowebshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I should see that title contains \"shop\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "shop",
      "offset": 34
    }
  ],
  "location": "BackgroundDemo.i_should_see_that_title_contains(String)"
});
formatter.result({
  "duration": 442693600,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login",
  "description": "",
  "id": "verify-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "verify-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters email and password and clicks login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_login_page()"
});
formatter.result({
  "duration": 4229650600,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_email_and_password_and_clicks_login_button()"
});
formatter.result({
  "duration": 2632729600,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_see_logout_link()"
});
formatter.result({
  "duration": 1475064900,
  "status": "passed"
});
});