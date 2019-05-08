$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/addcustomer/addtarffi.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "I want to  launch the launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "addtariff.i_want_to_launch_the_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the add tariff plan1",
  "keyword": "When "
});
formatter.match({
  "location": "addtariff.click_on_the_add_tariff_plan(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Mentions the add tariff details",
  "keyword": "When "
});
formatter.match({
  "location": "addtariff.mentions_the_add_tariff_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the customer output",
  "keyword": "Then "
});
formatter.match({
  "location": "addtariff.i_validate_the_customer_output()"
});
formatter.result({
  "status": "passed"
});
});