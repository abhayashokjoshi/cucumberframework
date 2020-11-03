package lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import Stepdefinitions.Basedefinitions;

public class CommonFunctions {
	
	public static WebDriverWait wait = new WebDriverWait(Basedefinitions.driver,Integer.parseInt("20"));
	
	public static void entervalue(WebElement elm, String val) throws Exception
	{				
		try
		{
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			elm.sendKeys(val);
			//Basedefinitions.logger.pass("Text "+val+" entered successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//Basedefinitions.logger.fail("Text "+val+" did not enter and error msg "+e.getMessage());
			//String str = BaseMethods.getScreenshot(BaseTest.driver, "logo");
			//Basedefinitions.logger.fail("<a href="+str+"><span class=\"label end-time\">Screenshot</span><a>");
		}
	}
	
	public static void clickElement(WebElement elm)
	{				
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			elm.click();
			//BaseTest.logger.pass("Element click successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//BaseTest.logger.fail("Element did not click and error msg "+e.getMessage());
		}
	}

}
