package leedOnline
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

//import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

class Usgbc_LeedPrjtRegStepDef {

	@Then("User should navigate to project Details Page")
	public void User_should_navigate_to_Project_Details_Page(){
		//WebUI.delay(3)

		//WebUI.click(findTestObject('Object Repository/Project_Registration/Page_LEED Online/Page_LEED Online/div_Create new Project'))
	}

	@Then("User clicks on Create new button to navigate to in Leeds online homepage")
	public void User_clicks_on_Create_new_button_to_navigate_to_in_Leeds_online_homepage(){
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Project_Registration/Page_LEED Online/Page_LEED Online/div_Create new Project'))
	}


	@Given("User should be in Leeds online homepage")
	def User_should_be_in_Leeds_online_homepage(){
	}

	@Given("User has to fill all the entries in project details page such as Name (.*)")
	def User_has_to_fill_all_the_entries_in_project_details_page_such_as_Name(String Name){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Name_name'),Name)
	}


	@Given("User should select Group Certification project,Rating Systems,Unit Type")
	def User_should_select_Group_Certification_project_Rating_Systems_Unit_Type(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/span_No_checked'))
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/select_LEED v4 BDC New Constru'))
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/span_IP units_checked'))
	}
	@Given("User should select start date")
	def User_should_select_start_date(){

		WebUI.delay(3)
		((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('validBeforeDatepicker').removeAttribute('readonly',0);")
		WebElement fromdate= DriverFactory.getWebDriver().findElement(By.id("validBeforeDatepicker"));
		fromdate.clear();
		fromdate.sendKeys("01 Feb 2019");
	}
	@Given("User should select end date")
	def User_should_select_end_date(){
		WebUI.delay(3)
		((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('validAfterDatepicker').removeAttribute('readonly',0);")
		WebElement Todate= DriverFactory.getWebDriver().findElement(By.id("validAfterDatepicker"));
		Todate.clear();
		Todate.sendKeys("25 Feb 2019")
	}

	@Given("User should click and select Anticipated type")
	def User_should_click_and_select_Anticipated_type(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/calender/Page_LEED Online/select_Select project typeAirp'))
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/calender/Page_LEED Online/select_Select project typeAirp'),'Airport: Distribution Center', true)
	}
	@Given("User should enter Gross floor area (.*),Owner (.*),Owners Representative (.*)")
	def User_should_enter_Gross_floor_area_Owner_Owners_Representative(String Gross_floor_area,String Owner,String Owners_Representative){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Gross floor area_grossFo'),Gross_floor_area)

		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Owner_organization'),Owner)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_concat(Owner  s Represen'),Owners_Representative)
	}
	@Given("User has to select OwnerType,Owner Country")
	def User_has_to_select_OwnerType_Owner_Country(){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/select_Select owner typeBusine'), 'Business Improvement District', true)
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/select_Select owner typeBusine'))
	}
	@Given("User should enter the email address (.*)")
	def User_should_enter_the_email_address(String email_address){
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Email_email'),email_address)
	}
	@Given("User has to select the Project Options")
	def User_has_to_select_the_Project_Options(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_This project is private_'))
	}
	@Given("User has to select the Project Options of previously certified")
	def User_has_to_select_the_Project_Options_of_previously_certified(){
		//WebUI.click(findTestObject('Object Repository/Project_Registration/project previous/Page_LEED Online/input_This project was previou'))
	}
	@Given("User can enter the ProjectID (.*)")
	def User_can_enter_the_ProjectID(String ProjectID){

		//WebUI.setText(findTestObject('Object Repository/Project_Registration/project previous/Page_LEED Online/Page_LEED Online/input_Project ID_accessid'),ProjectID)
		//WebUI.click(findTestObject('Object Repository/Project_Registration/project previous/Page_LEED Online/Page_LEED Online/Page_LEED Online/a_Project ID_searchproject'))
	}
	@Given("User enters address1 (.*) and address2 (.*)")
	def User_enters_address1_and_address2(String address1,String address2){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Address 1_address1'),address1)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Address 2_address2'),address2)
	}
	@Given("User has to enter city (.*)")
	def User_has_to_enter_city(String city){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_City_city'),city)
	}
	@Given("User has to select Country and state")
	def User_has_to_select_Country_and_state(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/div_City'))

		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/select_AlabamaAlaskaAmerican S'))
	}
	@Given("User has to enter postal code (.*)")
	def User_has_to_enter_postal_code(String postal_code){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Postal code_postalcode'),postal_code)
	}
	@Given("User has to enter geo location of latitude (.*) and longitude (.*)")
	def User_has_to_enter_geo_location_of_latitude_and_longitude(String latitude,String longitude){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Geo location_geoLat'),latitude)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Geo location_geoLng'),longitude)
	}
	@When("User clicks on Continue Button")
	def User_clicks_on_Continue_Button(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/Detail/Page_LEED Online/input_Geo location_fActionsSub'))
	}
	@Then("Successfully entered the details page and user should navigate to Agreement page")
	def Successfully_entered_the_details_page_and_user_should_navigate_to_Agreement_page(){
	}
	@Given("User has to find LEED certification agreement")
	def User_has_to_find_LEED_certification_agreement(){
		//WebUI.delay(5)
		//WebUI.verifyElementVisible(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/p_LEED CERTIFICATION AGREEMENT (1)'))
	}
	@Given("User should find all the 29 list of points")
	def User_should_find_all_the_29_list_of_points(){
		WebUI.delay(5)

		WebUI.sendKeys(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/iframe'), Keys.chord(Keys.END))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/iframe'), Keys.chord(Keys.HOME))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/iframe'), Keys.chord(Keys.END))

		WebUI.delay(2)

		WebUI.scrollToElement(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/button_I AGREE'), 2)

		WebUI.delay(2)
	}
	@When("User wants to agree then user should click on I AGREE button")
	def User_wants_to_agree_then_user_should_click_on_I_AGREE_button(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/button_I AGREE'))
	}
	@Then("User successfully registered project and user should navigate to payment page")
	def User_successfully_registered_project_and_user_should_navigate_to_payment_page(){
	}
	//<---------------------------------------------------------------------------------------------->
	@Given("User has to verify LEED certification agreement")
	def User_has_to_verify_LEED_certification_agreement(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/p_LEED CERTIFICATION AGREEMENT (1)'))
	}
	@When("User dont want to agree then user should click on CANCEL button")
	def User_dont_want_to_agree_then_user_should_click_on_CANCEL_button(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/agrrement verifi/Page_LEED Online/a_Cancel'))
	}
	@Then("User can navigate back to LEED online page")
	def User_can_navigat_back_to_LEED_online_page(){
	}

	//<---------------------------------------------------------------------------------------------->
	@Given("User has to see Project details")
	def User_has_to_see_Project_details(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Payment type_payment_typ'))
	}
	@Given("User has to find payment type")
	def User_has_to_find_payment_type(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Payment type_payment_typ'))
	}
	@Given("User can select credit card and card type")
	def User_can_select_credit_card_and_card_type(){

		WebUI.click(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Payment type_payment_typ'))
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Card type_card_type'))

	}
	@Given("User should enter Name on card (.*),Card number (.*),CVV (.*)")
	def User_should_enter_Name_on_card_Card_number_CVV(String Name_on_card,String Card_number,String CVV){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Name on card_card-name'), 'gokul')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Card number_card-number'), '4111111111111111')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_CVV_card-cvv'), '999')
	}
	@Given("User should select Expiration Month (.*) and Year (.*)")
	def User_should_select_Expiration_Month_and_Year(String Month,String Year){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/select_01020304050607080910111'), '07', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/select_20192020202120222023202'), '2021', true)

	}
	@Given("User should enter Bill to party name (.*),Bill to party Email (.*)")
	def User_should_enter_Bill_to_party_name_Bill_to_party_Email(String Bill_to_party_name,String Bill_to_party_Email) {
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Bill-to-party name_billN'), 'john james p')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Bill-to-party email_bill'), 'gokulthiru22@gmail.com')
	}
	@Given("User should enter Address1 (.*),Address2 (.*),City (.*),Country (.*),State (.*),Postal code (.*)")
	def User_should_enter_Address1_Address2_City_Country_State_Postal_code(String Address1,String Address2,String City,String Country,String State,String Postal_code){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Address 2_address2_20'), '9338 Carpenter St.')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Address 2_address2_21'), '9338 Carpenter St.')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_City_city'), 'Waukesha')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/select_AfghanistanAland Island'),'US', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/select_AlabamaAlaskaAmerican S'),'IN ', true)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Postal code_postalcode'), '46526')
	}

	/*@Given("User can enter code (.*)")
	 def User_can_enter_code(String code){
	 //WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Code_discountcode'), '1733752986034941')
	 }
	 @When("User should click on Refresh Total")
	 def User_should_click_on_Refresh_Total(){
	 //WebUI.click(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/a_Refresh total'))
	 }*/
	@When("User should click on SUBMIT PAYMENT")
	def User_should_click_on_SUBMIT_PAYMENT(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/a_Submit Payment'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment2/Page_/span_close'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/a_Submit Payment'))
	}
	@Then("User successfully entered into Receipt page")
	def User_successfully_entered_into_Receipt_page(){


	}

	//<--------------------------------------------------------------------------------------------------------------------->
	@Given("User has to find Project details")
	def User_has_to_find_Project_details(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Credit card_payment_type'))
	}
	@Given("User can select Check in payment type")
	def User_can_select_Check_in_payment_type(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Credit card_payment_type'))
	}
	@Given("User has to enter Bill to party name (.*),Bill to party Email (.*)")
	def User_has_to_enter_Bill_to_party_name_Bill_to_party_Email(String Bill_to_party_name,String Bill_to_party_Email){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment page/Page_LEED Online/input_Bill-to-party name_billN'), 'john james p')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Bill-to-party email_bill'), 'gokulthiru22@gmail.com')
	}
	@Given("User should give Address1 (.*),Address2 (.*),City (.*),Country (.*),State (.*),Postal code (.*)")
	def User_should_give_Address1_Address2_City_Country_State_Postal_code(String Address1,String Address2,String City,String Country,String State,String Postal_code){
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Address 1_address1_1'), '9338 Carpenter St.')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Address 1_address1_2'), '9338 Carpenter St.')
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_City_city'), 'Waukesha')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/select_AfghanistanAland Island'), 'US', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/select_AlabamaAlaskaAmerican S'), 'IN ', true)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Postal code_postalcode'), '46526')
	}
	/* @Given("User has enter code (.*)")
	 def User_has_enter_code(String code){
	 WebUI.setText(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/input_Code_discountcode'), '1733752986034941')
	 }
	 @When("User has to click on Refresh Total")
	 def User_has_to_click_on_Refresh_Total(){
	 WebUI.click(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/a_Refresh total'))
	 WebUI.selectOptionByValue(null, null, false)
	 }
	 */
	@When("User has to click on GENERATE INVOICE")
	def User_has_to_click_on_GENERATE_INVOICE(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/a_Generate Invoice'))
	}
	@Then("User successfully navigated to Receipt page")
	def User_successfully_navigated_to_Receipt_page(){
		WebUI.click(findTestObject('Object Repository/Project_Registration/payment2/Page_LEED Online/a_Yes Continue'))
	}
	//<----------------------------------------------------------------------------------------------------------------------->

	@Given("User has to find Order Summary")
	def User_has_to_find_Order_Summary(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Project_Registration/Receipt/Page_LEED Online/td_v4.1 Interiors BP02'))
	}
	@When("User has to click on Print and DONE buttons")
	def User_has_to_click_on_Print_and_DONE_buttons(){
		//WebUI.click(findTestObject('Object Repository/Project_Registration/Receipt/Page_LEED Online/a_Print Order'))
		//WebUI.delay(5)
		//WebUI.switchToWindowTitle('LEED Online')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Project_Registration/Receipt/Page_LEED Online/a_Done'), 5)
		WebUI.click(findTestObject('Object Repository/Project_Registration/Receipt/Page_LEED Online/a_Done'))
	}
	@Then("User successfully created project")
	def User_successfully_created_project(){
		//WebUI.closeBrowser();
	}
}

