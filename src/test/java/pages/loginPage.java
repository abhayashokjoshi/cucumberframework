package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import lib.CommonFunctions;



public class loginPage {
	
	private WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")	
	private WebElement tb_username;
	
	@FindBy(xpath="//input[@name='user_password']")	
	WebElement tb_password;
	
	@FindBy(how=How.NAME,using="Login")	
	WebElement btn_login;
	
	@FindBy(xpath="//img[@src='include/images/vtiger-crm123.gif']")	
	WebElement img_logo;
	
	@FindBy(xpath="//*[contains(text(),'You must specify a valid username and password.')]")	
	WebElement txt_errorMsg;
	
	
	public HomePage login(String userid, String pwd) throws Exception
	{		
		CommonFunctions.entervalue(tb_username, userid);		
		CommonFunctions.entervalue(tb_password, pwd);		
		CommonFunctions.clickElement(btn_login);
		return new HomePage(driver);
	}
	
	public void Clicklogin() throws Exception
	{		
		CommonFunctions.clickElement(btn_login);
		
	}
	
	public void EnterUseridPwd(String userid, String pwd) throws Exception
	{		
		CommonFunctions.entervalue(tb_username, userid);		
		CommonFunctions.entervalue(tb_password, pwd);		
	}
	
	public void invalidlogin(String userid, String pwd) throws Exception
	{
		CommonFunctions.entervalue(tb_username, userid);		
		CommonFunctions.entervalue(tb_password, pwd);		
		CommonFunctions.clickElement(btn_login);
		btn_login.click();
	}
	
	public boolean verifyLogo() throws Exception
	{
		try
		{
			if(img_logo.isDisplayed())
			{
				return true;
			}			
			else
			{
				//String str = BaseMethods.getScreenshot(driver, "logo");
				//BaseTest.logger.fail("Logo not found  <a href="+str+"><span class=\"label end-time\">Screenshot</span><a>");
				return false;
			}
	    }	
		catch(Exception e)
		{
		//	String str = BaseMethods.getScreenshot(driver, "logo");
		//	BaseTest.logger.fail("Logo not found  <a href="+str+"><span class=\"label end-time\">Screenshot</span><a>");
			return false;
		}
	}
	
	public boolean verifyErrorMsg()
	{
		return txt_errorMsg.isDisplayed();
	}
	
	

}
