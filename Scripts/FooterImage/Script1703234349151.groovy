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

WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

WebUI.setText(findTestObject('Object Repository/FooterImage/Page_Swag Labs/input_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/FooterImage/Page_Swag Labs/input_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/FooterImage/Page_Swag Labs/inputlogin-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/FooterImage/Page_Swag Labs/img_footer_robot'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/FooterImage/Page_Swag Labs/div_2020 Sauce Labs. All Rights Reserved. T_5b767f'), 
    '© 2020 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy')

WebUI.rightClick(findTestObject('Object Repository/FooterImage/Page_Swag Labs/li_Twitter'))

WebUI.click(findTestObject('Object Repository/FooterImage/Page_Swag Labs/div_Sauce Labs OnesieRib snap infant onesie_8fcfdc'))

WebUI.closeBrowser()

