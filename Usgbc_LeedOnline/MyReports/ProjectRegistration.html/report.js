$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Usgbc_LeedPrjtReg.feature");
formatter.feature({
  "name": "USGBC Leed Online Project Registration",
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
  "name": "User should navigate to project Details Page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Create new button to navigate to in Leeds online homepage",
  "keyword": "And "
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
  "name": "User should navigate to project Details Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_navigate_to_Project_Details_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Create new button to navigate to in Leeds online homepage",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_clicks_on_Create_new_button_to_navigate_to_in_Leeds_online_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Creating Project for Leeds Online",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be in Leeds online homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to fill all the entries in project details page such as Name \u003cName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should select Group Certification project,Rating Systems,Unit Type",
  "keyword": "And "
});
formatter.step({
  "name": "User should select start date",
  "keyword": "And "
});
formatter.step({
  "name": "User should select end date",
  "keyword": "And "
});
formatter.step({
  "name": "User should click and select Anticipated type",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter Gross floor area \u003cGross floor area\u003e,Owner \u003cOwner\u003e,Owners Representative \u003cOwners Representative\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select OwnerType,Owner Country",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter the email address \u003cemail address\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select the Project Options",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select the Project Options of previously certified",
  "keyword": "And "
});
formatter.step({
  "name": "User can enter the ProjectID \u003cProjectID\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User enters address1 \u003caddress1\u003e and address2 \u003caddress2\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter city \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select Country and state",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter postal code \u003cpostal code\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter geo location of latitude \u003clatitude\u003e and longitude \u003clongitude\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Continue Button",
  "keyword": "When "
});
formatter.step({
  "name": "Successfully entered the details page and user should navigate to Agreement page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Gross floor area",
        "Owner",
        "Owners Representative",
        "email address",
        "ProjectID",
        "address1",
        "address2",
        "city",
        "postal code",
        "latitude",
        "longitude"
      ]
    },
    {
      "cells": [
        "BDDAuto001",
        "1000",
        "J \u0026 S Real Assets, LLC",
        "Jancy Rani",
        "gokulthiru22@gmail.com",
        "1000159688",
        "9338 Carpenter St.",
        "9338 Carpenter St.",
        "Waukesha",
        "46526",
        "41.582272",
        "-85.834438"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating Project for Leeds Online",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be in Leeds online homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_be_in_Leeds_online_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill all the entries in project details page such as Name BDDAuto001",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_fill_all_the_entries_in_project_details_page_such_as_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Group Certification project,Rating Systems,Unit Type",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_select_Group_Certification_project_Rating_Systems_Unit_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select start date",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_select_start_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select end date",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_select_end_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click and select Anticipated type",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_click_and_select_Anticipated_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter Gross floor area 1000,Owner J \u0026 S Real Assets, LLC,Owners Representative Jancy Rani",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_enter_Gross_floor_area_Owner_Owners_Representative(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select OwnerType,Owner Country",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_select_OwnerType_Owner_Country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the email address gokulthiru22@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_enter_the_email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the Project Options",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_select_the_Project_Options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the Project Options of previously certified",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_select_the_Project_Options_of_previously_certified()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can enter the ProjectID 1000159688",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_can_enter_the_ProjectID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters address1 9338 Carpenter St. and address2 9338 Carpenter St.",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_enters_address1_and_address2(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter city Waukesha",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_enter_city(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Country and state",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_select_Country_and_state()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter postal code 46526",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_enter_postal_code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter geo location of latitude 41.582272 and longitude -85.834438",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_enter_geo_location_of_latitude_and_longitude(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Continue Button",
  "keyword": "When "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_clicks_on_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Successfully entered the details page and user should navigate to Agreement page",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.Successfully_entered_the_details_page_and_user_should_navigate_to_Agreement_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Verify LEED certification agreement",
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
formatter.scenarioOutline({
  "name": "To verify USGBC LEED online payment for card",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to see Project details",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to find payment type",
  "keyword": "And "
});
formatter.step({
  "name": "User can select credit card and card type",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter Name on card \u003cName on card\u003e,Card number \u003cCard number\u003e,CVV \u003cCVV\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should select Expiration Month \u003cMonth\u003e and Year \u003cYear\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter Bill to party name \u003cBill to party name\u003e,Bill to party Email \u003c Bill to party Email\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter Address1 \u003cAddress1\u003e,Address2 \u003cAddress2\u003e,City \u003cCity\u003e,Country \u003cCountry\u003e,State \u003cState\u003e,Postal code \u003cPostal code\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should click on SUBMIT PAYMENT",
  "keyword": "When "
});
formatter.step({
  "name": "User successfully entered into Receipt page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Project details",
        "payment type",
        "card type",
        "Name on card",
        "Card number",
        "CVV",
        "Month",
        "Year",
        "Bill-to-party name",
        "Bill-to-party Email",
        "Address1",
        "Address2",
        "City",
        "Country",
        "State",
        "Postalcode",
        "code"
      ]
    },
    {
      "cells": [
        "private",
        "credit card",
        "mastercard",
        "gokul t",
        "4111111111111111",
        "999",
        "02",
        "2023",
        "John James p",
        "gokulthiru22@gmail.com",
        "9338 Carpenter St.",
        "9338 Carpenter St.",
        "Waukesha",
        "United States",
        "Indiana",
        "46526",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify USGBC LEED online payment for card",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to see Project details",
  "keyword": "Given "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_see_Project_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to find payment type",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_find_payment_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can select credit card and card type",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_can_select_credit_card_and_card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter Name on card gokul t,Card number 4111111111111111,CVV 999",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_enter_Name_on_card_Card_number_CVV(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Expiration Month 02 and Year 2023",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_select_Expiration_Month_and_Year(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter Bill to party name \u003cBill to party name\u003e,Bill to party Email \u003c Bill to party Email\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_enter_Bill_to_party_name_Bill_to_party_Email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter Address1 9338 Carpenter St.,Address2 9338 Carpenter St.,City Waukesha,Country United States,State Indiana,Postal code \u003cPostal code\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_enter_Address1_Address2_City_Country_State_Postal_code(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on SUBMIT PAYMENT",
  "keyword": "When "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_should_click_on_SUBMIT_PAYMENT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully entered into Receipt page",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_successfully_entered_into_Receipt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Receipt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to find Order Summary",
  "keyword": "Given "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_find_Order_Summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Print and DONE buttons",
  "keyword": "When "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_has_to_click_on_Print_and_DONE_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully created project",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedPrjtRegStepDef.User_successfully_created_project()"
});
formatter.result({
  "status": "passed"
});
});