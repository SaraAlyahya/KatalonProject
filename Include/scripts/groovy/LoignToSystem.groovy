import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoignToSystem {
	@Given ("User Navigates to the MMS")
	def  openBrowser(){
		WebUI.openBrowser('http://192.168.30.39/Web/Home/Login')
	}

	@When ("User Maximizes the Screen")
	def maximizeTheScreen(){
		WebUI.maximizeWindow()
	}

	@And ("User Enters m.sukhun in UserName Field")
	def enterUserName(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'm.sukhun')
	}

	@And ("User Enters lana in UserName Field")
	def enterUserName14(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'lana')
	}

	@And ("User Enters fadi in UserName Field")
	def enterUserName15(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'fadi')
	}

	@And ("User Enters mohammad in UserName Field")
	def enterUserName16(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'mohammad')
	}

	@And ("User Enters Alaa Hasan in UserName Field")
	def enterUserName13(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'alaa hasan')
	}

	@And ("User Enters Lubna in UserName Field")
	def enterUserName12(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'lubna')
	}

	@And ("User Enters Osama in UserName Field")
	def enterUserName11(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'osama')
	}

	@And ("User Enters Raghad in UserName Field")
	def enterUserName10(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'Raghad')
	}

	@And ("User Enters n.hatoqay in UserName Field")
	def enterUserName1(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'n.hatoqay')
	}

	@And ("User Enters a.haddad in UserName Field")
	def enterUserName2(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'a.haddad')
	}

	@And ("User Enters s.alyahia in UserName Field")
	def enterUserName3(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 's.alyahia')
	}

	@And ("User Enters mirna in UserName Field")
	def enterUserName4(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'mirna')
	}

	@And ("User Enters nada in UserName Field")
	def enterUserName5(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'nada')
	}

	@And ("User Enters mahmoud in UserName Field")
	def enterUserName6(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'mahmoud')
	}

	@And ("User Enters Aseel in UserName Field")
	def enterUserName7(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'a.hylooz')
	}

	@And ("User Enters Mayada in UserName Field")
	def enterUserName8(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'm.abed')
	}

	@And ("User Enters Hussam in UserName Field")
	def enterUserName9(){
		WebUI.setText(findTestObject('Page_MMS - Login/input_Username_UserName'), 'h.bloukh')
	}

	@And ("User Enters Valid Password")
	def enterPassworde(){
		WebUI.setText(findTestObject('Page_MMS - Login/Password'), '1')
	}

	@And ("User Clicks on Login Button")
	def clickOnLogin(){
		WebUI.click(findTestObject('Page_MMS - Login/button_Login'))
	}

	@Then ("User Clicks on Logout Button")
	def clickOnLogOut(){
		WebUI.click(findTestObject('Page_MMS/i_AR_icon-logout'))
	}

	@Then ("From My Meetings Screen the User Clicks on View Button")
	def clickOnMyMeetings(){
		WebUI.click(findTestObject('Page_MMS/a_View'))
	}

	@And ("User Clicks on Topic Button")
	def clickOnTopic(){
		WebUI.click(findTestObject('Page_MMS/a_Topic'))
	}

	@And ("User Clicks on QA Plan Review")
	def clickOnQAplan(){
		WebUI.click(findTestObject('Page_MMS/a_qa plan review'))
	}

	@And ("From QA Plan Review the User Clicks on Attachment Button")
	def clickOnAttachmnets(){
		WebUI.click(findTestObject('Page_MMS/button_qa plan review_Topic_Attchment'))
	}

	@Then ("User Fills Title Field")
	def fillsTitle(){
		WebUI.setText(findTestObject('Page_MMS/input_Title_ATTCH_TITLE'), 'test')
	}

	@Then ("User Clicks on Submit Button for Attachment")
	def clickOnSubmit(){
		WebUI.click(findTestObject('Page_MMS/button_Submit'))
	}

	@And ("From QA Plan Review the User Clicks on Link Button")
	def clickOnLink(){
		WebUI.click(findTestObject('Page_MMS/button_qa plan review_Topic_Link'))
	}

	@And ("User Fills the Title")
	def fillTitle2(){
		WebUI.setText(findTestObject('Page_MMS/input_Title_LINK_TITLE'), 'test')
	}

	@And ("User Fills URL")
	def fillURL(){
		WebUI.setText(findTestObject('Page_MMS/input_Url_LINK_PATH'), 'https://google.com')
	}

	@And ("From QA Plan Review the User Clicks on Comment Button")
	def clickOnComment(){
		WebUI.click(findTestObject('Page_MMS/button_qa plan review_Topic_Comm'))
	}

	@And ("User Fills Comment")
	def fillComment(){
		WebUI.setText(findTestObject('Page_MMS/textarea_Comment_COMM_BODY'), 'test')
	}

	@And ("User Closes the Link Box")
	def closeLink(){
		WebUI.click(findTestObject('Page_MMS/button_Close14'))
	}

	@And ("User Closes the Comment Box")
	def closeComment(){
		WebUI.click(findTestObject('Page_MMS/button_Close15'))
	}

	@And ("User Closes the Box")
	def closeComment6(){
		WebUI.click(findTestObject('Page_MMS/button_Close17'))
	}

	@And ("User Scrols down the Screen")
	def scrollDown(){
		WebUI.scrollToElement(findTestObject('Page_MMS/button_Approve'), 2)
	}

	@Then ("User Clicks on Meeting Details")
	def clickOnMeetingDetails(){
		WebUI.click(findTestObject('Page_MMS/a_Meeting Details'))
	}

	@Then ("User Clicks on Approve Button")
	def clickOnApproveButton(){
		WebUI.click(findTestObject('Page_MMS/button_Approve'))
	}

	@Then ("User Clicks on Reject Button")
	def clickOnRejectButton(){
		WebUI.click(findTestObject('Page_MMS/button_Reject'))
	}

	@Then ("User Clicks on Submit Button for Link")
	def closeButton1(){
		WebUI.click(findTestObject('Page_MMS/submit link'))
	}

	@Then ("User Clicks on Submit Button for Comment")
	def closeButton2(){
		WebUI.click(findTestObject('Page_MMS/button_Submit comm'))
	}

	@Then ("Close the Browser")
	def closeBrowser(){
		WebUI.closeBrowser()
	}
}
