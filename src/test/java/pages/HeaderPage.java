package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import lib.CommonFunctions;


public class HeaderPage {
	
	private WebDriver driver;
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Logout")	
	WebElement lnk_Logout;
	
	@FindBy(linkText="Leads")	
	WebElement lnk_Leads;
	
	@FindBy(linkText="New Lead")	
	WebElement lnk_NewLead;
	
	public void clickOnLogout()
	{
		lnk_Logout.click();
	}
	
	public void clickOnLeads()
	{
		lnk_Leads.click();
	}
	
	public CreateLeadPage clickOnCreateLead()
	{
		CommonFunctions.clickElement(lnk_NewLead);
		return new CreateLeadPage(driver);
	}


}
