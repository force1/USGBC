#-------------------------------------------------------------------------------------------------------------------------------
#Authors  : Sainath                                                          Reviewer   : Sabaresh
# Date   : 22-02-2019                                                         Reviewed On : 25-02-2019
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description
# CR #1 :
#-------------------------------------------------------------------------------------------------------------------------------
Feature: Verifying the project details, edit, download and upload documents

  #Scenario-1
  @SmokeTest
  Scenario Outline: To verify Leed Online Login
    Given User has to navigate to LEED Online login page
    And User has to enter username <username> and password <password>
    And User has to check accept checkbox
    When User clicks on login button and navigate to home page
    And User clicks on Project
    Then User should navigate to Project Details Page

    Examples: 
      | username              | password |
      | jaypeejay@hotmail.com | initpass |

  #Scenario-2
  @SmokeTest
  Scenario Outline: To verify project details
    Given User should be in Project Details page
    When User has to verify project name <project name>,Registration date <Registration date>,project type <project type>
    And User has to verify rating system <rating system>,unit type <unit type>
    And User has to verify Gross floor area <Gross floor area>,Antisipated type <Antisipated type>
    And User has to verify country <country>,Address <Address>
    And User has to verify city <city>,state <state>,postal code <postal code>,geo location <geo location>
    And User has to verify PRIVATE <PRIVATE>,Affliated with Leed lab <Affliated with Leed lab>
    And User has to verify Owner <Owner>,Owners Representative <Owners Representative>,OwnerType <OwnerType>,Owner Country<Owner Country>
    And User has to verify Email address <Email address>

    Examples: 
      | project name        | Registration date | project type       | rating system            | unit type | Gross floor area | Antisipated type             | country       | Address            | city     | state     | postal code | geo location          | PRIVATE | Affiliated with Leed lab | Owner               | Owner representative | Owner type                                                | country       | Email address  |
      | v4.1 Interiors BP02 | 21 Feb 2019       | Individual Project | LEED v4.1 O+M: Interiors | IP units  | 1000 sq ft       | Airport: Distribution Center | United States | 9338 Carpenter St. | Waukesha | Wisconsin |       53186 | 41.582272, -85.834438 | no      | no                       | J & S Real AssetLLC | Jancy Rani           | Community Development Corporation or Non-profit Developer | United States | js.a@gmail.com |

  #-------------------------------------------------------------------------------------------------------------------------------------
  #Scenario-3
  @SmokeTest
  Scenario: To  Download and Upload the Change of Owner Agreement if the owner has changed
    Given User has to verify Change of Owner Agreement page
    When User clicks on download
    And User should navigate to Change of Owner Agreement form page
    And User clicks on download button
    And User should navigate to resource file page
    And User clicks on Change of Owner Agreement pdf file
    Then User has to fill the downloaded file and upload file by click on Upload Change of Owner Agreement button
    And User can see the uploaded file in project details page

  #-----------------------------------------------------------------------------------------------
  #Scenario-4
  @RegressionTest
  Scenario: To  Download and Upload the Confirmation of Primary Owners Authority if there are multiple owners
    Given User has to be navigate to the project details page
    And User has to verify Confirmation of Primary Owners Authority
    When User click on download
    And User should navigate to Confirmation of Primary Owners Authority form page
    And User click on download button
    And User should navigate to the resource file page
    And User clicks on Confirmation of Primary Owners Authority pdf file and file has to be downloaded
    Then User has to fill the downloaded file and upload file by click on Upload Confirmation of Primary Owners Authority button
    And User can see the upload file in project details page

  #----------------------------------------------------------------------------------------------------------
  #Scenario-5
  @SmokeTest
  Scenario: To edit and update  project details
    Given User sholud be in project details page
    When User has to click on edit icon
    And User can see the update project page
    And User can edit Gross floor area
    And User clicks on Update Button
    Then User can check the update details
