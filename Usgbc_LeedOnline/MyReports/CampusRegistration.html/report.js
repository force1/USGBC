$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Usgbc_LeedCampusReg.feature");
formatter.feature({
  "name": "USGBC Leed Online - Registration for Campus",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify the Leed online Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to navigate to LEED Online login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter username \u003cusername\u003e and password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to check accept checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on login button and navigate to home page",
  "keyword": "When "
});
formatter.step({
  "name": "User should navigate to Project Details Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "jaypeejay@hotmail.com",
        "initpass"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the Leed online Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to navigate to LEED Online login page",
  "keyword": "Given "
});
formatter.match({
  "location": "projectdetails.user_has_to_navigate_to_LEED_Online_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter username jaypeejay@hotmail.com and password initpass",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to check accept checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_check_accept_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button and navigate to home page",
  "keyword": "When "
});
formatter.match({
  "location": "projectdetails.User_clicks_on_login_button_and_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to Project Details Page",
  "keyword": "Then "
});
formatter.match({
  "location": "projectdetails.User_should_navigate_to_Project_Details_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create a campus for Leed online",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on registration page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select campus from the register dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify campus registration",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter the Name \u003ccampusName\u003e,Owner \u003cOwner\u003e and Owners Representative \u003cRepresentative\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select Owner type",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select owner country",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter email address \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter Address \u003cAddress1\u003e,Address \u003cAddress2\u003e and City \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select Country",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select State",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter Postal code \u003cpostalcode1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Continue button",
  "keyword": "When "
});
formatter.step({
  "name": "User has filled the details successfully and should navigate to Agreement page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "campusName",
        "Owner",
        "Representative",
        "email",
        "Address1",
        "Address2",
        "city",
        "postalcode1",
        "postalcode2",
        "postalcode3"
      ]
    },
    {
      "cells": [
        "TestProjectcampus12",
        "JOHN J NOLIS ARCHITECTURE AND INTERIORS",
        "123456789",
        "testleed@campus.com",
        "795",
        "E DRAGRAM",
        "TUCSON",
        "98104",
        "85705",
        "85728"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create a campus for Leed online",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_should_be_on_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select campus from the register dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.user_has_to_select_campus_from_the_register_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify campus registration",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.user_has_to_verify_campus_registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the Name TestProjectcampus12,Owner JOHN J NOLIS ARCHITECTURE AND INTERIORS and Owners Representative 123456789",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_enter_the_Name_Owner_and_Owners_Representative(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Owner type",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_select_Owner_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select owner country",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_select_owner_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter email address testleed@campus.com",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_enter_email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Address 795,Address E DRAGRAM and City TUCSON",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_enter_Address_Address_and_City(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Country",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_select_Country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select State",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_select_State()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Postal code 98104",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_to_enter_Postalcodes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_clicks_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has filled the details successfully and should navigate to Agreement page",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedCampusRegStepDef.User_has_filled_the_details_successfully_and_should_navigate_to_Agreement_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LEED certification agreement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to find LEED certification agreement",
  "keyword": "Given "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_find_LEED_certification_agreement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should find all the 29 list of points",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_find_all_the_29_list_of_points()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User wants to agree then user should click on I AGREE button",
  "keyword": "When "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_wants_to_agree_then_user_should_click_on_I_AGREE_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully registered project and user should navigate to payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_successfully_registered_project_and_user_should_navigate_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
});