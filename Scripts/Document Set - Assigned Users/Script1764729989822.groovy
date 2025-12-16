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

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/a_Archive One_nav-link active'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/a_Archive One_nav-link active'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/div_HR 201 Set_inner'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/div_HR 201 Set_inner'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_Assigned Users_btnAssignTemplateUser'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_Assigned Users_btnAssignTemplateUser'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/div_No records found_modal-content'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_AssignRemove Users_txtSearchUser'))

WebUI.setText(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_AssignRemove Users_txtSearchUser'), 
    'Bojo')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_AssignRemove Users_btnSearchUser'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_AssignRemove Users_btnSearchUser'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_Bojo, Randell James_SelectedMembers'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_Bojo, Randell James_SelectedMembers'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_Yapchengco, Carlos_btnAssignTemplateUsers'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_Yapchengco, Carlos_btnAssignTemplateUsers'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button__btn btn-primary bootbox-accept'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button__btn btn-primary bootbox-accept'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/div_No records found_modal-content'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_AssignRemove Users_txtSearchUser'))

WebUI.setText(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_AssignRemove Users_txtSearchUser'), 
    'Manato')

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_AssignRemove Users_btnSearchUser'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_AssignRemove Users_btnSearchUser'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_Manato, James Mark_SelectedMembers'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/input_Manato, James Mark_SelectedMembers'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_Yapchengco, Carlos_btnAssignTemplateUsers'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button_Yapchengco, Carlos_btnAssignTemplateUsers'))

WebUI.verifyElementVisible(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button__btn btn-primary bootbox-accept'))

WebUI.click(findTestObject('AO web/Document Set/Assign User/Page_Archive One/button__btn btn-primary bootbox-accept'))

