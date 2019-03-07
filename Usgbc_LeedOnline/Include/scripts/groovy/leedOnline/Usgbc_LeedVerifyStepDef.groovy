import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.google.common.collect.FilteredEntryMultimap.Keys
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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

class projectdetails {

	@Given("User has to navigate to LEED Online login page")
	public void user_has_to_navigate_to_LEED_Online_login_page(){
		WebUI.openBrowser("")
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://leedonline-stg.usgbc.org")
		//WebUI.setViewPortSize(1044,788)
		//WebUI.executeJavaScript("document.body.style.zoom='75%'", null)

	}
	@When("User has to enter username (.*) and password (.*)")
	public void User_has_to_enter_username_and_password(String username,String password){
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Page_LEED Online/input_Log username'), username)
		WebUI.setText(findTestObject('Object Repository/Project_Registration/Page_LEED Online/input_Log password'), password)
	}


	@When("User has to check accept checkbox")
	public void User_has_to_check_accept_checkbox(){
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Object Repository/Project_Registration/Page_LEED Online/span_End User License Agreemen'),30)
		//		WebUI.delay(3)

		//WebUI.waitForElementVisible(findTestObject('Object Repository/Project_Registration/Page_LEED Online/span_End User License Agreemen'), 10)
		WebUI.check(findTestObject('Object Repository/Project_Registration/Page_LEED Online/span_End User License Agreemen'))
		//WebUI.click(findTestObject('Object Repository/Project_Registration/Page_LEED Online/span_End User License Agreemen'))
	}
	@When("User clicks on login button and navigate to home page")
	public void User_clicks_on_login_button_and_navigate_to_home_page(){
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Project_Registration/Page_LEED Online/button_Log In'))
	}

	@When("User clicks on Project")
	public void User_clicks_on_Project(){
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/Page_LEED Online/Page_LEED Online/li_of_btn next simpleTip'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/Page_LEED Online/Page_LEED Online/li_of_btn next simpleTip'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/Page_LEED Online/Page_LEED Online/li_of_btn next simpleTip'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/Page_LEED Online/Page_LEED Online/li_of_btn next simpleTip'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/Page_LEED Online/Page_LEED Online/li_of_btn next simpleTip'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/Page_LEED Online/Page_LEED Online/li_of_btn next simpleTip'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Page_LEED Online/div_v4.1 Interiors BP021000158'))
	}
	@Then("User should navigate to Project Details Page")
	public void User_should_navigate_to_Project_Details_Page(){
	}


