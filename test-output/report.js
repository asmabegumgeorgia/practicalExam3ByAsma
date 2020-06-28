$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ChangeColor.feature");
formatter.feature({
  "line": 1,
  "name": "Change Background color.",
  "description": "",
  "id": "change-background-color.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6964092000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "1 Sky Blue Background",
  "description": "",
  "id": "change-background-color.;1-sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "\"Set SkyBlue Background\" button exists in the page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on the button to change background to skyblue",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The background color should change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "ChangeBackgroundSteps.button_exists_in_the_page(String)"
});
formatter.result({
  "duration": 222455000,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundSteps.user_click_on_the_button_to_change_background_to_skyblue()"
});
formatter.result({
  "duration": 59840100,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundSteps.the_background_color_should_change_to_sky_blue()"
});
formatter.result({
  "duration": 499300000,
  "status": "passed"
});
formatter.after({
  "duration": 604158200,
  "status": "passed"
});
formatter.before({
  "duration": 6117102900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "2 Change to White background",
  "description": "",
  "id": "change-background-color.;2-change-to-white-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "\"Set SkyWhite Background\" button exists in page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on the buttonto change background to skywhite",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The background color should change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 1
    }
  ],
  "location": "ChangeBackgroundSteps.button_exists_in_page(String)"
});
formatter.result({
  "duration": 209090300,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundSteps.user_click_on_the_buttonto_change_background_to_skywhite()"
});
formatter.result({
  "duration": 29148900,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundSteps.the_background_color_should_change_to_white()"
});
formatter.result({
  "duration": 496207900,
  "status": "passed"
});
formatter.after({
  "duration": 610351500,
  "status": "passed"
});
});