package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class CreateLeadPage extends HeaderPage {
	
	private WebDriver driver;	
	
	public CreateLeadPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="lastname")	
	private WebElement tb_lastname;
	
	@FindBy(name="company")	
	private WebElement tb_company;
	
	@FindBy(name="button")	
	private WebElement tb_button;
	
	
	public void verifyCreateLeadwithMandatoryField(String lname, String comp)
	{
		tb_lastname.clear();
		tb_lastname.sendKeys(lname);
		tb_company.clear();
		tb_company.sendKeys(comp);
		tb_button.click();
	}
	
	public void CreateMultipleLeads(String lname, String comp)
	{
		tb_lastname.clear();
		tb_lastname.sendKeys(lname);
		tb_company.clear();
		tb_company.sendKeys(comp);
		tb_button.click();
	}
	

}
