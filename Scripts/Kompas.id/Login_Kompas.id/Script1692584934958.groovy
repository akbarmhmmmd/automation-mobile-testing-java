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

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_MasukEmail'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_MasukEmail'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/field_Email'), 10)

Mobile.setText(findTestObject('Kompas.id/field_Email'), GlobalVariable.email, 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Lanjutkan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/field_KataSandi'), 10)

Mobile.setText(findTestObject('Kompas.id/field_KataSandi'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_MasukLogin'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_LewatiHomePage'), 0)

Mobile.checkElement(findTestObject('Kompas.id/btn_Terapkan'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terapkan'), 0)

Mobile.verifyElementExist(findTestObject('Kompas.id/img_Kompas.id'), 10)

Mobile.waitForElementPresent(findTestObject('Kompas.id/btn_LanjutkanGoogle'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/txt_akbarmhmmmdgmail.com'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/txt_akbarmhmmmdgmail.com'), 0)

Mobile.startApplication('C:\\Users\\akbar\\Katalon Studio\\BDD Mobile Testing\\androidapp\\app.apk', true)

Mobile.swipe(200, 200, 400, 200)

Mobile.swipe(400, 200, 200, 200)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_BeritaUtama'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terbaru'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Pilihanku'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_FavoritPembaca'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_Terpopuler'), 0)

device_height = Mobile.getDeviceHeight()

device_width = Mobile.getDeviceWidth()

int startY = device_height / 2

int endY = startY

int startX = device_width * 0.3

int endX = device_width * 0.7

Mobile.swipe(startX, startY, endX, endY)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\akbar\\Katalon Studio\\BDD Mobile Testing\\androidapp\\app.apk', true)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\akbar\\Katalon Studio\\BDD Mobile Testing\\androidapp\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/Kompas.id/btn_backStartup'), 0)

Mobile.closeApplication()

