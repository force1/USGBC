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


class Usgbc_LeedCampusRegStepDef {
	@Given("User should be on registration page")
	public void User_should_be_on_registration_page(){

		WebUI.click(findTestObject('Object Repository/Campus_Registration/createcampus/Page_LEED Online/a_Campuses'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Campus_Registration/createcampus/Page_LEED Online/a_Create new campus'))
	}
	@Given("User has to select campus from the register dropdown")
	public void user_has_to_select_campus_from_the_register_dropdown(){
		//WebUI.delay(2)
		//WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/select_CampusProject'),
		//	'https://leedonline-stg.usgbc.org/campuses/registerCampus', false)
	}
	@Given("User has to verify campus registration")
	public void user_has_to_verify_campus_registration(){
		//WebUI.verifyElementVisible(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/li_Campus Registration'))
	}
	@Given("User has to enter the Name (.*),Owner (.*) and Owners Representative (.*)")
	public void User_has_to_enter_the_Name_Owner_and_Owners_Representative(String campusName, String Owner, String Representative){
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Name_name'),50)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Name_name'), campusName)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Owner_organization'), Owner)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_concat(Owner  s Represen'), Representative)
	}
	@Given("User has to select Owner type")
	public void User_has_to_select_Owner_type(){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/Page_LEED Online/select_Select owner typeBusine'), 'Educational: College, Private',
				true)
	}
	@Given("User has to select owner country")
	public void User_has_to_select_owner_country(){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/select_AfghanistanAland Island'),
				'US', true)
	}
	@Given("User has to enter email address (.*)")
	public void User_has_to_enter_email_address(String email){
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Email_email'), email)
	}
	@Given("User has to enter Address (.*),Address (.*) and City (.*)")
	public void User_has_to_enter_Address_Address_and_City(String Address1, String Address2, String city){
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Address 1_address1'), Address1)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Address 2_address2'), Address2)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_City_city'), city)
	}
	@Given("User has to select Country")
	public void User_has_to_select_Country(){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/select_AfghanistanAland Island_2'),
				'US', true)
	}
	@Given("User has to select State")
	public void User_has_to_select_State(){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/select_AlabamaAlaskaAmerican S'),
				'AK ', true)
	}
	@Given("User has to enter Postal code (.*)")
	public void User_has_to_enter_Postalcodes(String postalcode1){
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Postal code 1_postalcode'), postalcode1)
		//WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Postal code 2_postalcode'), postalcode2)
		//WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_log/LEED_campusReg/Page_LEED Online/input_Postal code 3_postalcode'), postalcode3)
	}
	@When("User clicks Continue button")
	public void User_clicks_Continue_button(){
		WebUI.click(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/input_Postal code 3_fActionsSu'))
	}
	@Then("User has filled the details successfully and should navigate to Agreement page")
	public void User_has_filled_the_details_successfully_and_should_navigate_to_Agreement_page(){
		//WebUI.verifyElementVisible(findTestObject("Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/td_Green Business Certificatio"))
	}

	//<------------------------------------------------------------------------------------------------------------------------------------------------>

	@Given("User should be on Agreement page")
	public void User_should_be_on_Agreement_page(){
		//WebUI.verifyElementVisible(findTestObject("Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/td_Green Business Certificatio"))
	}
	@When("User scrolls the agreement till End")
	public void User_scrolls_the_agreement_till_End(){
		//WebUI.scrollToPosition(0, 0)
		WebUI.sendKeys(findTestObject('Object Repository/Campus_Registration/Page_LEED Online/iframe'), Keys.chord(Keys.END))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Campus_Registration/Page_LEED Online/iframe'), Keys.chord(Keys.HOME))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Campus_Registration/Page_LEED Online/iframe'), Keys.chord(Keys.END))

	}
	@When("User should verify the Agree button enabled")
	public void User_should_verify_the_Agree_button_enabled(){
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedagreeepage/Page_LEED Online/button_I AGREE'), 50)
		WebUI.verifyElementClickable(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedagreeepage/Page_LEED Online/button_I AGREE'))
	}
	@When("User should click I Agree button")
	public void User_should_click_I_Agree_button(){
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedagreeepage/Page_LEED Online/button_I AGREE'))
		println "Clicked"

		WebUI.delay(15)

	}
	@Then("User has created the project successfully and has to see the project in the list")
	public void User_has_created_the_project_successfully_and_has_to_see_the_project_in_the_list(){
		WebUI.delay(5)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/Page_LEED Online/span_Campuses'))
	}
	//<----------------------------------------------------------------------------------------------------------------------------------------------------------------->

	@When("User should click Cancel button")
	public void User_should_click_Cancel_button(){
		WebUI.click(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedcampus/Page_LEED Online/a_Cancel'))
	}
	@Then("The project creation will be canceled and user will redirect to Leeds online home page")
	public void The_project_creation_will_be_canceled_and_user_will_redirect_to_Leeds_online_home_page(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/Page_LEED Online/span_Campuses'))

	}

	//<------------------------------------------------------------------------------------------------------------------------------------------------>

	@When("User clicks on Click Here link text")
	public void User_clicks_on_Click_Here_link_text(){
		WebUI.click(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/a_Click here'))
	}
	@When("User has to enter organization name (.*),owner represenative (.*),Owner contact email (.*) and Website (.*)")
	public void User_has_to_enter_organizationname_ownerrepresenative_Ownercontact_email_and_Website(String orgname, String ownerRep,String contactmail, String web){
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/input_Organization Name_orgNam'), orgname)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/input_(Employee or Officer of'), ownerRep)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/input_Owner Contact Email_orgC'), contactmail)
		WebUI.setText(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/input_Website_orgWebSite'), web)
	}
	@When("User has to select Industry category (.*)")
	public void User_has_to_select_Industry_category(String category){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/select_Product ManufacturersUt'),
				'4', true)
	}
	@When("User has to select Industry SubCategory (.*)")
	public void User_has_to_select_Industry_SubCategory(String subcategory){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/select_REComm-BrokageMgmREComm'),
				'114', true)
	}
	@When("User has to click Add button")
	public void User_has_to_click_Add_button(){
		WebUI.click(findTestObject('Object Repository/Campus_Registration/LEED_camRegtc/leedneworganization/Page_LEED Online/input_Industry Sub-Category_su'))

	}
	@Then("A new Organization has to be added successfully")
	public void A_new_Organization_has_to_be_added_successfully(){
		WebUI.closeBrowser();
	}
	//<----------------------------------------------------------------------------------------------------------------------------------------------------------------------->
}



