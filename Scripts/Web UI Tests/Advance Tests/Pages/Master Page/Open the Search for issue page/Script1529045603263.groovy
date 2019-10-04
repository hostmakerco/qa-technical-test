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

/**
 * This is a work-flow test case, which opens the Search page from the menu bar
 * 
 * Given The Jira Home page is openning
 * and   The I has permission to search items
 * When  I click on the Issues -> Search for issues button
 * 
 * @params
 * 
 */
WebUI.waitForElementClickable(findTestObject('web ui/Test Objects/Pages/Master Page/Menu/elIssuesAndFilters'), 0)

WebUI.click(findTestObject('web ui/Test Objects/Pages/Master Page/Menu/elIssuesAndFilters'))

WebUI.waitForElementClickable(findTestObject('web ui/Test Objects/Pages/Master Page/Menu/elSearchIssues'), 0)

WebUI.click(findTestObject('web ui/Test Objects/Pages/Master Page/Menu/elSearchIssues'))

