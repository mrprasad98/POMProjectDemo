package pompack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pompack.base.BasePage;
import pompack.util.Constants;

public class LoginPage extends BasePage {

	
	
	//Webelements for LoginPage
	
	@FindBy(css="#lid")
	public WebElement EmailField;
	
	@FindBy(id="pwd")
	public WebElement PasswordField;
	
	@FindBy(id="signin_submit")
	public WebElement SiginInButton;
	
	
	//constructor - Default
	public LoginPage(WebDriver driver, ExtentTest eTest)
	{
		this.driver=driver;
		this.eTest=eTest;
		
		
	}
	//reusable methods for LoginPage
	
	public boolean doLogin()
	{
				//automation code
		EmailField.sendKeys(Constants.USERNAME);
	eTest.log(LogStatus.INFO, "Entered Username");
		PasswordField.sendKeys(Constants.PASSWORD);
		eTest.log(LogStatus.INFO, "Password Entered");
		SiginInButton.click();
		eTest.log(LogStatus.INFO, "Clicked Sigin Button");
		
		HomePage homePage=new HomePage(driver, eTest);
		PageFactory.initElements(driver, homePage);
		boolean loginStatus=homePage.verifyDisplayofHomePage();
		return loginStatus;
	}
	
	//any other reusable methods
}
