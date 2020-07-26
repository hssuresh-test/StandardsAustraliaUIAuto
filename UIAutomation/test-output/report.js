$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/NAL_SeleniumJava_Workspace/UIAutomation/src/main/java/com/qa/feature/nabHomeloan.feature");
formatter.feature({
  "line": 1,
  "name": "NAB Home Loan enquire",
  "description": "",
  "id": "nab-home-loan-enquire",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate User is able to enquire HomeLoan",
  "description": "",
  "id": "nab-home-loan-enquire;validate-user-is-able-to-enquire-homeloan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user navigates from Home page to HomeloansPage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user traverses from HomeloansPage to EnquireHomeLoansPage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user selects HomeloansOption",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user provides homeloanEnquirer details in HomeloanFormsPage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user validates ConfirmationPage",
  "keyword": "Then "
});
formatter.match({
  "location": "NABHomePageSteps.user_opens_browser_with_url()"
});
formatter.result({
  "duration": 7230695531,
  "status": "passed"
});
formatter.match({
  "location": "NABHomePageSteps.user_is_on_Home_page()"
});
formatter.result({
  "duration": 494679372,
  "status": "passed"
});
formatter.match({
  "location": "NABHomePageSteps.user_navigates_from_Home_page_to_HomeloansPage()"
});
formatter.result({
  "duration": 6974172783,
  "status": "passed"
});
formatter.match({
  "location": "NABHomePageSteps.user_traverses_from_HomeloansPage_to_EnquireHomeLoansPage()"
});
formatter.result({
  "duration": 429652548,
  "status": "passed"
});
formatter.match({
  "location": "NABHomePageSteps.user_selects_HomeloansOption()"
});
formatter.result({
  "duration": 14314161349,
  "status": "passed"
});
formatter.match({
  "location": "NABHomePageSteps.user_provides_homeloanEnquirer_details_in_HomeloanFormsPage()"
});
formatter.result({
  "duration": 12660007841,
  "status": "passed"
});
formatter.match({
  "location": "NABHomePageSteps.user_validates_ConfirmationPage()"
});
formatter.result({
  "duration": 2226611661,
  "status": "passed"
});
});