$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/GitProjects/Usgbc_LeedOnline/Usgbc_LeedOnline/Include/features/Usgbc_LeedVerify.feature");
formatter.feature({
  "name": "Verifying the project details, edit, download and upload documents",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify Leed Online Login",
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
  "name": "User clicks on Project",
  "keyword": "And "
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
  "name": "To verify Leed Online Login",
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
  "name": "User clicks on Project",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_clicks_on_Project()"
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
  "name": "To verify project details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be in Project Details page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to verify project name \u003cproject name\u003e,Registration date \u003cRegistration date\u003e,project type \u003cproject type\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to verify rating system \u003crating system\u003e,unit type \u003cunit type\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify Gross floor area \u003cGross floor area\u003e,Antisipated type \u003cAntisipated type\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify country \u003ccountry\u003e,Address \u003cAddress\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify city \u003ccity\u003e,state \u003cstate\u003e,postal code \u003cpostal code\u003e,geo location \u003cgeo location\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify PRIVATE \u003cPRIVATE\u003e,Affliated with Leed lab \u003cAffliated with Leed lab\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify Owner \u003cOwner\u003e,Owners Representative \u003cOwners Representative\u003e,OwnerType \u003cOwnerType\u003e,Owner Country\u003cOwner Country\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to verify Email address \u003cEmail address\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "project name",
        "Registration date",
        "project type",
        "rating system",
        "unit type",
        "Gross floor area",
        "Antisipated type",
        "country",
        "Address",
        "city",
        "state",
        "postal code",
        "geo location",
        "PRIVATE",
        "Affiliated with Leed lab",
        "Owner",
        "Owner representative",
        "Owner type",
        "country",
        "Email address"
      ]
    },
    {
      "cells": [
        "v4.1 Interiors BP02",
        "21 Feb 2019",
        "Individual Project",
        "LEED v4.1 O+M: Interiors",
        "IP units",
        "1000 sq ft",
        "Airport: Distribution Center",
        "United States",
        "9338 Carpenter St.",
        "Waukesha",
        "Wisconsin",
        "53186",
        "41.582272, -85.834438",
        "no",
        "no",
        "J \u0026 S Real AssetLLC",
        "Jancy Rani",
        "Community Development Corporation or Non-profit Developer",
        "United States",
        "js.a@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify project details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be in Project Details page",
  "keyword": "Given "
});
formatter.match({
  "location": "projectdetails.User_should_be_in_Project_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify project name v4.1 Interiors BP02,Registration date 21 Feb 2019,project type Individual Project",
  "keyword": "When "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_project_name_Registration_date_project_type(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify rating system LEED v4.1 O+M: Interiors,unit type IP units",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_rating_system_unit_type(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify Gross floor area 1000 sq ft,Antisipated type Airport: Distribution Center",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_Gross_floor_area_Antisipated_type(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify country United States,Address 9338 Carpenter St.",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_country_address(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify city Waukesha,state Wisconsin,postal code 53186,geo location 41.582272, -85.834438",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_city_state_postal_code_geo_location(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify PRIVATE no,Affliated with Leed lab \u003cAffliated with Leed lab\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_PRIVATE_Affliated_with_Leed_lab(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify Owner J \u0026 S Real AssetLLC,Owners Representative \u003cOwners Representative\u003e,OwnerType \u003cOwnerType\u003e,Owner Country\u003cOwner Country\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_Owner_Owners_Representative_Ownertype_Owner_Country(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify Email address js.a@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_Email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To  Download and Upload the Change of Owner Agreement if the owner has changed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to verify Change of Owner Agreement page",
  "keyword": "Given "
});
formatter.match({
  "location": "projectdetails.User_has_to_verify_Change_of_Owner_Agreement_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on download",
  "keyword": "When "
});
formatter.match({
  "location": "projectdetails.User_clicks_on_download()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to Change of Owner Agreement form page",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_should_navigate_to_Change_of_Owner_Agreement_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on download button",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_clicks_on_download_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to resource file page",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_should_navigate_to_resource_file_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Change of Owner Agreement pdf file",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_clicks_on_Change_of_Owner_Agreement_pdf_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the downloaded file and upload file by click on Upload Change of Owner Agreement button",
  "keyword": "Then "
});
formatter.match({
  "location": "projectdetails.User_has_to_fill_the_downloaded_file_and_upload_file_by_click_on_Upload_Change_of_Owner_Agreement_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the uploaded file in project details page",
  "keyword": "And "
});
formatter.match({
  "location": "projectdetails.User_can_see_the_uploaded_file_in_project_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To edit and update  project details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User sholud be in project details page",
  "keyword": "Given "
});
formatter.match({
  "location": "Usgbc_LeedVerifyStepDef.User_sholud_be_in_project_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on edit icon",
  "keyword": "When "
});
formatter.match({
  "location": "Usgbc_LeedVerifyStepDef.User_has_to_click_on_edit_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the update project page",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedVerifyStepDef.User_can_see_the_update_project_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can edit Gross floor area",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedVerifyStepDef.User_can_edit_Gross_floor_area()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Update Button",
  "keyword": "And "
});
formatter.match({
  "location": "Usgbc_LeedVerifyStepDef.User_clicks_on_Update_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can check the update details",
  "keyword": "Then "
});
formatter.match({
  "location": "Usgbc_LeedVerifyStepDef.User_can_check_the_update_details()"
});
formatter.result({
  "status": "passed"
});
});