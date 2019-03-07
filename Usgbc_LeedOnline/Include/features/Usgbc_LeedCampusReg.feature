#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena Janardhanan and Srilakshmi R                                                               Reviewer    : Kamal
# Date   : 22-02-2019                                                                                        Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name:USGBC Leed Online - Registration
# Feature Description
# CR #1 :Add Leeds
#-----------------------------------------------------------------------------------------------------------------------------------
Feature: USGBC Leed Online - Registration for Campus

#Scenario-1
@SmokeTest
Scenario Outline: To verify the Leed online Login
    Given User has to navigate to LEED Online login page
    And User has to enter username <username> and password <password>
    And User has to check accept checkbox
    When User clicks on login button and navigate to home page
    Then User should navigate to Project Details Page

    Examples: 
      | username              | password |
      | jaypeejay@hotmail.com | initpass |
      
  #Scenario-2
  @SmokeTest 
  Scenario Outline: Create a campus for Leed online
    Given User should be on registration page
    And User has to select campus from the register dropdown
    And User has to verify campus registration
    And User has to enter the Name <campusName>,Owner <Owner> and Owners Representative <Representative>
    And User has to select Owner type
    And User has to select owner country
    And User has to enter email address <email>
    #Filling the Address Details
    And User has to enter Address <Address1>,Address <Address2> and City <city>
    And User has to select Country
    And User has to select State
    And User has to enter Postal code <postalcode1>
    When User clicks Continue button
    Then User has filled the details successfully and should navigate to Agreement page

    Examples: 
      | campusName          | Owner                                   | Representative | email               | Address1 | Address2  | city   | postalcode1 | postalcode2 | postalcode3 |
      | TestProjectcampus12 | JOHN J NOLIS ARCHITECTURE AND INTERIORS |      123456789 | testleed@campus.com |      795 | E DRAGRAM | TUCSON |       98104 |       85705 |       85728 |

  #Scenario-3
   @SmokeTest
  Scenario: LEED certification agreement
    Given User has to find LEED certification agreement
    And User should find all the 29 list of points
    When User wants to agree then user should click on I AGREE button
    Then User successfully registered project and user should navigate to payment page
   
  #Scenario-4
  #Negative scenario of Agreement page
  @NegativeTest
  Scenario: Leed Online Cancel Agreement while creating campus
    Given User should be on Agreement page
    When User should click Cancel button
    Then The project creation will be canceled and user will redirect to Leeds online home page

  #Scenario-5
  #Verifying Add new Organization
  @RegressionTest
  Scenario Outline: Adding a new organization In Campus Details
    Given User should be on registration page
    And User has to select campus from the register dropdown
    When User clicks on Click Here link text
    And User has to enter organization name <orgname>,owner represenative <ownerRep>,Owner contact email <contactmail> and Website <web>
    And User has to select Industry category <category>
    And User has to select Industry SubCategory <subcategory>
    And User has to click Add button
    Then A new Organization has to be added successfully

    Examples: 
      | orgname    | ownerRep | contactmail         | web          | category              | subcategory           |
      | ExampleOrg | John     | john@exampleorg.com | www.test.com | Real Estate Providers | RE:Service Contractor |
