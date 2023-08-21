import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - API Demos'), 3)

Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility'), 0)

Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility Node Provider'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Node Provider'), 3)

Mobile.tap(findTestObject('Object Repository/API Demos/android.view.View'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility Node Querying'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Node Querying'), 3)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Take Out Trash_checkBox'), 3)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Do Laundry_checkBox'), 3)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Nap_checkBox'), 0)

Mobile.tap(findTestObject('Object Repository/API Demos/Conquer World_checkBox'), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Conquer World_checkBox'), 3)

Mobile.tap(findTestObject('Object Repository/API Demos/Do Taxes_checkBox'), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Do Taxes_checkBox'), 3)

Mobile.tap(findTestObject('Object Repository/API Demos/Abolish IRS_checkBox'), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Abolish IRS_checkBox'), 3)

Mobile.tap(findTestObject('Object Repository/API Demos/Tea with Aunt_checkBox'), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos/Tea with Aunt_checkBox'), 3)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/API Demos/Text - Accessibility Service'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text View - Accessibility Service'), 3)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/API Demos/Text - Custom View'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/Text - AccessibilityCustom View'), 0)

Mobile.tap(findTestObject('Object Repository/API Demos/button1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/button1_on'), 3)

Mobile.verifyElementExist(findTestObject('Object Repository/API Demos/button1_on'), 3)

Mobile.tap(findTestObject('Object Repository/API Demos/button2'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/API Demos/button2_on'), 3)

Mobile.verifyElementExist(findTestObject('Object Repository/API Demos/button2_on'), 3)

Mobile.pressBack()

Mobile.closeApplication()

