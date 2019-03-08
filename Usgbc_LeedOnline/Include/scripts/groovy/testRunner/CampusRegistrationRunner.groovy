package testRunner
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
import org.junit.runner.RunWith
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

import cucumber.api.CucumberOptions
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.junit.Cucumber


/*
 @RunWith(Cucumber.class)
 @CucumberOptions(features = "F:/GitProjects/Usgbc_LeedOnline/Usgbc_LeedOnline/Include/features/Usgbc_LeedCampusReg.feature",glue="",
 plugin = ["pretty",
 "junit:F:/GitProjects/Usgbc_LeedOnline/Usgbc_LeedOnline/MyReports/CampusRegistration.xml",
 "html:F:/GitProjects/Usgbc_LeedOnline/Usgbc_LeedOnline/MyReports/CampusRegistration.html",
 "json:F:/GitProjects/Usgbc_LeedOnline/Usgbc_LeedOnline/MyReports/CampusRegistration.json"],
 tags=['@SmokeTest'] )
 */

/*
 @RunWith(Cucumber.class)
 @CucumberOptions(features = "C:/Program Files (x86)/Jenkins/workspace/Leed_Online/Usgbc_LeedOnline/Include/features/Usgbc_LeedCampusReg.feature",glue="",
 plugin = ["pretty",
 "junit:C:/Program Files (x86)/Jenkins/workspace/Leed_Online/Usgbc_LeedOnline/MyReports/CampusRegistration.xml",
 "html:C:/Program Files (x86)/Jenkins/workspace/Leed_Online/Usgbc_LeedOnline/MyReports/CampusRegistration.html",
 "json:C:/Program Files (x86)/Jenkins/workspace/Leed_Online/Usgbc_LeedOnline/MyReports/CampusRegistration.json"],
 tags=['@SmokeTest'] )
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Program Files (x86)/Jenkins/workspace/usgbc/Usgbc_LeedOnline/Include/features/" ,glue="",
plugin = ["pretty",
	"junit:C:/Program Files (x86)/Jenkins/workspace/usgbc/Usgbc_LeedOnline/MyReports/CampusRegistration.xml",
	"html:C:/Program Files (x86)/Jenkins/workspace/usgbc/Usgbc_LeedOnline/MyReports/CampusRegistration.html",
	"json:C:/Program Files (x86)/Jenkins/workspace/usgbc/Usgbc_LeedOnline/MyReports/CampusRegistration.json"],
tags=['@SmokeTest'] )
class CampusRegistrationRunner {
}


