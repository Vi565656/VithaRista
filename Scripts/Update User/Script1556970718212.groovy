import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Create User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/dewata/public/auth/login')

WebUI.setText(findTestObject('Page_Admin/input_name - Copy'), 'admin1')

WebUI.setText(findTestObject('Page_Admin/input_password - Copy'), 'P@ssw0rd')

WebUI.click(findTestObject('Page_Admin/btn_login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Dewata Admin Tools/span'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Dewata Admin Tools/btn_edit_user'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Dewata Admin Tools/input_name - Copy'), 'vitha edit')

WebUI.click(findTestObject('Page_Dewata Admin Tools/input_level - Copy'))

WebUI.click(findTestObject('Page_Dewata Admin Tools/button_Buat - Copy'))

WebUI.verifyElementPresent(findTestObject('Page_Dewata Admin Tools/strong_User Berhasil di Update'), 0)

not_run: WebUI.click(findTestObject('Page_Dewata Admin Tools/div_                      User'))

WebUI.verifyTextPresent('vitha edit', false)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

