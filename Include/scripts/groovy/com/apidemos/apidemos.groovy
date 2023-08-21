package com.apidemos
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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


class apidemos {
	@Given("User on API Demos app")
	def validateApp() {
		Mobile.startApplication(GlobalVariable.appPath, false)
		Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - API Demos'), 3)
	}

	@When("User tap (.*) menu")
	def tapMenu(String tap) {
		switch (tap) {
			case 'Accessibility':
				Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility'), 0)
				break;
			case 'Accessibility Node Provider sub':
				Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility Node Provider'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Node Provider'), 3)
				break;
			case 'Accessibility Node Querying sub':
				Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility Node Querying'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Node Querying'), 3)
				break;
			case 'Accessibility Service sub':
				Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility Service'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Service'), 3)
				break;
			case 'Custom View sub':
				Mobile.tap(findTestObject('Object Repository/API Demos/Text - Custom View'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text - AccessibilityCustom View'), 0)
				break;
			default:
				throw new Error('option does not exist')	
		}
	}
	
	@When("User tap on (.*)")
	def tapAction(String tap) {
		switch (tap) {
			case 'unchecked checkboxes':
				Mobile.tap(findTestObject('Object Repository/API Demos/Conquer World_checkBox'), 0)
				Mobile.tap(findTestObject('Object Repository/API Demos/Do Taxes_checkBox'), 0)
				Mobile.tap(findTestObject('Object Repository/API Demos/Abolish IRS_checkBox'), 0)
				Mobile.tap(findTestObject('Object Repository/API Demos/Tea with Aunt_checkBox'), 0)
				break;
			case 'first box':
				Mobile.tap(findTestObject('Object Repository/API Demos/button1'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/button1_on'), 3)
				break;
			case 'second box':
				Mobile.tap(findTestObject('Object Repository/API Demos/button2'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/button2_on'), 3)
				break;
			default:
				throw new Error('option does not exist')
		}
	}

	@Then("(.*) menu successfully accessed by User")
	def validateAccess(String menu) {
		switch (menu) {
			case 'Node Provider sub':
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Node Provider'), 3)
				break;
			case 'Node Querying sub':
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Take Out Trash_checkBox'), 3)
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Do Laundry_checkBox'), 3)
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Nap_checkBox'), 0)
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Conquer World_checkBox'), 3)
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Do Taxes_checkBox'), 3)
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Abolish IRS_checkBox'), 3)
				Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Tea with Aunt_checkBox'), 3)
				break;
			case 'Service sub':
				Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Service'), 3)
				break;
			case 'Custom View sub':
				Mobile.verifyElementExist(findTestObject('Object Repository/API Demos/button1_on'), 3)
				Mobile.verifyElementExist(findTestObject('Object Repository/API Demos/button2_on'), 3)
				break;
			default:
				throw new Error('option does not exist')
		}
		Mobile.closeApplication()
	}
}