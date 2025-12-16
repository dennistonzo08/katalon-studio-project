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

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/a_Document Browser_nav-link'))

WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/a_Document Browser_nav-link'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/a_Archive One_nav-link'))

WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/a_Archive One_nav-link'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/div_HR 201 Set_inner'))

WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/div_HR 201 Set_inner'))

//WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/div_Add Document Set_inner'))
//WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/div_Add Document Set_inner'))
WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/i_Katalon Test Document_fas fa-cloud-upload-alt custom-theme-color-icon-gray1 ml-1 mr-1'))

WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/i_Katalon Test Document_fas fa-cloud-upload-alt custom-theme-color-icon-gray1 ml-1 mr-1'))

WebUI.verifyElementPresent(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_Browse File_inputid'), 5)

WebUI.uploadFile(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_Browse File_inputid'), 'C:\\Users\\Dennis John Tonzo\\Downloads\\document set - check in sample 2.docx')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_Document Date_DocumentDate'))

WebUI.setText(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_Document Date_DocumentDate'), '05/12/2025')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/textarea_Keywords_Keywords'))

WebUI.setText(findTestObject('AO web/Document Set/Check In/Page_Archive One/textarea_Keywords_Keywords'), 'Katalon Keyword Test')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_EmployeeName_index_EmployeeName'))

WebUI.setText(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_EmployeeName_index_EmployeeName'), 'Dennis John Tonzo')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_EmployeeNo_index_EmployeeNo'))

WebUI.setText(findTestObject('AO web/Document Set/Check In/Page_Archive One/input_EmployeeNo_index_EmployeeNo'), '12369123')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/button_Cancel_btncheckin'))

WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/button_Cancel_btncheckin'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Check In/Page_Archive One/button__swal2-confirm swal2-styled'))

WebUI.click(findTestObject('AO web/Document Set/Check In/Page_Archive One/button__swal2-confirm swal2-styled'))

