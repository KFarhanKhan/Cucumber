$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Farhan/Desktop/testing/com.Calculator/src/test/resources/Feature/sendNumber.feature");
formatter.feature({
  "name": "User should send number",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the user number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "sendStepDefinition.user_should_be_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should clear the number and send send the new one",
  "keyword": "When "
});
formatter.match({
  "location": "sendStepDefinition.user_should_clear_the_number_and_send_send_the_new_one()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the new number",
  "keyword": "Then "
});
formatter.match({
  "location": "sendStepDefinition.user_should_see_the_new_number()"
});
formatter.result({
  "status": "passed"
});
});