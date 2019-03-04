$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/prestashop/features/homepage_products.feature");
formatter.feature({
  "name": "Verify products on the home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system should display the promoted items",
  "keyword": "Then "
});
formatter.match({
  "location": "PromotedItemsStepDefs.system_should_display_the_promoted_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item details should be correct",
  "keyword": "And "
});
formatter.match({
  "location": "PromotedItemsStepDefs.the_item_details_should_be_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});