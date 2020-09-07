import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Demoblaze/PlaceOrder/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Demoblaze/PlaceOrder/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Demoblaze/PlaceOrder/a_Cart'))

WebUI.click(findTestObject('Object Repository/Demoblaze/PlaceOrder/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Demoblaze/PlaceOrder/input_Name_name'), 'evi')

WebUI.setText(findTestObject('Object Repository/Demoblaze/PlaceOrder/input_Country_country'), 'Indonesia')

WebUI.setText(findTestObject('Object Repository/Demoblaze/PlaceOrder/input_City_city'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Demoblaze/PlaceOrder/input_Credit card_card'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Demoblaze/PlaceOrder/input_Month_month'), '12')

WebUI.setText(findTestObject('Object Repository/Demoblaze/PlaceOrder/input_Year_year'), '2022')

WebUI.click(findTestObject('Object Repository/Demoblaze/PlaceOrder/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Demoblaze/PlaceOrder/button_OK'))

