$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("employee.feature");
formatter.feature({
  "line": 1,
  "name": "Employee feature",
  "description": "",
  "id": "employee-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10687029800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "Given user is on the homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user enter username as \"Admin\" and password as \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Hover over on PIM",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click on Add Employee",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    },
    {
      "val": "admin123",
      "offset": 48
    }
  ],
  "location": "EmployeeSteps.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 298101100,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 2067165500,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.hoverOverOnPIM()"
});
formatter.result({
  "duration": 182480100,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnAddEmployee()"
});
formatter.result({
  "duration": 1734398900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "to verify user should be able to assign username for existing employee with specific role",
  "description": "",
  "id": "employee-feature;to-verify-user-should-be-able-to-assign-username-for-existing-employee-with-specific-role",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user enter firstName as \"Radha\" and lastName as \"Krishna\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user upload Photo",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on create login details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enter username as \"Radha.Krishna\",password as \"Sitaram1\" and confirmPassword as \"Sitaram1\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on admin tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on add",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user select User roles",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter employeeName as\"Radha Krishna\",username as\"Radha1.Krishna\" ,password as \"Sitaram1\" and confirmPassword as \"Sitaram1\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user verify by entering username as \"Radha1.Krishna\" to search in the database",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user enter username as \"Radha1.Krishna\" and password as \"Sitaram1\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "verify user is able to login successfully with message \"Welcome Radha\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Radha",
      "offset": 25
    },
    {
      "val": "Krishna",
      "offset": 49
    }
  ],
  "location": "EmployeeSteps.userEnterFirstNameAsAndLastNameAs(String,String)"
});
formatter.result({
  "duration": 159159300,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userUploadPhoto()"
});
formatter.result({
  "duration": 34732300,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnCreateLoginDetails()"
});
formatter.result({
  "duration": 288687800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radha.Krishna",
      "offset": 24
    },
    {
      "val": "Sitaram1",
      "offset": 52
    },
    {
      "val": "Sitaram1",
      "offset": 86
    }
  ],
  "location": "EmployeeSteps.userEnterUsernameAsPasswordAsAndConfirmPasswordAs(String,String,String)"
});
formatter.result({
  "duration": 232502100,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnSaveButton()"
});
formatter.result({
  "duration": 4808365800,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.clickOnAdminTab()"
});
formatter.result({
  "duration": 1203494200,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.clickOnAdd()"
});
formatter.result({
  "duration": 569305000,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userSelectUserRoles()"
});
formatter.result({
  "duration": 393062900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radha Krishna",
      "offset": 27
    },
    {
      "val": "Radha1.Krishna",
      "offset": 54
    },
    {
      "val": "Sitaram1",
      "offset": 84
    },
    {
      "val": "Sitaram1",
      "offset": 118
    }
  ],
  "location": "EmployeeSteps.userEnterEmployeeNameAsUsernameAsPasswordAsAndConfirmPasswordAs(String,String,String,String)"
});
formatter.result({
  "duration": 533344700,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnSaveButton()"
});
formatter.result({
  "duration": 3449445500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radha1.Krishna",
      "offset": 37
    }
  ],
  "location": "EmployeeSteps.userVerifyByEnteringUsernameAsToSearchInTheDatabase(String)"
});
formatter.result({
  "duration": 73800600,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnSearchButton()"
});
formatter.result({
  "duration": 574878300,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.clickOnLogout()"
});
formatter.result({
  "duration": 2100971400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radha1.Krishna",
      "offset": 24
    },
    {
      "val": "Sitaram1",
      "offset": 57
    }
  ],
  "location": "EmployeeSteps.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 120663500,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1232261600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Radha",
      "offset": 56
    }
  ],
  "location": "EmployeeSteps.verifyUserIsAbleToLoginSuccessfullyWithMessage(String)"
});
formatter.result({
  "duration": 73742200,
  "status": "passed"
});
formatter.after({
  "duration": 20400,
  "status": "passed"
});
formatter.before({
  "duration": 9232160200,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "Given user is on the homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user enter username as \"Admin\" and password as \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Hover over on PIM",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click on Add Employee",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    },
    {
      "val": "admin123",
      "offset": 48
    }
  ],
  "location": "EmployeeSteps.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 185639600,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1860951700,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.hoverOverOnPIM()"
});
formatter.result({
  "duration": 164868600,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnAddEmployee()"
});
formatter.result({
  "duration": 1810302100,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "to verify user should able to add Employee successfully",
  "description": "",
  "id": "employee-feature;to-verify-user-should-able-to-add-employee-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user fill all the compulsory fields",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User edit personal details and fill License Expiry ,Marital Status and DOB",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user click on save button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 32,
      "value": "#   Then user verify \"Successfully Saved\" message displayed"
    }
  ],
  "line": 33,
  "name": "user click on Employee list",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user search  Employee by ID",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "verify same employee is present in data base at bottom",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeSteps.userFillAllTheCompulsoryFields()"
});
formatter.result({
  "duration": 160552900,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnSaveButton()"
});
formatter.result({
  "duration": 4187497300,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userEditPersonalDetailsAndFillLicenseExpiryMaritalStatusAndDOB()"
});
formatter.result({
  "duration": 4320383400,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnSaveButton()"
});
formatter.result({
  "duration": 3257384000,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userClickOnEmployeeList()"
});
formatter.result({
  "duration": 938893500,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.userSearchEmployeeByID()"
});
formatter.result({
  "duration": 596613600,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.verifySameEmployeeIsPresentInDataBaseAtBottom()"
});
formatter.result({
  "duration": 64022100,
  "status": "passed"
});
formatter.after({
  "duration": 24100,
  "status": "passed"
});
});