$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("udemy.feature");
formatter.feature({
  "line": 1,
  "name": "Book Selection In Good Read Web Application",
  "description": "",
  "id": "book-selection-in-good-read-web-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login Page",
  "description": "",
  "id": "book-selection-in-good-read-web-application;login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The GoodRead Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Follows The Sign In Tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Click The Sign In Using Email Tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Email Address With \"pradeep.cpk7015@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password With \"Books@read\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click The Sign In Tab",
  "keyword": "Then "
});
formatter.match({
  "location": "step_Definition.user_Launch_The_GoodRead_Application()"
});
formatter.result({
  "duration": 14846736000,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Follows_The_Sign_In_Tab()"
});
formatter.result({
  "duration": 6543850200,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Click_The_Sign_In_Using_Email_Tab()"
});
formatter.result({
  "duration": 1670620400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pradeep.cpk7015@gmail.com",
      "offset": 36
    }
  ],
  "location": "step_Definition.user_Enters_The_Email_Address_With(String)"
});
formatter.result({
  "duration": 292360000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books@read",
      "offset": 31
    }
  ],
  "location": "step_Definition.user_Enters_The_Password_With(String)"
});
formatter.result({
  "duration": 121122200,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Clicks_The_Sign_In_Tab()"
});
formatter.result({
  "duration": 15135960400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "book Search",
  "description": "",
  "id": "book-selection-in-good-read-web-application;book-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user Search the Book name",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Hit The Search button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Want To Read Tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "go To the My Books",
  "keyword": "Then "
});
formatter.match({
  "location": "step_Definition.user_Search_the_Book_name()"
});
formatter.result({
  "duration": 186199700,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Hit_The_Search_button()"
});
formatter.result({
  "duration": 5941497600,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Select_The_Want_To_Read_Tab()"
});
formatter.result({
  "duration": 209743800,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.go_To_the_My_Books()"
});
formatter.result({
  "duration": 10803884400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "LogOut",
  "description": "",
  "id": "book-selection-in-good-read-web-application;logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user Remove The Book Name From MyBooks",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Acknowledge The Remove Alert",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click The Profile Tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user LogOut from The Application",
  "keyword": "Then "
});
formatter.match({
  "location": "step_Definition.user_Remove_The_Book_Name_From_MyBooks()"
});
formatter.result({
  "duration": 987850500,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Acknowledge_The_Remove_Alert()"
});
formatter.result({
  "duration": 33779700,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_Click_The_Profile_Tab()"
});
formatter.result({
  "duration": 9373667900,
  "status": "passed"
});
formatter.match({
  "location": "step_Definition.user_LogOut_from_The_Application()"
});
formatter.result({
  "duration": 3564825300,
  "status": "passed"
});
});