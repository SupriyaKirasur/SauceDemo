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

WebUI.callTestCase(findTestCase('AddToCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/path'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/a_CHECKOUT'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Checkout Your Information'), 'Checkout: Your Information')

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_app_logo'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/inputfirst-name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/inputlast-name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/inputpostal-code'), 0)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/inputfirst-name'), 'Standard')

WebUI.verifyElementClickable(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_btn_primary cart_button'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/inputlast-name'), 'user')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/inputpostal-code'), '567890')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_CANCEL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Checkout/Page_Swag Labs/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_btn_primary cart_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Checkout Overview'), 'Checkout: Overview')

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Sauce Labs Backpackcarry.allTheThings()_077ba8'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_QTY'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_FREE PONY EXPRESS DELIVERY'), 'FREE PONY EXPRESS DELIVERY!')

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Item total 29.99'), 'Item total: $29.99')

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Total 32.39'), 'Total: $32.39')

WebUI.waitForElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/a_CANCEL_1'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Checkout/Page_Swag Labs/a_FINISH'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/a_FINISH'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'), 'THANK YOU FOR YOUR ORDER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/img_pony_express'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Finish'), 'Finish')

WebUI.closeBrowser()

