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

import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
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

	@When("User tap (.*) navigation button")
	def tapNavigation(String tap) {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_NantiSaja'), 3)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_NantiSaja'), 0)

		switch (tap) {
			case 'ePaper':
				Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/epaper_0'), 3)
				Mobile.tap(findTestObject('Object Repository/Kompas.id/epaper_0'), 0)
				Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 3)
				Mobile.tap(findTestObject('Kompas.id/btn_LewatiHomePage'), 0)
				break;
			case 'Buku':
				Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/buku_0'), 3)
				Mobile.tap(findTestObject('Object Repository/Kompas.id/buku_0'), 0)
				break;
			case 'Akun':
				Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/akun_0'), 3)
				Mobile.tap(findTestObject('Object Repository/Kompas.id/akun_0'), 0)
				break;
			default:
				throw new Error('option does not exist')
		}
	}

	@When("User tap Lewati on Startup Page")
	def tapLewati() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LewatiStartpage'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_LewatiStartpage'), 0)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_backStartup'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_backStartup'), 0)
	}

	@When("User tap Masuk Button")
	def tapMasuk() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_Masuk'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Masuk'), 0)
	}

	@When("User tap Masuk dengan Email Button")
	def tapMasukEmail() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_MasukEmail'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_MasukEmail'), 0)
	}

	@When("User tap Lanjutkan dengan Google")
	def tapGoogleSignIn() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LanjutkanGoogle'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_LanjutkanGoogle'), 0)
	}

	@When("User select the registered email")
	def selectEmail() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_akbartesting321gmail.com'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/txt_akbartesting321gmail.com'), 0)
	}

	@When("User input Email Field")
	def inputEmail() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/field_Email'), 5)
		Mobile.setText(findTestObject('Kompas.id/field_Email'), GlobalVariable.email, 0)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Lanjutkan'), 0)
	}

	@When("User input Kata Sandi Field")
	def inputPassword() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/field_KataSandi'), 5)
		Mobile.setText(findTestObject('Kompas.id/field_KataSandi'), GlobalVariable.password, 0)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_MasukLogin'), 0)
	}

	@When("User tap Lewati on Home Page")
	def tapLewatiHome() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 5)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 0)

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 5)) {
			Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 0)
		}
		
		Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/Kompas.idHome'), 3)
	}

	@When("User swipe (.*) page")
	def swipePage(String number) {

		int device_height = Mobile.getDeviceHeight()
		int device_width = Mobile.getDeviceWidth()
		int startY = device_height / 2
		int endY = startY

		Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/Kompas.idHome'), 3)
		switch (number) {
			case 'right':
				int startX = device_width * 0.7
				int endX = device_width * 0.3

				Mobile.swipe(startX, startY, endX, endY)
				Mobile.waitForElementNotPresent(findTestObject('Object Repository/Kompas.id/nav_BeritaUtama_On'), 3)
				break;
			case 'left':
				int startX = device_width * 0.3
				int endX = device_width * 0.7

				Mobile.swipe(startX, startY, endX, endY)
				Mobile.waitForElementNotPresent(findTestObject('Object Repository/Kompas.id/nav_Terbaru_On'), 3)
				break;
			default:
				throw new Error('option does not exist')
		}
	}
	
	@When("User scroll until alert text")
	def scrollAlert() {
		Mobile.scrollToText('Pelajari Lebih Lanjut')
	}
	
	@When("User tap burger menu button")
	def tapBurger() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_burger'), 3)
		Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_burger'), 0)
	}
	
	@When("User tap (.*) burger button")
	def tapMenuNav(String nav) {
		switch (nav) {
			case 'Fotografi':
				Mobile.scrollToText('Muda')
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/btn_Fotografi'), 3)
				Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Fotografi'), 0)
				break;
			case 'Muda':
				Mobile.scrollToText('Hiburan')
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/btn_Muda'), 3)
				Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Muda'), 0)
				break;
			default:
				throw new Error('option does not exist')
		}
	}
	
	@Then("User redirect to (.*) page")
	def validatePage(String page) {
		switch (page) {
			case 'Fotografi':
				Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_pageFotografi'), 5)
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/txt_pageFotografi'), 5)
				break;
			case 'Muda':
				Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_pageMuda'), 5)
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/txt_pageMuda'), 5)
				break;
			default:
				throw new Error('option does not exist')
		}
		Mobile.closeApplication()
	}
	
	@Then("User see the last article in the page")
	def validateLast() {
		Mobile.tap(findTestObject('Object Repository/Kompas.id/nav_BeritaUtama_On'), 0)
	}

	@Then("User success do swipe on all page")
	def validateSwipe() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/Kompas.idHome'), 2)
		Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/Kompas.idHome'), 2)
		Mobile.closeApplication()
	}

	@Then("User success redirect to (.*) page")
	def validateNav(String navPage) {
		switch (navPage) {
			case 'ePaper':
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/ePaper_1'), 5)
				break;
			case 'Buku':
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/buku_1'), 5)
				break;
			case 'Akun':
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/akun_1'), 5)
				Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/txt_Akun'), 5)
				break;
			default:
				throw new Error('option does not exist')
		}
		Mobile.closeApplication()
	}

	@Then("User redirect to Home Page")
	def validateHomePage() {
		Mobile.verifyElementExist(findTestObject('Kompas.id/img_Kompas.id'), 5)
		Mobile.closeApplication()
	}
}
