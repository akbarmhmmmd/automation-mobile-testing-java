package com.kompas
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


class kompasid {
	@Given("User on Kompas.id App Startup Page")
	def validateKompasApp() {
		Mobile.startApplication(GlobalVariable.appPath, true)
	}

	@When("User tap Lewati on Startup Page")
	def tapLewati() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Lewati'), 10)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Lewati'), 0)
	}

	@When("User tap Masuk Button")
	def tapMasuk() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Masuk'), 10)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Masuk'), 0)
	}

	@When("User tap Masuk dengan Email Button")
	def tapMasukEmail() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.Button - Masuk dengan EmailNo. Ponsel'), 10)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Masuk dengan EmailNo. Ponsel'), 0)
	}

	@When("User tap Lanjutkan dengan Google")
	def tapGoogleSignIn() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lanjutkan dengan Google'), 10)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lanjutkan dengan Google'), 0)
	}

	@When("User select the registered email")
	def selectEmail() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.TextView - akbarmhmmmdgmail.com'), 10)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.TextView - akbarmhmmmdgmail.com'), 0)
	}

	@When("User input Email Field")
	def inputEmail() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.EditText - Email atau No. Ponsel'), 10)
		Mobile.setText(findTestObject('Kompas.id/android.widget.EditText - Email atau No. Ponsel'), GlobalVariable.email, 0)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lanjutkan'), 0)
	}

	@When("User input Kata Sandi Field")
	def inputPassword() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.EditText - Kata Sandi'), 10)
		Mobile.setText(findTestObject('Kompas.id/android.widget.EditText - Kata Sandi'), GlobalVariable.password, 0)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Masuk'), 0)
	}

	@When("User tap Lewati on Home Page")
	def tapLewatiHome() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lewati'), 10)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lewati'), 0)

		boolean terapkanButton = Mobile.checkElement(findTestObject('Object Repository/Kompas.id/android.widget.Button - Terapkan'), 10)

		if (terapkanButton == true) {
			Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.Button - Terapkan'), 10)
			Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Terapkan'), 0)
		}
	}

	@Then("User redirect to Home Page")
	def validateHomePage() {
		Mobile.verifyElementExist(findTestObject('Kompas.id/android.widget.ImageViewKompasId'), 10)
		Mobile.closeApplication()
	}
}
