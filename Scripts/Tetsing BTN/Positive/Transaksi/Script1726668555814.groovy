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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pos.lumintu.xyz/login')

WebUI.setText(findTestObject('Object Repository/Transaksi Positive/Page_CAFE - Login Page/input_USERNAME_username'), 'superadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Transaksi Positive/Page_CAFE - Login Page/input_KATA SANDI_password'), 
    'Syiw1RC7G8fJIAZiRhBE9w==')

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_CAFE - Login Page/button_Masuk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/div_Buat BaruTransaksi'))

WebUI.click(findTestObject('Transaksi Positive/Page_CAFE - Login Page/Jenis pesanan'))

WebUI.click(findTestObject('Transaksi Positive/Page_CAFE - Login Page/Takeaway'))

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/img'))

WebUI.setText(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/QYT'), Quantity_Item)

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/img - Copy'))

WebUI.setText(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/QYT'), Quantity_Item_1)

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/img - Copy (1)'))

WebUI.setText(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/QYT'), Quantity_Item_2)

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/img - Copy (2)'))

WebUI.setText(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/QYT'), Quantity_Item_3)

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/img - Copy (3)'))

WebUI.setText(findTestObject('Transaksi Positive/Page_Shifa Donat v.1.0.1/QYT'), Quantity_Item_4)

WebUI.click(findTestObject('Object Repository/Transaksi Positive/Page_Shifa Donat v.1.0.1/button_Tambah'))

WebUI.click(findTestObject('Transaksi Positive/Page_CAFE - Login Page/Button Simpan'))

