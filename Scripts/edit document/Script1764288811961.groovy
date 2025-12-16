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

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/a_Dashboard_nav-link'))

WebUI.click(findTestObject('AO web/edit document/Page_Archive One/a_Dashboard_nav-link'))

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/a_Folder View_container-1036_anchor'))

WebUI.click(findTestObject('AO web/edit document/Page_Archive One/a_Folder View_container-1036_anchor'))

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/a_Manalo, Nicole_doctitle_2978'))

WebUI.click(findTestObject('AO web/edit document/Page_Archive One/a_Manalo, Nicole_doctitle_2978'))

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/a_Preview_custom-link-color'))

WebUI.click(findTestObject('AO web/edit document/Page_Archive One/a_Preview_custom-link-color'))

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/div_txt_modal-content'))

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/input_Document Title_DocumentTitle'))

WebUI.setText(findTestObject('AO web/edit document/Page_Archive One/input_Document Title_DocumentTitle'), 'katalon automation test')

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/input_Document Date_ValidFrom'))

WebUI.setText(findTestObject('AO web/edit document/Page_Archive One/input_Document Date_ValidFrom'), '2025-13-12')

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/input_Expiry Date_ValidTo'))

WebUI.setText(findTestObject('AO web/edit document/Page_Archive One/input_Expiry Date_ValidTo'), '2025-14-12')

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/textarea_Keywords_Keywords'))

WebUI.setText(findTestObject('AO web/edit document/Page_Archive One/textarea_Keywords_Keywords'), 'katalon automation keyword test')

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/input_EmployeeName_index_EmployeeName'))

WebUI.setText(findTestObject('AO web/edit document/Page_Archive One/input_EmployeeName_index_EmployeeName'), 'katalon automation set name test')

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/input_EmployeeNo_index_EmployeeNo'))

WebUI.setText(findTestObject('AO web/edit document/Page_Archive One/input_EmployeeNo_index_EmployeeNo'), 'katalon automation set employee number test')

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/button_Cancel_btnEditDocument'))

WebUI.click(findTestObject('AO web/edit document/Page_Archive One/button_Cancel_btnEditDocument'))

WebUI.verifyElementVisible(findTestObject('AO web/edit document/Page_Archive One/button_Success_swal2-confirm swal2-styled'))

WebUI.click(findTestObject('AO web/edit document/Page_Archive One/button_Success_swal2-confirm swal2-styled'))

