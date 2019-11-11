package pompack.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
	
	//Reusable Variables
	
	
	public WebDriver driver = null;
	public ExtentTest eTest = null;
	
	//Reusable Methods
	public boolean isElementPresent(WebElement element)
	{
		boolean displayedStatus=element.isDisplayed();
		if(displayedStatus)
		{
			return true;
		}else
		{
			return false;
		}
	}

}
