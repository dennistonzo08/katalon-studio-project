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

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/a_Archive One_nav-link'))

WebUI.click(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/a_Archive One_nav-link'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/div_HR 201 Set_inner'))

WebUI.click(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/div_HR 201 Set_inner'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/button_Katalon Automation Template Name Tes_9d1c15'))

WebUI.click(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/button_Katalon Automation Template Name Tes_9d1c15'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Document Code_DocumentCode'))

WebUI.setText(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Document Code_DocumentCode'), 
    'katalon_code_test')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Item Name_DSIName'))

WebUI.setText(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Item Name_DSIName'), 'Katalon Add Item Test')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Description_DSIDescription'))

WebUI.setText(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Description_DSIDescription'), 
    'Katalon Item Description')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Annotation_Annotation'))

WebUI.setText(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/input_Annotation_Annotation'), 'Katalon Item Annotation Test')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_Validity_Validity'))

WebUI.selectOptionByIndex(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_Validity_Validity'), 
    3)

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_DocumentType_DocumentTypeIDDSI'))

WebUI.selectOptionByIndex(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_DocumentType_DocumentTypeIDDSI'), 
    2)

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_Library_LibraryIDDSI'))

WebUI.selectOptionByIndex(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_Library_LibraryIDDSI'), 
    2)

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_Folder_DocumentFolderIDDSI'))

WebUI.selectOptionByIndex(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/select_Folder_DocumentFolderIDDSI'), 
    1)

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/button_Close_btnSaveDocumentSetTemplateItem'))

WebUI.click(findTestObject('AO web/Document Set/Create Item Template/Page_Archive One/button_Close_btnSaveDocumentSetTemplateItem'))

