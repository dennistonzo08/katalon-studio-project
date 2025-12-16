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
//import org.openqa.selenium.Keys as Keys
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import org.openqa.selenium.Cookie as Cookie
//import groovy.json.JsonOutput as JsonOutput
//import com.kms.katalon.core.configuration.RunConfiguration


WebUI.openBrowser('')

WebUI.navigateToUrl('https://devportalci.archive-one.net/Home/Index')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtUName'),
    5)

WebUI.click(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtUName'))

WebUI.setText(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtUName'),
    GlobalVariable.username)

WebUI.waitForElementPresent(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/button_Remember Me_btnVerifyUsername'),
    5)

WebUI.click(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/button_Remember Me_btnVerifyUsername'))

WebUI.waitForElementPresent(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtPassword'),
    5)

WebUI.setEncryptedText(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtPassword'),
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/button_Loading_btnNext'))

WebUI.waitForPageLoad(10)


//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://devportalci.archive-one.net/account/login')
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtUName'), 
//    5)
//
//WebUI.click(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtUName'))
//
//WebUI.setText(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtUName'), 
//    GlobalVariable.username)
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/button_Remember Me_btnVerifyUsername'), 
//    5)
//
//WebUI.click(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/button_Remember Me_btnVerifyUsername'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtPassword'), 
//    5)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/input_Resend Security Code_txtPassword'), 
//    GlobalVariable.password)
//
//WebUI.click(findTestObject('Object Repository/AO web/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/Page_Archive One/button_Loading_btnNext'))
//
//WebUI.waitForPageLoad(10)

//def driver = DriverFactory.getWebDriver()
//
//def cookies = driver.manage().getCookies()
//
//def cookieList = cookies.collect({ def cookie ->
//        [('name') : cookie.getName(), ('value') : cookie.getValue(), ('domain') : cookie.getDomain(), ('path') : cookie.getPath()
//            , ('expiry') : cookie.getExpiry() ? cookie.getExpiry().time : null, ('isSecure') : cookie.isSecure()]
//    })
//
//def cookieFile = new File(RunConfiguration.getProjectDir() + '/cookies.json')
//
//cookieFile.text = JsonOutput.prettyPrint(JsonOutput.toJson(cookieList))
//
//println("Cookies saved to: $cookieFile.absolutePath")

