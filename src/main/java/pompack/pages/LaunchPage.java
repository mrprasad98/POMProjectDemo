package pompack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pompack.base.BasePage;
import pompack.util.Constants;

public class LaunchPage extends BasePage{
	
	
	
	//Webelements of LaunchPage
	
	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	@FindBy(className="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-contact")
	public WebElement ContactSale;
	
	@FindBy(className="zh-login")
	public WebElement Login;
	
	//constructor - default
	public LaunchPage(WebDriver driver, ExtentTest eTest)
	{
		
		this.driver=driver;
		this.eTest=eTest;
		
		
		
		
	}
	
	
	//reusable methods for LaunchPage
		
	public boolean gotoLogin()
	{
		//automation code for Login
		
		driver.get(Constants.APP_URL);
		eTest.log(LogStatus.INFO, "Application url got opened"+Constants.APP_URL);
		Login.click();
	eTest.log(LogStatus.INFO, "Login option clicked");
		
		LoginPage loginPage=new LoginPage(driver, eTest);
		PageFactory.initElements(driver, loginPage);
		boolean loginStatus=loginPage.doLogin();
		return loginStatus;
		
		
	}
	
	//reusable methods for Customers
	//reusable methods for Support
	//reusable methods for Contact Sale
	

}
