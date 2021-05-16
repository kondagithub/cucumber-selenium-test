$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("practise.feature");
formatter.feature({
  "line": 1,
  "name": "Automation practise",
  "description": "",
  "id": "automation-practise",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": ": Sign in to automation practise home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on automation prictise login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "navigated to Authenticationpage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "provided userName \"userName\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Provided password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "clicked on Sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "navidagated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPractiseStepdef.i_am_on_automation_prictise_login_page()"
});
formatter.result({
  "duration": 5910013000,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPractiseStepdef.click_on_Sign_in()"
});
formatter.result({
  "duration": 23000,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPractiseStepdef.navigated_to_Authenticationpage()"
});
formatter.result({
  "duration": 17300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 19
    }
  ],
  "location": "AutomationPractiseStepdef.provided_userName(String)"
});
formatter.result({
  "duration": 1429800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 19
    }
  ],
  "location": "AutomationPractiseStepdef.provided_password(String)"
});
formatter.result({
  "duration": 33900,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPractiseStepdef.clicked_on_Sign_in_button()"
});
formatter.result({
  "duration": 21100,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPractiseStepdef.navidagated_to_home_page()"
});
formatter.result({
  "duration": 578749700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Order TShirt and verify order history",
  "description": "Given: I am automation prictise home page\nThen: Choosen T-SHIRTS tab\nThen: Selected T-Shirt from search results\nAnd: Added to cart shoosen T-SHIRTS\nThen: Navigated to proceed to check out\nAnd: Clicked on proceed to checkout",
  "id": "automation-practise;order-tshirt-and-verify-order-history",
  "type": "scenario",
  "keyword": "Scenario"
});
});