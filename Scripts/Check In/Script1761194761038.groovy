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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://devportalci.archive-one.net/Home/Index')
//
//WebUI.waitForPageLoad(10)
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
//WebUI.waitForElementPresent(findTestObject('AO web/Document Browser/Page_Archive One/a_Dashboard_nav-link'), 5)
//
//WebUI.click(findTestObject('AO web/Document Browser/Page_Archive One/a_Dashboard_nav-link'))
//
//WebUI.waitForPageLoad(10)
//
//WebUI.verifyElementVisible(findTestObject('AO web/Check In Document/Page_Archive One/a_Folder View_container-1036_anchor'))
WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/a_Folder View_container-1036_anchor'))

WebUI.verifyElementVisible(findTestObject('AO web/Check In Document/Page_Archive One/a_Close_btn-checkin'))

WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/a_Close_btn-checkin'))

WebUI.verifyElementVisible(findTestObject('AO web/Check In Document/Page_Archive One/div_pdf_modal-content'))

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_Browse File_inputid'), 5)

WebUI.uploadFile(findTestObject('AO web/Check In Document/Page_Archive One/input_Browse File_inputid'), 'C:\\Users\\Dennis John Tonzo\\Downloads\\test sharepoint\\test.png')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/span_Document Type_select2-DocumentType-container'), 
    5)

WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/span_Document Type_select2-DocumentType-container'))

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input__select2-search__field'), 5)

WebUI.setText(findTestObject('AO web/Check In Document/Page_Archive One/input__select2-search__field'), 'EMPLOYEE 201')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/ul_concat(id(, , select2-DocumentType-resul_e3bcf5'), 
    5)

WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/ul_concat(id(, , select2-DocumentType-resul_e3bcf5'))

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_Document Date_ValidFrom'), 5)

WebUI.setText(findTestObject('AO web/Check In Document/Page_Archive One/input_Document Date_ValidFrom'), '04-11-2025')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_Expiry Date_ValidTo'), 5)

WebUI.setText(findTestObject('AO web/Check In Document/Page_Archive One/input_Expiry Date_ValidTo'), '05-11-2025')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_Keywords_Compress'), 5)

WebUI.setText(findTestObject('AO web/Check In Document/Page_Archive One/textarea_Keywords_Keywords'), 'test case check in testing')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_Keywords_Compress'), 5)

WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/input_Keywords_Compress'))

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_EmployeeName_index_EmployeeName'), 
    5)

WebUI.setText(findTestObject('AO web/Check In Document/Page_Archive One/input_EmployeeName_index_EmployeeName'), 'Dennis John Tonzo')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/input_EmployeeNo_index_EmployeeNo'), 
    5)

WebUI.setText(findTestObject('AO web/Check In Document/Page_Archive One/input_EmployeeNo_index_EmployeeNo'), '12369123')

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/button_Cancel_btncheckin'), 5)

WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/button_Cancel_btncheckin'))

WebUI.verifyElementPresent(findTestObject('AO web/Check In Document/Page_Archive One/button_Document checkin successful_swal2-confirm swal2-styled'), 
    5)

WebUI.click(findTestObject('AO web/Check In Document/Page_Archive One/button_Document checkin successful_swal2-confirm swal2-styled'))

