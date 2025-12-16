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

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/a_Archive One_nav-link'))

WebUI.click(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/a_Archive One_nav-link'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/button_Document Set Templates  Assignments__bcb9ce'))

WebUI.click(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/button_Document Set Templates  Assignments__bcb9ce'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/div_Way, Gerard_modal-content'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/input_Name_DSName'))

WebUI.setText(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/input_Name_DSName'), 'Katalon Automation Template Name Testing')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/input_Description_DSDescription'))

WebUI.setText(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/input_Description_DSDescription'), 'Katalon Template Description Testing')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/button_Close_btnSaveDocumentSet'))

WebUI.click(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/button_Close_btnSaveDocumentSet'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/button_Success_swal2-confirm swal2-styled'))

WebUI.click(findTestObject('AO web/Document Set/Add Document Set Template/Page_Archive One/button_Success_swal2-confirm swal2-styled'))

