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

WebUI.verifyElementPresent(findTestObject('AO web/preview/Page_Archive One/a_Folder View_container-1036_anchor'), 5)

WebUI.click(findTestObject('AO web/preview/Page_Archive One/a_Folder View_container-1036_anchor'))

WebUI.verifyElementPresent(findTestObject('AO web/preview/Page_Archive One/a_Manalo, Nicole_doctitle_2977'), 5)

WebUI.click(findTestObject('AO web/preview/Page_Archive One/a_Manalo, Nicole_doctitle_2977'))

WebUI.verifyElementPresent(findTestObject('AO web/preview/Page_Archive One/a_ACTIONS_custom-link-color'), 5)

WebUI.click(findTestObject('AO web/preview/Page_Archive One/a_ACTIONS_custom-link-color'))

WebUI.waitForPageLoad(20)

