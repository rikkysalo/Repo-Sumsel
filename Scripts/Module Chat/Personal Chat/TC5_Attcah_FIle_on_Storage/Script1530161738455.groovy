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

Mobile.startApplication('C:\\Users\\RIKKY\\git\\Repo-Sumsel\\Android Apk\\Polisi110_Staging200618.apk', true)

Mobile.tap(findTestObject('android.widget.TextView3 - Login (4)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (5)'), 'fajar2@mailinator.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1 (4)'), 'fajar1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - Login (5)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView5 (6)'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - Contact'), 0)

Mobile.tap(findTestObject('android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('android.widget.ImageView12 (2)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView11'), 0)

Mobile.tap(findTestObject('android.widget.ImageView2 (2)'), 0)

Mobile.closeApplication()

