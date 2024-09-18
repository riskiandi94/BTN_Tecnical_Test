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

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://pos.lumintu.xyz/login')

WebUI.setText(findTestObject('Object Repository/Transaksi Negative 1/Page_CAFE - Login Page/input_USERNAME_username'), 'superadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Transaksi Negative 1/Page_CAFE - Login Page/input_KATA SANDI_password'), 
    'Syiw1RC7G8fJIAZiRhBE9w==')

WebUI.click(findTestObject('Object Repository/Transaksi Negative 1/Page_CAFE - Login Page/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Transaksi Negative 1/Page_Shifa Donat v.1.0.1/svg_Buat Baru_feather feather-plus-circle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Transaksi Negative 1/Page_Shifa Donat v.1.0.1/select_Makan Ditempat                      _7f16f5'), 
    'TAKEAWAY', true)

WebUI.click(findTestObject('Object Repository/Transaksi Negative 1/Page_Shifa Donat v.1.0.1/img'))

WebUI.setText(findTestObject('Transaksi Negative 1/Page_Shifa Donat v.1.0.1/QYT'), QTY)

WebUI.click(findTestObject('Object Repository/Transaksi Negative 1/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Transaksi Negative 1/Page_Shifa Donat v.1.0.1/img - Copy'))

WebUI.setText(findTestObject('Transaksi Negative 1/Page_Shifa Donat v.1.0.1/QYT - Copy'), QTY_1)

WebUI.click(findTestObject('Object Repository/Transaksi Negative 1/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Object Repository/Transaksi Negative 1/Page_Shifa Donat v.1.0.1/a_Simpan'))

WebUI.delay(10)

