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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://devportalci.archive-one.net/account/login')
//
//WebUI.verifyElementPresent(findTestObject('AO web/Check Out Document/Page_Archive One/input_Resend Security Code_txtUName'), 
//    5)
//
//WebUI.setText(findTestObject('Object Repository/AO web/Check Out Document/Page_Archive One/input_Resend Security Code_txtUName'), 
//    's.similatan@paperlesstrail.net')
//
//WebUI.verifyElementPresent(findTestObject('AO web/login/Page_Archive One/button_Remember Me_btnVerifyUsername'), 5)
//
//WebUI.click(findTestObject('AO web/login/Page_Archive One/button_Remember Me_btnVerifyUsername'))
//
//WebUI.verifyElementPresent(findTestObject('AO web/Page_Archive One/Page_Archive One/input_Resend Security Code_txtPassword'), 
//    5)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/AO web/Check Out Document/Page_Archive One/input_Resend Security Code_txtPassword'), 
//    'OYp8LT6FofKKjIpKLnomAg==')
//
//WebUI.verifyElementPresent(findTestObject('AO web/login/Page_Archive One/button_Loading_btnNext'), 5)
//
//WebUI.click(findTestObject('AO web/login/Page_Archive One/button_Loading_btnNext'))
//
//WebUI.waitForPageLoad(10)
WebUI.verifyElementPresent(findTestObject('AO web/Check Out Document/Page_Archive One/a_Dashboard_nav-link'), 5)

WebUI.click(findTestObject('Object Repository/AO web/Check Out Document/Page_Archive One/a_Dashboard_nav-link'))

WebUI.verifyElementPresent(findTestObject('AO web/Check Out Document/Page_Archive One/a_Folder View_container-1036_anchor'), 
    5)

WebUI.click(findTestObject('Object Repository/AO web/Check Out Document/Page_Archive One/a_Folder View_container-1036_anchor'))

WebUI.verifyElementPresent(findTestObject('AO web/Check Out Document/Page_Archive One/a_Manalo, Nicole_doctitle_2977'), 
    5)

WebUI.click(findTestObject('AO web/Check Out Document/Page_Archive One/a_Manalo, Nicole_doctitle_2977'))

WebUI.verifyElementPresent(findTestObject('AO web/Check Out Document/Page_Archive One/a_Preview_custom-link-color'), 5)

WebUI.click(findTestObject('AO web/Check Out Document/Page_Archive One/a_Preview_custom-link-color'))

WebUI.verifyElementPresent(findTestObject('AO web/Check Out Document/Page_Archive One/button_Cancel_btncheckout'), 5)

WebUI.click(findTestObject('Object Repository/AO web/Check Out Document/Page_Archive One/button_Cancel_btncheckout'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('AO web/Check Out Document/Page_Archive One/button_Success_swal2-confirm swal2-styled_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AO web/Check Out Document/Page_Archive One/button_Success_swal2-confirm swal2-styled_1'))

