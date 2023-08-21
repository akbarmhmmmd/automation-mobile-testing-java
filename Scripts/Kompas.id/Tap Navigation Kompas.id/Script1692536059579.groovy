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

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Lewati'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Lewati'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Masuk'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.TextView - Masuk'), 0)

Mobile.waitForElementPresent(findTestObject('Kompas.id/android.widget.Button - Lanjutkan dengan Google'), 10)

Mobile.tap(findTestObject('Kompas.id/android.widget.Button - Lanjutkan dengan Google'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.TextView - akbarmhmmmdgmail.com'), 
    10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.TextView - akbarmhmmmdgmail.com'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lewati'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Lewati'), 0)

boolean terapkanButton = Mobile.verifyElementExist(findTestObject('Object Repository/Kompas.id/android.widget.Button - Terapkan'), 
    10)

if (terapkanButton == true) {
    Mobile.waitForElementPresent(findTestObject('Object Repository/Kompas.id/android.widget.Button - Terapkan'), 10)

    Mobile.tap(findTestObject('Object Repository/Kompas.id/android.widget.Button - Terapkan'), 0)
}

Mobile.verifyElementExist(findTestObject('Kompas.id/android.widget.ImageViewKompasId'), 10)

Mobile.tap(findTestObject('Object Repository/Kompas.id/BeritaUtama_btn'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/Terbaru_btn'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/Pilihanku_btn'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/FavoritPembaca_btn'), 0)

Mobile.tap(findTestObject('Object Repository/Kompas.id/Terpopuler_btn'), 0)

Mobile.closeApplication()

