package pompack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pompack.base.BasePage;

public class HomePage extends BasePage{

		
	//webelements for HomePage
	
	
	@FindBy(css = "span[class^='zicon-apps-calendar']")
	public WebElement Calendar;

	@FindBy(css = "span[class^='zicon-apps-chat']")
	public WebElement Cliq;

	@FindBy(css = "span[class^='zicon-apps-crm']")
	public WebElement CRM;

	@FindBy(css = "span[class^='zicon-apps-mail']")
	public WebElement Mail;

	@FindBy(css = "span[class^='zicon-apps-salesiq']")
	public WebElement SalesIQ;

	//constructor default
	
	public HomePage(WebDriver driver, ExtentTest eTest)
	{
		this.driver=driver;
		this.eTest=eTest;
		
		
	}
	//reusable codes for HomePage
	
	public boolean verifyDisplayofHomePage()
	{
	
	return(	isElementPresent(CRM));
	
	
	
	}
	
	//reusable method for Calendar
	//reusable method for Cliq
	//reusable method for CRM
	//reusable method for Mail
	//reusable method for SalesIQ
	
	
}
