#-------------------------------------------------------------------------------------------------------------
# Author : Gokul T,Janaki.U                                                               Reviewer    : Dinesh
# Date   : 07-02-2019                                                                     Reviewed On : 18-02-2019
# Last Updated By:
# Last Updated On:
# Feature Name: USGBC Leed Online - Registration
# Feature Description
# CR #1 :Add Leeds
#-------------------------------------------------------------------------------------------------------------
Feature: USGBC Leed Online Project Registration

  #Scenario-1
 @SmokeTest
  Scenario Outline: To verify the Leed online Login
    Given User has to navigate to LEED Online login page
    And User has to enter username <username> and password <password>
    And User has to check accept checkbox
    When User clicks on login button and navigate to home page
    Then User should navigate to project Details Page
    And User clicks on Create new button to navigate to in Leeds online homepage

    Examples: 
      | username              | password |
      | jaypeejay@hotmail.com | initpass |

  #Scenario-2
  @SmokeTest
  Scenario Outline: Creating Project for Leeds Online
    Given User should be in Leeds online homepage
    #-------------------------------------------------------------------------
    #Project details
    #-------------------------------------------------------------------------
    And User has to fill all the entries in project details page such as Name <Name>
    And User should select Group Certification project,Rating Systems,Unit Type
    And User should select start date
    And User should select end date
    And User should click and select Anticipated type
    And User should enter Gross floor area <Gross floor area>,Owner <Owner>,Owners Representative <Owners Representative>
    And User has to select OwnerType,Owner Country
    And User should enter the email address <email address>
    And User has to select the Project Options
    And User has to select the Project Options of previously certified
    #-------------------------------------------------------------------------
    #Previously certified project information
    #-------------------------------------------------------------------------
    And User can enter the ProjectID <ProjectID>
    #-------------------------------------------------------------------------
    #Project address
    #-------------------------------------------------------------------------
    And User enters address1 <address1> and address2 <address2>
    And User has to enter city <city>
    And User has to select Country and state
    And User has to enter postal code <postal code>
    And User has to enter geo location of latitude <latitude> and longitude <longitude>
    When User clicks on Continue Button
    Then Successfully entered the details page and user should navigate to Agreement page

    Examples: 
      | Name | Gross floor area | Owner                  | Owners Representative | email address          | ProjectID  | address1           | address2           | city     | postal code | latitude  | longitude  |
      | BDDAuto001 |             1000 | J & S Real Assets, LLC | Jancy Rani            | gokulthiru22@gmail.com | 1000159688 | 9338 Carpenter St. | 9338 Carpenter St. | Waukesha |       46526 | 41.582272 | -85.834438 |

  #Scenario-3
  @SmokeTest
  Scenario: To Verify LEED certification agreement
    Given User has to find LEED certification agreement
    And User should find all the 29 list of points
    When User wants to agree then user should click on I AGREE button
    Then User successfully registered project and user should navigate to payment page

  #Scenario-4
  #@NegativeTest
  #Scenario: To Verify USGBC LEED certification agreement
   # Given User has to verify LEED certification agreement
   # When User dont want to agree then user should click on CANCEL button
   # Then User can navigate back to LEED online page

  #Scenario-5
  @SmokeTest
  Scenario Outline: To verify USGBC LEED online payment for card
    Given User has to see Project details
    And User has to find payment type
    #-------------------------------------------------------------------------
    #Card
    #-------------------------------------------------------------------------
    And User can select credit card and card type
    And User should enter Name on card <Name on card>,Card number <Card number>,CVV <CVV>
    And User should select Expiration Month <Month> and Year <Year>
    #-------------------------------------------------------------------------
    #Billing
    #-------------------------------------------------------------------------
    And User should enter Bill to party name <Bill to party name>,Bill to party Email < Bill to party Email>
    And User should enter Address1 <Address1>,Address2 <Address2>,City <City>,Country <Country>,State <State>,Postal code <Postal code>
    #-------------------------------------------------------------------------
    #Promotional Code
    #-------------------------------------------------------------------------
    #And User can enter code <code>
    #When User should click on Refresh Total
    When User should click on SUBMIT PAYMENT
    Then User successfully entered into Receipt page

    Examples: 
      | Project details | payment type | card type  | Name on card | Card number      | CVV | Month | Year | Bill-to-party name | Bill-to-party Email    | Address1           | Address2           | City     | Country       | State   | Postalcode | code |
      | private         | credit card  | mastercard | gokul t      | 4111111111111111 | 999 |    02 | 2023 | John James p       | gokulthiru22@gmail.com | 9338 Carpenter St. | 9338 Carpenter St. | Waukesha | United States | Indiana |      46526 |      |

  #Scenario-6
 # @NegativeTest
 # Scenario Outline: To verify USGBC LEED online payment for check
   # Given User has to find Project details
   # And User has to find payment type
   # And User can select Check in payment type
    #-------------------------------------------------------------------------
    #Billing
    #-------------------------------------------------------------------------
   # And User has to enter Bill to party name <Bill to party name>,Bill to party Email <Bill to party Email>
   # And User should give Address1 <Address1>,Address2 <Address2>,City <City>,Country <Country>,State <State>,Postal code <Postal code>
    #-------------------------------------------------------------------------
    #Promotional Code
    #-------------------------------------------------------------------------
    #And User can enter code <code>
    #When User should click on Refresh Total
   # And User has to click on GENERATE INVOICE
   # Then User successfully navigated to Receipt page

   # Examples: 
   #   | Project details | Bill to party name | Bill-to-party Email    | Address1           | Address2           | City     | Country       | State   | Postal code | code             |
    #  |                 | John James p       | gokulthiru22@gmail.com | 9338 Carpenter St. | 9338 Carpenter St. | Waukesha | United States | Indiana |       46526 | 1733752986034941 |

  #Scenario-7
  @SmokeTest
  Scenario: To verify the Receipt
    Given User has to find Order Summary
    When User has to click on Print and DONE buttons
    Then User successfully created project
