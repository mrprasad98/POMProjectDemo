package pompack.tests;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pompack.pages.LaunchPage;

import pompack.tests.base.BaseTest;
import pompack.util.Constants;

public class LoginTest extends BaseTest {

	/*
	 * Testcase Name - Login into Zoho Application Steps 1. Open the chrome
	 * browser 2. Open the Application using URL - Constant Class 3. Enter Valid
	 * emailID - Constant Class 4. Enter Valid password - Constant Class 5.
	 * click on Sigin button - Constant Class 6. Verify Landed in Home Page or
	 * not
	 */
//Login Test
	//This is the test method
	@Test
	public void testLogin() {
		// automation code for Login TestCases
		// eTest.log(LogStatus.INFO, "Login Started");
 eTest = eReport.startTest("LoginTest");
		 
		 eTest.log(LogStatus.INFO,"Login Test has started");
		
		openBrowser(Constants.BROWSER_TYPE);

		LaunchPage launchPage = new LaunchPage(driver, eTest);
		PageFactory.initElements(driver, launchPage);

		boolean loginStatus = launchPage.gotoLogin();
		if (loginStatus) {
			// pass testcase

			reportPass("LoginTest Passed");
		} else {
			// fail testcase
			reportFail("LoginTest Fail");
			takeScreenshot();
		}

	}

	@AfterMethod
	public void testClouser() {

		if (eReport != null) {
			eReport.endTest(eTest);
			eReport.flush();
		}

		if (driver != null) {
			driver.quit();
		}
	}
}
