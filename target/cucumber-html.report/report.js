$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/problem.feature");
formatter.feature({
  "name": "Automated  Tests",
  "description": "Description: The purpose of this feature is to test value.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the page balance",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the right count of values appear on the screen",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the values on the screen are greater than 0",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the values are formatted as currencies",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the total balance matches the sum of the values",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the mockup results would look like assuming all steps passed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});