	@Given("User should be in Project Details page")
	public void User_should_be_in_Project_Details_page(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/div_v4.1 Interiors BP02'))
	}
	@When("User has to verify project name (.*),Registration date (.*),project type (.*)")
	public void User_has_to_verify_project_name_Registration_date_project_type (String projectname,String Registrationdate,String projecttype){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_v4.1 Interiors BP02'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_04 Feb 2019'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_Individual Project'))
	}
	@When("User has to verify rating system (.*),unit type (.*)")
	public void User_has_to_verify_rating_system_unit_type (String ratingsytem,String unittype){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_LEED v4.1 OM Interiors'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_IP units'))
	}

	@When("User has to verify Gross floor area (.*),Antisipated type (.*)")
	public void User_has_to_verify_Gross_floor_area_Antisipated_type (String Grossfloorarea,String Antisipatedtype){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_1000 sq ft'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_Airport Distribution Center'))
	}
	@When("User has to verify country (.*),Address (.*)")
	public void User_has_to_verify_country_address (String country,String address){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_United States'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_9338 Carpenter St.'))
	}
	@When("User has to verify city (.*),state (.*),postal code (.*),geo location (.*)")
	public void User_has_to_verify_city_state_postal_code_geo_location (String city,String state,String postalcode,String geolocation){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_Waukesha'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_Wisconsin'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_53186'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_43.007534 -88.217655'))
	}
	@When("User has to verify PRIVATE (.*),Affliated with Leed lab (.*)")
	public void User_has_to_verify_PRIVATE_Affliated_with_Leed_lab (String PRIVATE,String AffliatedwithLeedlab){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_No'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_No'))
	}

	@When("User has to verify Owner (.*),Owners Representative (.*),OwnerType (.*),Owner Country(.*)")
	public void User_has_to_verify_Owner_Owners_Representative_Ownertype_Owner_Country (String Owner,String OwnesrRepresentative,String Ownertype,String Ownercountry){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_J  S Real Assets LLC'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_Jancy Rani'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_Community Development Corpo'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_United States'))
	}

	@When("User has to verify Email address(.*)")
	public void User_has_to_verify_Email_address (String EmailAddress){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/verify project details/Page_LEED Online/td_js.agmail.com'))
	}
	//--------------------------

	@Given("User has to verify Change of Owner Agreement page")
	public void User_has_to_verify_Change_of_Owner_Agreement_page(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/strong_Change of Owner Agreeme'))
	}
	@When("User clicks on download")
	public void User_clicks_on_download(){
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/a_Download'))
	}
	@When("User should navigate to Change of Owner Agreement form page")
	public void User_should_navigate_to_Change_of_Owner_Agreement_form_page(){
		WebUI.delay(10)
		WebUI.switchToWindowTitle('Change of Owner Agreement | U.S. Green Building Council')
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_Change of Owner Agreement  U.S/h1_Change of Owner Agreement'))
	}
	@When("User clicks on download button")
	public void User_clicks_on_download_button(){
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_Change of Owner Agreement  U.S/a_Download'))
	}
	@When("User should navigate to resource file page")
	public void User_should_navigate_to_resource_file_page(){
		WebUI.delay(5)
		WebUI.switchToWindowTitle('Change of Owner Agreement Form | GBCI')
	}
	@When("User clicks on Change of Owner Agreement pdf file")
	public void  User_clicks_on_Change_of_Owner_Agreement_pdf_file(){
		WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_Change of Owner Agreement Form/a_change-of-owner.pdf'))
		// WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/embed_plugin'), Keys.chord(Keys.CONTROL,'s'))
		WebUI.delay(2)

		Robot r = new Robot()

		r.keyPress(KeyEvent.VK_ENTER)

		r.keyRelease(KeyEvent.VK_ENTER)

	}
	@Then("User has to fill the downloaded file and upload file by click on Upload Change of Owner Agreement button")
	public void User_has_to_fill_the_downloaded_file_and_upload_file_by_click_on_Upload_Change_of_Owner_Agreement_button(){
		WebUI.delay(5)
		WebUI.navigateToUrl("https://leedonline-stg.usgbc.org/projects/details/1000158832")
		WebUI.delay(5)
		WebUI.uploadFile(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/Page_LEED Online/input_Upload Change of Owner A'), 'C:\\Users\\Promantus Inc\\Desktop')
		//CustomKeywords.'customKeywords.CustomKeywordPdfupload.uploadFile'(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/Page_LEED Online/input_Upload Change of Owner A'), 'F:/GitProjects/Usgbc_LeedOnline/Usgbc_LeedOnline/Include/Test Data/COO.pdf')
		CustomKeywords.'customKeywords.CustomKeywordPdfupload.uploadFile'(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/Page_LEED Online/input_Upload Change of Owner A'), 'C:/Program Files (x86)/Jenkins/workspace/Leed_Online/Usgbc_LeedOnline/Include/Test Data/COO.pdf')

	}
	@Then("User can see the uploaded file in project details page")
	public void User_can_see_the_uploaded_file_in_project_details_page(){
	}
}

//--------------------------------------

@Given("User has to be navigate to the project details page")
public void User_has_to_be_navigate_to_the_project_details_page(){
	WebUI.navigateToUrl("https://leedonline-stg.usgbc.org/projects/details/1000158832")
}
@Given("User has to verify Confirmation of Primary Owners Authority")
public void User_has_to_verify_Confirmation_of_Primary_Owners_Authority(){
	WebUI.verifyElementVisible(findTestObject('Object Repository/Verify_PrjtDetail/Primary Own Auth_LeedOnlinePrjDetails/Page_LEED Online/strong_Confirmation of Primary'))
}
@When("User click on download")
public void User_click_on_download(){
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Primary Own Auth_LeedOnlinePrjDetails/Page_LEED Online/a_Download'))
}
@When("User should navigate to Confirmation of Primary Owners Authority form page")
public void User_should_navigate_to_Confirmation_of_Primary_Owners_Authority_form_page(){
	WebUI.delay(10)
	WebUI.switchToWindowTitle('Confirmation of Primary Owner\'s Authority | U.S. Green Building Council')
	WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_PrjtDetail/Primary Own Auth_LeedOnlinePrjDetails/Page_Confirmation of Primary Owners/h1_Confirmation of Primary Own'))
}
@When("User click on download button")
public void User_click_on_download_button(){
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Primary Own Auth_LeedOnlinePrjDetails/Page_Confirmation of Primary Owners/a_Download'))
}
@When("User should navigate to the resource file page")
public void User_should_navigate_to_the_resource_file_page(){
	WebUI.delay(5)
	//WebUI.switchToWindowTitle('Confirmation of Primary Owner\'s Authority | GBCI')
}
@When("User clicks on Confirmation of Primary Owners Authority pdf file and file has to be downloaded")
public void  User_clicks_on_Confirmation_of_Primary_Owners_Authority_pdf_file_and_file_has_to_be_downloaded(){
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/Primary Own Auth_LeedOnlinePrjDetails/Page_Confirmation of Primary Owners/a_confirmation-of-primary-owne'))
	WebUI.delay(5)
	WebUI.sendKeys(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/embed_plugin'), Keys.chord(Keys.CONTROL,'s'))
	WebUI.delay(2)
	Robot r = new Robot()
	r.keyPress(KeyEvent.VK_ENTER)
	r.keyRelease(KeyEvent.VK_ENTER)
}
@Then("User has to fill the downloaded file and upload file by click on Upload Confirmation of Primary Owners Authority button")
public void User_has_to_fill_the_downloaded_file_and_upload_file_by_click_on_Upload_Confirmation_of_Primary_Owners_Authority_button(){
	WebUI.delay(5)
	WebUI.navigateToUrl("https://leedonline-stg.usgbc.org/projects/details/1000158832")
	WebUI.delay(5)
	//WebUI.uploadFile(findTestObject('Object Repository/Verify_PrjtDetail/change Owner/Page_LEED Online/Page_LEED Online/input_Upload Change of Owner A'), 'C:\\Users\\Promantus Inc\\Desktop')
	CustomKeywords.'com.upload.CustomKeywordPdfupload.uploadFile'(findTestObject('Object Repository/Verify_PrjtDetail/Primary Own Auth_LeedOnlinePrjDetails/Page_Confirmation of Primary Owners/Page_LEED Online/input_Upload Primary Owners Au'), 'C:\\Users\\Promantus Inc\\Desktop\\COA.pdf')
}
@Then("User can see the upload file in project details page")
public void User_can_see_the_upload_file_in_project_details_page(){
}
//------------------------
@Given("User sholud be in project details page")
public void User_sholud_be_in_project_details_page(){
	WebUI.navigateToUrl("https://leedonline-stg.usgbc.org/projects/details/1000158832")
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/update/Page_LEED Online/div_v4.1 Interiors BP02'))
}
@When("User has to click on edit icon")
public void User_has_to_click_on_edit_icon(){
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/update/Page_LEED Online/i_Project details_icon-pencil'))
}
@When("User can see the update project page")
public void User_can_see_the_update_project_page(){
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/update/Page_LEED Online/h5_Update Project'))
}
@When("User can edit Gross floor area")
public void User_can_edit_Gross_floor_area(){
	WebUI.setText(findTestObject('Object Repository/Verify_PrjtDetail/update/Page_LEED Online/input_Gross floor area_grossFo'), '12564')
}
@When("User clicks on Update Button")
public void User_clicks_on_Update_Button(){
	WebUI.click(findTestObject('Object Repository/Verify_PrjtDetail/update/Page_LEED Online/input_This project includes st'))
}

@Then("User can check the update details")
public void User_can_check_the_update_details(){
	//WebUI.closeBrowser();
}



















