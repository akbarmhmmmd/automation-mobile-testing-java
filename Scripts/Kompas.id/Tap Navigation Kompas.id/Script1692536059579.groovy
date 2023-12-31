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

Mobile.startApplication(GlobalVariable.appPath, true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LewatiStartpage'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_LewatiStartpage'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_Masuk'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Masuk'), 0)

Mobile.waitForElementPresent(findTestObject('Kompas.id/btn_LanjutkanGoogle'), 10)

Mobile.tap(findTestObject('Kompas.id/btn_LanjutkanGoogle'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_akbarmhmmmdgmail.com'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/txt_akbarmhmmmdgmail.com'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 0)

boolean terapkanButton = Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 10)

if (terapkanButton == true) {
    Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 10)

    Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 0)
}

Mobile.verifyElementExist(findTestObject('Kompas.id/img_Kompas.id'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_BeritaUtama'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terbaru'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Pilihanku'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_FavoritPembaca'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terpopuler'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\akbar\\Katalon Studio\\BDD Mobile Testing\\androidapp\\app.apk', true)

Mobile.scrollToText('Pelajari Lebih Lanjut')

Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_burger'), 0)

Mobile.scrollToText('Fotografi')

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_Fotografi'), 3)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Fotografi'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_Fotografi'), 3)

Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/txt_Fotografi'), 3)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\akbar\\Katalon Studio\\BDD Mobile Testing\\androidapp\\app.apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_pageFotografi'), 3)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_backView'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\akbar\\Katalon Studio\\BDD Mobile Testing\\androidapp\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Muda'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_pageMuda'), 3)

Mobile.closeApplication()

