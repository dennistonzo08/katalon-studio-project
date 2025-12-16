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

WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/a_Dashboard_nav-link'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AO web/search/Page_Archive One/a_Dashboard_nav-link'))

WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/input_Search_Keywords'))

WebUI.click(findTestObject('AO web/search/Page_Archive One/input_Search_Keywords'))

WebUI.setText(findTestObject('AO web/search/Page_Archive One/input_Search_Keywords'), 'Dennis John Tonzo')

WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/label_undefined_custom-control-label'))

WebUI.click(findTestObject('AO web/search/Page_Archive One/label_undefined_custom-control-label'))

//WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/label_Content_custom-control-label'))
//
//WebUI.click(findTestObject('AO web/search/Page_Archive One/label_Content_custom-control-label'))
//WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/label_Meta Tag_custom-control-label'))
//
//WebUI.click(findTestObject('AO web/search/Page_Archive One/label_Meta Tag_custom-control-label'))
//WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/label_All Libraries_custom-control-label'))
//
//WebUI.click(findTestObject('AO web/search/Page_Archive One/label_All Libraries_custom-control-label'))
WebUI.verifyElementVisible(findTestObject('AO web/search/Page_Archive One/button_undefined_search'))

WebUI.click(findTestObject('AO web/search/Page_Archive One/button_undefined_search'))

WebUI.delay(60)

